package gameClass;

import java.awt.Graphics;

public abstract class GameObject {

	 protected int x;
	 protected int y;
	 protected int speed;
	 protected int xVelo;
	 protected int yVelo;
	 protected boolean inAir;
	 protected boolean gravity;
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
		abstract void draw(Graphics g);
}
