package gameClass;

public class Character {
	private String s = "";
	private CharacterInfo info;
	protected Character(int index, CharacterInfo info){
		s += index;
		this.info = info;
	}
	public String toString(){
		return s;
	}
	CharacterInfo getInfo(){
		return info;
	}

}
