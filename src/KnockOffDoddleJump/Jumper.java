package KnockOffDoddleJump;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Jumper extends ImageObject {
int cVelocity = 0;
int maxVelocity = 10;
int jump = -20; 
int xVelocity = 5;
public boolean left;
public boolean right;
int nextX;
int nextY;
Jumper(int x, int y, int width, int height, BufferedImage image) {
		super(x, y, width, height, image);
		colisionBox = new Rectangle(x, y, width, height);
	}
	public void update(){
		super.update();
		
		nextX = x;
		nextY = y;
		
		if(y + height >= GameWindow.height){
			y= GameWindow.height - height;
		}
		cVelocity ++;
		if(cVelocity > maxVelocity){
			cVelocity = maxVelocity;
		}
		nextY += cVelocity;
		if(right){
			xVelocity = 5;
		}
		else if(left){
			xVelocity = -5;
		}
		else{
			xVelocity = 0;
		}
		nextX = x + xVelocity;
		nextY = y + cVelocity;
		
		if(isColiding == false){
			x = nextX;
			y = nextY;
			//colisionBox.setBounds(nextX, nextY, width, height);
		}
		else{
			x -= xVelocity;
			y -= cVelocity;
			//colisionBox.setBounds(x, x, width, height);
		}
	}
	
	public void checkColision(ArrayList<Platform> platform){
		System.out.println(platform.size());
		for(Platform p : platform){
			if(colisionBox.intersects(p.getCBox())){
				isColiding = true;
			}
			else{
				isColiding = false;
			}
			}
		}
	public void jump(){
		if(isColiding == true || y >=500){
		cVelocity = jump;
		}
		
	}
}
