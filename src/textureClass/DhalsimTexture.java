package textureClass;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class DhalsimTexture {
	public static BufferedImage[] idleDhalsimRight = new BufferedImage[9];
	public static BufferedImage[] walkDhalsimRight = new BufferedImage[8];
	public static BufferedImage[] jumpDhalsimRight = new BufferedImage[4];
	public static BufferedImage[] diagonalJumpDhalsimRight = new BufferedImage[5];

	public static BufferedImage[] punchDhalsimRight = new BufferedImage[3];
	public static BufferedImage[] kickDhalsimRight = new BufferedImage[3];
	
	public static BufferedImage[] idlesneakDhalsimRight = new BufferedImage[2];
	public static BufferedImage[] sneakPunchDhalsimRight = new BufferedImage[5];
	public static BufferedImage[] sneakKickDhalsimRight = new BufferedImage[3];
	public static BufferedImage[] aerialkickDhalsimRight = new BufferedImage[3];
	
	public static BufferedImage[] speicalDhalsimRight = punchDhalsimRight;
	
	public static BufferedImage[] DhalsimTorsoHitRight = new BufferedImage[3];
	public static BufferedImage[] DhalsimHeadHitRight = new BufferedImage[3];
	public static BufferedImage[] knockDownDhalsimRight = new BufferedImage[4];
	public static BufferedImage[] defeatDhalsimRight = new BufferedImage[4];
	
	
	
	
	
	// Left
	public static BufferedImage[] idleDhalsimLeft = new BufferedImage[9];
	public static BufferedImage[] walkDhalsimLeft = new BufferedImage[8];
	public static BufferedImage[] jumpDhalsimLeft = new BufferedImage[4];
	public static BufferedImage[] diagonalJumpDhalsimLeft = new BufferedImage[5];

	public static BufferedImage[] punchDhalsimLeft = new BufferedImage[3];
	public static BufferedImage[] kickDhalsimLeft = new BufferedImage[3];
	
	public static BufferedImage[] idlesneakDhalsimLeft = new BufferedImage[2];
	public static BufferedImage[] sneakPunchDhalsimLeft = new BufferedImage[5];
	public static BufferedImage[] sneakKickDhalsimLeft = new BufferedImage[3];
	public static BufferedImage[] aerialkickDhalsimLeft = new BufferedImage[3];
	
	public static BufferedImage[] speicalDhalsimLeft = punchDhalsimLeft;
	
	public static BufferedImage[] DhalsimTorsoHitLeft = new BufferedImage[3];
	public static BufferedImage[] DhalsimHeadHitLeft = new BufferedImage[3];
	public static BufferedImage[] knockDownDhalsimLeft = new BufferedImage[4];
	public static BufferedImage[] defeatDhalsimLeft = new BufferedImage[4];
	
	
	
	protected DhalsimTexture(){
		loadLeft();
		loadRight();
		
	}



	private void loadRight() {
		// TODO Auto-generated method stub
		try{
			//1710x945
			BufferedImage DhalsimSpriteSheetRight = ImageIO.read(getClass().getResource("/imgs/characters/DhalsimSpriteSheetRight.png"));

			idleDhalsimRight[0] =  DhalsimSpriteSheetRight.getSubimage(12,22,44,86);
			idleDhalsimRight[1] =  DhalsimSpriteSheetRight.getSubimage(67,23,41,85);
			idleDhalsimRight[2] =  DhalsimSpriteSheetRight.getSubimage(123,28,46,80);
			idleDhalsimRight[3] =  DhalsimSpriteSheetRight.getSubimage(184,23,43,85);
			idleDhalsimRight[4] =  DhalsimSpriteSheetRight.getSubimage(239,22,41,86);
			idleDhalsimRight[5] =  DhalsimSpriteSheetRight.getSubimage(294,27,45,81);
			idleDhalsimRight[6] =  DhalsimSpriteSheetRight.getSubimage(353,23,43,85);
			idleDhalsimRight[7] =  DhalsimSpriteSheetRight.getSubimage(408,24,41,84);
			idleDhalsimRight[8] =  DhalsimSpriteSheetRight.getSubimage(464,27,45,81);

			
		diagonalJumpDhalsimRight[0] = 	DhalsimSpriteSheetRight.getSubimage(12,632,34,67);
		diagonalJumpDhalsimRight[1] = 	DhalsimSpriteSheetRight.getSubimage(66,599,35,97);
		diagonalJumpDhalsimRight[2] = 	DhalsimSpriteSheetRight.getSubimage(119,598,36,62);
		diagonalJumpDhalsimRight[3] = 	DhalsimSpriteSheetRight.getSubimage(170,584,52,77);
		diagonalJumpDhalsimRight[4] = 	DhalsimSpriteSheetRight.getSubimage(403,598,36,62);

			
			
			walkDhalsimRight[0] = DhalsimSpriteSheetRight.getSubimage(567-51,25,51,84);
			walkDhalsimRight[1] = DhalsimSpriteSheetRight.getSubimage(622-45,22,45,87);
			walkDhalsimRight[2] = DhalsimSpriteSheetRight.getSubimage(677-40,20,40,89);
			walkDhalsimRight[3] = DhalsimSpriteSheetRight.getSubimage(736-40,22,40,87);
			walkDhalsimRight[4] = DhalsimSpriteSheetRight.getSubimage (790-48,23,48,87);
			walkDhalsimRight[5] = DhalsimSpriteSheetRight.getSubimage(850-40,22,40,86);
			walkDhalsimRight[6] = DhalsimSpriteSheetRight.getSubimage(905-40,20,40,88);
			walkDhalsimRight[7] = DhalsimSpriteSheetRight.getSubimage(959-44,22,44,87);
			
			jumpDhalsimRight[0] =  DhalsimSpriteSheetRight.getSubimage(1013-35,42,35,67);
			jumpDhalsimRight[1] =  DhalsimSpriteSheetRight.getSubimage(1057-34,14,34,96);
			jumpDhalsimRight[2] =  DhalsimSpriteSheetRight.getSubimage(1098-35,24,35,61);
			jumpDhalsimRight[3] =  DhalsimSpriteSheetRight.getSubimage(1135-34,14,34,96);

			diagonalJumpDhalsimRight[0] = DhalsimSpriteSheetRight.getSubimage(12,632,34,67);
			diagonalJumpDhalsimRight[1] = DhalsimSpriteSheetRight.getSubimage(66,599,35,97);
			diagonalJumpDhalsimRight[2] = DhalsimSpriteSheetRight.getSubimage(119,598,36,62);
			diagonalJumpDhalsimRight[3] = DhalsimSpriteSheetRight.getSubimage(170,584,52,77);
			diagonalJumpDhalsimRight[4] = DhalsimSpriteSheetRight.getSubimage(403,598,36,62);

			
			
			
			idlesneakDhalsimRight[0] =  DhalsimSpriteSheetRight.getSubimage(1186-33,42,33,68);
			idlesneakDhalsimRight[1] =  DhalsimSpriteSheetRight.getSubimage(1240-38,52,38,57);
			
			
			
			punchDhalsimRight[0] = DhalsimSpriteSheetRight.getSubimage(62-55,170,55,77) ;
			punchDhalsimRight[1] = DhalsimSpriteSheetRight.getSubimage(158-80,175,80,73);
			punchDhalsimRight[2] = DhalsimSpriteSheetRight.getSubimage(226-56,169,56,78);

			kickDhalsimRight[0] = DhalsimSpriteSheetRight.getSubimage(56-37,280,37,82);
			kickDhalsimRight[1] = DhalsimSpriteSheetRight.getSubimage(148-70,267,70,96);
			kickDhalsimRight[2] = DhalsimSpriteSheetRight.getSubimage(270-99,267,99,96);
			
			
			
		
			
//
			sneakPunchDhalsimRight[0] =  DhalsimSpriteSheetRight.getSubimage(58-43,408,43,54);
			sneakPunchDhalsimRight[1] =  DhalsimSpriteSheetRight.getSubimage(147-77,432,77,32);
			sneakPunchDhalsimRight[2] =  DhalsimSpriteSheetRight.getSubimage(286-124,432,124,32);
			sneakPunchDhalsimRight[3] =  DhalsimSpriteSheetRight.getSubimage(379-77, 432,77, 32);
			sneakPunchDhalsimRight[4] =  DhalsimSpriteSheetRight.getSubimage(435-43,408,43,54);
			
			
			sneakKickDhalsimRight[0] = DhalsimSpriteSheetRight.getSubimage(491-39,408,39,55);
			sneakKickDhalsimRight[1] = DhalsimSpriteSheetRight.getSubimage(582-87,425,87,37);
			sneakKickDhalsimRight[2] = DhalsimSpriteSheetRight.getSubimage(632-39,407,39,55);
			
			aerialkickDhalsimRight[0] = DhalsimSpriteSheetRight.getSubimage(975-66,392,66,66);
			aerialkickDhalsimRight[1] = DhalsimSpriteSheetRight.getSubimage(1096-103,393,103,74);
			aerialkickDhalsimRight[2] = DhalsimSpriteSheetRight.getSubimage(1175-66,393,66,66);
//
			DhalsimTorsoHitRight[0] = DhalsimSpriteSheetRight.getSubimage(56-50,729,50,79);
			DhalsimTorsoHitRight[1] = DhalsimSpriteSheetRight.getSubimage(109-43,723,43,76);
			DhalsimTorsoHitRight[2] = DhalsimSpriteSheetRight.getSubimage(162-47,721,47,70);
			
			DhalsimHeadHitRight[0] =  DhalsimSpriteSheetRight.getSubimage(224-43,726,43,83);
			DhalsimHeadHitRight[1] =  DhalsimSpriteSheetRight.getSubimage(272-45,723,45,87);
			DhalsimHeadHitRight[2] = DhalsimSpriteSheetRight.getSubimage(336-53,723,53,86);
			
			knockDownDhalsimRight[0] = DhalsimSpriteSheetRight.getSubimage(464-57,732,57,76);
			knockDownDhalsimRight[1] = DhalsimSpriteSheetRight.getSubimage(529-61,741,61,51);
			knockDownDhalsimRight[2] = DhalsimSpriteSheetRight.getSubimage (611-79,781,79,29);
			knockDownDhalsimRight[3] = DhalsimSpriteSheetRight.getSubimage(691-70,747,70,62);
			
		
			defeatDhalsimRight[0] = DhalsimSpriteSheetRight.getSubimage(1008-74,753,74,46);
			defeatDhalsimRight[1] = DhalsimSpriteSheetRight.getSubimage(1090-84,781,84,60);
			defeatDhalsimRight[2] = DhalsimSpriteSheetRight.getSubimage(1172-78,753,78,28);
			defeatDhalsimRight[3] = DhalsimSpriteSheetRight.getSubimage(1258-78,781,78,28);
			

		}catch(Exception e) { }
	
	}



	private void loadLeft() {
		try{
			//1710x945
			final int xStart = 1710;
			BufferedImage DhalsimSpriteSheetLeft = ImageIO.read(getClass().getResource("/imgs/characters/DhalsimSpriteSheetLeft.png"));
			idleDhalsimLeft[0] = DhalsimSpriteSheetLeft.getSubimage(xStart-54,23,46,92);
			idleDhalsimLeft[1] = DhalsimSpriteSheetLeft.getSubimage(xStart-108,23,41,87);
			idleDhalsimLeft[2] = DhalsimSpriteSheetLeft.getSubimage(xStart-168,29,46,80);
			idleDhalsimLeft[3] = DhalsimSpriteSheetLeft.getSubimage(xStart-226,24,43,85);
			idleDhalsimLeft[4] = DhalsimSpriteSheetLeft.getSubimage(xStart-280,23,40,86);
			idleDhalsimLeft[5] = DhalsimSpriteSheetLeft.getSubimage(xStart-339,28,45,81);
			idleDhalsimLeft[6] = DhalsimSpriteSheetLeft.getSubimage(xStart-396,24,43,85);
			idleDhalsimLeft[7] = DhalsimSpriteSheetLeft.getSubimage(xStart-449,25,40,83);
			idleDhalsimLeft[8] = DhalsimSpriteSheetLeft.getSubimage(xStart-509,28,44,81);

			walkDhalsimLeft[0] = DhalsimSpriteSheetLeft.getSubimage(xStart-567,25,51,84);
			walkDhalsimLeft[1] = DhalsimSpriteSheetLeft.getSubimage(xStart-622,22,45,87);
			walkDhalsimLeft[2] = DhalsimSpriteSheetLeft.getSubimage(xStart-677,20,40,89);
			walkDhalsimLeft[3] = DhalsimSpriteSheetLeft.getSubimage(xStart-736,22,40,87);
			walkDhalsimLeft[4] = DhalsimSpriteSheetLeft.getSubimage (xStart-790,23,48,87);
			walkDhalsimLeft[5] = DhalsimSpriteSheetLeft.getSubimage(xStart-850,22,40,86);
			walkDhalsimLeft[6] = DhalsimSpriteSheetLeft.getSubimage(xStart-905,20,40,88);
			walkDhalsimLeft[7] = DhalsimSpriteSheetLeft.getSubimage(xStart-959,22,44,87);
			
			diagonalJumpDhalsimLeft[0] = 	DhalsimSpriteSheetLeft.getSubimage(xStart-12-34,632,34,67);
			diagonalJumpDhalsimLeft[1] = 	DhalsimSpriteSheetLeft.getSubimage(xStart-66-35,599,35,97);
			diagonalJumpDhalsimLeft[2] = 	DhalsimSpriteSheetLeft.getSubimage(xStart-119-36,598,36,62);
			diagonalJumpDhalsimLeft[3] = 	DhalsimSpriteSheetLeft.getSubimage(xStart-170-52,584,52,77);
			diagonalJumpDhalsimLeft[4] = 	DhalsimSpriteSheetLeft.getSubimage(xStart-403-36,598,36,62);

				
			
			
			jumpDhalsimLeft[0] =  DhalsimSpriteSheetLeft.getSubimage(xStart-1013,42,35,67);
			jumpDhalsimLeft[1] =  DhalsimSpriteSheetLeft.getSubimage(xStart-1057,14,34,96);
			jumpDhalsimLeft[2] =  DhalsimSpriteSheetLeft.getSubimage(xStart-1098,24,35,61);
			jumpDhalsimLeft[3] =  DhalsimSpriteSheetLeft.getSubimage(xStart-1135,14,34,96);

			idlesneakDhalsimLeft[0] =  DhalsimSpriteSheetLeft.getSubimage(xStart-1186,42,33,68);
			idlesneakDhalsimLeft[1] =  DhalsimSpriteSheetLeft.getSubimage(xStart-1240,52,38,57);
			
			
			
			punchDhalsimLeft[0] = DhalsimSpriteSheetLeft.getSubimage(xStart-62,170,55,77) ;
			punchDhalsimLeft[1] = DhalsimSpriteSheetLeft.getSubimage(xStart-158,175,80,73);
			punchDhalsimLeft[2] = DhalsimSpriteSheetLeft.getSubimage(xStart-226,169,56,78);

			kickDhalsimLeft[0] = DhalsimSpriteSheetLeft.getSubimage(xStart-56,280,37,82);
			kickDhalsimLeft[1] = DhalsimSpriteSheetLeft.getSubimage(xStart-148,267,70,96);
			kickDhalsimLeft[2] = DhalsimSpriteSheetLeft.getSubimage(xStart-270,267,99,96);
			
			
			
		
			
//
			sneakPunchDhalsimLeft[0] =  DhalsimSpriteSheetLeft.getSubimage(xStart-58,408,43,54);
			sneakPunchDhalsimLeft[1] =  DhalsimSpriteSheetLeft.getSubimage(xStart-147,432,77,32);
			sneakPunchDhalsimLeft[2] =  DhalsimSpriteSheetLeft.getSubimage(xStart-286,432,124,32);
			sneakPunchDhalsimLeft[3] =  DhalsimSpriteSheetLeft.getSubimage(xStart-379, 432,77, 32);
			sneakPunchDhalsimLeft[4] =  DhalsimSpriteSheetLeft.getSubimage(xStart-435,408,43,54);
			
			
			sneakKickDhalsimLeft[0] = DhalsimSpriteSheetLeft.getSubimage(xStart-491,408,39,55);
			sneakKickDhalsimLeft[1] = DhalsimSpriteSheetLeft.getSubimage(xStart-582,425,87,37);
			sneakKickDhalsimLeft[2] = DhalsimSpriteSheetLeft.getSubimage(xStart-632,407,39,55);
			
			aerialkickDhalsimLeft[0] = DhalsimSpriteSheetLeft.getSubimage(xStart-975,392,66,66);
			aerialkickDhalsimLeft[1] = DhalsimSpriteSheetLeft.getSubimage(xStart-1096,393,103,74);
			aerialkickDhalsimLeft[2] = DhalsimSpriteSheetLeft.getSubimage(xStart-1175,393,66,66);
//
			DhalsimTorsoHitLeft[0] = DhalsimSpriteSheetLeft.getSubimage(xStart-56,729,50,79);
			DhalsimTorsoHitLeft[1] = DhalsimSpriteSheetLeft.getSubimage(xStart-109,723,43,76);
			DhalsimTorsoHitLeft[2] = DhalsimSpriteSheetLeft.getSubimage(xStart-162,721,47,70);
			
			DhalsimHeadHitLeft[0] =  DhalsimSpriteSheetLeft.getSubimage(xStart-224,726,43,83);
			DhalsimHeadHitLeft[1] =  DhalsimSpriteSheetLeft.getSubimage(xStart-272,723,45,87);
			DhalsimHeadHitLeft[2] = DhalsimSpriteSheetLeft.getSubimage(xStart-336,723,53,86);
			
			knockDownDhalsimLeft[0] = DhalsimSpriteSheetLeft.getSubimage(xStart-464,732,57,76);
			knockDownDhalsimLeft[1] = DhalsimSpriteSheetLeft.getSubimage(xStart-529,741,61,51);
			knockDownDhalsimLeft[2] = DhalsimSpriteSheetLeft.getSubimage (xStart-611,781,79,29);
			knockDownDhalsimLeft[3] = DhalsimSpriteSheetLeft.getSubimage(xStart-691,747,70,62);
			
		
			defeatDhalsimLeft[0] = DhalsimSpriteSheetLeft.getSubimage(xStart-1008,753,74,46);
			defeatDhalsimLeft[1] = DhalsimSpriteSheetLeft.getSubimage(xStart-1090,781,84,60);
			defeatDhalsimLeft[2] = DhalsimSpriteSheetLeft.getSubimage(xStart-1172,753,78,28);
			defeatDhalsimLeft[3] = DhalsimSpriteSheetLeft.getSubimage(xStart-1258,781,78,28);
			

		}catch(Exception e) { }
	}
		
	
	
}
