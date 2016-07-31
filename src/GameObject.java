import java.awt.Color;
import java.awt.Graphics;

public class GameObject {
int x;
int y;
int width;
int height;
Color color;
GameObject(int x, int y, int width, int height){
	this.x = x;
	this.y = y;
	this.width = width;
	this.height = height;
	color = color.BLACK;
}
GameObject(int x, int y, int width, int height,Color color){
	this.x = x;
	this.y = y;
	this.width = width;
	this.height = height;
	this.color = color;
}
public void draw(Graphics g){
	g.setColor(color);
	g.fillRect(x, y, width, height);
}
public void update(){
	x++;
	y++;
}
}
