package textureClass;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class DeeJayTexture extends Texture{
	//DeeJay CHARACTER SPRITES RIGHT
		public static BufferedImage[] idleDeeJayRight = new BufferedImage[4];
		public static BufferedImage[] walkDeeJayRight = new BufferedImage[5];
		public static BufferedImage[] verticalJumpDeeJayRight = new BufferedImage[7];
		public static BufferedImage[] diagonalJumpDeeJayRight = new BufferedImage[7];
		public static BufferedImage[] punchDeeJayRight = new BufferedImage[3];
		public static BufferedImage[] kickDeeJayRight = new BufferedImage[8];
		
		public static BufferedImage[] idleSneakDeeJayRight = new BufferedImage[1];
		public static BufferedImage[] sneakpunchDeeJayRight = new BufferedImage[2];
		public static BufferedImage[] sneakkickDeeJayRight = new BufferedImage[3];
		public static BufferedImage[] aerialkickDeeJayRight = new BufferedImage[2];
		
		public static BufferedImage[] speicalDeeJayRight = new BufferedImage[6];
		
		public static BufferedImage[] DeeJayTorsoHitRight = new BufferedImage[4];
		public static BufferedImage[] DeeJayHeadHitRight = new BufferedImage[4];
		public static BufferedImage[] knockDownDeeJayRight = new BufferedImage[8];
		public static BufferedImage[] defeatDeeJayRight = new BufferedImage[4];
		
		//END OF DeeJay CHARACTER SPRITES RIGHT
		
		
		
		
		//DeeJay CHARACTER SPRITES LEFT
		public static BufferedImage[] idleDeeJayLeft = new BufferedImage[4];
		public static BufferedImage[] walkDeeJayLeft = new BufferedImage[5];
		public static BufferedImage[] verticalJumpDeeJayLeft = new BufferedImage[7];
		public static BufferedImage[] diagonalJumpDeeJayLeft = new BufferedImage[7];
		public static BufferedImage[] punchDeeJayLeft = new BufferedImage[3];
		public static BufferedImage[] kickDeeJayLeft = new BufferedImage[8];
		
		public static BufferedImage[] idleSneakDeeJayLeft = new BufferedImage[1];
		public static BufferedImage[] sneakpunchDeeJayLeft = new BufferedImage[2];
		public static BufferedImage[] sneakkickDeeJayLeft = new BufferedImage[3];
		public static BufferedImage[] aerialkickDeeJayLeft = new BufferedImage[2];
		
		public static BufferedImage[] speicalDeeJayLeft = new BufferedImage[6];
		
		public static BufferedImage[] DeeJayTorsoHitLeft = new BufferedImage[4];
		public static BufferedImage[] DeeJayHeadHitLeft = new BufferedImage[4];
		public static BufferedImage[] knockDownDeeJayLeft = new BufferedImage[8];
		public static BufferedImage[] defeatDeeJayLeft = new BufferedImage[4];
		
				//END OF DeeJay CHARACTER SPRITES LEFT
	protected DeeJayTexture(){
	loadRight();	
	loadLeft();
	}
	void loadLeft(){
		try{
			final int xStart = 1385;
			BufferedImage DeeJaySpriteSheetLeft = ImageIO.read(getClass().getResource("/imgs/characters/DeeJayLeft.png"));
			idleDeeJayLeft[0] = DeeJaySpriteSheetLeft.getSubimage(xStart-9-40,30,40,90);
			idleDeeJayLeft[1] = DeeJaySpriteSheetLeft.getSubimage(xStart-60-50,30,50,90);
			idleDeeJayLeft[2] = DeeJaySpriteSheetLeft.getSubimage(xStart-115-50,25,50,95);
			idleDeeJayLeft[3] = DeeJaySpriteSheetLeft.getSubimage(xStart-170-50,30,50,90);
			
			walkDeeJayLeft[0] = DeeJaySpriteSheetLeft.getSubimage(xStart-233-(271-233),31,271-233,123-31);
			walkDeeJayLeft[1] = DeeJaySpriteSheetLeft.getSubimage(xStart-278-(321-278),29,321-278,123-29);
			walkDeeJayLeft[2] = DeeJaySpriteSheetLeft.getSubimage(xStart-327-(384-327),27,384-327,121-27);
			walkDeeJayLeft[3] = DeeJaySpriteSheetLeft.getSubimage(xStart-392-(447-392),31,447-392,121-31);
			walkDeeJayLeft[4] = DeeJaySpriteSheetLeft.getSubimage(xStart-458-(497-458),32,497-458,122-32);

			punchDeeJayLeft[0] = DeeJaySpriteSheetLeft.getSubimage(xStart-8-(40),160,40,85);
			punchDeeJayLeft[1] = DeeJaySpriteSheetLeft.getSubimage(xStart-63-(75),160,75,85);
			punchDeeJayLeft[2] = DeeJaySpriteSheetLeft.getSubimage(xStart-145-(55),160,55,85);

			kickDeeJayLeft[0] = 	DeeJaySpriteSheetLeft.getSubimage(xStart-2-65,747,65,87);
			kickDeeJayLeft[1] = 	DeeJaySpriteSheetLeft.getSubimage(xStart-74-65,746,65,88);
			kickDeeJayLeft[2] = 	DeeJaySpriteSheetLeft.getSubimage(xStart-135-55,747,55,90);
			kickDeeJayLeft[3] = 	DeeJaySpriteSheetLeft.getSubimage(xStart-196-55,747,55,90);
			kickDeeJayLeft[4] = 	DeeJaySpriteSheetLeft.getSubimage(xStart-255-84,741,84,96);
			kickDeeJayLeft[5] = 	DeeJaySpriteSheetLeft.getSubimage(xStart-343-84,741,84,96);
			kickDeeJayLeft[6] = 	DeeJaySpriteSheetLeft.getSubimage(xStart-432-68,750,68,87);
			kickDeeJayLeft[7] = 	DeeJaySpriteSheetLeft.getSubimage(xStart-504-59,753,59,84);
			
			
			verticalJumpDeeJayLeft[0] =  DeeJaySpriteSheetLeft.getSubimage(xStart-508-(42),44,42,76);
			verticalJumpDeeJayLeft[1] =  DeeJaySpriteSheetLeft.getSubimage(xStart-555-(45),11,45,115);
			verticalJumpDeeJayLeft[2] =  DeeJaySpriteSheetLeft.getSubimage(xStart-600-(35),25,35,90);
			verticalJumpDeeJayLeft[3] =  DeeJaySpriteSheetLeft.getSubimage(xStart-640-(40),30,40,80);
			verticalJumpDeeJayLeft[4] =  DeeJaySpriteSheetLeft.getSubimage(xStart-680-(40),30,40,75);
			verticalJumpDeeJayLeft[5] =  DeeJaySpriteSheetLeft.getSubimage(xStart-722-(758-722),10,758-722,70);
			verticalJumpDeeJayLeft[6] =  DeeJaySpriteSheetLeft.getSubimage(xStart-765-(35),45,35,80);

		//	diagonalJumpDeeJayLeft[0] = DeeJaySpriteSheetLeft.getSubimage(834, 64, 62, 68);
		//	diagonalJumpDeeJayLeft[0] = DeeJaySpriteSheetLeft.getSubimage(846, 7, 80, 125);
			   
			diagonalJumpDeeJayLeft[0] = DeeJaySpriteSheetLeft.getSubimage(xStart-821-(858-821),46,858-821,122-46);
			diagonalJumpDeeJayLeft[1] = DeeJaySpriteSheetLeft.getSubimage(xStart-867-(923-867),33,923-867,123-33);
			diagonalJumpDeeJayLeft[2] = DeeJaySpriteSheetLeft.getSubimage(xStart-926-(994-926),26,994-926,114-26);
			diagonalJumpDeeJayLeft[3] = DeeJaySpriteSheetLeft.getSubimage(xStart-997-(1050-997),26,1050-997,122-26);
			diagonalJumpDeeJayLeft[4] = DeeJaySpriteSheetLeft.getSubimage(xStart-1055-(1141-1055),26,1141-1055,108-26);
			diagonalJumpDeeJayLeft[5] = DeeJaySpriteSheetLeft.getSubimage(xStart-1146-(1216-1146),32,1216-1146,123-32);
			diagonalJumpDeeJayLeft[6] = DeeJaySpriteSheetLeft.getSubimage(xStart-1219-(1262-1219),11,1262-1219,123-11);

//
			idleSneakDeeJayLeft[0] =  DeeJaySpriteSheetLeft.getSubimage(xStart-1270-(40),45,40,75);
//
			sneakpunchDeeJayLeft[0] =  DeeJaySpriteSheetLeft.getSubimage(xStart-190-(60),530,60,70);
			sneakpunchDeeJayLeft[1] =  DeeJaySpriteSheetLeft.getSubimage(xStart-260-(65),540,65, 60);
			
			sneakkickDeeJayLeft[0] = DeeJaySpriteSheetLeft.getSubimage(xStart-650-(60),520,60, 80);
			sneakkickDeeJayLeft[1] = DeeJaySpriteSheetLeft.getSubimage(xStart-710-(90), 520,90, 80);
			sneakkickDeeJayLeft[2] = DeeJaySpriteSheetLeft.getSubimage(xStart-800-(62), 520, 62,80);


			aerialkickDeeJayLeft[0] = DeeJaySpriteSheetLeft.getSubimage(xStart-669-( 718-669),645, 718-669, 723-645);
			aerialkickDeeJayLeft[1] = DeeJaySpriteSheetLeft.getSubimage(xStart-723-( 810-723),647, 810-723,723-647);

			DeeJayTorsoHitLeft[0] = DeeJaySpriteSheetLeft.getSubimage(xStart-887-(932-887),1130,932-887,1218-1130);
			DeeJayTorsoHitLeft[1] = DeeJaySpriteSheetLeft.getSubimage(xStart-936-(984-936),1131,984-936,1217-1131);
			DeeJayTorsoHitLeft[2] = DeeJaySpriteSheetLeft.getSubimage(xStart-994-(1046-994),1129,1046-994,1217-1129);
			DeeJayTorsoHitLeft[3] = DeeJaySpriteSheetLeft.getSubimage(xStart-1061-(1106-1061),1128,1106-1061,1218-1128);

			DeeJayHeadHitLeft[0] =  DeeJaySpriteSheetLeft.getSubimage(xStart-1112-(1164-1112),1129,1164-1112,1219-1129);
			DeeJayHeadHitLeft[1] =  DeeJaySpriteSheetLeft.getSubimage(xStart-1166-(1225-1166),1130,1225-1166,1218-1130);
			DeeJayHeadHitLeft[2] =  DeeJaySpriteSheetLeft.getSubimage(xStart-1227-(1291-1227),1127,1291-1227,1218-1127);
			DeeJayHeadHitLeft[3] =  DeeJaySpriteSheetLeft.getSubimage(xStart-1299-(1345-1299),1126,1345-1299,1217-1126);

			knockDownDeeJayLeft[0] = DeeJaySpriteSheetLeft.getSubimage(xStart-5-(71-5),1254, 71-5,1324-1254);
			knockDownDeeJayLeft[1] = DeeJaySpriteSheetLeft.getSubimage(xStart-73-(156-73),1257,156-73,1316-1257);
			knockDownDeeJayLeft[2] = DeeJaySpriteSheetLeft.getSubimage(xStart-158-(248-158),1268,248-158,1329-1268);
			knockDownDeeJayLeft[3] = DeeJaySpriteSheetLeft.getSubimage(xStart-251-(348-251),1296,348-251,1329-1296) ;
			knockDownDeeJayLeft[4] = DeeJaySpriteSheetLeft.getSubimage(xStart-349-(391-349),1275,391-349,1329-1275) ;
			knockDownDeeJayLeft[5] = DeeJaySpriteSheetLeft.getSubimage (xStart-414-(464-414),1236,464-414,1325-1236);
			knockDownDeeJayLeft[6] = DeeJaySpriteSheetLeft.getSubimage(xStart-477-(549-477),1256,549-477,1322-1256);
			knockDownDeeJayLeft[7] = DeeJaySpriteSheetLeft.getSubimage(xStart-569-(601-569),1253,601-569,1325-1253);

			defeatDeeJayLeft[0] = DeeJaySpriteSheetLeft.getSubimage(xStart-735-(801-735), 1254, 801-735, 1324-1254) ;
			defeatDeeJayLeft[1] = DeeJaySpriteSheetLeft.getSubimage(xStart-805-(887-805),1267,887-805,1323-1267);
			defeatDeeJayLeft[2] = DeeJaySpriteSheetLeft.getSubimage(xStart-894-(977-894),1270, 977-894, 1330-1270);
			defeatDeeJayLeft[3] = DeeJaySpriteSheetLeft.getSubimage(xStart-1077-( 1174-1077),1299-25, 1174-1077, 1329-1299+25);

			speicalDeeJayLeft[0] = DeeJaySpriteSheetLeft.getSubimage(xStart-4-56,872,56,97);
			speicalDeeJayLeft[1] = DeeJaySpriteSheetLeft.getSubimage(xStart-73-63,882,63,87);
			speicalDeeJayLeft[2] = DeeJaySpriteSheetLeft.getSubimage(xStart-145-71,885,71,84);
			speicalDeeJayLeft[3] = DeeJaySpriteSheetLeft.getSubimage(xStart-226-67,864,67,105);
			speicalDeeJayLeft[4] = DeeJaySpriteSheetLeft.getSubimage(xStart-306-66,856,66,113);
			speicalDeeJayLeft[5] = DeeJaySpriteSheetLeft.getSubimage(xStart-387-55,883,55,86);

			

		}catch(Exception e) { }
	}
	void loadRight(){
			try{
				BufferedImage DeeJaySpriteSheetRight = ImageIO.read(getClass().getResource("/imgs/characters/DeeJayRight.png"));
				idleDeeJayRight[0] = DeeJaySpriteSheetRight.getSubimage(9,30,40,90);
				idleDeeJayRight[1] = DeeJaySpriteSheetRight.getSubimage(60,30,50,90);
				idleDeeJayRight[2] = DeeJaySpriteSheetRight.getSubimage(115,25,50,95);
				idleDeeJayRight[3] = DeeJaySpriteSheetRight.getSubimage(170,30,50,90);
				
				walkDeeJayRight[0] = DeeJaySpriteSheetRight.getSubimage(233,31,271-233,123-31);
				walkDeeJayRight[1] = DeeJaySpriteSheetRight.getSubimage(278,29,321-278,123-29);
				walkDeeJayRight[2] = DeeJaySpriteSheetRight.getSubimage(327,27,384-327,121-27);
				walkDeeJayRight[3] = DeeJaySpriteSheetRight.getSubimage(392,31,447-392,121-31);
				walkDeeJayRight[4] = DeeJaySpriteSheetRight.getSubimage(458,32,497-458,122-32);

				punchDeeJayRight[0] = DeeJaySpriteSheetRight.getSubimage(8,160,40,85);
				punchDeeJayRight[1] = DeeJaySpriteSheetRight.getSubimage(63,160,75,85);
				punchDeeJayRight[2] = DeeJaySpriteSheetRight.getSubimage(145,160,55,85);

				
				kickDeeJayRight[0] = 	DeeJaySpriteSheetRight.getSubimage(2,747,65,87);
				kickDeeJayRight[1] = 	DeeJaySpriteSheetRight.getSubimage(74,746,55,88);
				kickDeeJayRight[2] = 	DeeJaySpriteSheetRight.getSubimage(135,747,55,90);
				kickDeeJayRight[3] = 	DeeJaySpriteSheetRight.getSubimage(196,747,55,90);
				kickDeeJayRight[4] = 	DeeJaySpriteSheetRight.getSubimage(255,741,84,96);
				kickDeeJayRight[5] = 	DeeJaySpriteSheetRight.getSubimage(343,741,84,96);
				kickDeeJayRight[6] = 	DeeJaySpriteSheetRight.getSubimage(432,750,68,87);
				kickDeeJayRight[7] = 	DeeJaySpriteSheetRight.getSubimage(504,753,59,84);

				
				
				verticalJumpDeeJayRight[0] =  DeeJaySpriteSheetRight.getSubimage(508,44,42,76);
				verticalJumpDeeJayRight[1] =  DeeJaySpriteSheetRight.getSubimage(555,11,45,115);
				verticalJumpDeeJayRight[2] =  DeeJaySpriteSheetRight.getSubimage(600,25,35,90);
				verticalJumpDeeJayRight[3] =  DeeJaySpriteSheetRight.getSubimage(640,30,40,80);
				verticalJumpDeeJayRight[4] =  DeeJaySpriteSheetRight.getSubimage(680,30,40,75);
				verticalJumpDeeJayRight[5] =  DeeJaySpriteSheetRight.getSubimage(722,10,758-722,70);
				verticalJumpDeeJayRight[6] =  DeeJaySpriteSheetRight.getSubimage(765,45,35,80);

			//	diagonalJumpDeeJayRight[0] = DeeJaySpriteSheetRight.getSubimage(834, 64, 62, 68);
			//	diagonalJumpDeeJayRight[0] = DeeJaySpriteSheetRight.getSubimage(846, 7, 80, 125);
				   
				diagonalJumpDeeJayRight[0] = DeeJaySpriteSheetRight.getSubimage(821,46,858-821,122-46);
				diagonalJumpDeeJayRight[1] = DeeJaySpriteSheetRight.getSubimage(867,33,923-867,123-33);
				diagonalJumpDeeJayRight[2] = DeeJaySpriteSheetRight.getSubimage(926,26,994-926,114-26);
				diagonalJumpDeeJayRight[3] = DeeJaySpriteSheetRight.getSubimage(997,26,1050-997,122-26);
				diagonalJumpDeeJayRight[4] = DeeJaySpriteSheetRight.getSubimage(1055,26,1141-1055,108-26);
				diagonalJumpDeeJayRight[5] = DeeJaySpriteSheetRight.getSubimage(1146,32,1216-1146,123-32);
				diagonalJumpDeeJayRight[6] = DeeJaySpriteSheetRight.getSubimage(1219,11,1262-1219,123-11);

//
				idleSneakDeeJayRight[0] =  DeeJaySpriteSheetRight.getSubimage(1270,45,40,75);
//
				sneakpunchDeeJayRight[0] =  DeeJaySpriteSheetRight.getSubimage(190,530,60,70);
				sneakpunchDeeJayRight[1] =  DeeJaySpriteSheetRight.getSubimage(260,540,65, 60);
				
				sneakkickDeeJayRight[0] = DeeJaySpriteSheetRight.getSubimage(650,520,60, 80);
				sneakkickDeeJayRight[1] = DeeJaySpriteSheetRight.getSubimage(710, 520,90, 80);
				sneakkickDeeJayRight[2] = DeeJaySpriteSheetRight.getSubimage(800, 520, 62,80);

				aerialkickDeeJayRight[0] = DeeJaySpriteSheetRight.getSubimage(669,645, 718-669, 723-645);
				aerialkickDeeJayRight[1] = DeeJaySpriteSheetRight.getSubimage(723,647, 810-723,723-647);

				DeeJayTorsoHitRight[0] = DeeJaySpriteSheetRight.getSubimage(887,1130,932-887,1218-1130);
				DeeJayTorsoHitRight[1] = DeeJaySpriteSheetRight.getSubimage(936,1131,984-936,1217-1131);
				DeeJayTorsoHitRight[2] = DeeJaySpriteSheetRight.getSubimage(994,1129,1046-994,1217-1129);
				DeeJayTorsoHitRight[3] = DeeJaySpriteSheetRight.getSubimage(1061,1128,1106-1061,1218-1128);

				DeeJayHeadHitRight[0] =  DeeJaySpriteSheetRight.getSubimage(1112,1129,1164-1112,1219-1129);
				DeeJayHeadHitRight[1] =  DeeJaySpriteSheetRight.getSubimage(1166,1130,1225-1166,1218-1130);
				DeeJayHeadHitRight[2] =  DeeJaySpriteSheetRight.getSubimage(1227,1127,1291-1227,1218-1127);
				DeeJayHeadHitRight[3] =  DeeJaySpriteSheetRight.getSubimage(1299,1126,1345-1299,1217-1126);

				knockDownDeeJayRight[0] = DeeJaySpriteSheetRight.getSubimage(5,1254, 71-5,1324-1254);
				knockDownDeeJayRight[1] = DeeJaySpriteSheetRight.getSubimage(73,1257,156-73,1316-1257);
				knockDownDeeJayRight[2] = DeeJaySpriteSheetRight.getSubimage(158,1268,248-158,1329-1268);
				knockDownDeeJayRight[3] = DeeJaySpriteSheetRight.getSubimage(251,1296,348-251,1329-1296) ;
				knockDownDeeJayRight[4] = DeeJaySpriteSheetRight.getSubimage(349,1275,391-349,1329-1275) ;
				knockDownDeeJayRight[5] = DeeJaySpriteSheetRight.getSubimage (414,1236,464-414,1325-1236);
				knockDownDeeJayRight[6] = DeeJaySpriteSheetRight.getSubimage(477,1256,549-477,1322-1256);
				knockDownDeeJayRight[7] = DeeJaySpriteSheetRight.getSubimage(569,1253,601-569,1325-1253);

				defeatDeeJayRight[0] = DeeJaySpriteSheetRight.getSubimage(735, 1254, 801-735, 1324-1254) ;
				defeatDeeJayRight[1] = DeeJaySpriteSheetRight.getSubimage(805,1267,887-805,1323-1267);
				defeatDeeJayRight[2] = DeeJaySpriteSheetRight.getSubimage(894,1270, 977-894, 1330-1270);
				defeatDeeJayRight[3] = DeeJaySpriteSheetRight.getSubimage(1077,1299-25, 1174-1077, 1329-1299+25);

				speicalDeeJayRight[0] = DeeJaySpriteSheetRight.getSubimage(4,872,56,97);
				speicalDeeJayRight[1] = DeeJaySpriteSheetRight.getSubimage(73,882,63,87);
				speicalDeeJayRight[2] = DeeJaySpriteSheetRight.getSubimage(145,885,71,84);
				speicalDeeJayRight[3] = DeeJaySpriteSheetRight.getSubimage(226,864,67,105);
				speicalDeeJayRight[4] = DeeJaySpriteSheetRight.getSubimage(306,856,66,113);
				speicalDeeJayRight[5] = DeeJaySpriteSheetRight.getSubimage(387,883,55,86);
				
				
			}catch(Exception e){e.printStackTrace(); }
		
	}
	
}
