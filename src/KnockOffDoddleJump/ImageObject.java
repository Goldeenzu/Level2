package KnockOffDoddleJump;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.Random;

public class ImageObject extends GameObject implements KeyListener{
	BufferedImage image;
	Rectangle colisionBox;

	ImageObject(int x, int y, int width, int height) {
		super(x, y, width, height);
		colisionBox = new Rectangle(x, y, width, height);
		
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
		if(colisionBox != null){
			colisionBox.setBounds(x, y, width, height);
		}
		}
	public Rectangle getCBox(){
		return colisionBox;
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
