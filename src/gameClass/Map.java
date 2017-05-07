package gameClass;

import java.awt.Graphics;

import textureClass.MapTexture;
import textureClass.Texture;

public class Map {
	private int index;
	private MapInfo info;
	protected Map(int index, MapInfo info){
		this.index = index;
		this.info = info;
	}
	public String toString(){
		return ""+info.toString();
	}
	MapInfo getInfo(){
		return info;
	}
	void drawMap(Graphics g){
		int indexTemp = index- 1;
		int row = (int)(indexTemp/ MapTexture.mapSelectSprites[0].length);
		int col = (indexTemp % MapTexture.mapSelectSprites[0].length);
		g.drawImage(MapTexture.mapSelectSprites[row][col], 0, 0,Constants.SCREEN_WIDTH.getIntValue(),Constants.SCREEN_HEIGHT.getIntValue(), null);
	}
}		
