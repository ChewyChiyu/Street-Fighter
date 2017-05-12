package gameClass;

import java.awt.Graphics;


import textureClass.EHondaTexture;

public class EHonda extends Character {
	boolean right;
	protected EHonda(CharacterInfo info, int speed, boolean right,boolean isAutomated) {
		super(CharacterInfo.EHONDA, speed, right, isAutomated);
		this.right = right;	
		
		

		if(right){
			idle = EHondaTexture.idleEHondaRight;
			walk =  EHondaTexture.walkEHondaRight;
			verticalJump =  EHondaTexture.verticalJumpEHondaRight;
			diagonalJump =  EHondaTexture.diagonalJumpEHondaRight;
			punch = EHondaTexture.punchEHondaRight;
			kick =  EHondaTexture.kickEHondaRight;



			sneakPunch =  EHondaTexture.sneakpunchEHondaRight;
			sneakKick =  EHondaTexture.sneakkickEHondaRight;
			aerialKick = EHondaTexture.aerialkickEHondaRight;
			special = EHondaTexture.speicalEHondaRight;

			hitTorso = EHondaTexture.EHondaTorsoHitRight;
			idleSneak =  EHondaTexture.idleSneakEHondaRight;

			hitHead = EHondaTexture.EHondaHeadHitRight;
			knockDown = EHondaTexture.knockDownEHondaRight;
			defeat = EHondaTexture.defeatEHondaRight;



		}
		if(!right){
			idle = EHondaTexture.idleEHondaLeft;
			walk =  EHondaTexture.walkEHondaLeft;
			verticalJump =  EHondaTexture.verticalJumpEHondaLeft;
			diagonalJump =  EHondaTexture.diagonalJumpEHondaLeft;
			punch = EHondaTexture.punchEHondaLeft;
			kick =  EHondaTexture.kickEHondaLeft;



			sneakPunch =  EHondaTexture.sneakpunchEHondaLeft;
			sneakKick =  EHondaTexture.sneakkickEHondaLeft;
			aerialKick = EHondaTexture.aerialkickEHondaLeft;
			special = EHondaTexture.speicalEHondaLeft;

			hitTorso = EHondaTexture.EHondaTorsoHitLeft;
			idleSneak =  EHondaTexture.idleSneakEHondaLeft;

			hitHead = EHondaTexture.EHondaHeadHitLeft;
			knockDown = EHondaTexture.knockDownEHondaLeft;
			defeat = EHondaTexture.defeatEHondaLeft;

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
			if(defeatedIndex<5){
				g.drawImage(defeat[defeatedIndex],x,y+(int)(getInfo().getHeight()/2), (int)(getInfo().getWidth()*1.5), getInfo().getHeight()/2, null);
			}else if(defeatedIndex<5){
				g.drawImage(defeat[defeatedIndex],x,y+(int)(getInfo().getHeight()/2), (int)(getInfo().getHeight()), getInfo().getWidth()/2, null);
			}else if(defeatedIndex<7){
				g.drawImage(defeat[defeatedIndex],x,y+(int)(getInfo().getHeight()*.8), (int)(getInfo().getHeight()), (int)(getInfo().getWidth()/2), null);
			}
			return;
		}
		if(isGettingKnockedDown){
//			if(gettingKnockedDownIndex<5){
//				g.drawImage(knockDown[gettingKnockedDownIndex],x,y+(int)(getInfo().getHeight()/2), (int)(getInfo().getWidth()*1.5), getInfo().getHeight()/2, null);
//			}else if(gettingKnockedDownIndex<6){
//				g.drawImage(knockDown[gettingKnockedDownIndex],x,y+(int)(getInfo().getHeight()*.75), (int)(getInfo().getWidth()*1.5), getInfo().getHeight()/4, null);
//			}else if(gettingKnockedDownIndex<10){
//				g.drawImage(knockDown[gettingKnockedDownIndex],x,y+(int)(getInfo().getHeight()/2.5), (int)(getInfo().getWidth()), (int)(getInfo().getHeight()/1.9), null);
//			}else{
//				g.drawImage(knockDown[gettingKnockedDownIndex],x,y, (int)(getInfo().getWidth()), getInfo().getHeight(), null);
//			}
			g.drawImage(knockDown[gettingKnockedDownIndex],x,y, getInfo().getWidth(), getInfo().getHeight(), null);
			return;
		}
		if(isGettingHitTorso){
			g.drawImage(hitTorso[gettingHitTorsoIndex],x,y, (int)(getInfo().getWidth()), getInfo().getHeight(), null);
			return;
		}

		if(isGettingHitHead){
			g.drawImage(hitHead[gettingHitHeadIndex],x,y, (int)(getInfo().getWidth()), getInfo().getHeight(), null);
			return;
		}


		if(isSpecial){
			if(specialIndex!=special.length-2){
				g.drawImage(punch[specialIndex],x,y, (int)(getInfo().getWidth()), getInfo().getHeight(), null);
			}else{
				g.drawImage(punch[specialIndex],x,y, (int)(getInfo().getWidth()*1.7), getInfo().getHeight(), null);
			}
			return;
		}
		if(isPunching){
			g.drawImage(punch[punchIndex],x,y, (int)(getInfo().getWidth()*1.1), getInfo().getHeight(), null);
			return;
		}
		if(isLowPunching){
			g.drawImage(sneakPunch[sneakPunchIndex],x,y + (int)(getInfo().getHeight()/2), (int)(getInfo().getWidth()*1.1), getInfo().getHeight()/2, null);
			return;

		}
		if(isAerialPunching){
			g.drawImage(sneakKick[sneakKickIndex],x,y + (int)(getInfo().getHeight()/2), (int)(getInfo().getWidth()*1.5), getInfo().getHeight()/2, null);
			return;
		}
		if(isAerialKicking){
			g.drawImage(aerialKick[aerialKickIndex],x,y, (int)(getInfo().getWidth()), getInfo().getHeight(), null);
			return;
		}
		if(isLowKicking){
			g.drawImage(sneakKick[sneakKickIndex],x,y + (int)(getInfo().getHeight()/2), (int)(getInfo().getWidth()*1.5), getInfo().getHeight()/2, null);
			return;
		}
		if(isKicking){
			g.drawImage(kick[kickIndex],x,y, (int)(getInfo().getWidth()*1.1), getInfo().getHeight(), null);
			return;
		}
		if(xVelo==0&&yVelo==0){
			if(!isSneaking){
				g.drawImage(idle[idleIndex],x,y, getInfo().getWidth(), getInfo().getHeight(), null);
			}else{
				g.drawImage(idleSneak[0],x,y+(getInfo().getHeight()/2), (int) (getInfo().getWidth()*1.5), getInfo().getHeight()/2, null);

			}
		}else if(xVelo!=0 && yVelo== 0){
			g.drawImage(walk[walkIndex],x,y, getInfo().getWidth(), getInfo().getHeight(), null);
		}else if(xVelo==0&&yVelo!=0){
			g.drawImage(verticalJump[vertialJumpIndex],x,y, (int)(getInfo().getWidth()*.9), (int)(getInfo().getHeight()*.9), null);
		}else if(xVelo!=0&&yVelo!=0){
			g.drawImage(diagonalJump[diagonalJumpIndex],x,y, (int)(getInfo().getWidth()*1.05), (int)(getInfo().getHeight()*1.05), null);
		}

	}

	@Override
	public String toString() {
		return "EHonda";
	}



	@Override
	void punch() {
		if(!isAttacking){
			Thread punch = new Thread(new Runnable(){

				@Override
				public void run() {
					isPunching = true;
					punchIndex = 0;

					for(int index = 0; index < EHondaTexture.punchEHondaRight.length-1; index++){
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


					for(int index = 0; index < EHondaTexture.kickEHondaRight.length-1; index++){
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
		if(!isAttacking&&!isGettingKnockedDown){
			int energyBallXVelo = 0;
			int xBuffer = 0;
			if(right){
				energyBallXVelo = 10;
				xBuffer = (int) (x+(getInfo().getWidth()));
			}else{
				energyBallXVelo = -10;
				xBuffer = x-(getInfo().getWidth()/2);
			}
			FightPanelLauncher.sprites.add(new EnergyBall(xBuffer,y+(Constants.ENERGYBALL_HEIGHT.getIntValue()),energyBallXVelo,0));
			Thread special = new Thread(new Runnable(){

				@Override
				public void run() {
					isSpecial = true;
					specialIndex = 0;
					for(int index = 0; index < EHondaTexture.speicalEHondaRight.length-1; index++){
						specialIndex++;
						try{
							Thread.sleep(500);
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
					for(int index = 0; index < EHondaTexture.sneakkickEHondaRight.length-1; index++){
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
					for(int index = 0; index < EHondaTexture.aerialkickEHondaRight.length-1; index++){
						aerialKickIndex++;
						try{
							Thread.sleep(200);
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
					for(int index = 0; index < EHondaTexture.sneakpunchEHondaRight.length-1; index++){
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
					for(int index = 0; index < EHondaTexture.sneakkickEHondaRight.length-1; index++){
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
				for(int index = 0; index < EHondaTexture.EHondaTorsoHitRight.length-1; index++){
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
				for(int index = 0; index < EHondaTexture.EHondaHeadHitRight.length-1; index++){
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
				for(int index = 0; index < EHondaTexture.knockDownEHondaRight.length-1; index++){
					gettingKnockedDownIndex++;
					
					try{
						Thread.sleep(200);
					}catch(Exception e) { }
				}		
				isGettingKnockedDown = false;
			}
		});
		
		Thread knockBack = new Thread(new Runnable(){
			public void run(){
			for(int index = 0; index < 50; index++){	
				y -= Constants.GRAVITY.getIntValue();
				if(!right){
					setX(5);
				}
				else{
					setX(-5);
				}
				try{
					Thread.sleep(1);
				}catch(Exception e) { }
			}
			}
		});
		
		knockBack.start();
		gettingKnocked.start();

	}

	@Override
	void defeated() {
		if(defeated){
			return;
		}
		Thread defeat = new Thread(new Runnable(){
			public void run(){
				defeated = true;
				defeatedIndex = 0;
				for(int index = 0; index < EHondaTexture.defeatEHondaRight.length-1; index++){
					defeatedIndex++;
					try{
						Thread.sleep(200);
					}catch(Exception e) { }
				}		
			}
		});
		defeat.start();		
	}

}
