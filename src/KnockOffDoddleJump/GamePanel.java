package KnockOffDoddleJump;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	boolean gameStarter = false;
	Timer timer;
	BufferedImage dogeImage;
	BufferedImage doge2Image;
	ImageObject image;
	ImageObject image2;
	boolean gameStart;
	
	Random r;

	Jumper J;
	Platform P;

	ArrayList<GameObject> objects = new ArrayList<GameObject>();
	ArrayList<Platform> platform = new ArrayList<Platform>();
	
	void intGameObjects() {
		gameStart = false;
		J = new Jumper(225, 450, 100, 100, dogeImage);
		objects.add(J);
		P = new Platform(new Random().nextInt(200), 0, 100, 30, doge2Image);
		objects.add(P);
		platform.add(P);
	}
	public void platformMoved(int platformY){
		P.y = platformY;
		P.update();
	}
	
	public void addPlatform(){
		Platform p = new Platform(new Random().nextInt(700), 0, 100, 30, doge2Image);
		objects.add(p);
		platform.add(p);
	}
	
	public void removePlatform(){
		for(int i = 0; i < objects.size(); i++){
			GameObject p = objects.get(i);
			if(p.y >= 700 && p instanceof Platform){
				objects.remove(p);
				platform.remove(p);
			}
		}

	}
	
	public void updatePlatform(){
		int x = new Random().nextInt(100);
		if(x == 0) {
			addPlatform();
		}
		removePlatform();
	}

//	 public void mouseMoved(int mouseX, int mouseY) {
//		J.x = mouseX - 50;
//		System.out.println(mouseX);
//	}
	

	public void paintComponent(Graphics g) {

		if (gameStart == true) {
			for (int i = 0; i < objects.size(); i++) {
				GameObject gg = objects.get(i);
				gg.draw(g);
			}
		}
	}

	public void startGame() {
		LoadImages();
		intGameObjects();
		timer = new Timer(1000 / 60, this);
		timer.start();
		gameStart = true;
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
		if(gameStart){
			J.checkColision(platform);
		}
		repaint();
		updatePlatform();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_SPACE ){
			J.jump();
		}
		
		if(e.getKeyCode() == KeyEvent.VK_RIGHT){
			J.right = true;
		}
		
		if(e.getKeyCode() == KeyEvent.VK_LEFT){
			J.left = true;
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_RIGHT){
			J.right = false;
		}
		
		if(e.getKeyCode() == KeyEvent.VK_LEFT){
			J.left = false;
		}
	}
}
