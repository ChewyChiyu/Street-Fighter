package gameClass;

import textureClass.BlankaTexture;
import textureClass.EHondaTexture;
import textureClass.RyuTexture;

public enum CharacterInfo {
	//will change constant names when more characters are added
	RYU(1,RyuTexture.idleRyuLeft[0].getWidth()*5,RyuTexture.idleRyuLeft[0].getHeight()*5), EHONDA(2,EHondaTexture.idleEHondaLeft[0].getWidth()*5,EHondaTexture.idleEHondaLeft[0].getHeight()*5), BLANKA(3,BlankaTexture.idleBlankaLeft[0].getWidth()*5,BlankaTexture.idleBlankaLeft[0].getHeight()*5), DEEJAY(4,200,500);
	private int location;
	private int height;
	private int width;
	private CharacterInfo(int loc, int width, int height){
		location = loc;
		this.width = width;
		this.height = height;
	}
	int getWidth(){
		return width;
	}
	int getHeight(){
		return height;
	}
	int locationInCharSelect(){
		return location;
	}
	Character getCharacter(boolean right, boolean automated){
		switch(location){
		case 1:
			return new Ryu(CharacterInfo.RYU,5,right,automated);
		case 2:
			return new EHonda(CharacterInfo.EHONDA,3,right,automated);
		case 3:
			return new Blanka(CharacterInfo.BLANKA,5,right,automated);
		case 4:
			return new DeeJay(CharacterInfo.DEEJAY,5,right,automated);
		}
		return null;
	}
	public String toString(){
		return ""+location;
	}
	
	
}
