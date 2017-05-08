package gameClass;

import java.awt.image.BufferedImage;

import javax.swing.Timer;
public abstract class Character extends GameObject {

	private boolean isAutomated;
	protected boolean right;
	private CharacterInfo info;

	protected HitBox head;
	protected HitBox legs;
	protected volatile int idleIndex = 0;
	protected volatile int walkIndex = 0;
	protected volatile int vertialJumpIndex = 0;
	protected volatile int diagonalJumpIndex = 0;
	protected volatile int punchIndex = 0;
	protected volatile int kickIndex = 0;
	protected volatile int sneakPunchIndex = 0;
	protected volatile int sneakKickIndex = 0;
	protected volatile int aerialKickIndex = 0;
	protected volatile int specialIndex = 0;

	protected volatile int gettingHitTorsoIndex = 0;
	protected volatile int gettingHitHeadIndex = 0;
	protected volatile int gettingKnockedDownIndex = 0;
	protected volatile int defeatedIndex = 0;



	protected volatile boolean isAttacking = false;



	protected volatile boolean isPunching = false;
	protected volatile boolean isKicking = false;
	protected volatile boolean isSneaking = false;
	protected volatile boolean isSpecial = false;
	protected volatile boolean isLowPunching = false;
	protected volatile boolean isLowKicking = false;
	protected volatile boolean isAerialPunching = false;
	protected volatile boolean isAerialKicking = false;

	protected volatile boolean isGettingHitTorso = false;
	protected volatile boolean isGettingHitHead = false;
	protected volatile boolean isGettingKnockedDown = false;
	protected volatile boolean defeated = false;


	protected BufferedImage[] idle;
	protected BufferedImage[] walk;
	protected BufferedImage[] verticalJump;
	protected BufferedImage[] diagonalJump;
	protected BufferedImage[] punch;
	protected BufferedImage[] kick;

	protected BufferedImage[] idleSneak;
	protected BufferedImage[] sneakPunch;
	protected BufferedImage[] sneakKick;
	protected BufferedImage[] aerialKick;
	protected BufferedImage[] special;

	protected BufferedImage[]  hitTorso;	
	protected BufferedImage[]  hitHead;
	protected BufferedImage[] knockDown;
	protected BufferedImage[] defeat;

	protected boolean justAttacked = false;

	protected void characterLoops(){
		Thread move = new Thread(new Runnable(){
			public void run(){
				while(FightPanelLauncher.isRunning){
					incrementMoveIndex();
					try{
						Thread.sleep(100);
					}catch(Exception e) { } 
				}
			}
		});
		Thread checkIfAttack = new Thread(new Runnable(){
			public void run(){
				while(FightPanelLauncher.isRunning){
					if(isPunching||isKicking||isSpecial||isLowPunching||isLowKicking||isAerialPunching||isAerialKicking){
						isAttacking = true;
					}else{
						isAttacking = false;
					}
					try{
						Thread.sleep(1);
					}catch(Exception e) { } 
				}
			}
		});
		Thread recentAttack = new Thread(new Runnable(){
			public void run(){
				while(FightPanelLauncher.isRunning){
					if(justAttacked){
						justAttacked = false;
					}
					try{
						Thread.sleep(1000);
					}catch(Exception e) { }
				}
			}
		});
		recentAttack.start();
		move.start();
		checkIfAttack.start();
	}



	protected Character(CharacterInfo info, int speed, boolean right, boolean isAutomated){
		this.right = right;
		this.info = info;
		this.speed = speed;
		this.isAutomated = isAutomated;
		g = GameType.PLAYER;
		final int leftStart = (int)(Constants.SCREEN_WIDTH.getIntValue()*.8);
		if(right){
			body = new HitBox(x+(int)(Constants.PLAYER_WIDTH.getIntValue()*.2),y+(int)(Constants.PLAYER_HEIGHT.getIntValue()*.2),(int)(Constants.PLAYER_WIDTH.getIntValue()*.5),(int)(Constants.PLAYER_HEIGHT.getIntValue()*.50));
			head = new HitBox(x+(int)(Constants.PLAYER_WIDTH.getIntValue()*.2),y,(int)(Constants.PLAYER_WIDTH.getIntValue()*.5),(int)(Constants.PLAYER_HEIGHT.getIntValue()*.2));
			legs = new HitBox(x+(int)(Constants.PLAYER_WIDTH.getIntValue()*.6),y+(int)(Constants.PLAYER_HEIGHT.getIntValue()*.8),(int)(Constants.PLAYER_WIDTH.getIntValue()*.5),(int)(Constants.PLAYER_HEIGHT.getIntValue()*.3));
		}else{
			body =  new HitBox(leftStart+(int)(Constants.PLAYER_WIDTH.getIntValue()*.2),y+(int)(Constants.PLAYER_HEIGHT.getIntValue()*.2),(int)(Constants.PLAYER_WIDTH.getIntValue()*.5),(int)(Constants.PLAYER_HEIGHT.getIntValue()*.50));
			head = new HitBox(leftStart+(int)(Constants.PLAYER_WIDTH.getIntValue()*.2),y,(int)(Constants.PLAYER_WIDTH.getIntValue()*.5),(int)(Constants.PLAYER_HEIGHT.getIntValue()*.2));
			legs = new HitBox(leftStart+(int)(Constants.PLAYER_WIDTH.getIntValue()*.2),y+(int)(Constants.PLAYER_HEIGHT.getIntValue()*.8),(int)(Constants.PLAYER_WIDTH.getIntValue()*.5),(int)(Constants.PLAYER_HEIGHT.getIntValue()*.3));

		}



		if(!right){
			x = leftStart;
		}


		gravity = true;

	}
	HitBox getHead(){
		return head;
	}
	HitBox getLegs(){
		return legs;
	}
	CharacterInfo getInfo(){
		return info;
	}
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
	abstract void jump();
	abstract void sneak();
	abstract void stand();
	abstract void punch();
	abstract void kick();
	abstract void aerialPunch();
	abstract void aerialKick();
	abstract void sneakPunch();
	abstract void sneakKick();
	abstract void special();
	abstract void getHitTorso();
	abstract void getHitHead();
	abstract void getKnockedDown();
	abstract void defeated();
	public abstract String toString();
}
