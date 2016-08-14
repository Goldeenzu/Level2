package KnockOffDoddleJump;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class GameWindow implements KeyListener, MouseMotionListener, MouseListener {
	private int width;
	private int height;
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
		frame.addKeyListener(this);
		frame.addMouseListener(this);
		frame.addMouseMotionListener(this);
		panel.startGame();
		frame.setBackground(Color.LIGHT_GRAY);
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
		System.out.println("Mouse Entered");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse Exited");
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse Dragged");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse Moved");
		panel.mouseMoved(e.getX(), e.getY());
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Key Typed");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Key Pressed");
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			rightArrow = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			leftArrow = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			upArrow = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			downArrow = true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Key Released");
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			rightArrow = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			leftArrow = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			upArrow = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			downArrow = false;
		}
	}

}
