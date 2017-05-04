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
	
	//RYU CHARACTER SPRITES
	public static BufferedImage[] idleRyuRight = new BufferedImage[4];
	public static BufferedImage[] walkRyuRight = new BufferedImage[6];
	public static BufferedImage[] verticalJumpRyuRight = new BufferedImage[5];
	public static BufferedImage[] diagonalJumpRyuRight = new BufferedImage[3];
	//END OF RYU CHARACTER SPRITES
	
	public Texture(){
		load();
	}
	void load(){
		ryuSprites();
		mapSprites();
		characterHeadSprites();
	}
	void characterHeadSprites(){
		try{
		int xBuffer = 0;
		int yBuffer = 200;
		BufferedImage characterHeadSpriteSheet = ImageIO.read(getClass().getResource("/imgs/characters/CharacterHeads.png"));
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
		}catch(Exception e) { }
	}
	void mapSprites(){
		try{
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
			
			launcherSprites[0] = ImageIO.read(getClass().getResource("/imgs/maps/LauncherScreen.jpg"));
		
		}catch(Exception e){ }
	}
	void ryuSprites(){
		try{
			BufferedImage ryuSpriteSheetRight = ImageIO.read(getClass().getResource("/imgs/characters/RyuSpriteSheetRight.png"));
			
			int xBuffer = 0;
			int yBuffer = 15;
			//idle
			for(int index = 0; index < idleRyuRight.length; index++){
				idleRyuRight[index] = ryuSpriteSheetRight.getSubimage(xBuffer, yBuffer, 50, 85);
				xBuffer +=50;
			}
			//walk
			for(int index = 0; index < walkRyuRight.length; index++){
				walkRyuRight[index] = ryuSpriteSheetRight.getSubimage(xBuffer, yBuffer, 50, 85);
				xBuffer +=50;
			}
			//vertial jump
			for(int index = 0; index < verticalJumpRyuRight.length; index++){
				verticalJumpRyuRight[index] = ryuSpriteSheetRight.getSubimage(xBuffer, yBuffer, 39, 85);
				xBuffer +=39;
			}
			//diagonal jump
			xBuffer = 833;
			diagonalJumpRyuRight[0] = ryuSpriteSheetRight.getSubimage(xBuffer, yBuffer, 67, 85);
			xBuffer+=67;
			diagonalJumpRyuRight[1] = ryuSpriteSheetRight.getSubimage(xBuffer, yBuffer, 40, 85);
			xBuffer+=40;
			diagonalJumpRyuRight[2] = ryuSpriteSheetRight.getSubimage(xBuffer, yBuffer, 67, 85);
			xBuffer+=67;
		
		}catch(Exception e){ }
	}
}
