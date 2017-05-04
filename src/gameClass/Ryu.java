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
	protected Ryu(CharacterInfo info, int speed) {
		super(CharacterInfo.ONE, speed);
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
		return "Test Character";
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

}
