package KnockOffDoddleJump;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.Random;

public class ImageObject extends GameObject implements KeyListener{
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
		if (y >= 700){
			y = 0;
			x = new Random().nextInt(401);
		}
}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
