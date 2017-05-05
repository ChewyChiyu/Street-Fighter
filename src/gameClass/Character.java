package gameClass;



public abstract class Character extends GameObject {
	
	private CharacterInfo info;
	
	protected Character(CharacterInfo info, int speed){
		this.info = info;
		this.speed = speed;
		gravity = true;
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
	abstract void special();
	public abstract String toString();
}
