import org.jointheleague.graphical.robot.Robot;
public class RobotShapeMaker {
private Robot rick;


RobotShapeMaker(Robot r){
	this.rick = r;
}
void drawSquare(int length){
	rick.setSpeed(10);
	rick.penDown();
	rick.move(length);
	rick.turn(90);
	rick.move(length);
	rick.turn(90);
	rick.move(length);
	rick.turn(90);
	rick.move(length);
	rick.turn(90);
}
void drawTriangle(int length){
	rick.setSpeed(10);
	rick.penDown();
	for (int i = 0; i < 3; i++) {
		rick.turn(120);
		rick.move(length);
	}
}
void drawRectangle(int w, int h){
	rick.setSpeed(10);
	rick.penDown();
	for (int i = 0; i < 2; i++) {
		rick.move(h);
		rick.turn(90);
		rick.move(w);
		rick.turn(90);
	}
}
void drawCircle(int lenght){
	rick.setSpeed(10);
	rick.penDown();
	for (int i = 0; i < 360; i++) {
		rick.move(lenght);
		rick.turn(1);
	}
}

}
