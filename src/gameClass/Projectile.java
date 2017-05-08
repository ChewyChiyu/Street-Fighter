package gameClass;


public abstract class Projectile extends GameObject {
	
	
	protected Projectile(int x, int y, int xVelo, int yVelo){
		g = GameType.PROJECTILE;
		this.x = x;
		this.y = y;
		this.xVelo = xVelo;
		this.yVelo = yVelo;
		gravity = false;
		body = new HitBox(x,y,Constants.ENERGYBALL_WIDTH.getIntValue(),Constants.ENERGYBALL_HEIGHT.getIntValue());
	}
	
	 
}
