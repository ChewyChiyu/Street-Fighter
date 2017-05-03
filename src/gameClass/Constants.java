package gameClass;

import java.awt.Toolkit;

public enum Constants {
	SCREEN_WIDTH(Toolkit.getDefaultToolkit().getScreenSize().width), SCREEN_HEIGHT(Toolkit.getDefaultToolkit().getScreenSize().height);
	
	private int num;
	
	private Constants(int num){
		this.num = num;
	}
	public int getIntValue(){
		return num;
	}
	

}
