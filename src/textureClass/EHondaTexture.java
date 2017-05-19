package textureClass;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class EHondaTexture extends Texture{
	//EHonda CHARACTER SPRITES RIGHT
	public static BufferedImage[] idleEHondaRight = new BufferedImage[4];
	public static BufferedImage[] walkEHondaRight = new BufferedImage[4];
	public static BufferedImage[] verticalJumpEHondaRight = new BufferedImage[4];
	public static BufferedImage[] diagonalJumpEHondaRight = new BufferedImage[4];
	public static BufferedImage[] punchEHondaRight = new BufferedImage[3];
	public static BufferedImage[] kickEHondaRight = new BufferedImage[3];

	public static BufferedImage[] idleSneakEHondaRight = new BufferedImage[2];
	public static BufferedImage[] sneakpunchEHondaRight = new BufferedImage[7];
	public static BufferedImage[] sneakkickEHondaRight = new BufferedImage[5];
	public static BufferedImage[] aerialkickEHondaRight = new BufferedImage[3];

	public static BufferedImage[] speicalEHondaRight = new BufferedImage[6];





	public static BufferedImage[] EHondaTorsoHitRight = new BufferedImage[3];
	public static BufferedImage[] EHondaHeadHitRight = new BufferedImage[2];
	public static BufferedImage[] knockDownEHondaRight = new BufferedImage[8];
	public static BufferedImage[] defeatEHondaRight = new BufferedImage[5];

	//END OF EHonda CHARACTER SPRITES RIGHT




	//EHonda CHARACTER SPRITES LEFT
	public static BufferedImage[] idleEHondaLeft = new BufferedImage[4];
	public static BufferedImage[] walkEHondaLeft = new BufferedImage[4];
	public static BufferedImage[] verticalJumpEHondaLeft = new BufferedImage[4];
	public static BufferedImage[] diagonalJumpEHondaLeft = new BufferedImage[4];
	public static BufferedImage[] punchEHondaLeft = new BufferedImage[3];
	public static BufferedImage[] kickEHondaLeft = new BufferedImage[3];

	public static BufferedImage[] idleSneakEHondaLeft = new BufferedImage[2];
	public static BufferedImage[] sneakpunchEHondaLeft = new BufferedImage[7];
	public static BufferedImage[] sneakkickEHondaLeft = new BufferedImage[5];
	public static BufferedImage[] aerialkickEHondaLeft = new BufferedImage[3];

	public static BufferedImage[] speicalEHondaLeft = new BufferedImage[6];

	public static BufferedImage[] EHondaTorsoHitLeft = new BufferedImage[3];
	public static BufferedImage[] EHondaHeadHitLeft = new BufferedImage[2];
	public static BufferedImage[] knockDownEHondaLeft = new BufferedImage[8];
	public static BufferedImage[] defeatEHondaLeft = new BufferedImage[5];

	//END OF EHonda CHARACTER SPRITES LEFT
	protected EHondaTexture(){
		loadRight();	
		loadLeft();
	}
	void loadLeft(){
		try{
			final int xStart = 1457;
			BufferedImage EHondaSpriteSheetLeft = ImageIO.read(getClass().getResource("/imgs/characters/EHondaLeft.png"));
			idleEHondaLeft[0] = EHondaSpriteSheetLeft.getSubimage(xStart-6-60, 48, 60, 84);
			idleEHondaLeft[1] = EHondaSpriteSheetLeft.getSubimage(xStart-74-68, 52, 68, 82);
			idleEHondaLeft[2] = EHondaSpriteSheetLeft.getSubimage(xStart-152-62, 56, 62, 78);
			idleEHondaLeft[3] = EHondaSpriteSheetLeft.getSubimage(xStart-225-63, 52, 63, 80);

			walkEHondaLeft[0] = EHondaSpriteSheetLeft.getSubimage(xStart-298-74, 52, 74, 82);
			walkEHondaLeft[1] = EHondaSpriteSheetLeft.getSubimage(xStart-374-68, 52, 68, 80);
			walkEHondaLeft[2] = EHondaSpriteSheetLeft.getSubimage(xStart-444-64, 54, 64, 80);
			walkEHondaLeft[3] = EHondaSpriteSheetLeft.getSubimage(xStart-512-64, 54, 64, 78);

			punchEHondaLeft[0] = EHondaSpriteSheetLeft.getSubimage(xStart-6-72, 174, 72, 78);
			punchEHondaLeft[1] = EHondaSpriteSheetLeft.getSubimage(xStart-80-90, 176, 90, 76);
			punchEHondaLeft[2] = EHondaSpriteSheetLeft.getSubimage(xStart-174-70, 172, 70, 82);

			kickEHondaLeft[0] = EHondaSpriteSheetLeft.getSubimage(xStart-6-68, 294, 68, 82);
			kickEHondaLeft[1] = EHondaSpriteSheetLeft.getSubimage(xStart-80-94, 306, 94, 68);
			kickEHondaLeft[2] = EHondaSpriteSheetLeft.getSubimage(xStart-174-72, 293, 72, 84);

			verticalJumpEHondaLeft[0] =  EHondaSpriteSheetLeft.getSubimage(xStart-586-64, 64, 64, 78);
			verticalJumpEHondaLeft[1] =  EHondaSpriteSheetLeft.getSubimage(xStart-650-60, 50, 60, 82);
			verticalJumpEHondaLeft[2] =  EHondaSpriteSheetLeft.getSubimage(xStart-712-56, 54, 56, 60);
			verticalJumpEHondaLeft[3] =  EHondaSpriteSheetLeft.getSubimage(xStart-772-58, 50, 58, 86);

			//	diagonalJumpEHondaLeft[0] = EHondaSpriteSheetLeft.getSubimage(834, 64, 62, 68);
			//	diagonalJumpEHondaLeft[0] = EHondaSpriteSheetLeft.getSubimage(846, 7, 80, 125);
			diagonalJumpEHondaLeft[0] = EHondaSpriteSheetLeft.getSubimage(xStart-978-66, 32, 66, 76);
			diagonalJumpEHondaLeft[1] = EHondaSpriteSheetLeft.getSubimage(xStart-1044-56, 34, 56, 62);
			diagonalJumpEHondaLeft[2] = EHondaSpriteSheetLeft.getSubimage(xStart-1098-72, 24, 72, 88);
			diagonalJumpEHondaLeft[3] = EHondaSpriteSheetLeft.getSubimage(xStart-1166-76, 24, 76, 90);
			//diagonalJumpEHondaLeft[6] = EHondaSpriteSheetLeft.getSubimage(1236, 18, 82, 114);

			idleSneakEHondaLeft[0] =  EHondaSpriteSheetLeft.getSubimage(xStart-1324-66, 64, 66, 70);
			idleSneakEHondaLeft[1] =  EHondaSpriteSheetLeft.getSubimage(xStart-1390-60, 70, 60, 64);

			sneakpunchEHondaLeft[0] =  EHondaSpriteSheetLeft.getSubimage(xStart-714-74, 306, 74, 70);
			sneakpunchEHondaLeft[1] =  EHondaSpriteSheetLeft.getSubimage(xStart-798-94, 312, 94, 64);
			sneakpunchEHondaLeft[2] =  EHondaSpriteSheetLeft.getSubimage(xStart-902-78, 314, 78, 62);
			sneakpunchEHondaLeft[3] =  EHondaSpriteSheetLeft.getSubimage(xStart-988-74, 304, 74, 70);
			sneakpunchEHondaLeft[4] =  EHondaSpriteSheetLeft.getSubimage(xStart-1078-74, 312, 74, 62);
			sneakpunchEHondaLeft[5] =  EHondaSpriteSheetLeft.getSubimage(xStart-1162-90, 312, 90, 64);
			sneakpunchEHondaLeft[6] =  EHondaSpriteSheetLeft.getSubimage(xStart-1256-72, 310, 72, 66);

			sneakkickEHondaLeft[0] = EHondaSpriteSheetLeft.getSubimage(xStart-400-66, 402, 66, 70);
			sneakkickEHondaLeft[1] = EHondaSpriteSheetLeft.getSubimage(xStart-472-86, 402, 86, 74);
			sneakkickEHondaLeft[2] = EHondaSpriteSheetLeft.getSubimage(xStart-556-58, 407, 58, 67);
			sneakkickEHondaLeft[3] = EHondaSpriteSheetLeft.getSubimage(xStart-628-68, 407, 68, 63);
			sneakkickEHondaLeft[4] = EHondaSpriteSheetLeft.getSubimage(xStart-746-48, 409, 48, 64);

			aerialkickEHondaLeft[0] = EHondaSpriteSheetLeft.getSubimage(xStart-815-(872-815), 408, (872-815), (463-408));
			aerialkickEHondaLeft[1] = EHondaSpriteSheetLeft.getSubimage(xStart-876-(965-876),402,(965-876),(470-402));
			aerialkickEHondaLeft[2] = EHondaSpriteSheetLeft.getSubimage(xStart-964-(1031-964), 399, (1031-964), (463-399));




			EHondaTorsoHitLeft[0] = EHondaSpriteSheetLeft.getSubimage(xStart-6-70, 919, 70, 75);
			EHondaTorsoHitLeft[1] = EHondaSpriteSheetLeft.getSubimage(xStart-80-68, 924, 68, 69);
			EHondaTorsoHitLeft[2] = EHondaSpriteSheetLeft.getSubimage(xStart-150-66, 916, 66, 75);

			EHondaHeadHitLeft[0] =  EHondaSpriteSheetLeft.getSubimage(xStart-232-60, 907, 60, 87);
			EHondaHeadHitLeft[1] =  EHondaSpriteSheetLeft.getSubimage(xStart-292-58, 910, 58, 86);

			knockDownEHondaLeft[0] = EHondaSpriteSheetLeft.getSubimage(xStart-454-68, 900, 68, 87);
			knockDownEHondaLeft[1] = EHondaSpriteSheetLeft.getSubimage(xStart-526-70, 901, 70, 86);
			knockDownEHondaLeft[2] = EHondaSpriteSheetLeft.getSubimage(xStart-598-72, 899, 72, 86);
			knockDownEHondaLeft[3] = EHondaSpriteSheetLeft.getSubimage(xStart-664-98, 950, 98, 48);
			knockDownEHondaLeft[4] = EHondaSpriteSheetLeft.getSubimage(xStart-760-72, 912, 72, 80);
			knockDownEHondaLeft[5] = EHondaSpriteSheetLeft.getSubimage(xStart-846-54, 883, 54, 79);
			knockDownEHondaLeft[6] = EHondaSpriteSheetLeft.getSubimage(xStart-904-74, 881, 74, 72);
			knockDownEHondaLeft[7] = EHondaSpriteSheetLeft.getSubimage(xStart-984-66, 927, 66, 64);

			defeatEHondaLeft[0] = EHondaSpriteSheetLeft.getSubimage(xStart-8-70, 1049, 70, 85);
			defeatEHondaLeft[1] = EHondaSpriteSheetLeft.getSubimage(xStart-82-66, 1052, 66, 81);
			defeatEHondaLeft[2] = EHondaSpriteSheetLeft.getSubimage(xStart-148-96, 1094, 96, 48);
			defeatEHondaLeft[3] = EHondaSpriteSheetLeft.getSubimage(xStart-240-68, 1051, 68, 82);
			defeatEHondaLeft[4] = EHondaSpriteSheetLeft.getSubimage(xStart-312-88, 1089, 88, 51);
		
		
			speicalEHondaLeft[0] = EHondaSpriteSheetLeft.getSubimage(xStart-8-105,655,105,73);
			speicalEHondaLeft[1] = EHondaSpriteSheetLeft.getSubimage(xStart-121-81,642,81,86);
			speicalEHondaLeft[2] = EHondaSpriteSheetLeft.getSubimage(xStart-212-96,655,96,73);
			speicalEHondaLeft[3] = EHondaSpriteSheetLeft.getSubimage(xStart-315-86,655,86,73);
			speicalEHondaLeft[4] = EHondaSpriteSheetLeft.getSubimage(xStart-411-104,642,104,86);
			speicalEHondaLeft[5] = EHondaSpriteSheetLeft.getSubimage(xStart-524-74,655,74,73);
		
		}catch(Exception e) { }
	}
	void loadRight(){
		try{
			BufferedImage EHondaSpriteSheetRight = ImageIO.read(getClass().getResource("/imgs/characters/EHondaRight.png"));
			idleEHondaRight[0] = EHondaSpriteSheetRight.getSubimage(6, 48, 60, 84);
			idleEHondaRight[1] = EHondaSpriteSheetRight.getSubimage(74, 52, 68, 82);
			idleEHondaRight[2] = EHondaSpriteSheetRight.getSubimage(152, 56, 62, 78);
			idleEHondaRight[3] = EHondaSpriteSheetRight.getSubimage(225, 52, 63, 80);

			walkEHondaRight[0] = EHondaSpriteSheetRight.getSubimage(298, 52, 74, 82);
			walkEHondaRight[1] = EHondaSpriteSheetRight.getSubimage(374, 52, 68, 80);
			walkEHondaRight[2] = EHondaSpriteSheetRight.getSubimage(444, 54, 64, 80);
			walkEHondaRight[3] = EHondaSpriteSheetRight.getSubimage(512, 54, 64, 78);

			punchEHondaRight[0] = EHondaSpriteSheetRight.getSubimage(6, 174, 72, 78);
			punchEHondaRight[1] = EHondaSpriteSheetRight.getSubimage(80, 176, 90, 76);
			punchEHondaRight[2] = EHondaSpriteSheetRight.getSubimage(174, 172, 70, 82);

			kickEHondaRight[0] = EHondaSpriteSheetRight.getSubimage(6, 294, 68, 82);
			kickEHondaRight[1] = EHondaSpriteSheetRight.getSubimage(80, 306, 94, 68);
			kickEHondaRight[2] = EHondaSpriteSheetRight.getSubimage(174, 293, 72, 84);

			verticalJumpEHondaRight[0] =  EHondaSpriteSheetRight.getSubimage(586, 64, 64, 78);
			verticalJumpEHondaRight[1] =  EHondaSpriteSheetRight.getSubimage(650, 50, 60, 82);
			verticalJumpEHondaRight[2] =  EHondaSpriteSheetRight.getSubimage(712, 54, 56, 60);
			verticalJumpEHondaRight[3] =  EHondaSpriteSheetRight.getSubimage(772, 50, 58, 86);

			//	diagonalJumpEHondaRight[0] = EHondaSpriteSheetRight.getSubimage(834, 64, 62, 68);
			//	diagonalJumpEHondaRight[0] = EHondaSpriteSheetRight.getSubimage(846, 7, 80, 125);
			diagonalJumpEHondaRight[0] = EHondaSpriteSheetRight.getSubimage(978, 32, 66, 76);
			diagonalJumpEHondaRight[1] = EHondaSpriteSheetRight.getSubimage(1044, 34, 56, 62);
			diagonalJumpEHondaRight[2] = EHondaSpriteSheetRight.getSubimage(1098, 24, 72, 88);
			diagonalJumpEHondaRight[3] = EHondaSpriteSheetRight.getSubimage(1166, 24, 76, 90);
			//diagonalJumpEHondaRight[6] = EHondaSpriteSheetRight.getSubimage(1236, 18, 82, 114);

			idleSneakEHondaRight[0] =  EHondaSpriteSheetRight.getSubimage(1324, 64, 66, 70);
			idleSneakEHondaRight[1] =  EHondaSpriteSheetRight.getSubimage(1390, 70, 60, 64);

			sneakpunchEHondaRight[0] =  EHondaSpriteSheetRight.getSubimage(714, 306, 74, 70);
			sneakpunchEHondaRight[1] =  EHondaSpriteSheetRight.getSubimage(798, 312, 94, 64);
			sneakpunchEHondaRight[2] =  EHondaSpriteSheetRight.getSubimage(902, 314, 78, 62);
			sneakpunchEHondaRight[3] =  EHondaSpriteSheetRight.getSubimage(988, 304, 74, 70);
			sneakpunchEHondaRight[4] =  EHondaSpriteSheetRight.getSubimage(1078, 312, 74, 62);
			sneakpunchEHondaRight[5] =  EHondaSpriteSheetRight.getSubimage(1162, 312, 90, 64);
			sneakpunchEHondaRight[6] =  EHondaSpriteSheetRight.getSubimage(1256, 310, 72, 66);

			sneakkickEHondaRight[0] = EHondaSpriteSheetRight.getSubimage(400, 402, 66, 70);
			sneakkickEHondaRight[1] = EHondaSpriteSheetRight.getSubimage(472, 402, 86, 74);
			sneakkickEHondaRight[2] = EHondaSpriteSheetRight.getSubimage(556, 407, 58, 67);
			sneakkickEHondaRight[3] = EHondaSpriteSheetRight.getSubimage(628, 407, 68, 63);
			sneakkickEHondaRight[4] = EHondaSpriteSheetRight.getSubimage(746, 409, 48, 64);

			aerialkickEHondaRight[0] = EHondaSpriteSheetRight.getSubimage(815, 408, (872-815), (463-408));
			aerialkickEHondaRight[1] = EHondaSpriteSheetRight.getSubimage(876,402,(965-876),(470-402));
			aerialkickEHondaRight[2] = EHondaSpriteSheetRight.getSubimage(964, 399, (1031-964), (463-399));

			EHondaTorsoHitRight[0] = EHondaSpriteSheetRight.getSubimage(6, 919, 70, 75);
			EHondaTorsoHitRight[1] = EHondaSpriteSheetRight.getSubimage(80, 924, 68, 69);
			EHondaTorsoHitRight[2] = EHondaSpriteSheetRight.getSubimage(150, 916, 66, 75);

			EHondaHeadHitRight[0] =  EHondaSpriteSheetRight.getSubimage(232, 907, 60, 87);
			EHondaHeadHitRight[1] =  EHondaSpriteSheetRight.getSubimage(292, 910, 58, 86);

			knockDownEHondaRight[0] = EHondaSpriteSheetRight.getSubimage(454, 900, 68, 87);
			knockDownEHondaRight[1] = EHondaSpriteSheetRight.getSubimage(526, 901, 70, 86);
			knockDownEHondaRight[2] = EHondaSpriteSheetRight.getSubimage(598, 899, 72, 86);
			knockDownEHondaRight[3] = EHondaSpriteSheetRight.getSubimage(664, 950, 98, 48);
			knockDownEHondaRight[4] = EHondaSpriteSheetRight.getSubimage(760, 912, 72, 80);
			knockDownEHondaRight[5] = EHondaSpriteSheetRight.getSubimage(846, 883, 54, 79);
			knockDownEHondaRight[6] = EHondaSpriteSheetRight.getSubimage(904, 881, 74, 72);
			knockDownEHondaRight[7] = EHondaSpriteSheetRight.getSubimage(984, 927, 66, 64);

			defeatEHondaRight[0] = EHondaSpriteSheetRight.getSubimage(8, 1049, 70, 85);
			defeatEHondaRight[1] = EHondaSpriteSheetRight.getSubimage(82, 1052, 66, 81);
			defeatEHondaRight[2] = EHondaSpriteSheetRight.getSubimage(148, 1094, 96, 48);
			defeatEHondaRight[3] = EHondaSpriteSheetRight.getSubimage(240, 1051, 68, 82);
			defeatEHondaRight[4] = EHondaSpriteSheetRight.getSubimage(312, 1089, 88, 51);

			speicalEHondaRight[0] = EHondaSpriteSheetRight.getSubimage(8,655,105,73);
			speicalEHondaRight[1] = EHondaSpriteSheetRight.getSubimage(121,642,81,86);
			speicalEHondaRight[2] = EHondaSpriteSheetRight.getSubimage(212,655,96,73);
			speicalEHondaRight[3] = EHondaSpriteSheetRight.getSubimage(315,655,86,73);
			speicalEHondaRight[4] = EHondaSpriteSheetRight.getSubimage(411,642,104,86);
			speicalEHondaRight[5] = EHondaSpriteSheetRight.getSubimage(524,655,74,73);

		}catch(Exception e){e.printStackTrace(); }

	}

}
