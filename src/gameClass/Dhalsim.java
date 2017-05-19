package gameClass;

import textureClass.DeeJayTexture;
import textureClass.DhalsimTexture;

public class Dhalsim extends Character{
	public Dhalsim(CharacterInfo info, int speed, boolean right,boolean isAutomated) {
		super(CharacterInfo.DHALSIM, speed, right, isAutomated);
		this.right = right;	
			if(right){
				idle = DhalsimTexture.idleDhalsimRight;
				walk =  DhalsimTexture.walkDhalsimRight;
				verticalJump =  DhalsimTexture.jumpDhalsimRight;
				punch = DhalsimTexture.punchDhalsimRight;
				kick =  DhalsimTexture.kickDhalsimRight;
				diagonalJump = DhalsimTexture.diagonalJumpDhalsimRight;


				sneakPunch =  DhalsimTexture.sneakPunchDhalsimRight;
				sneakKick =  DhalsimTexture.sneakKickDhalsimRight;
				aerialKick = DhalsimTexture.aerialkickDhalsimRight;
				special = DhalsimTexture.speicalDhalsimRight;

				hitTorso = DhalsimTexture.DhalsimTorsoHitRight;
				idleSneak =  DhalsimTexture.idlesneakDhalsimRight;

				hitHead = DhalsimTexture.DhalsimHeadHitRight;
				knockDown = DhalsimTexture.knockDownDhalsimRight;
				defeat = DhalsimTexture.defeatDhalsimRight;
	}
			if(!right){
				idle = DhalsimTexture.idleDhalsimLeft;
				walk =  DhalsimTexture.walkDhalsimLeft;
				verticalJump =  DhalsimTexture.jumpDhalsimLeft;
				punch = DhalsimTexture.punchDhalsimLeft;
				kick =  DhalsimTexture.kickDhalsimLeft;
				diagonalJump = DhalsimTexture.diagonalJumpDhalsimLeft;



				sneakPunch =  DhalsimTexture.sneakPunchDhalsimLeft;
				sneakKick =  DhalsimTexture.sneakKickDhalsimLeft;
				aerialKick = DhalsimTexture.aerialkickDhalsimLeft;
				special = DhalsimTexture.speicalDhalsimLeft;

				hitTorso = DhalsimTexture.DhalsimTorsoHitLeft;
				idleSneak =  DhalsimTexture.idlesneakDhalsimLeft;

				hitHead = DhalsimTexture.DhalsimHeadHitLeft;
				knockDown = DhalsimTexture.knockDownDhalsimLeft;
				defeat = DhalsimTexture.defeatDhalsimLeft;
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
	void sneak() {
		isSneaking = true;
		
	}

	@Override
	void stand() {
		isSneaking = false;
	}

	@Override
	void punch() {
		if(!isAttacking){
			Thread punch = new Thread(new Runnable(){

				@Override
				public void run() {
					isPunching = true;
					punchIndex = 0;

					for(int index = 0; index < DhalsimTexture.punchDhalsimRight.length-1; index++){
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


					for(int index = 0; index < DhalsimTexture.kickDhalsimRight.length-1; index++){
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
	void aerialPunch() {
		if(!isAttacking){
			Thread aerialPunch = new Thread(new Runnable(){
				public void run(){
					isAerialPunching = true;
					sneakKickIndex = 0;
					for(int index = 0; index < DhalsimTexture.sneakKickDhalsimRight.length-1; index++){
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
					for(int index = 0; index < DhalsimTexture.aerialkickDhalsimRight.length-1; index++){
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
					for(int index = 0; index < DhalsimTexture.sneakPunchDhalsimRight.length-1; index++){
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
					for(int index = 0; index < DhalsimTexture.sneakKickDhalsimRight.length-1; index++){
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
	void special() {
		if(!isAttacking&&!isGettingKnockedDown){
			Thread special = new Thread(new Runnable(){

				@Override
				public void run() {
					isSpecial = true;
					specialIndex = 0;
					for(int index = 0; index < DhalsimTexture.speicalDhalsimRight.length-1; index++){
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
	void getHitTorso() {
		Thread gettingHit = new Thread(new Runnable(){
			public void run(){
				isGettingHitTorso = true;
				gettingHitTorsoIndex = 0;
				for(int index = 0; index < DhalsimTexture.DhalsimTorsoHitRight.length-1; index++){
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
				for(int index = 0; index < DhalsimTexture.DhalsimHeadHitRight.length-1; index++){
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
				for(int index = 0; index < DhalsimTexture.knockDownDhalsimRight.length-1; index++){
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
				for(int index = 0; index < DhalsimTexture.defeatDhalsimRight.length-1; index++){
					defeatedIndex++;
					try{
						Thread.sleep(200);
					}catch(Exception e) { }
				}		
			}
		});
		defeat.start();		
	}

	@Override
	public String toString() {
		
		return "Dhalsim";
	}
}
