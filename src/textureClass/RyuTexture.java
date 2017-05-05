package textureClass;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class RyuTexture extends Texture{
	//RYU CHARACTER SPRITES
		public static BufferedImage[] idleRyuRight = new BufferedImage[4];
		public static BufferedImage[] walkRyuRight = new BufferedImage[6];
		public static BufferedImage[] verticalJumpRyuRight = new BufferedImage[5];
		public static BufferedImage[] diagonalJumpRyuRight = new BufferedImage[3];
		public static BufferedImage[] punchRyuRight = new BufferedImage[6];
		public static BufferedImage[] kickRyuRight = new BufferedImage[8];
		
		public static BufferedImage[] idleSneakRyuRight = new BufferedImage[1];
		public static BufferedImage[] sneakPunchRyuRight = new BufferedImage[7];
		public static BufferedImage[] sneakKickRyuRight = new BufferedImage[4];
		public static BufferedImage[] aerialKickRyuRight = new BufferedImage[8];
		
		public static BufferedImage[] speicalRyuRight = new BufferedImage[5];
		public static BufferedImage energyBallRyuRight;
		
		public static BufferedImage[] ryuTorsoHitRight = new BufferedImage[4];
		
		//END OF RYU CHARACTER SPRITES
	protected RyuTexture(){
	loadRight();	
	loadLeft();
	}
	void loadLeft(){
		
	}
	void loadRight(){
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
				//punch
				xBuffer = 0;
				yBuffer = 127;
				punchRyuRight[0] = ryuSpriteSheetRight.getSubimage(xBuffer, yBuffer,50 ,94);
				xBuffer+=50;
				punchRyuRight[1] = ryuSpriteSheetRight.getSubimage(xBuffer, yBuffer,66 ,94);
				xBuffer+=66;
				punchRyuRight[2] = ryuSpriteSheetRight.getSubimage(xBuffer, yBuffer,50 ,94);
				xBuffer+=50;
				punchRyuRight[3] = ryuSpriteSheetRight.getSubimage(xBuffer, yBuffer,50 ,94);
				xBuffer+=50;
				punchRyuRight[4] = ryuSpriteSheetRight.getSubimage(xBuffer, yBuffer,64 ,94);
				xBuffer+=64;
				punchRyuRight[5] = ryuSpriteSheetRight.getSubimage(xBuffer, yBuffer,70 ,94);
				xBuffer+=70;
				//kick
				xBuffer = 0;
				yBuffer = 250;
				kickRyuRight[0] = ryuSpriteSheetRight.getSubimage(xBuffer, yBuffer,55 ,94);
				xBuffer+=55;
				kickRyuRight[1] = ryuSpriteSheetRight.getSubimage(xBuffer, yBuffer,80 ,94);
				xBuffer+=80;
				kickRyuRight[2] = ryuSpriteSheetRight.getSubimage(xBuffer, yBuffer,49 ,94);
				xBuffer+=49;
				kickRyuRight[3] = ryuSpriteSheetRight.getSubimage(xBuffer, yBuffer,57 ,94);
				xBuffer+=57;
				kickRyuRight[4] = ryuSpriteSheetRight.getSubimage(xBuffer, yBuffer,61 ,94);
				xBuffer+=61;
				kickRyuRight[5] = ryuSpriteSheetRight.getSubimage(xBuffer, yBuffer,77 ,94);
				xBuffer+=77;
				kickRyuRight[6] = ryuSpriteSheetRight.getSubimage(xBuffer, yBuffer,66 ,94);
				xBuffer+=66;
				kickRyuRight[7] = ryuSpriteSheetRight.getSubimage(xBuffer, yBuffer,54 ,94);
				xBuffer+=54;
				
				//idle sneak
				
				idleSneakRyuRight[0] = ryuSpriteSheetRight.getSubimage(1163, 45, 41, 55);
				
				//sneak punch
				xBuffer = 15;
				yBuffer = 417;
				
				sneakPunchRyuRight[0] = ryuSpriteSheetRight.getSubimage(xBuffer, yBuffer, 49, 55);
				xBuffer += 49;
				sneakPunchRyuRight[1] = ryuSpriteSheetRight.getSubimage(xBuffer, yBuffer, 70, 55);
				xBuffer += 70;
				sneakPunchRyuRight[2] = ryuSpriteSheetRight.getSubimage(xBuffer, yBuffer, 47, 55);
				xBuffer += 47;
				sneakPunchRyuRight[3] = ryuSpriteSheetRight.getSubimage(xBuffer, yBuffer, 52, 55);
				xBuffer += 52;
				sneakPunchRyuRight[4] = ryuSpriteSheetRight.getSubimage(xBuffer, yBuffer, 68, 55);
				xBuffer += 68;
				sneakPunchRyuRight[5] = ryuSpriteSheetRight.getSubimage(xBuffer, yBuffer, 49, 55);
				xBuffer += 49;
				sneakPunchRyuRight[6] = ryuSpriteSheetRight.getSubimage(xBuffer, yBuffer, 51, 55);
				xBuffer += 51;
				
				//sneak kick
				xBuffer = 613;
				yBuffer = 407;
				sneakKickRyuRight[0] = ryuSpriteSheetRight.getSubimage(xBuffer, yBuffer, 48, 70);
				xBuffer += 48;
				sneakKickRyuRight[1] = ryuSpriteSheetRight.getSubimage(xBuffer, yBuffer, 55, 70);
				xBuffer += 55;
				sneakKickRyuRight[2] = ryuSpriteSheetRight.getSubimage(xBuffer, yBuffer, 74, 70);
				xBuffer += 74;
				sneakKickRyuRight[3] = ryuSpriteSheetRight.getSubimage(xBuffer, yBuffer, 56, 70);
				xBuffer += 56;
				
				//aerial kick
				aerialKickRyuRight[0] = ryuSpriteSheetRight.getSubimage(946, 523, 52, 94);
				aerialKickRyuRight[1] = ryuSpriteSheetRight.getSubimage(1000, 503, 44, 77);
				aerialKickRyuRight[2] = ryuSpriteSheetRight.getSubimage(1050, 490, 68, 98);
				aerialKickRyuRight[3] = ryuSpriteSheetRight.getSubimage(1114, 491, 45, 94);
				aerialKickRyuRight[4] = ryuSpriteSheetRight.getSubimage(1156, 498, 67, 81);
				aerialKickRyuRight[5] = ryuSpriteSheetRight.getSubimage(1228, 494, 51, 85);
				aerialKickRyuRight[6] = ryuSpriteSheetRight.getSubimage(1286, 499, 41, 88);
				aerialKickRyuRight[7] = ryuSpriteSheetRight.getSubimage(1331, 533, 37, 81);
				
				//speical
				speicalRyuRight[0]  = ryuSpriteSheetRight.getSubimage(0,635,69,80);
				speicalRyuRight[1]  = ryuSpriteSheetRight.getSubimage(60,640,60,77);
				speicalRyuRight[2]  = ryuSpriteSheetRight.getSubimage(137,640,56,76);
				speicalRyuRight[3]  = ryuSpriteSheetRight.getSubimage(207,637,90,79);
				speicalRyuRight[4]  = ryuSpriteSheetRight.getSubimage(304,641,67,73);
				//energy ball
				energyBallRyuRight = ryuSpriteSheetRight.getSubimage(420, 650, 42, 29);
				
				//torso hit right
				ryuTorsoHitRight[0] = ryuSpriteSheetRight.getSubimage(0,760,47,70);
				ryuTorsoHitRight[1] = ryuSpriteSheetRight.getSubimage(47,759,53,70);
				ryuTorsoHitRight[2] = ryuSpriteSheetRight.getSubimage(100,768,53,65);
				ryuTorsoHitRight[3] = ryuSpriteSheetRight.getSubimage(160,750,50,81);

			}catch(Exception e){ }
		
	}
	
}
