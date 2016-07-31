import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener{
	boolean gameStarter = false;
	Timer timer;
	BufferedImage dogeImage;
	BufferedImage doge2Image;
	ImageObject image;
	ImageObject image2;
public void paintComponent(Graphics g){
if(gameStarter == true){
	image.draw(g);
	image2.draw(g);
}
}
public void startGame(){
	LoadImages();
	image = new ImageObject(50,50,100,100,dogeImage);
	image2 = new ImageObject(160,50,100,100,doge2Image);
	timer = new Timer(1000/60,this);
	timer.start();
	gameStarter = true;
}
private void LoadImages(){
	try{
		dogeImage = ImageIO.read(this.getClass().getResourceAsStream("Doge.jpeg"));
		doge2Image =ImageIO.read(this.getClass().getResourceAsStream("Doge2.jpg"));

	}
	catch(Exception e){
		System.err.println("Error loading image");
	}
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	repaint();
}
}
