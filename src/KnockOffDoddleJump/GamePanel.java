package KnockOffDoddleJump;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener {
	boolean gameStarter = false;
	Timer timer;
	BufferedImage dogeImage;
	BufferedImage doge2Image;
	ImageObject image;
	ImageObject image2;
	Random r;

	Jumper J;
	Platform P;

	ArrayList<GameObject> objects = new ArrayList<GameObject>();

	void intGameObjects() {
		
		J = new Jumper(225, 450, 100, 100, dogeImage);
		objects.add(J);
		P = new Platform(new Random().nextInt(401), 0, 100, 30, doge2Image);
		objects.add(P);
	}
	public void platformMoved(int platformY){
		P.y = platformY;
		P.update();
		if(platformY >= 700){
			platformY = 0;
		}
	}

	public void mouseMoved(int mouseX, int mouseY) {
		J.x = mouseX - 50;
		System.out.println(mouseX);
	}
	

	public void paintComponent(Graphics g) {

		if (gameStarter == true) {
			// image.draw(g);
			// image2.draw(g);
			for (int i = 0; i < objects.size(); i++) {
				GameObject gg = objects.get(i);
				gg.draw(g);
			}
		}
	}

	public void startGame() {
		LoadImages();
		// image = new ImageObject(50, 50, 100, 100, dogeImage);
		// image2 = new ImageObject(160, 50, 100, 100, doge2Image);
		intGameObjects();
		timer = new Timer(1000 / 60, this);
		timer.start();
		gameStarter = true;
	}

	private void LoadImages() {
		try {
			dogeImage = ImageIO.read(this.getClass().getResourceAsStream("Doge.jpeg"));
			doge2Image = ImageIO.read(this.getClass().getResourceAsStream("Doge2.jpg"));

		} catch (Exception e) {
			System.err.println("Error loading image");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// TODO Auto-generated method stub
		for (int i = 0; i < objects.size(); i++) {
			GameObject g = objects.get(i);
			g.update();
		}
		// image.update();
		repaint();
	}
}
