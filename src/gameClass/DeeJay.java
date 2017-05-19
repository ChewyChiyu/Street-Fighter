package gameClass;

import java.awt.Graphics;
import java.awt.Image;

import textureClass.DeeJayTexture;

public class DeeJay extends Character {
	boolean right;
	protected DeeJay(CharacterInfo info, int speed, boolean right,boolean isAutomated) {
		super(CharacterInfo.DEEJAY, speed, right, isAutomated);
		this.right = right;	
		
		

		if(right){
			idle = DeeJayTexture.idleDeeJayRight;
			walk =  DeeJayTexture.walkDeeJayRight;
			verticalJump =  DeeJayTexture.verticalJumpDeeJayRight;
			diagonalJump =  DeeJayTexture.diagonalJumpDeeJayRight;
			punch = DeeJayTexture.punchDeeJayRight;
			kick =  DeeJayTexture.kickDeeJayRight;



			sneakPunch =  DeeJayTexture.sneakpunchDeeJayRight;
			sneakKick =  DeeJayTexture.sneakkickDeeJayRight;
			aerialKick = DeeJayTexture.aerialkickDeeJayRight;
			special = DeeJayTexture.speicalDeeJayRight;

			hitTorso = DeeJayTexture.DeeJayTorsoHitRight;
			idleSneak =  DeeJayTexture.idleSneakDeeJayRight;

			hitHead = DeeJayTexture.DeeJayHeadHitRight;
			knockDown = DeeJayTexture.knockDownDeeJayRight;
			defeat = DeeJayTexture.defeatDeeJayRight;



		}
		if(!right){
			idle = DeeJayTexture.idleDeeJayLeft;
			walk =  DeeJayTexture.walkDeeJayLeft;
			verticalJump =  DeeJayTexture.verticalJumpDeeJayLeft;
			diagonalJump =  DeeJayTexture.diagonalJumpDeeJayLeft;
			punch = DeeJayTexture.punchDeeJayLeft;
			kick =  DeeJayTexture.kickDeeJayLeft;



			sneakPunch =  DeeJayTexture.sneakpunchDeeJayLeft;
			sneakKick =  DeeJayTexture.sneakkickDeeJayLeft;
			aerialKick = DeeJayTexture.aerialkickDeeJayLeft;
			special = DeeJayTexture.speicalDeeJayLeft;

			hitTorso = DeeJayTexture.DeeJayTorsoHitLeft;
			idleSneak =  DeeJayTexture.idleSneakDeeJayLeft;

			hitHead = DeeJayTexture.DeeJayHeadHitLeft;
			knockDown = DeeJayTexture.knockDownDeeJayLeft;
			defeat = DeeJayTexture.defeatDeeJayLeft;

		}

	}

	@Override
	void jump() {
		if(!inAir){
			Thread jump = new Thread(new Runnable(){
				public void run(){
					for(int index = 0; index < 100; index++){
						y -= 5;
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
		return "DeeJay";
	}



	@Override
	void punch() {
		if(!isAttacking){
			Thread punch = new Thread(new Runnable(){

				@Override
				public void run() {
					isPunching = true;
					punchIndex = 0;

					for(int index = 0; index < DeeJayTexture.punchDeeJayRight.length-1; index++){
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


					for(int index = 0; index < DeeJayTexture.kickDeeJayRight.length-1; index++){
						kickIndex++;
						try{
							Thread.sleep(40);
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
			Thread special = new Thread(new Runnable(){

				@Override
				public void run() {
					isSpecial = true;
					specialIndex = 0;
					for(int index = 0; index < DeeJayTexture.speicalDeeJayRight.length-1; index++){
						specialIndex++;
						try{
							Thread.sleep(50);
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
					for(int index = 0; index < DeeJayTexture.sneakkickDeeJayRight.length-1; index++){
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
					for(int index = 0; index < DeeJayTexture.aerialkickDeeJayRight.length-1; index++){
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
					for(int index = 0; index < DeeJayTexture.sneakpunchDeeJayRight.length-1; index++){
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
					for(int index = 0; index < DeeJayTexture.sneakkickDeeJayRight.length-1; index++){
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
				for(int index = 0; index < DeeJayTexture.DeeJayTorsoHitRight.length-1; index++){
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
				for(int index = 0; index < DeeJayTexture.DeeJayHeadHitRight.length-1; index++){
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
				for(int index = 0; index < DeeJayTexture.knockDownDeeJayRight.length-1; index++){
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
				for(int index = 0; index < DeeJayTexture.defeatDeeJayRight.length-1; index++){
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
