package gameClass;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.Timer;

import textureClass.Texture;

public class Ryu extends Character {
	int idleIndex = 0;
	int walkIndex = 0;
	int vertialJumpIndex = 0;
	int diagonalJumpIndex = 0;
	int punchIndex = 0;
	int kickIndex = 0;
	boolean isPunching = false;
	boolean isKicking = false;
	protected Ryu(CharacterInfo info, int speed) {
		super(CharacterInfo.RYU, speed);
		Timer move = new Timer(100 , e-> {
			incrementMoveIndex();
		});
		move.start();
	}

	@Override
	void jump() {
		if(!inAir){
			Thread jump = new Thread(new Runnable(){
				public void run(){
					for(int index = 0; index < 100; index++){
						y -= Constants.GRAVITY.getIntValue();
						try{
							Thread.sleep(1);
						}catch(Exception e) {}
					}
				}
			});
			jump.start();
		}
	}

	@Override
	void draw(Graphics g) {
		if(isPunching && yVelo==0 && !isKicking){
			g.drawImage(Texture.punchRyuRight[punchIndex],x,y, (int)(Constants.PLAYER_WIDTH.getIntValue()*1.1), Constants.PLAYER_HEIGHT.getIntValue(), null);
			return;
		}
		if(isKicking && yVelo==0 && !isPunching){
			g.drawImage(Texture.kickRyuRight[kickIndex],x,y, (int)(Constants.PLAYER_WIDTH.getIntValue()*1.1), Constants.PLAYER_HEIGHT.getIntValue(), null);
			return;
		}
		if(xVelo==0&&yVelo==0)
		g.drawImage(Texture.idleRyuRight[idleIndex],x,y, Constants.PLAYER_WIDTH.getIntValue(), Constants.PLAYER_HEIGHT.getIntValue(), null);
		else if(xVelo!=0 && yVelo== 0){
			g.drawImage(Texture.walkRyuRight[walkIndex],x,y, Constants.PLAYER_WIDTH.getIntValue(), Constants.PLAYER_HEIGHT.getIntValue(), null);
		}else if(xVelo==0&&yVelo!=0){
			g.drawImage(Texture.verticalJumpRyuRight[vertialJumpIndex],x,y, (int)(Constants.PLAYER_WIDTH.getIntValue()*.9), (int)(Constants.PLAYER_HEIGHT.getIntValue()*.9), null);
		}else if(xVelo!=0&&yVelo!=0){
			g.drawImage(Texture.diagonalJumpRyuRight[diagonalJumpIndex],x,y, (int)(Constants.PLAYER_WIDTH.getIntValue()*1.05), (int)(Constants.PLAYER_HEIGHT.getIntValue()*1.05), null);
		}
			
	}

	@Override
	public String toString() {
		return "RYU";
	}

	@Override
	void sneak() {
		
	}
	
	@Override
	void incrementMoveIndex() {
		if(xVelo==0&&yVelo==0){
			//idle
			idleIndex++;
			if(idleIndex>Texture.idleRyuRight.length-1){
				idleIndex = 0;
			}
		}else if(xVelo!=0&&yVelo==0){
			walkIndex++;
			if(walkIndex>Texture.walkRyuRight.length-1){
				walkIndex = 0;
			}
		}else if(xVelo==0&&yVelo!=0){
			vertialJumpIndex++;
			if(vertialJumpIndex>Texture.verticalJumpRyuRight.length-1){
				vertialJumpIndex = 0;
			}
		}else if(xVelo!=0&&yVelo!=0){
			diagonalJumpIndex++;
			if(diagonalJumpIndex>Texture.diagonalJumpRyuRight.length-1){
				diagonalJumpIndex = 0;
			}
		}
	}

	@Override
	void punch() {
		if(!isPunching){
		Thread punch = new Thread(new Runnable(){

			@Override
			public void run() {
				punchIndex = 0;
				isPunching = true;
				for(int index = 0; index < Texture.punchRyuRight.length-1; index++){
						punchIndex++;
					try{
						Thread.sleep(100);
					}catch(Exception e) { }
				}
				isPunching = false;
			}
			
		});
		punch.start();
		}
	}


	@Override
	void kick() {
		if(!isKicking){
			Thread kick = new Thread(new Runnable(){

				@Override
				public void run() {
					kickIndex = 0;
					isKicking = true;
					for(int index = 0; index < Texture.kickRyuRight.length-1; index++){
							kickIndex++;
						try{
							Thread.sleep(100);
						}catch(Exception e) { }
					}
					isKicking = false;
				}
				
			});
			kick.start();
			}
	}

}
