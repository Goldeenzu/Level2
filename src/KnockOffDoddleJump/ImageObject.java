package KnockOffDoddleJump;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class ImageObject extends GameObject {
	BufferedImage image;

	ImageObject(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	ImageObject(int x, int y, int width, int height, BufferedImage image) {
		super(x, y, width, height);
		this.image = image;
	}

	public void draw(Graphics g) {

		g.drawImage(image, x, y, width, height, null);
	}

	public void update() {
		if (GameWindow.rightArrow) {
			x++;
		}
		if (GameWindow.leftArrow) {
			x--;
		}
		if (GameWindow.upArrow) {
			y--;
		}
		if (GameWindow.downArrow) {
			y++;
		}
	}

}
