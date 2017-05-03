package gameClass;

public class Character {
	private String s = "";
	protected Character(int index){
		s += index;
	}
	public String toString(){
		return s;
	}
}
