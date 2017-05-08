package gameClass;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class HitBox {
	
	
	
	private int x;
	private int y;
	private int w;
	private int h;
	protected HitBox(int x, int y, int w, int h){
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		
		
	}
	
	void setX(int x){
		this.x = x;
	}
	void setY(int y){
		this.y = y;
	}
	int getX(){
		return x;
	}
	int getY(){
		return y;
	}
	int getCenterX(){
		return x+(w/2);
	}
	int getCenterY(){
		return y+(h/2);
	}
	int getWidth(){
		return w;
	}
	int getHeight(){
		return h;
	}
	boolean isTouching(int dubX, int dubY, boolean favorRight){
		int x1 = x;
		int x2 = x + w;
		int y1 = y;
		int y2 = y + h;
		if(dubX>x1&&dubY>y1&&dubY<y2&&favorRight){
			return true;
		}
		if(x2>dubX&&dubY>y1&&dubY<y2&&!favorRight){
			return true;
		}
		return false;
	}
	void draw(Graphics g, Color c){
		//testing out hitbox
		g.setColor(c);
		g.fillRect(x, y, w, h);
	}
}
