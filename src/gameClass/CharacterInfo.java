package gameClass;


public enum CharacterInfo {
	//will change constant names when more characters are added
	RYU(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9);
	private int location;
	private CharacterInfo(int loc){
		location = loc;
	}
	int locationInCharSelect(){
		return location;
	}
	Character getCharacter(boolean right){
		switch(location){
		case 1:
			return new Ryu(CharacterInfo.RYU,5,right,false);
		case 2:
			return null;
		case 3:
			return null;
		case 4:
			return null;
		case 5:
			return null;
		case 6:
			return null;
		case 7:
			return null;
		case 8:
			return null;
		case 9:
			return null;
		}
		return null;
	}
	public String toString(){
		return ""+location;
	}
	
	
}
