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
		y = y + 2;
		System.out.println(y + " y");
	}

}
