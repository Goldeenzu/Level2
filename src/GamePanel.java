import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

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
	ArrayList<GameObject> objects = new ArrayList<GameObject>();

	void intGameObjects() {
		objects.add(new ImageObject(50, 50, 100, 100, dogeImage));
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
