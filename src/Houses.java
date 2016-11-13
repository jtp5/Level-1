import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
public class Building {
int wallHeight;
int roofWidth;
int grassWidth;
int x;
int y;
	public Building(int wallHeight, int roofWidth, int grassWidth) {
		// TODO Auto-generated constructor stub
	if(wallHeight < 100){
		this.wallHeight = 100;
	}
	else{
		this.wallHeight = wallHeight;
	}
	this.roofWidth = roofWidth;
	this.grassWidth = grassWidth;
	}
	public void draw(Robot robot){
		x = robot.getX();
		y = robot.getY();
		robot.move(wallHeight);
		robot.turn(60);
		robot.move(roofWidth);
		robot.turn(60);
		robot.move(roofWidth);
		robot.turn(60);
		robot.move(wallHeight);
		robot.turn(-90);
		robot.setPenColor(Color.GREEN);
		robot.move(grassWidth);
		robot.turn(-90);
		robot.setPenColor(Color.BLACK);
	}
	public void drawdoor(Robot robot){
		int doorX = x + roofWidth;
		int doorY = y;
		int doorHeight = wallHeight/3;
		int doorWidth = roofWidth/3;
		robot.penUp();
		int oldx = robot.getX();
		int oldy = robot.getY();
		robot.moveTo(doorX, doorY);
		robot.penDown();
		robot.move(doorHeight);
		robot.turn(90);
		robot.move(doorWidth);
		robot.turn(90);
		robot.move(doorHeight);
		robot.turn(180);
		robot.penUp();
		robot.moveTo(oldx, oldy);
		robot.penDown();
	}
	}

public static void main(String[] args) {
	Houses big = new Houses ();
	Robot hank = new Robot();
	hank.moveTo(50, hank.getWindow().getHeight() - 50);
	hank.penDown();
	hank.setSpeed(10);
	for (int i = 0; i < 10; i++) {
		Building bob = big.new Building(new Random().nextInt(700), 100, 90);
		bob.draw(hank);
		bob.drawdoor(hank);
		
		
	}
}
}
