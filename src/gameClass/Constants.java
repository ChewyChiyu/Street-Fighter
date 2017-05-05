package gameClass;

import java.awt.Toolkit;

public enum Constants {
	SCREEN_WIDTH(Toolkit.getDefaultToolkit().getScreenSize().width), SCREEN_HEIGHT(Toolkit.getDefaultToolkit().getScreenSize().height)
	,GRAVITY(5), ENERGYBALL_WIDTH(100), ENERGYBALL_HEIGHT(100), PLAYER_WIDTH(200), PLAYER_HEIGHT(500);

	private int num;

	private Constants(int num){
		this.num = num;
	}
	int getIntValue(){
		return num;
	}


}
