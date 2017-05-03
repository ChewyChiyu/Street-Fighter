package gameClass;

public class Character {
	private String s = "";
	public Character(int index){
		s += index;
	}
	public String toString(){
		return s;
	}
}
