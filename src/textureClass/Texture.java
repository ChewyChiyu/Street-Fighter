package textureClass;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Texture {
	public static BufferedImage[] launcherSprites = new BufferedImage[1];
	/*
	 * 1. Start Up Image
	 * 
	 */
	public static BufferedImage[][] characterSelectSprites = new BufferedImage[3][3];

	
	public Texture(){
		load();
	}
	void load(){
		try{
			launcherSprites[0] = ImageIO.read(getClass().getResource("/imgs/LauncherScreen.jpg"));
		}catch(Exception e) { System.err.println("error loading textures"); }
	}
	
}
