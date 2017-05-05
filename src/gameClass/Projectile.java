package gameClass;


public abstract class Projectile extends GameObject {
	
	
	protected Projectile(int x, int y, int xVelo, int yVelo){
		this.x = x;
		this.y = y;
		this.xVelo = xVelo;
		this.yVelo = yVelo;
		gravity = false;
	}
	
	 
}
