import org.jointheleague.graphical.robot.Robot;
public class RobotFun {
public static void main(String[] args) {
	Robot rick = new Robot();
	RobotShapeMaker rsm = new RobotShapeMaker(rick);
	rsm.drawCircle(5);
}
}
