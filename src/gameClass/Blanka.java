package gameClass;

import java.awt.Graphics;
import java.awt.Image;

import textureClass.BlankaTexture;

public class Blanka extends Character {
	boolean right;
	protected Blanka(CharacterInfo info, int speed, boolean right,boolean isAutomated) {
		super(CharacterInfo.BLANKA, speed, right, isAutomated);
		this.right = right;	



		if(right){
			idle = BlankaTexture.idleBlankaRight;
			walk =  BlankaTexture.walkBlankaRight;
			verticalJump =  BlankaTexture.verticalJumpBlankaRight;
			diagonalJump =  BlankaTexture.diagonalJumpBlankaRight;
			punch = BlankaTexture.punchBlankaRight;
			kick =  BlankaTexture.kickBlankaRight;



			sneakPunch =  BlankaTexture.sneakpunchBlankaRight;
			sneakKick =  BlankaTexture.sneakkickBlankaRight;
			aerialKick = BlankaTexture.aerialkickBlankaRight;
			special = BlankaTexture.speicalBlankaRight;

			hitTorso = BlankaTexture.BlankaTorsoHitRight;
			idleSneak =  BlankaTexture.idleSneakBlankaRight;

			hitHead = BlankaTexture.BlankaHeadHitRight;
			knockDown = BlankaTexture.knockDownBlankaRight;
			defeat = BlankaTexture.defeatBlankaRight;



		}
		if(!right){
			idle = BlankaTexture.idleBlankaLeft;
			walk =  BlankaTexture.walkBlankaLeft;
			verticalJump =  BlankaTexture.verticalJumpBlankaLeft;
			diagonalJump =  BlankaTexture.diagonalJumpBlankaLeft;
			punch = BlankaTexture.punchBlankaLeft;
			kick =  BlankaTexture.kickBlankaLeft;



			sneakPunch =  BlankaTexture.sneakpunchBlankaLeft;
			sneakKick =  BlankaTexture.sneakkickBlankaLeft;
			aerialKick = BlankaTexture.aerialkickBlankaLeft;
			special = BlankaTexture.speicalBlankaLeft;

			hitTorso = BlankaTexture.BlankaTorsoHitLeft;
			idleSneak =  BlankaTexture.idleSneakBlankaLeft;

			hitHead = BlankaTexture.BlankaHeadHitLeft;
			knockDown = BlankaTexture.knockDownBlankaLeft;
			defeat = BlankaTexture.defeatBlankaLeft;

		}

	}

	@Override
	void jump() {
		if(!inAir){
			Thread jump = new Thread(new Runnable(){
				public void run(){
					for(int index = 0; index < 100; index++){
						y -= 4;
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
	public String toString() {
		return "Blanka";
	}



	@Override
	void punch() {
		if(!isAttacking){
			Thread punch = new Thread(new Runnable(){

				@Override
				public void run() {
					isPunching = true;
					punchIndex = 0;

					for(int index = 0; index < BlankaTexture.punchBlankaRight.length-1; index++){
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


					for(int index = 0; index < BlankaTexture.kickBlankaRight.length-1; index++){
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
		Thread special = new Thread(new Runnable(){

			@Override
			public void run() {
				isSpecial = true;
				specialIndex = 0;
				for(int index = 0; index < BlankaTexture.speicalBlankaRight.length-1; index++){
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



	@Override
	void aerialPunch() {
		if(!isAttacking){
			Thread aerialPunch = new Thread(new Runnable(){
				public void run(){
					isAerialPunching = true;
					sneakKickIndex = 0;
					for(int index = 0; index < BlankaTexture.sneakkickBlankaRight.length-1; index++){
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
					for(int index = 0; index < BlankaTexture.aerialkickBlankaRight.length-1; index++){
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
					for(int index = 0; index < BlankaTexture.sneakpunchBlankaRight.length-1; index++){
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
					for(int index = 0; index < BlankaTexture.sneakkickBlankaRight.length-1; index++){
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
				for(int index = 0; index < BlankaTexture.BlankaTorsoHitRight.length-1; index++){
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
				for(int index = 0; index < BlankaTexture.BlankaHeadHitRight.length-1; index++){
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
				for(int index = 0; index < BlankaTexture.knockDownBlankaRight.length-1; index++){
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
						setX(6);
					}
					else{
						setX(-6);
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
				for(int index = 0; index < BlankaTexture.defeatBlankaRight.length-1; index++){
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
