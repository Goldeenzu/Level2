package KnockOffDoddleJump;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Jumper extends ImageObject {
int cVelocity = 0;
int maxVelocity = 10;
int jump = -20; 
Jumper(int x, int y, int width, int height, BufferedImage image) {
		super(x, y, width, height, image);

		colisionBox = new Rectangle(x, y, width, height);
	}
	public void update(){
		super.update();
		if(y + height >= GameWindow.height){
			y= GameWindow.height - height;
		}
		cVelocity ++;
		if(cVelocity > maxVelocity){
			cVelocity = maxVelocity;
		}
		y += cVelocity;
	}
	public void checkColision(ArrayList<Platform> platform){
		for(Platform p : platform){
			if(colisionBox.intersects(p.getCBox())){
					
				}
			}
		}
	public void jump(){
		cVelocity = jump;
	}
}
