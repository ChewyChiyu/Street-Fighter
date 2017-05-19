package textureClass;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class MapTexture extends Texture{
	public static BufferedImage[] launcherSprites = new BufferedImage[1];
	/*
	 * 1. Start Up Image
	 * 
	 */
	public static BufferedImage[] characterSelectSprites = new BufferedImage[5];
	public static BufferedImage[] characterSelectSpritesFlipped = new BufferedImage[5];
	public static BufferedImage[][] mapSelectSprites = new BufferedImage[3][3];
	public static BufferedImage selector, player1Selector, player2Selector;
	public static BufferedImage characterSelectBackground;
	public static BufferedImage koLogo;
	public static BufferedImage koEndLogo;
	protected MapTexture(){
		characterHeadSprites();
		mapSprites();
	}
	void characterHeadSprites(){
		try{
		int xBuffer = 0;
		int yBuffer = 200;
		BufferedImage characterHeadSpriteSheet = ImageIO.read(getClass().getResource("/imgs/characters/CharacterHeads.png"));
		//character heads
		for(int index = 0; index < characterSelectSprites.length; index++){
				characterSelectSprites[index] = characterHeadSpriteSheet.getSubimage(xBuffer, yBuffer, 80, 112);
				xBuffer+=80;	
		}
		 
		 xBuffer = 538;
		 yBuffer = 200;
		BufferedImage characterHeadSpriteSheetflipped = ImageIO.read(getClass().getResource("/imgs/characters/CharacterHeadsFlipped.png"));
		//character heads
		for(int index = 0; index < characterSelectSpritesFlipped.length; index++){
			characterSelectSpritesFlipped[index] = characterHeadSpriteSheetflipped.getSubimage(xBuffer-80, yBuffer, 80, 112);
				xBuffer-=80;	
		}
		}catch(Exception e) { }
	}
	void mapSprites(){
		try{
			characterSelectBackground = ImageIO.read(getClass().getResource("/imgs/maps/CharacterSelectBackGround.png"));
			//KO LOGO
			koLogo = ImageIO.read(getClass().getResource("/imgs/maps/KO.png"));
			koLogo = koLogo.getSubimage(0, 0, 460, 180);
			koEndLogo = ImageIO.read(getClass().getResource("/imgs/maps/KOEND.png"));
			//maps
			mapSelectSprites[0][0] = ImageIO.read(getClass().getResource("/imgs/maps/BrazilBackDrop.png"));
			mapSelectSprites[0][1] = ImageIO.read(getClass().getResource("/imgs/maps/ThailandBackDrop.png"));
			mapSelectSprites[0][2] = ImageIO.read(getClass().getResource("/imgs/maps/JapanBackDrop.png"));
			mapSelectSprites[1][0] = ImageIO.read(getClass().getResource("/imgs/maps/CastleBackDrop.jpg"));
			mapSelectSprites[1][1] = ImageIO.read(getClass().getResource("/imgs/maps/HarborBackDrop.jpg"));
			mapSelectSprites[1][2] = ImageIO.read(getClass().getResource("/imgs/maps/VegasBackDrop.png"));
			mapSelectSprites[2][0] = ImageIO.read(getClass().getResource("/imgs/maps/Japan2BackDrop.png"));
			mapSelectSprites[2][1] = ImageIO.read(getClass().getResource("/imgs/maps/BuddhaBackDrop.png"));
			mapSelectSprites[2][2] = ImageIO.read(getClass().getResource("/imgs/maps/CityBackDrop.png"));

			selector = ImageIO.read(getClass().getResource("/imgs/maps/Selector.png"));
			player1Selector = ImageIO.read(getClass().getResource("/imgs/maps/Player1Selector.png"));
			player2Selector = ImageIO.read(getClass().getResource("/imgs/maps/Player2Selector.png"));

			launcherSprites[0] = ImageIO.read(getClass().getResource("/imgs/maps/LauncherScreen.jpg"));
		
		}catch(Exception e){ }
	}
	
}
