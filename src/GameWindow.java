import javax.swing.JFrame;

public class GameWindow {
private int width;
private int height;
String title;
public static void main(String[] args) {
	GameWindow x = new GameWindow(700,500,"game");
	x.createWindow();
}
GameWindow(int width, int height, String title){
	this.width = width;
	this.height = height;
	this.title = title;
}
public void createWindow(){
	JFrame frame;
	frame = new JFrame(title);
	GamePanel panel = new GamePanel();
	frame.add(panel);
	frame.setSize(width, height);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	panel.startGame();
}
}
