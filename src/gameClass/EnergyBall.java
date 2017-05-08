package gameClass;

import java.awt.Graphics;

import textureClass.RyuTexture;

public class EnergyBall extends Projectile{
	protected EnergyBall(int x, int y, int xVelo, int yVelo) {
		super(x, y, xVelo, yVelo);
	}

	@Override
	void draw(Graphics g) {
		if(xVelo>=0)
			g.drawImage(RyuTexture.energyBallRyuRight, x, y,Constants.ENERGYBALL_WIDTH.getIntValue(),Constants.ENERGYBALL_HEIGHT.getIntValue(), null);
		else
			g.drawImage(RyuTexture.energyBallRyuLeft, x, y,Constants.ENERGYBALL_WIDTH.getIntValue(),Constants.ENERGYBALL_HEIGHT.getIntValue(), null);

	


	}

}
