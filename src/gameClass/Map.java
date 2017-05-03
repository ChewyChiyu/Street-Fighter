package gameClass;

public class Map {
	private String s = "";
	private MapInfo info;
	protected Map(int index, MapInfo info){
		s += index;
		this.info = info;
	}
	public String toString(){
		return s;
	}
	MapInfo getInfo(){
		return info;
	}
}		
