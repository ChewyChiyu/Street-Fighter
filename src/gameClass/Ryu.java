package gameClass;

import java.awt.Graphics;

import javax.swing.Timer;

import textureClass.RyuTexture;

public class Ryu extends Character {

	protected Ryu(CharacterInfo info, int speed, boolean right) {
		super(CharacterInfo.RYU, speed);
		Timer move = new Timer(100 , e-> {
			incrementMoveIndex();
		});
		move.start();


		if(right){
			idle = RyuTexture.idleRyuRight;
			walk =  RyuTexture.walkRyuRight;
			verticalJump =  RyuTexture.verticalJumpRyuRight;
			diagonalJump =  RyuTexture.diagonalJumpRyuRight;
			punch = RyuTexture.punchRyuRight;
			kick =  RyuTexture.kickRyuRight;



			sneakPunch =  RyuTexture.sneakPunchRyuRight;
			sneakKick =  RyuTexture.sneakKickRyuRight;
			aerialKick = RyuTexture.aerialKickRyuRight;
			special = RyuTexture.speicalRyuRight;

			hitTorso = RyuTexture.ryuTorsoHitRight;
			idleSneak =  RyuTexture.idleSneakRyuRight;
			
			hitHead = RyuTexture.ryuHeadHitRight;
			knockDown = RyuTexture.knockDownRyuRight;
			defeat = RyuTexture.defeatRyuRight;
			
			
			
		}
		if(!right){

		}

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
		if(defeated){
			if(defeatedIndex<2){
				g.drawImage(defeat[defeatedIndex],x,y+(int)(Constants.PLAYER_HEIGHT.getIntValue()*.2), (int)(Constants.PLAYER_WIDTH.getIntValue()*1.5), (int) (Constants.PLAYER_HEIGHT.getIntValue()*.8), null);
				}else if(defeatedIndex<6){
					g.drawImage(defeat[defeatedIndex],x,y+(int)(Constants.PLAYER_HEIGHT.getIntValue()*.7), (int)(Constants.PLAYER_HEIGHT.getIntValue()), (int)(Constants.PLAYER_WIDTH.getIntValue()*.8), null);
				}
				return;
			
		}
		if(isGettingKnockedDown){
			if(gettingKnockedDownIndex<5){
			g.drawImage(knockDown[gettingKnockedDownIndex],x,y+(int)(Constants.PLAYER_HEIGHT.getIntValue()/2), (int)(Constants.PLAYER_WIDTH.getIntValue()*1.5), Constants.PLAYER_HEIGHT.getIntValue()/2, null);
			}else if(gettingKnockedDownIndex<6){
				g.drawImage(knockDown[gettingKnockedDownIndex],x,y+(int)(Constants.PLAYER_HEIGHT.getIntValue()*.75), (int)(Constants.PLAYER_WIDTH.getIntValue()*1.5), Constants.PLAYER_HEIGHT.getIntValue()/4, null);
			}else if(gettingKnockedDownIndex<10){
				g.drawImage(knockDown[gettingKnockedDownIndex],x,y+(int)(Constants.PLAYER_HEIGHT.getIntValue()/2.5), (int)(Constants.PLAYER_WIDTH.getIntValue()), (int)(Constants.PLAYER_HEIGHT.getIntValue()/1.9), null);
			}else{
				g.drawImage(knockDown[gettingKnockedDownIndex],x,y, (int)(Constants.PLAYER_WIDTH.getIntValue()), Constants.PLAYER_HEIGHT.getIntValue(), null);
			}
			return;
		}
		if(isGettingHitTorso){
			g.drawImage(hitTorso[gettingHitTorsoIndex],x,y, (int)(Constants.PLAYER_WIDTH.getIntValue()), Constants.PLAYER_HEIGHT.getIntValue(), null);
			return;
		}

		if(isGettingHitHead){
			g.drawImage(hitHead[gettingHitHeadIndex],x,y, (int)(Constants.PLAYER_WIDTH.getIntValue()), Constants.PLAYER_HEIGHT.getIntValue(), null);
			return;
		}


		if(isSpecial){
			if(specialIndex!=special.length-2){
				g.drawImage(special[specialIndex],x,y, (int)(Constants.PLAYER_WIDTH.getIntValue()), Constants.PLAYER_HEIGHT.getIntValue(), null);
			}else{
				g.drawImage(special[specialIndex],x,y, (int)(Constants.PLAYER_WIDTH.getIntValue()*1.7), Constants.PLAYER_HEIGHT.getIntValue(), null);
			}
			return;
		}
		if(isPunching){
			g.drawImage(punch[punchIndex],x,y, (int)(Constants.PLAYER_WIDTH.getIntValue()*1.1), Constants.PLAYER_HEIGHT.getIntValue(), null);
			return;
		}
		if(isLowPunching){
			g.drawImage(sneakPunch[sneakPunchIndex],x,y + (int)(Constants.PLAYER_HEIGHT.getIntValue()/2), (int)(Constants.PLAYER_WIDTH.getIntValue()*1.1), Constants.PLAYER_HEIGHT.getIntValue()/2, null);
			return;

		}
		if(isAerialPunching){
			g.drawImage(sneakKick[sneakKickIndex],x,y + (int)(Constants.PLAYER_HEIGHT.getIntValue()/2), (int)(Constants.PLAYER_WIDTH.getIntValue()*1.7), (int)(Constants.PLAYER_HEIGHT.getIntValue()*.7), null);
			return;
		}
		if(isAerialKicking){
			g.drawImage(aerialKick[aerialKickIndex],x,y, (int)(Constants.PLAYER_WIDTH.getIntValue()), Constants.PLAYER_HEIGHT.getIntValue(), null);
			return;
		}
		if(isLowKicking){
			g.drawImage(sneakKick[sneakKickIndex],x,y + (int)(Constants.PLAYER_HEIGHT.getIntValue()/2), (int)(Constants.PLAYER_WIDTH.getIntValue()*1.5), Constants.PLAYER_HEIGHT.getIntValue()/2, null);
			return;
		}
		if(isKicking){
			g.drawImage(kick[kickIndex],x,y, (int)(Constants.PLAYER_WIDTH.getIntValue()*1.1), Constants.PLAYER_HEIGHT.getIntValue(), null);
			return;
		}
		if(xVelo==0&&yVelo==0){
			if(!isSneaking){
				g.drawImage(idle[idleIndex],x,y, Constants.PLAYER_WIDTH.getIntValue(), Constants.PLAYER_HEIGHT.getIntValue(), null);
			}else{
				g.drawImage(idleSneak[0],x,y+(Constants.PLAYER_HEIGHT.getIntValue()/2), Constants.PLAYER_WIDTH.getIntValue(), Constants.PLAYER_HEIGHT.getIntValue()/2, null);

			}
		}else if(xVelo!=0 && yVelo== 0){
			g.drawImage(walk[walkIndex],x,y, Constants.PLAYER_WIDTH.getIntValue(), Constants.PLAYER_HEIGHT.getIntValue(), null);
		}else if(xVelo==0&&yVelo!=0){
			g.drawImage(verticalJump[vertialJumpIndex],x,y, (int)(Constants.PLAYER_WIDTH.getIntValue()*.9), (int)(Constants.PLAYER_HEIGHT.getIntValue()*.9), null);
		}else if(xVelo!=0&&yVelo!=0){
			g.drawImage(diagonalJump[diagonalJumpIndex],x,y, (int)(Constants.PLAYER_WIDTH.getIntValue()*1.05), (int)(Constants.PLAYER_HEIGHT.getIntValue()*1.05), null);
		}

	}

	@Override
	public String toString() {
		return "RYU";
	}

	@Override
	void incrementMoveIndex() {
		if(xVelo==0&&yVelo==0 &&!isSneaking&&!isSpecial&&!isPunching&&!isKicking){
			//idle
			idleIndex++;
			if(idleIndex>idle.length-1){
				idleIndex = 0;
			}
		}else if(xVelo!=0&&yVelo==0&&!isSpecial&&!isPunching&&!isKicking){
			walkIndex++;
			if(walkIndex>walk.length-1){
				walkIndex = 0;
			}
		}else if(xVelo==0&&yVelo!=0&&!isSpecial&&!isPunching&&!isKicking){
			vertialJumpIndex++;
			if(vertialJumpIndex>verticalJump.length-1){
				vertialJumpIndex = 0;
			}
		}else if(xVelo!=0&&yVelo!=0&&!isSpecial&&!isPunching&&!isKicking){
			diagonalJumpIndex++;
			if(diagonalJumpIndex>diagonalJump.length-1){
				diagonalJumpIndex = 0;
			}
		}
	}

	@Override
	void punch() {
		if(!isAttacking){
			Thread punch = new Thread(new Runnable(){

				@Override
				public void run() {
					isPunching = true;
					punchIndex = 0;

					for(int index = 0; index < RyuTexture.punchRyuRight.length-1; index++){
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
		if(!isAttacking){
			Thread kick = new Thread(new Runnable(){

				@Override
				public void run() {
					kickIndex = 0;
					isKicking = true;


					for(int index = 0; index < RyuTexture.kickRyuRight.length-1; index++){
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


	@Override
	void special() {
		if(!isAttacking){
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

	@Override
	void aerialPunch() {
		if(!isAttacking){
			Thread aerialPunch = new Thread(new Runnable(){
				public void run(){
					isAerialPunching = true;
					sneakKickIndex = 0;
					for(int index = 0; index < RyuTexture.sneakKickRyuRight.length-1; index++){
						sneakKickIndex++;
						try{
							Thread.sleep(100);
						}catch(Exception e) { }
					}
					isAerialPunching = false;
				}
			});
			aerialPunch.start();
		}
	}

	@Override
	void aerialKick() {
		if(!isAttacking){
			Thread aerialKick = new Thread(new Runnable(){
				public void run(){
					isAerialKicking = true;
					aerialKickIndex = 0;
					for(int index = 0; index < RyuTexture.aerialKickRyuRight.length-1; index++){
						aerialKickIndex++;
						try{
							Thread.sleep(100);
						}catch(Exception e) { }
					}		
					isAerialKicking = false;
				}
			});
			aerialKick.start();
		}
	}

	@Override
	void sneakPunch() {
		if(!isAttacking){
			Thread sneakPunch = new Thread(new Runnable(){

				@Override
				public void run() {
					isLowPunching = true;
					sneakPunchIndex = 0;
					for(int index = 0; index < RyuTexture.sneakPunchRyuRight.length-1; index++){
						sneakPunchIndex++;
						try{
							Thread.sleep(100);
						}catch(Exception e) { }

					}		
					isLowPunching = false;
				}

			});
			sneakPunch.start();
		}
	}

	@Override
	void sneakKick() {
		if(!isAttacking){
			Thread sneakKick = new Thread(new Runnable(){
				public void run(){
					isLowKicking = true;
					sneakKickIndex = 0;
					for(int index = 0; index < RyuTexture.sneakKickRyuRight.length-1; index++){
						sneakKickIndex++;
						try{
							Thread.sleep(100);
						}catch(Exception e) { }
					}		
					isLowKicking = false;
				}
			});
			sneakKick.start();
		}
	}
	@Override
	void stand() {
		isSneaking = false;
	}

	@Override
	void sneak() {
		isSneaking = true;
	}

	@Override
	void getHitTorso() {

		Thread gettingHit = new Thread(new Runnable(){
			public void run(){
				isGettingHitTorso = true;
				gettingHitTorsoIndex = 0;
				for(int index = 0; index < RyuTexture.ryuTorsoHitRight.length-1; index++){
					gettingHitTorsoIndex++;
					try{
						Thread.sleep(100);
					}catch(Exception e) { }
				}		
				isGettingHitTorso = false;
			}
		});
		gettingHit.start();

	}

	@Override
	void getHitHead() {
		Thread gettingHit = new Thread(new Runnable(){
			public void run(){
				isGettingHitHead = true;
				gettingHitHeadIndex = 0;
				for(int index = 0; index < RyuTexture.ryuHeadHitRight.length-1; index++){
					gettingHitHeadIndex++;
					try{
						Thread.sleep(100);
					}catch(Exception e) { }
				}		
				isGettingHitHead = false;
			}
		});
		gettingHit.start();

	}

	@Override
	void getKnockedDown() {
		Thread gettingKnocked = new Thread(new Runnable(){
			public void run(){
				isGettingKnockedDown = true;
				gettingKnockedDownIndex = 0;
				for(int index = 0; index < RyuTexture.knockDownRyuRight.length-1; index++){
					gettingKnockedDownIndex++;
					try{
						Thread.sleep(200);
					}catch(Exception e) { }
				}		
				isGettingKnockedDown = false;
			}
		});
		gettingKnocked.start();
		
	}

	@Override
	void defeated() {
		Thread defeat = new Thread(new Runnable(){
			public void run(){
				defeated = true;
				defeatedIndex = 0;
				for(int index = 0; index < RyuTexture.defeatRyuRight.length-1; index++){
					defeatedIndex++;
					try{
						Thread.sleep(500);
					}catch(Exception e) { }
				}		
				defeated = false;
			}
		});
		defeat.start();		
	}

}
