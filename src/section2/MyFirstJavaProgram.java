package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot zombsroyal=new Robot("batman");
	zombsroyal.penDown();
	zombsroyal.move(100);
	zombsroyal.turn(90);
	zombsroyal.hide();
	zombsroyal.setSpeed(100);
		
	}
}
