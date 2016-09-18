package KnockOffDoddleJump;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;

import javax.swing.JFrame;

public class GameWindow implements MouseMotionListener, MouseListener {
	public static int width;
	public static int height;
	String title;
	static boolean rightArrow;
	static boolean leftArrow;
	static boolean upArrow;
	static boolean downArrow;
	private GamePanel panel;

	public static void main(String[] args) {
		GameWindow x = new GameWindow(500, 700, "Knock Off Doodle Jump");
		x.createWindow();
	}

	GameWindow(int width, int height, String title) {
		this.width = width;
		this.height = height;
		this.title = title;
	}

	public void createWindow() {
		JFrame frame;
		frame = new JFrame(title);
		panel = new GamePanel();
		frame.add(panel);
		frame.setSize(width, height);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addKeyListener(panel);
		frame.addMouseListener(this);
		frame.addMouseMotionListener(this);
		panel.startGame();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse Clicked");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse Pressed");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse Released");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
		//panel.mouseMoved(e.getX(), e.getY());
	}

	

}
