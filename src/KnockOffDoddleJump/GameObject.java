package KnockOffDoddleJump;

import java.awt.Graphics;

public class GameObject {
	int x;
	int y;
	int width;
	int height;

	GameObject(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public void draw(Graphics g) {
		g.fillRect(x, y, width, height);
		g.fillRect(x, y, width, height);
	}

	public void update() {
		x++;
		y++;
	}
}
