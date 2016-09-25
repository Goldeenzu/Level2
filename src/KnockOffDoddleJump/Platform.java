package KnockOffDoddleJump;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class Platform extends ImageObject{

	Platform(int x, int y, int width, int height, BufferedImage image) {
		super(x, y, width, height, image);
		// TODO Auto-generated constructor stub
		colisionBox = new Rectangle(x, y, width, height);
		
}
	 public void update(){
		y += 2;
		colisionBox.setBounds(x, y, width, height);
	}
}
