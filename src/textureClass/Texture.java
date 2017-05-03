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
	public static BufferedImage[][] mapSelectSprites = new BufferedImage[3][3];
	public static BufferedImage selector;
	
	public Texture(){
		load();
	}
	void load(){
		try{
			int xBuffer = 0;
			int yBuffer = 200;
			BufferedImage characterHeadSpriteSheet = ImageIO.read(getClass().getResource("/imgs/CharacterHeads.png"));
			//character heads
			for(int index = 0; index < characterSelectSprites.length; index++){
				for(int subIndex = 0; subIndex < characterSelectSprites[0].length; subIndex++){
					characterSelectSprites[index][subIndex] = characterHeadSpriteSheet.getSubimage(xBuffer, yBuffer, 80, 112);
					xBuffer+=80;
					if(xBuffer>400){
						xBuffer = 0;
						yBuffer += 112;
					}
				}
			}
			//maps
			mapSelectSprites[0][0] = ImageIO.read(getClass().getResource("/imgs/BrazilBackDrop.png"));
			mapSelectSprites[0][1] = ImageIO.read(getClass().getResource("/imgs/ThailandBackDrop.png"));
			mapSelectSprites[0][2] = ImageIO.read(getClass().getResource("/imgs/JapanBackDrop.png"));
			mapSelectSprites[1][0] = ImageIO.read(getClass().getResource("/imgs/CastleBackDrop.jpg"));
			mapSelectSprites[1][1] = ImageIO.read(getClass().getResource("/imgs/HarborBackDrop.jpg"));
			mapSelectSprites[1][2] = ImageIO.read(getClass().getResource("/imgs/VegasBackDrop.png"));
			mapSelectSprites[2][0] = ImageIO.read(getClass().getResource("/imgs/Japan2BackDrop.png"));
			mapSelectSprites[2][1] = ImageIO.read(getClass().getResource("/imgs/BuddhaBackDrop.png"));
			mapSelectSprites[2][2] = ImageIO.read(getClass().getResource("/imgs/CityBackDrop.png"));

			selector = ImageIO.read(getClass().getResource("/imgs/Selector.png"));
			
			
			launcherSprites[0] = ImageIO.read(getClass().getResource("/imgs/LauncherScreen.jpg"));
		}catch(Exception e) { System.err.println("error loading textures"); }
	}
	
}
