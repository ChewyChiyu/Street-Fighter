package textureClass;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class RyuTexture extends Texture{
	//RYU CHARACTER SPRITES RIGHT
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
		public static BufferedImage[] ryuHeadHitRight = new BufferedImage[5];
		public static BufferedImage[] knockDownRyuRight = new BufferedImage[11];
		public static BufferedImage[] defeatRyuRight = new BufferedImage[6];
		
		//END OF RYU CHARACTER SPRITES RIGHT
		
		
		
		
		//RYU CHARACTER SPRITES LEFT
				public static BufferedImage[] idleRyuLeft = new BufferedImage[4];
				public static BufferedImage[] walkRyuLeft = new BufferedImage[6];
				public static BufferedImage[] verticalJumpRyuLeft = new BufferedImage[5];
				public static BufferedImage[] diagonalJumpRyuLeft = new BufferedImage[3];
				public static BufferedImage[] punchRyuLeft = new BufferedImage[6];
				public static BufferedImage[] kickRyuLeft = new BufferedImage[8];
				
				public static BufferedImage[] idleSneakRyuLeft = new BufferedImage[1];
				public static BufferedImage[] sneakPunchRyuLeft = new BufferedImage[7];
				public static BufferedImage[] sneakKickRyuLeft = new BufferedImage[4];
				public static BufferedImage[] aerialKickRyuLeft = new BufferedImage[8];
				
				public static BufferedImage[] speicalRyuLeft = new BufferedImage[5];
				public static BufferedImage energyBallRyuLeft;
				
				public static BufferedImage[] ryuTorsoHitLeft = new BufferedImage[4];
				public static BufferedImage[] ryuHeadHitLeft = new BufferedImage[5];
				public static BufferedImage[] knockDownRyuLeft = new BufferedImage[11];
				public static BufferedImage[] defeatRyuLeft = new BufferedImage[6];
				
				//END OF RYU CHARACTER SPRITES LEFT
	protected RyuTexture(){
	loadRight();	
	loadLeft();
	}
	void loadLeft(){
		try{
		BufferedImage ryuSpriteSheetLeft = ImageIO.read(getClass().getResource("/imgs/characters/RyuSpriteSheetLeft.png"));

		final int xStart = 1540; //size of png
		int xBuffer = xStart-50;
		int yBuffer = 15;
		//idle
		for(int index = 0; index < idleRyuLeft.length; index++){
			idleRyuLeft[index] = ryuSpriteSheetLeft.getSubimage(xBuffer, yBuffer, 50, 85);
			xBuffer -=50;
		}
		//walk
		for(int index = 0; index < walkRyuLeft.length; index++){
			walkRyuLeft[index] = ryuSpriteSheetLeft.getSubimage(xBuffer, yBuffer, 50, 85);
			if(index!=walkRyuLeft.length-1)
			xBuffer -=50;
		}
		//vertial jump
		xBuffer-=38;
		for(int index = 0; index < verticalJumpRyuLeft.length; index++){
			verticalJumpRyuLeft[index] = ryuSpriteSheetLeft.getSubimage(xBuffer, yBuffer, 39, 85);
			xBuffer -=39;
		}
		
		//diagonal jump
		xBuffer = xStart - 833;
		xBuffer-=67;
		diagonalJumpRyuLeft[0] = ryuSpriteSheetLeft.getSubimage(xBuffer, yBuffer, 67, 85);
		xBuffer-=40;
		diagonalJumpRyuLeft[1] = ryuSpriteSheetLeft.getSubimage(xBuffer, yBuffer, 40, 85);
		xBuffer-=67;
		diagonalJumpRyuLeft[2] = ryuSpriteSheetLeft.getSubimage(xBuffer, yBuffer, 67, 85);
		
		//punch
		xBuffer = xStart;
		yBuffer = 127;
		
		xBuffer-=50;
		punchRyuLeft[0] = ryuSpriteSheetLeft.getSubimage(xBuffer, yBuffer,50 ,94);
		xBuffer-=66;
		punchRyuLeft[1] = ryuSpriteSheetLeft.getSubimage(xBuffer, yBuffer,66 ,94);
		xBuffer-=50;
		punchRyuLeft[2] = ryuSpriteSheetLeft.getSubimage(xBuffer, yBuffer,50 ,94);
		xBuffer-=50;
		punchRyuLeft[3] = ryuSpriteSheetLeft.getSubimage(xBuffer, yBuffer,50 ,94);
		xBuffer-=64;
		punchRyuLeft[4] = ryuSpriteSheetLeft.getSubimage(xBuffer, yBuffer,64 ,94);
		xBuffer-=70;
		punchRyuLeft[5] = ryuSpriteSheetLeft.getSubimage(xBuffer, yBuffer,70 ,94);
		//kick
		xBuffer = xStart;
		yBuffer = 250;
		xBuffer-=52;
		kickRyuLeft[0] = ryuSpriteSheetLeft.getSubimage(xBuffer, yBuffer,52 ,94);
		xBuffer-=80;
		kickRyuLeft[1] = ryuSpriteSheetLeft.getSubimage(xBuffer, yBuffer,80 ,94);
		xBuffer-=49;
		kickRyuLeft[2] = ryuSpriteSheetLeft.getSubimage(xBuffer, yBuffer,49 ,94);
		xBuffer-=57;
		kickRyuLeft[3] = ryuSpriteSheetLeft.getSubimage(xBuffer, yBuffer,57 ,94);
		xBuffer-=61;
		kickRyuLeft[4] = ryuSpriteSheetLeft.getSubimage(xBuffer, yBuffer,61 ,94);
		xBuffer-=77;
		kickRyuLeft[5] = ryuSpriteSheetLeft.getSubimage(xBuffer, yBuffer,77 ,94);
		xBuffer-=66;
		kickRyuLeft[6] = ryuSpriteSheetLeft.getSubimage(xBuffer, yBuffer,66 ,94);
		xBuffer-=54;
		kickRyuLeft[7] = ryuSpriteSheetLeft.getSubimage(xBuffer, yBuffer,54 ,94);
		
		//idle sneak
		
		idleSneakRyuLeft[0] = ryuSpriteSheetLeft.getSubimage(xStart-1163-41, 45, 41, 55);
		
		//sneak punch
		xBuffer = xStart-15;
		yBuffer = 417;
		
		xBuffer-=48;
		sneakPunchRyuLeft[0] = ryuSpriteSheetLeft.getSubimage(xBuffer, yBuffer, 48, 55);
		xBuffer-=70;
		sneakPunchRyuLeft[1] = ryuSpriteSheetLeft.getSubimage(xBuffer, yBuffer, 70, 55);
		xBuffer-=47;
		sneakPunchRyuLeft[2] = ryuSpriteSheetLeft.getSubimage(xBuffer, yBuffer, 47, 55);
		xBuffer-=52;
		sneakPunchRyuLeft[3] = ryuSpriteSheetLeft.getSubimage(xBuffer, yBuffer, 52, 55);
		xBuffer-=68;
		sneakPunchRyuLeft[4] = ryuSpriteSheetLeft.getSubimage(xBuffer, yBuffer, 68, 55);
		xBuffer-=49;
		sneakPunchRyuLeft[5] = ryuSpriteSheetLeft.getSubimage(xBuffer, yBuffer, 49, 55);
		xBuffer-=51;
		sneakPunchRyuLeft[6] = ryuSpriteSheetLeft.getSubimage(xBuffer, yBuffer, 51, 55);

		//sneak kick
		xBuffer = xStart-613;
		yBuffer = 407;
		
		xBuffer-=48;
		sneakKickRyuLeft[0] = ryuSpriteSheetLeft.getSubimage(xBuffer, yBuffer, 48, 70);
		xBuffer-=55;
		sneakKickRyuLeft[1] = ryuSpriteSheetLeft.getSubimage(xBuffer, yBuffer, 55, 70);
		xBuffer-=74;
		sneakKickRyuLeft[2] = ryuSpriteSheetLeft.getSubimage(xBuffer, yBuffer, 74, 70);
		xBuffer-=56;
		sneakKickRyuLeft[3] = ryuSpriteSheetLeft.getSubimage(xBuffer, yBuffer, 56, 70);
		
		//aerial kick
		aerialKickRyuLeft[0] = ryuSpriteSheetLeft.getSubimage(xStart-946-52, 523, 52, 94);
		aerialKickRyuLeft[1] = ryuSpriteSheetLeft.getSubimage(xStart-1000-44, 503, 44, 77);
		aerialKickRyuLeft[2] = ryuSpriteSheetLeft.getSubimage(xStart-1050-68, 490, 68, 98);
		aerialKickRyuLeft[3] = ryuSpriteSheetLeft.getSubimage(xStart-1114-45, 491, 45, 94);
		aerialKickRyuLeft[4] = ryuSpriteSheetLeft.getSubimage(xStart-1156-67, 498, 67, 81);
		aerialKickRyuLeft[5] = ryuSpriteSheetLeft.getSubimage(xStart-1228-51, 494, 51, 85);
		aerialKickRyuLeft[6] = ryuSpriteSheetLeft.getSubimage(xStart-1286-41, 499, 41, 88);
		aerialKickRyuLeft[7] = ryuSpriteSheetLeft.getSubimage(xStart-1331-37, 533, 37, 81);
		
		//speical
		speicalRyuLeft[0]  = ryuSpriteSheetLeft.getSubimage(xStart-0-69,635,69,80);
		speicalRyuLeft[1]  = ryuSpriteSheetLeft.getSubimage(xStart-60-60,640,60,77);
		speicalRyuLeft[2]  = ryuSpriteSheetLeft.getSubimage(xStart-137-56,640,56,76);
		speicalRyuLeft[3]  = ryuSpriteSheetLeft.getSubimage(xStart-207-90,637,90,79);
		speicalRyuLeft[4]  = ryuSpriteSheetLeft.getSubimage(xStart-304-67,641,67,73);
		//energy ball
		energyBallRyuLeft = ryuSpriteSheetLeft.getSubimage(xStart-420-42, 650, 42, 29);
		
		//torso hit right
		ryuTorsoHitLeft[0] = ryuSpriteSheetLeft.getSubimage(xStart-0-47,760,47,70);
		ryuTorsoHitLeft[1] = ryuSpriteSheetLeft.getSubimage(xStart-47-53,759,53,70);
		ryuTorsoHitLeft[2] = ryuSpriteSheetLeft.getSubimage(xStart-100-53,768,53,65);
		ryuTorsoHitLeft[3] = ryuSpriteSheetLeft.getSubimage(xStart-160-50,750,50,81);

		
		//hit head right
		xBuffer = xStart-164;
		xBuffer-=53;
		yBuffer = 752;
		for(int index = 0; index < ryuHeadHitLeft.length; index++ ){
			ryuHeadHitLeft[index] = ryuSpriteSheetLeft.getSubimage(xBuffer, yBuffer, 53, 80);
			xBuffer-=53;

		}
		//knocked down ryu right
		knockDownRyuLeft[0] =  ryuSpriteSheetLeft.getSubimage(xStart-390-42,755,42,80);
		knockDownRyuLeft[1] =  ryuSpriteSheetLeft.getSubimage(xStart-448-40,772,40,65);
		knockDownRyuLeft[2] =  ryuSpriteSheetLeft.getSubimage(xStart-506-54,760,54,70);
		knockDownRyuLeft[3] =  ryuSpriteSheetLeft.getSubimage(xStart-565-47,755,47,76);
		knockDownRyuLeft[4] =  ryuSpriteSheetLeft.getSubimage(xStart-618-70,779,70,45);
		knockDownRyuLeft[5] =  ryuSpriteSheetLeft.getSubimage(xStart-696-75,803, 75,27);
		knockDownRyuLeft[6] =  ryuSpriteSheetLeft.getSubimage(xStart-771-38,767,38,65);
		knockDownRyuLeft[7] =  ryuSpriteSheetLeft.getSubimage(xStart-830-28,733,28,103);
		knockDownRyuLeft[8] =  ryuSpriteSheetLeft.getSubimage(xStart-887-47,760,47,64);
		knockDownRyuLeft[9] =  ryuSpriteSheetLeft.getSubimage(xStart-955-28,740,28,67);
		knockDownRyuLeft[10] =  ryuSpriteSheetLeft.getSubimage(xStart-1008-45,754,45,77);

		//defeat ryu right
		
		defeatRyuLeft[0] =  ryuSpriteSheetLeft.getSubimage(xStart-390-42,755,42,80);
		defeatRyuLeft[1] =  ryuSpriteSheetLeft.getSubimage(xStart-448-40,772,40,65);
		defeatRyuLeft[2] =  ryuSpriteSheetLeft.getSubimage(xStart-506-54,760,54,70);
		defeatRyuLeft[3] =  ryuSpriteSheetLeft.getSubimage(xStart-565-47,755,47,76);
		defeatRyuLeft[4] =  ryuSpriteSheetLeft.getSubimage(xStart-618-70,779,70,45);
		defeatRyuLeft[5] =  ryuSpriteSheetLeft.getSubimage(xStart-696-75,803, 75,27);

		}catch(Exception e) { }
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

				//hit head right
				xBuffer = 164;
				yBuffer = 752;
				for(int index = 0; index < ryuHeadHitRight.length; index++ ){
					ryuHeadHitRight[index] = ryuSpriteSheetRight.getSubimage(xBuffer, yBuffer, 53, 80);
					xBuffer+=53;

				}
				//knocked down ryu right
				knockDownRyuRight[0] =  ryuSpriteSheetRight.getSubimage(390,755,42,80);
				knockDownRyuRight[1] =  ryuSpriteSheetRight.getSubimage(448,772,40,65);
				knockDownRyuRight[2] =  ryuSpriteSheetRight.getSubimage(506,760,54,70);
				knockDownRyuRight[3] =  ryuSpriteSheetRight.getSubimage(565,755,47,76);
				knockDownRyuRight[4] =  ryuSpriteSheetRight.getSubimage(618,779,70,45);
				knockDownRyuRight[5] =  ryuSpriteSheetRight.getSubimage(696,803, 75,27);
				knockDownRyuRight[6] =  ryuSpriteSheetRight.getSubimage(771,767,38,65);
				knockDownRyuRight[7] =  ryuSpriteSheetRight.getSubimage(830,733,28,103);
				knockDownRyuRight[8] =  ryuSpriteSheetRight.getSubimage(887,760,47,64);
				knockDownRyuRight[9] =  ryuSpriteSheetRight.getSubimage(955,740,28,67);
				knockDownRyuRight[10] =  ryuSpriteSheetRight.getSubimage(1008,754,45,77);

				//defeat ryu right
				
				defeatRyuRight[0] =  ryuSpriteSheetRight.getSubimage(390,755,42,80);
				defeatRyuRight[1] =  ryuSpriteSheetRight.getSubimage(448,772,40,65);
				defeatRyuRight[2] =  ryuSpriteSheetRight.getSubimage(506,760,54,70);
				defeatRyuRight[3] =  ryuSpriteSheetRight.getSubimage(565,755,47,76);
				defeatRyuRight[4] =  ryuSpriteSheetRight.getSubimage(618,779,70,45);
				defeatRyuRight[5] =  ryuSpriteSheetRight.getSubimage(696,803, 75,27);

				
			}catch(Exception e){ }
		
	}
	
}
