package gameClass;


public abstract class Projectile extends GameObject {
	
	
	protected Projectile(int x, int y, int xVelo, int yVelo){
		g = GameType.PROJECTILE;
		this.x = x;
		this.y = y;
		this.xVelo = xVelo;
		this.yVelo = yVelo;
		width = 100;
		height = 100;
		gravity = false;
		body = new HitBox(x,y,width,height);
	}
	
	 
}
