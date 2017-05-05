package gameClass;

import javax.swing.Timer;
public abstract class Character extends GameObject {
	
	private CharacterInfo info;


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
	
	
	protected volatile boolean isAttacking = false;

	
	
	protected volatile boolean isPunching = false;
	protected volatile boolean isKicking = false;
	protected volatile boolean isSneaking = false;
	protected volatile boolean isSpecial = false;
	protected volatile boolean isLowPunching = false;
	protected volatile boolean isLowKicking = false;
	protected volatile boolean isAerialPunching = false;
	protected volatile boolean isAerialKicking = false;
	protected Character(CharacterInfo info, int speed){
		this.info = info;
		this.speed = speed;
		gravity = true;
		Timer checkIfAttack = new Timer(1 , e->{
			if(isPunching||isKicking||isSpecial||isLowPunching||isLowKicking||isAerialPunching||isAerialKicking){
				isAttacking = true;
			}else{
				isAttacking = false;
			}
		});
		checkIfAttack.start();
		
	}
	
	CharacterInfo getInfo(){
		return info;
	}
	
	abstract void jump();
	abstract void sneak();
	abstract void stand();
	abstract void incrementMoveIndex();
	abstract void punch();
	abstract void kick();
	abstract void aerialPunch();
	abstract void aerialKick();
	abstract void sneakPunch();
	abstract void sneakKick();
	abstract void special();
	public abstract String toString();
}
