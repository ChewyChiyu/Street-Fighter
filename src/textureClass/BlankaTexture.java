package textureClass;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class BlankaTexture extends Texture{
	//Blanka CHARACTER SPRITES RIGHT
		public static BufferedImage[] idleBlankaRight = new BufferedImage[4];
		public static BufferedImage[] walkBlankaRight = new BufferedImage[5];
		public static BufferedImage[] verticalJumpBlankaRight = new BufferedImage[4];
		public static BufferedImage[] diagonalJumpBlankaRight = new BufferedImage[8];
		public static BufferedImage[] punchBlankaRight = new BufferedImage[3];
		public static BufferedImage[] kickBlankaRight = new BufferedImage[3];
		
		public static BufferedImage[] idleSneakBlankaRight = new BufferedImage[1];
		public static BufferedImage[] sneakpunchBlankaRight = new BufferedImage[3];
		public static BufferedImage[] sneakkickBlankaRight = new BufferedImage[3];
		public static BufferedImage[] aerialkickBlankaRight = new BufferedImage[3];
		
		public static BufferedImage[] speicalBlankaRight = new BufferedImage[8];
		
		public static BufferedImage[] BlankaTorsoHitRight = new BufferedImage[2];
		public static BufferedImage[] BlankaHeadHitRight = new BufferedImage[2];
		public static BufferedImage[] knockDownBlankaRight = new BufferedImage[9];
		public static BufferedImage[] defeatBlankaRight = new BufferedImage[5];
		
		//END OF Blanka CHARACTER SPRITES RIGHT
		
		
		
		
		//Blanka CHARACTER SPRITES LEFT
		public static BufferedImage[] idleBlankaLeft = new BufferedImage[4];
		public static BufferedImage[] walkBlankaLeft = new BufferedImage[5];
		public static BufferedImage[] verticalJumpBlankaLeft = new BufferedImage[4];
		public static BufferedImage[] diagonalJumpBlankaLeft = new BufferedImage[8];
		public static BufferedImage[] punchBlankaLeft = new BufferedImage[3];
		public static BufferedImage[] kickBlankaLeft = new BufferedImage[3];
		
		public static BufferedImage[] idleSneakBlankaLeft = new BufferedImage[2];
		public static BufferedImage[] sneakpunchBlankaLeft = new BufferedImage[3];
		public static BufferedImage[] sneakkickBlankaLeft = new BufferedImage[3];
		public static BufferedImage[] aerialkickBlankaLeft = new BufferedImage[3];
		
		public static BufferedImage[] speicalBlankaLeft = new BufferedImage[8];
		
		public static BufferedImage[] BlankaTorsoHitLeft = new BufferedImage[2];
		public static BufferedImage[] BlankaHeadHitLeft = new BufferedImage[2];
		public static BufferedImage[] knockDownBlankaLeft = new BufferedImage[9];
		public static BufferedImage[] defeatBlankaLeft = new BufferedImage[5];
		
				
				//END OF Blanka CHARACTER SPRITES LEFT
	protected BlankaTexture(){
	loadRight();	
	loadLeft();
	}
	void loadLeft(){
		try{
			final int xStart = 1188;
			BufferedImage BlankaSpriteSheetLeft = ImageIO.read(getClass().getResource("/imgs/characters/BlankaSpriteSheetLeft.png"));
			idleBlankaLeft[0] = BlankaSpriteSheetLeft.getSubimage(xStart-7-63,32,63,87);
			idleBlankaLeft[1] = BlankaSpriteSheetLeft.getSubimage(xStart-75-66,33,66,86);
			idleBlankaLeft[2] = BlankaSpriteSheetLeft.getSubimage(xStart-150-63,30,63,88);
			idleBlankaLeft[3] = BlankaSpriteSheetLeft.getSubimage(xStart-222-59,31,59,87);


			walkBlankaLeft[0] = BlankaSpriteSheetLeft.getSubimage(xStart-62-297,33,62,86);
			walkBlankaLeft[1] = BlankaSpriteSheetLeft.getSubimage(xStart-51-378,37,51,78);
			walkBlankaLeft[2] = BlankaSpriteSheetLeft.getSubimage(xStart-49-451,39,49,76);
			walkBlankaLeft[3] = BlankaSpriteSheetLeft.getSubimage(xStart-48-521,36,48,82);
			walkBlankaLeft[4] = BlankaSpriteSheetLeft.getSubimage (xStart-51-590,31,51,87);
			
			
			
			punchBlankaLeft[0] = BlankaSpriteSheetLeft.getSubimage(xStart-417-73,150,73,90) ;
			punchBlankaLeft[1] = BlankaSpriteSheetLeft.getSubimage(xStart-507-86,151,86,90);
			punchBlankaLeft[2] = BlankaSpriteSheetLeft.getSubimage(xStart-604-60,158,60,85);

			kickBlankaLeft[0] = BlankaSpriteSheetLeft.getSubimage(xStart-12-58,400,58,81);
			kickBlankaLeft[1] = BlankaSpriteSheetLeft.getSubimage(xStart-80-85,400,85,82);
			kickBlankaLeft[2] = BlankaSpriteSheetLeft.getSubimage(xStart-177-58,400,58,83);
			
			verticalJumpBlankaLeft[0] =  BlankaSpriteSheetLeft.getSubimage(xStart-654-55,50,55,72);
			verticalJumpBlankaLeft[1] =  BlankaSpriteSheetLeft.getSubimage(xStart-775-50,12,50,100);
			verticalJumpBlankaLeft[2] =  BlankaSpriteSheetLeft.getSubimage(xStart-834-45,16,45,72);
			verticalJumpBlankaLeft[3] =  BlankaSpriteSheetLeft.getSubimage(xStart-890-40,12,40,100);

		//	diagonalJumpBlankaLeft[0] = BlankaSpriteSheetLeft.getSubimage(834, 64, 62, 68);
		//	diagonalJumpBlankaLeft[0] = BlankaSpriteSheetLeft.getSubimage(846, 7, 80, 125);
			
			diagonalJumpBlankaLeft[0] = BlankaSpriteSheetLeft.getSubimage(xStart-409-37,932,37,88);
			diagonalJumpBlankaLeft[1] = BlankaSpriteSheetLeft.getSubimage(xStart-451-37,937,37,68);
			diagonalJumpBlankaLeft[2] = BlankaSpriteSheetLeft.getSubimage(xStart-519-37,951,37,48);
			diagonalJumpBlankaLeft[3] = BlankaSpriteSheetLeft.getSubimage(xStart-589-37,949,37,52);
			diagonalJumpBlankaLeft[4] = BlankaSpriteSheetLeft.getSubimage(xStart-640-37,951,37,50);
			diagonalJumpBlankaLeft[5] = BlankaSpriteSheetLeft.getSubimage(xStart-695-37,948,37,53);
			diagonalJumpBlankaLeft[6] = BlankaSpriteSheetLeft.getSubimage(xStart-749-37,951,37,50);
			diagonalJumpBlankaLeft[7] = BlankaSpriteSheetLeft.getSubimage(xStart-813-37,962,37,57);
			
//
			idleSneakBlankaLeft[0] =  BlankaSpriteSheetLeft.getSubimage(xStart-950-50,51,50,65);
//
			sneakpunchBlankaLeft[0] =  BlankaSpriteSheetLeft.getSubimage(xStart-460-60,530,60,50);
			sneakpunchBlankaLeft[1] =  BlankaSpriteSheetLeft.getSubimage(xStart-530-102,507,102,70);
			sneakpunchBlankaLeft[2] =  BlankaSpriteSheetLeft.getSubimage(xStart-646-57,530,57,50);
			
			sneakkickBlankaLeft[0] = BlankaSpriteSheetLeft.getSubimage(xStart-722-55,507,55,76);
			sneakkickBlankaLeft[1] = BlankaSpriteSheetLeft.getSubimage(xStart-787-83,509,83,63);
			sneakkickBlankaLeft[2] = BlankaSpriteSheetLeft.getSubimage(xStart-882-60,508,60,72);
			
			aerialkickBlankaLeft[0] = BlankaSpriteSheetLeft.getSubimage(xStart-615-85,595,85,85);
			aerialkickBlankaLeft[1] = BlankaSpriteSheetLeft.getSubimage(xStart-706-103,600,103,80);
			aerialkickBlankaLeft[2] = BlankaSpriteSheetLeft.getSubimage(xStart-815-85,595,85,85);
//
			BlankaTorsoHitLeft[0] = BlankaSpriteSheetLeft.getSubimage(xStart-5-55,1164,55,85);
			BlankaTorsoHitLeft[1] = BlankaSpriteSheetLeft.getSubimage(xStart-70-63,1170,63,80);
			
			BlankaHeadHitLeft[0] =  BlankaSpriteSheetLeft.getSubimage(xStart-3-54,1287,54,78);
			BlankaHeadHitLeft[1] =  BlankaSpriteSheetLeft.getSubimage(xStart-230-60,1175,60,75);
		
			knockDownBlankaLeft[0] = BlankaSpriteSheetLeft.getSubimage(xStart-133-83,1294,83,64);
			knockDownBlankaLeft[1] = BlankaSpriteSheetLeft.getSubimage(xStart-215-97,1314,97,50);
			knockDownBlankaLeft[2] = BlankaSpriteSheetLeft.getSubimage (xStart-317-107,1326,107,50);
			knockDownBlankaLeft[3] = BlankaSpriteSheetLeft.getSubimage(xStart-430-50,1280,50,55);
			knockDownBlankaLeft[4] = BlankaSpriteSheetLeft.getSubimage(xStart-495-105, 1270,105,56) ;
			knockDownBlankaLeft[5] = BlankaSpriteSheetLeft.getSubimage(xStart-605-75,1270,75,92);
			knockDownBlankaLeft[6] = BlankaSpriteSheetLeft.getSubimage(xStart-690-85,1280,85,90);
			knockDownBlankaLeft[7] = BlankaSpriteSheetLeft.getSubimage(xStart-780-80,1285,80,80);
			knockDownBlankaLeft[8] = BlankaSpriteSheetLeft.getSubimage(xStart-875-55,1310,55,60);
		
			defeatBlankaLeft[0] = BlankaSpriteSheetLeft.getSubimage(xStart-5-62,1410,62,70);
			defeatBlankaLeft[1] = BlankaSpriteSheetLeft.getSubimage(xStart-66-84,1410,84,60);
			defeatBlankaLeft[2] = BlankaSpriteSheetLeft.getSubimage(xStart-150-100,1435,100,50);
			defeatBlankaLeft[3] = BlankaSpriteSheetLeft.getSubimage(xStart-250-80,1410,80,60);
			defeatBlankaLeft[4] = BlankaSpriteSheetLeft.getSubimage(xStart-330-107,1440,107,47);

		

			speicalBlankaLeft[0] = BlankaSpriteSheetLeft.getSubimage(xStart-6-55,726-10,55,65+10);
			speicalBlankaLeft[1] = BlankaSpriteSheetLeft.getSubimage(xStart-69-52,727-10,52,64+10);
			speicalBlankaLeft[2] = BlankaSpriteSheetLeft.getSubimage(xStart-131-55,726-10,55,65+10);
			speicalBlankaLeft[3] = BlankaSpriteSheetLeft.getSubimage(xStart-194-52,727-10,52,64+10);
			speicalBlankaLeft[4] = BlankaSpriteSheetLeft.getSubimage(xStart-255-73,717-10,73,74+10);
			speicalBlankaLeft[5] = BlankaSpriteSheetLeft.getSubimage(xStart-338-50,734-10,50,57+10);
			speicalBlankaLeft[6] = BlankaSpriteSheetLeft.getSubimage(xStart-396-73,717-10,73,74+10);
			speicalBlankaLeft[7] = BlankaSpriteSheetLeft.getSubimage(xStart-479-50,734-10,50,57+10);
			
			
		}catch(Exception e) { }
	}
	void loadRight(){
			try{
				BufferedImage BlankaSpriteSheetRight = ImageIO.read(getClass().getResource("/imgs/characters/BlankaSpriteSheetRight.png"));
				idleBlankaRight[0] = BlankaSpriteSheetRight.getSubimage(7,32,63,87);
				idleBlankaRight[1] = BlankaSpriteSheetRight.getSubimage(75,33,66,86);
				idleBlankaRight[2] = BlankaSpriteSheetRight.getSubimage(150,30,63,88);
				idleBlankaRight[3] = BlankaSpriteSheetRight.getSubimage(222,31,59,87);

				walkBlankaRight[0] = BlankaSpriteSheetRight.getSubimage(297,33,62,86);
				walkBlankaRight[1] = BlankaSpriteSheetRight.getSubimage(378,37,51,78);
				walkBlankaRight[2] = BlankaSpriteSheetRight.getSubimage(451,39,49,76);
				walkBlankaRight[3] = BlankaSpriteSheetRight.getSubimage(521,36,48,82);
				walkBlankaRight[4] = BlankaSpriteSheetRight.getSubimage (590,31,51,87);

				punchBlankaRight[0] = BlankaSpriteSheetRight.getSubimage(417,150,73,90) ;
				punchBlankaRight[1] = BlankaSpriteSheetRight.getSubimage(507,151,86,90);
				punchBlankaRight[2] = BlankaSpriteSheetRight.getSubimage(604,158,60,85);

				kickBlankaRight[0] = BlankaSpriteSheetRight.getSubimage(12,400,58,81);
				kickBlankaRight[1] = BlankaSpriteSheetRight.getSubimage(80,400,85,82);
				kickBlankaRight[2] = BlankaSpriteSheetRight.getSubimage(177,400,58,83);
				
				verticalJumpBlankaRight[0] =  BlankaSpriteSheetRight.getSubimage(654,50,55,72);
				verticalJumpBlankaRight[1] =  BlankaSpriteSheetRight.getSubimage(775,12,50,100);
				verticalJumpBlankaRight[2] =  BlankaSpriteSheetRight.getSubimage(834,16,45,72);
				verticalJumpBlankaRight[3] =  BlankaSpriteSheetRight.getSubimage(890,12,40,100);

			//	diagonalJumpBlankaRight[0] = BlankaSpriteSheetRight.getSubimage(834, 64, 62, 68);
			//	diagonalJumpBlankaRight[0] = BlankaSpriteSheetRight.getSubimage(846, 7, 80, 125);
				
				diagonalJumpBlankaRight[0] = BlankaSpriteSheetRight.getSubimage(409,932,37,88);
				diagonalJumpBlankaRight[1] = BlankaSpriteSheetRight.getSubimage(451,937,65,68);
				diagonalJumpBlankaRight[2] = BlankaSpriteSheetRight.getSubimage(519,951,64,48);
				diagonalJumpBlankaRight[3] = BlankaSpriteSheetRight.getSubimage(589,949,48,52);
				diagonalJumpBlankaRight[4] = BlankaSpriteSheetRight.getSubimage(640,951,51,50);
				diagonalJumpBlankaRight[5] = BlankaSpriteSheetRight.getSubimage(695,948,48,53);
				diagonalJumpBlankaRight[6] = BlankaSpriteSheetRight.getSubimage(749,951,51,50);
				diagonalJumpBlankaRight[7] = BlankaSpriteSheetRight.getSubimage(813,962,50,57);

				
//
				idleSneakBlankaRight[0] =  BlankaSpriteSheetRight.getSubimage(950,51,50,65);
//
				sneakpunchBlankaRight[0] =  BlankaSpriteSheetRight.getSubimage(460,530,60,50);
				sneakpunchBlankaRight[1] =  BlankaSpriteSheetRight.getSubimage(530,507,102,70);
				sneakpunchBlankaRight[2] =  BlankaSpriteSheetRight.getSubimage(646,530,57,50);
				
				sneakkickBlankaRight[0] = BlankaSpriteSheetRight.getSubimage(722,507,55,76);
				sneakkickBlankaRight[1] = BlankaSpriteSheetRight.getSubimage(787,509,83,63);
				sneakkickBlankaRight[2] = BlankaSpriteSheetRight.getSubimage(882,508,60,72);
				
				aerialkickBlankaRight[0] = BlankaSpriteSheetRight.getSubimage(615,595,85,85);
				aerialkickBlankaRight[1] = BlankaSpriteSheetRight.getSubimage(706,600,103,80);
				aerialkickBlankaRight[2] = BlankaSpriteSheetRight.getSubimage(815,595,85,85);
//
				BlankaTorsoHitRight[0] = BlankaSpriteSheetRight.getSubimage(5,1164,55,85);
				BlankaTorsoHitRight[1] = BlankaSpriteSheetRight.getSubimage(70,1170,63,80);
				
				BlankaHeadHitRight[0] =  BlankaSpriteSheetRight.getSubimage(3,1287,54,78);
				BlankaHeadHitRight[1] =  BlankaSpriteSheetRight.getSubimage(230,1175,60,75);
			
				knockDownBlankaRight[0] = BlankaSpriteSheetRight.getSubimage(133,1294,83,64);
				knockDownBlankaRight[1] = BlankaSpriteSheetRight.getSubimage(215,1314,97,50);
				knockDownBlankaRight[2] = BlankaSpriteSheetRight.getSubimage (317,1326,107,50);
				knockDownBlankaRight[3] = BlankaSpriteSheetRight.getSubimage(430,1280,50,55);
				knockDownBlankaRight[4] = BlankaSpriteSheetRight.getSubimage(495, 1270,105,56) ;
				knockDownBlankaRight[5] = BlankaSpriteSheetRight.getSubimage(605,1270,75,92);
				knockDownBlankaRight[6] = BlankaSpriteSheetRight.getSubimage(690,1280,85,90);
				knockDownBlankaRight[7] = BlankaSpriteSheetRight.getSubimage(780,1285,80,80);
				knockDownBlankaRight[8] = BlankaSpriteSheetRight.getSubimage(875,1310,55,60);
			
				defeatBlankaRight[0] = BlankaSpriteSheetRight.getSubimage(5,1410,62,70);
				defeatBlankaRight[1] = BlankaSpriteSheetRight.getSubimage(66,1410,84,60);
				defeatBlankaRight[2] = BlankaSpriteSheetRight.getSubimage(150,1435,100,50);
				defeatBlankaRight[3] = BlankaSpriteSheetRight.getSubimage(250,1410,80,60);
				defeatBlankaRight[4] = BlankaSpriteSheetRight.getSubimage(330,1440,107,47);

				
				speicalBlankaRight[0] = BlankaSpriteSheetRight.getSubimage(6,726-10,55,65+10);
				speicalBlankaRight[1] = BlankaSpriteSheetRight.getSubimage(69,727-10,52,64+10);
				speicalBlankaRight[2] = BlankaSpriteSheetRight.getSubimage(131,726-10,55,65+10);
				speicalBlankaRight[3] = BlankaSpriteSheetRight.getSubimage(194,727-10,52,64+10);
				speicalBlankaRight[4] = BlankaSpriteSheetRight.getSubimage(255,717-10,73,74+10);
				speicalBlankaRight[5] = BlankaSpriteSheetRight.getSubimage(338,734-10,50,57+10);
				speicalBlankaRight[6] = BlankaSpriteSheetRight.getSubimage(396,717-10,73,74+10);
				speicalBlankaRight[7] = BlankaSpriteSheetRight.getSubimage(479,734-10,50,57+10);
			}catch(Exception e){e.printStackTrace(); }
		
	}
	
}
