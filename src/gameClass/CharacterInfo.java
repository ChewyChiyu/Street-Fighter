package gameClass;


public enum CharacterInfo {
	//will change constant names when more characters are added
	RYU(1,200,500), EHONDA(2,400,500), THREE(3,200,500), FOUR(4,200,500), FIVE(5,200,500), SIX(6,200,500), SEVEN(7,200,500), EIGHT(8,200,500), NINE(9,200,500);
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
	Character getCharacter(boolean right){
		switch(location){
		case 1:
			return new Ryu(CharacterInfo.RYU,5,right,false);
		case 2:
			return new EHonda(CharacterInfo.EHONDA,3,right,false);
		case 3:
			return new EHonda(CharacterInfo.EHONDA,5,right,false);
		case 4:
			return new EHonda(CharacterInfo.EHONDA,5,right,false);
		case 5:
			return new EHonda(CharacterInfo.EHONDA,5,right,false);
		case 6:
			return new EHonda(CharacterInfo.EHONDA,5,right,false);
		case 7:
			return new EHonda(CharacterInfo.EHONDA,5,right,false);
		case 8:
			return new EHonda(CharacterInfo.EHONDA,5,right,false);
		case 9:
			return new EHonda(CharacterInfo.EHONDA,5,right,false);
		}
		return null;
	}
	public String toString(){
		return ""+location;
	}
	
	
}
