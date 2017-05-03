package gameClass;


public enum CharacterInfo {
	ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9);
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
			return new Character(1,CharacterInfo.ONE);
		case 2:
			return new Character(2,CharacterInfo.TWO);
		case 3:
			return new Character(3,CharacterInfo.THREE);
		case 4:
			return new Character(4,CharacterInfo.FOUR);
		case 5:
			return new Character(5,CharacterInfo.FIVE);
		case 6:
			return new Character(6,CharacterInfo.SIX);
		case 7:
			return new Character(7,CharacterInfo.SEVEN);
		case 8:
			return new Character(8,CharacterInfo.EIGHT);
		case 9:
			return new Character(9,CharacterInfo.NINE);
		}
		return null;
	}
	public String toString(){
		return ""+location;
	}
	
	
}
