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
	Character getCharacter(){
		switch(location){
		case 1:
			return new Ryu(CharacterInfo.RYU,5,true);
		case 2:
			return new Ryu(CharacterInfo.TWO,5,true);
		case 3:
			return new Ryu(CharacterInfo.THREE,5,true);
		case 4:
			return new Ryu(CharacterInfo.FOUR,5,true);
		case 5:
			return new Ryu(CharacterInfo.FIVE,5,true);
		case 6:
			return new Ryu(CharacterInfo.SIX,5,true);
		case 7:
			return new Ryu(CharacterInfo.SEVEN,5,true);
		case 8:
			return new Ryu(CharacterInfo.EIGHT,5,true);
		case 9:
			return new Ryu(CharacterInfo.NINE,5,true);
		}
		return null;
	}
	public String toString(){
		return ""+location;
	}
	
	
}
