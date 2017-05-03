package gameClass;

public enum MapInfo {
	ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9);
	private int location;
	private MapInfo(int loc){
		location = loc;
	}
	int locationInMapSelect(){
		return location;
	}
	Map getMap(){
		switch(location){
		case 1:
			return new Map(1,MapInfo.ONE);
		case 2:
			return new Map(2,MapInfo.TWO);
		case 3:
			return new Map(3,MapInfo.THREE);
		case 4:
			return new Map(4,MapInfo.FOUR);
		case 5:
			return new Map(5,MapInfo.FIVE);
		case 6:
			return new Map(6,MapInfo.SIX);
		case 7:
			return new Map(7,MapInfo.SEVEN);
		case 8:
			return new Map(8,MapInfo.EIGHT);
		case 9:
			return new Map(9,MapInfo.NINE);
		}
		return null;
	}
	public String toString(){
		return ""+location;
	}
	
}
