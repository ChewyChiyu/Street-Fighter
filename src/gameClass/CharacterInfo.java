package gameClass;


public enum CharacterInfo {
	ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9);
	private int location;
	private CharacterInfo(int loc){
		location = loc;
	}
	public int locationInCharSelect(){
		return location;
	}
	public Character getCharacter(){
		switch(location){
		case 1:
			return new Character(1);
		case 2:
			return new Character(2);
		case 3:
			return new Character(3);
		case 4:
			return new Character(4);
		case 5:
			return new Character(5);
		case 6:
			return new Character(6);
		case 7:
			return new Character(7);
		case 8:
			return new Character(8);
		case 9:
			return new Character(9);
		}
		return null;
	}
	public String toString(){
		return ""+location;
	}
}
