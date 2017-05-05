package gameClass;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.Timer;

import textureClass.RyuTexture;
import textureClass.Texture;

public class Ryu extends Character {
	

	volatile int idleIndex = 0;
	volatile int walkIndex = 0;
	volatile int vertialJumpIndex = 0;
	volatile int diagonalJumpIndex = 0;
	volatile int punchIndex = 0;
	volatile int kickIndex = 0;
	volatile int sneakPunchIndex = 0;
	volatile int sneakKickIndex = 0;
	volatile int aerialKickIndex = 0;
	volatile int specialIndex = 0;
	
	volatile boolean isPunching = false;
	volatile boolean isKicking = false;
	volatile boolean isSneaking = false;
	volatile boolean isSpecial = false;
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
		if(isSpecial){
			if(specialIndex!=RyuTexture.speicalRyuRight.length-2){
			g.drawImage(RyuTexture.speicalRyuRight[specialIndex],x,y, (int)(Constants.PLAYER_WIDTH.getIntValue()), Constants.PLAYER_HEIGHT.getIntValue(), null);
			}else{
				g.drawImage(RyuTexture.speicalRyuRight[specialIndex],x,y, (int)(Constants.PLAYER_WIDTH.getIntValue()*1.7), Constants.PLAYER_HEIGHT.getIntValue(), null);

			}
			return;
		}
		if(isPunching && !inAir){
			if(!isSneaking)
			g.drawImage(RyuTexture.punchRyuRight[punchIndex],x,y, (int)(Constants.PLAYER_WIDTH.getIntValue()*1.1), Constants.PLAYER_HEIGHT.getIntValue(), null);
			else
				g.drawImage(RyuTexture.sneakPunchRyuRight[sneakPunchIndex],x,y + (int)(Constants.PLAYER_HEIGHT.getIntValue()/2), (int)(Constants.PLAYER_WIDTH.getIntValue()*1.1), Constants.PLAYER_HEIGHT.getIntValue()/2, null);
			return;
		
		}
		if(isPunching && inAir){
			g.drawImage(RyuTexture.sneakKickRyuRight[sneakKickIndex],x,y + (int)(Constants.PLAYER_HEIGHT.getIntValue()/2), (int)(Constants.PLAYER_WIDTH.getIntValue()*1.7), (int)(Constants.PLAYER_HEIGHT.getIntValue()*.7), null);
			return;
		}
		if(isKicking && inAir){
			g.drawImage(RyuTexture.aerialKickRyuRight[aerialKickIndex],x,y, (int)(Constants.PLAYER_WIDTH.getIntValue()), Constants.PLAYER_HEIGHT.getIntValue(), null);
			return;
		}
		if(isKicking && !inAir && !isPunching){
			if(!isSneaking){
			g.drawImage(RyuTexture.kickRyuRight[kickIndex],x,y, (int)(Constants.PLAYER_WIDTH.getIntValue()*1.1), Constants.PLAYER_HEIGHT.getIntValue(), null);
			}else{
				g.drawImage(RyuTexture.sneakKickRyuRight[sneakKickIndex],x,y + (int)(Constants.PLAYER_HEIGHT.getIntValue()/2), (int)(Constants.PLAYER_WIDTH.getIntValue()*1.5), Constants.PLAYER_HEIGHT.getIntValue()/2, null);
			}
			return;
		}
		
		if(xVelo==0&&yVelo==0){
		if(!isSneaking){
		g.drawImage(RyuTexture.idleRyuRight[idleIndex],x,y, Constants.PLAYER_WIDTH.getIntValue(), Constants.PLAYER_HEIGHT.getIntValue(), null);
		}else{
			g.drawImage(RyuTexture.idleSneakRyuRight,x,y+(Constants.PLAYER_HEIGHT.getIntValue()/2), Constants.PLAYER_WIDTH.getIntValue(), Constants.PLAYER_HEIGHT.getIntValue()/2, null);

		}
		}else if(xVelo!=0 && yVelo== 0){
			g.drawImage(RyuTexture.walkRyuRight[walkIndex],x,y, Constants.PLAYER_WIDTH.getIntValue(), Constants.PLAYER_HEIGHT.getIntValue(), null);
		}else if(xVelo==0&&yVelo!=0){
			g.drawImage(RyuTexture.verticalJumpRyuRight[vertialJumpIndex],x,y, (int)(Constants.PLAYER_WIDTH.getIntValue()*.9), (int)(Constants.PLAYER_HEIGHT.getIntValue()*.9), null);
		}else if(xVelo!=0&&yVelo!=0){
			g.drawImage(RyuTexture.diagonalJumpRyuRight[diagonalJumpIndex],x,y, (int)(Constants.PLAYER_WIDTH.getIntValue()*1.05), (int)(Constants.PLAYER_HEIGHT.getIntValue()*1.05), null);
		}
			
	}

	@Override
	public String toString() {
		return "RYU";
	}

	@Override
	void sneak() {
		isSneaking = true;
	}
	
	@Override
	void incrementMoveIndex() {
		if(xVelo==0&&yVelo==0 &&!isSneaking){
			//idle
			idleIndex++;
			if(idleIndex>RyuTexture.idleRyuRight.length-1){
				idleIndex = 0;
			}
		}else if(xVelo!=0&&yVelo==0){
			walkIndex++;
			if(walkIndex>RyuTexture.walkRyuRight.length-1){
				walkIndex = 0;
			}
		}else if(xVelo==0&&yVelo!=0){
			vertialJumpIndex++;
			if(vertialJumpIndex>RyuTexture.verticalJumpRyuRight.length-1){
				vertialJumpIndex = 0;
			}
		}else if(xVelo!=0&&yVelo!=0){
			diagonalJumpIndex++;
			if(diagonalJumpIndex>RyuTexture.diagonalJumpRyuRight.length-1){
				diagonalJumpIndex = 0;
			}
		}
	}

	@Override
	void punch() {
		if(!isPunching&&!isKicking&&!isSpecial){
		Thread punch = new Thread(new Runnable(){

			@Override
			public void run() {
				isPunching = true;
				if(!inAir){
				if(!isSneaking){
					punchIndex = 0;
				for(int index = 0; index < RyuTexture.punchRyuRight.length-1; index++){
						punchIndex++;
					try{
						Thread.sleep(100);
					}catch(Exception e) { }
				}
				}else{
					sneakPunchIndex = 0;
					for(int index = 0; index < RyuTexture.sneakPunchRyuRight.length-1; index++){
						sneakPunchIndex++;
					try{
						Thread.sleep(100);
					}catch(Exception e) { }
				}
				}
				}else{
					sneakKickIndex = 0;
					for(int index = 0; index < RyuTexture.sneakKickRyuRight.length-1; index++){
						sneakKickIndex++;
					try{
						Thread.sleep(100);
					}catch(Exception e) { }
				}
			}
				isPunching = false;
			}
		});
		punch.start();
		}
	}


	@Override
	void kick() {
		if(!isKicking&&!isPunching&&!isSpecial){
			Thread kick = new Thread(new Runnable(){

				@Override
				public void run() {
					isKicking = true;
					if(!inAir){
					if(!isSneaking){
					kickIndex = 0;
					for(int index = 0; index < RyuTexture.kickRyuRight.length-1; index++){
							kickIndex++;
						try{
							Thread.sleep(100);
						}catch(Exception e) { }
					}
					}else{
						sneakKickIndex = 0;
						for(int index = 0; index < RyuTexture.sneakKickRyuRight.length-1; index++){
							sneakKickIndex++;
							try{
								Thread.sleep(100);
							}catch(Exception e) { }
						}
					}
					}else{
						aerialKickIndex = 0;
						for(int index = 0; index < RyuTexture.aerialKickRyuRight.length-1; index++){
							aerialKickIndex++;
							try{
								Thread.sleep(100);
							}catch(Exception e) { }
						}
					}
					isKicking = false;
				}
				
			});
			kick.start();
			}
	}

	@Override
	void stand() {
		isSneaking = false;
	}

	@Override
	void special() {
		if(!isKicking&&!isPunching&&!isSpecial){
			FightPanelLauncher.sprites.add(new EnergyBall(x+(Constants.ENERGYBALL_WIDTH.getIntValue()),y+(Constants.ENERGYBALL_HEIGHT.getIntValue()),10,0));
			Thread special = new Thread(new Runnable(){

				@Override
				public void run() {
					isSpecial = true;
					specialIndex = 0;
					for(int index = 0; index < RyuTexture.speicalRyuRight.length-1; index++){
						specialIndex++;
						try{
							Thread.sleep(100);
						}catch(Exception e) { }
					}
					isSpecial = false;
				}
				
			});
			special.start();
			}
	}

}
