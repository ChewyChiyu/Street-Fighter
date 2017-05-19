package gameClass;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.Timer;
public abstract class Character extends GameObject {

	protected boolean isAutomated;
	protected boolean right;
	protected CharacterInfo info;

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

	protected volatile int health = 100;

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
						Thread.sleep(500);
					}catch(Exception e) { }
				}
			}
		});
		Thread mindAI = new Thread(new Runnable(){
			public void run(){
				while(FightPanelLauncher.isRunning){
					System.out.println("AI GOES HERE");
					/*
					*move , xVelo(speed)
					* 
					* 
					* 
					* 
					*/
					int rand=(int) (Math.random()*8);
					if(!defeated){
						if(FightPanelLauncher.c2.getX()>500 && FightPanelLauncher.c.getX()!=0)
							setXVelo(-speed);


						if(Math.abs(FightPanelLauncher.c.getX()-FightPanelLauncher.c2.getX())<=150){
							setXVelo(-speed);
							if(Math.abs(FightPanelLauncher.c.getX()-FightPanelLauncher.c2.getX())<=70){
								setXVelo(0);
							}
							if(rand!=0){
								if(isAttacking){
									sneak();
									stand();
								}
//								if()
								if(rand==1)
									kick();
								else if(rand==2)
									kick();
								else if(rand==3)
									special();
								else if(rand==4){
									jump();
									aerialKick();
									stand();
								}
								else if(rand==5){
									jump();
									aerialPunch();
									stand();
								}
								else if(rand==6){
									sneak();
									sneakPunch();
									stand();
								}
								else if(rand==7){
									sneak();
									sneakKick();
									stand();
								}
									
								else if(rand==8)
									punch();
							}
							
						}
						if(FightPanelLauncher.c2.getHealth()<70 && FightPanelLauncher.c2.getX()<500){
//							while(FightPanelLauncher.c2.getX()<500)
							setXVelo(speed);
							if(!isSneaking)
								special();
							else{
								sneak();
								sneakPunch();
								sneakKick();
								stand();
							}
						}
						System.out.println("C getX: "+FightPanelLauncher.c.getX());
						System.out.println("C2 getX: "+FightPanelLauncher.c2.getX());
					
					}
//					punch();
					
				
					
//					System.out.println("Distance: "+ FightPanelLauncher.c.getBody()-FightPanelLauncher.c2.getBody() );
					try{
						Thread.sleep(500);
					}catch(Exception e) { }
				}
			}
		});
		if(isAutomated)
			mindAI.start();
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
			body = new HitBox(x,y,(int)(getInfo().getWidth()*.75),(int)(getInfo().getHeight()*.50));
			head = new HitBox(x,y,(int)(getInfo().getWidth()*.75),(int)(getInfo().getHeight()*.2));
			legs = new HitBox(x,y,(int)(getInfo().getWidth()*.75),(int)(getInfo().getHeight()*.3));
		}else{
			body =  new HitBox(leftStart,y,(int)(getInfo().getWidth()*.75),(int)(getInfo().getHeight()*.50));
			head = new HitBox(leftStart,y,(int)(getInfo().getWidth()*.75),(int)(getInfo().getHeight()*.2));
			legs = new HitBox(leftStart,y,(int)(getInfo().getWidth()*.75),(int)(getInfo().getHeight()*.3));

		}



		if(!right){
			x = leftStart;
		}


		gravity = true;

	}
	int getHealth(){
		return health;
	}
	void isDead(int power){
		if((health-=power)<=0){
			defeated();
		}
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
		if(isAttacking||isGettingHitHead||isGettingHitTorso||isGettingKnockedDown){
			return;
		}
			
		if(xVelo==0&&yVelo==0 &&!isSneaking){
			//idle
			idleIndex++;
			if(idleIndex>idle.length-1){
				idleIndex = 0;
			}
		}else if(xVelo!=0&&yVelo==0){
			walkIndex++;
			if(walkIndex>walk.length-1){
				walkIndex = 0;
			}
		}else if(xVelo==0&&yVelo!=0){
			vertialJumpIndex++;
			if(vertialJumpIndex>verticalJump.length-1){
				vertialJumpIndex = 0;
			}
		}else if(xVelo!=0&&yVelo!=0){
			diagonalJumpIndex++;
			if(diagonalJumpIndex>diagonalJump.length-1){
				diagonalJumpIndex = 0;
			}
		}
	}
	void draw(Graphics g) {
		final int SCALE = 5;
		if(defeated){
			g.drawImage(defeat[defeatedIndex].getScaledInstance(defeat[defeatedIndex].getWidth()*SCALE,defeat[defeatedIndex].getHeight()*SCALE, Image.SCALE_DEFAULT),x,(int) (y+(defeat[defeatedIndex].getHeight()*SCALE)*.7), null);

			return;
		}
		if(isGettingKnockedDown){
			g.drawImage(knockDown[gettingKnockedDownIndex].getScaledInstance(knockDown[gettingKnockedDownIndex].getWidth()*SCALE,knockDown[gettingKnockedDownIndex].getHeight()*SCALE, Image.SCALE_DEFAULT),x, (int) (y+(knockDown[gettingKnockedDownIndex].getHeight()*SCALE)*.15), null);
			return;
		}
		if(isGettingHitTorso){
			g.drawImage(hitTorso[gettingHitTorsoIndex].getScaledInstance(hitTorso[gettingHitTorsoIndex].getWidth()*SCALE,hitTorso[gettingHitTorsoIndex].getHeight()*SCALE, Image.SCALE_DEFAULT),x,y, null);
			return;
		}

		if(isGettingHitHead){
			g.drawImage(hitHead[gettingHitHeadIndex].getScaledInstance(hitHead[gettingHitHeadIndex].getWidth()*SCALE,hitHead[gettingHitHeadIndex].getHeight()*SCALE, Image.SCALE_DEFAULT),x,y, null);
			return;
		}


		if(isSpecial){
			g.drawImage(special[specialIndex].getScaledInstance(special[specialIndex].getWidth()*SCALE,special[specialIndex].getHeight()*SCALE, Image.SCALE_DEFAULT),x,y, null);
			return;
		}
		if(isPunching){
			g.drawImage(punch[punchIndex].getScaledInstance(punch[punchIndex].getWidth()*SCALE,punch[punchIndex].getHeight()*SCALE, Image.SCALE_DEFAULT),x,y, null);
			return;
		}
		if(isLowPunching){
			g.drawImage(sneakPunch[sneakPunchIndex].getScaledInstance(sneakPunch[sneakPunchIndex].getWidth()*SCALE,sneakPunch[sneakPunchIndex].getHeight()*SCALE, Image.SCALE_DEFAULT),x,(int) (y+(sneakPunch[sneakPunchIndex].getHeight()*SCALE)*.15), null);
			return;

		}
		if(isAerialPunching){
			g.drawImage(sneakKick[sneakKickIndex].getScaledInstance(sneakKick[sneakKickIndex].getWidth()*SCALE,sneakKick[sneakKickIndex].getHeight()*SCALE, Image.SCALE_DEFAULT),x,(int) (y+(sneakKick[sneakKickIndex].getHeight()*SCALE)*.15), null);
			return;
		}
		if(isAerialKicking){
			g.drawImage(aerialKick[aerialKickIndex].getScaledInstance(aerialKick[aerialKickIndex].getWidth()*SCALE,aerialKick[aerialKickIndex].getHeight()*SCALE, Image.SCALE_DEFAULT),x,y, null);
			return;
		}
		if(isLowKicking){
			g.drawImage(sneakKick[sneakKickIndex].getScaledInstance(sneakKick[sneakKickIndex].getWidth()*SCALE,sneakKick[sneakKickIndex].getHeight()*SCALE, Image.SCALE_DEFAULT),x,(int) (y+(sneakKick[sneakKickIndex].getHeight()*SCALE)*.15), null);
			return;
		}
		if(isKicking){
			g.drawImage(kick[kickIndex].getScaledInstance(kick[kickIndex].getWidth()*SCALE,kick[kickIndex].getHeight()*SCALE, Image.SCALE_DEFAULT),x,y, null);
			return;
		}
		if(xVelo==0&&yVelo==0){
			if(!isSneaking){
				g.drawImage(idle[idleIndex].getScaledInstance(idle[idleIndex].getWidth()*SCALE,idle[idleIndex].getHeight()*SCALE, Image.SCALE_DEFAULT),x,y, null);
			}else{
				g.drawImage(idleSneak[0].getScaledInstance(idleSneak[0].getWidth()*SCALE,(int) (idleSneak[0].getHeight()*SCALE*.8), Image.SCALE_DEFAULT),x,(int) (y+(idleSneak[0].getHeight()*SCALE)*.5), null);
			}
		}else if(xVelo!=0 && yVelo== 0){
			g.drawImage(walk[walkIndex].getScaledInstance(walk[walkIndex].getWidth()*SCALE,walk[walkIndex].getHeight()*SCALE, Image.SCALE_DEFAULT),x,y, null);
		}else if(xVelo==0&&yVelo!=0){
			g.drawImage(verticalJump[vertialJumpIndex].getScaledInstance(verticalJump[vertialJumpIndex].getWidth()*SCALE,verticalJump[vertialJumpIndex].getHeight()*SCALE, Image.SCALE_DEFAULT),x,y, null);
		}else if(xVelo!=0&&yVelo!=0){
			g.drawImage(diagonalJump[diagonalJumpIndex].getScaledInstance(diagonalJump[diagonalJumpIndex].getWidth()*SCALE,diagonalJump[diagonalJumpIndex].getHeight()*SCALE, Image.SCALE_DEFAULT),x,y, null);
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
