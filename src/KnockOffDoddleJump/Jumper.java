package KnockOffDoddleJump;

import java.awt.image.BufferedImage;

public class Jumper extends ImageObject {
int cVelocity = 0;
int maxVelocity = 10;
int jump = -20; 
	Jumper(int x, int y, int width, int height, BufferedImage image) {
		super(x, y, width, height, image);
		// TODO Auto-generated constructor stub
	}
	public void update(){
		if(y + height >= GameWindow.height){
			y= GameWindow.height - height;
		}
		cVelocity ++;
		if(cVelocity > maxVelocity){
			cVelocity = maxVelocity;
		}
		y += cVelocity;
	}
	public void jump(){
		if(y + height == ImageObject.y);
		cVelocity = jump;
	}
}
