package strings_and_dialogs;
import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
		Robot john = new Robot();
   john.setSpeed(100);
   john.setPenColor(Color .red);
   john.penDown();
   
   john.move(200);
   john.turn(90);
   john.move(200);
   john.turn(90);
   john.move(200);
   john.turn(90);
   john.move(200);
   john.turn(90);
   john.penUp();
	
	
	}
}
