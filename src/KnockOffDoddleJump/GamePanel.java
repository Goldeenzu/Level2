package KnockOffDoddleJump;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener {
	boolean gameStarter = false;
	Timer timer;
	ArrayList<GameObject> objects = new ArrayList<GameObject>();

	void intGameObjects() {
		objects.add(new ImageObject(50, 50, 100, 100));
	}

	public void paintComponent(Graphics g) {
		if (gameStarter == true) {
			for (int i = 0; i < objects.size(); i++) {
				GameObject gg = objects.get(i);
				gg.draw(g);
			}
		}
	}

	public void startGame() {
		intGameObjects();
		timer = new Timer(1000 / 60, this);
		timer.start();
		gameStarter = true;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for (int i = 0; i < objects.size(); i++) {
			GameObject g = objects.get(i);
			g.update();
		}
		repaint();
	}
}
