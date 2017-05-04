package gameClass;

import java.awt.Graphics;

public abstract class Character {
	private CharacterInfo info;
	
	 int x;
	 int y;
	 int speed;
	 int xVelo;
	 int yVelo;
	 
	 boolean inAir = false;
	protected Character(CharacterInfo info, int speed){
		this.info = info;
		this.speed = speed;
	}
	
	CharacterInfo getInfo(){
		return info;
	}
	void setSpeed(int inc){
		speed = inc;
	}
	int getSpeed(){
		return speed;
	}
	void setX(int inc){
		x += inc;
	}
	void setY(int inc){
		y += inc;
	}
	int getX(){
		return x;
	}
	int getY(){
		return y;
	}
	void setXVelo(int inc){
		xVelo = inc;
	}
	void setYVelo(int inc){
		yVelo = inc;
	}
	int getXVelo(){
		return xVelo;
	}
	int getYVelo(){
		return yVelo;
	}
	abstract void jump();
	abstract void draw(Graphics g);
	abstract void sneak();
	abstract void stand();
	abstract void incrementMoveIndex();
	abstract void punch();
	abstract void kick();
	public abstract String toString();
}
