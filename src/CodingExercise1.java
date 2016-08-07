
import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

    public static void main(String[] args) {
    	Robot rob = new Robot();
   	 // 3. ask the user what color they would like the Robot to draw

   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
rob.setPenColor(0, 0, 0);    	
String color = JOptionPane.showInputDialog("Type a color");
if(color.equalsIgnoreCase("Yellow")){
rob.setPenColor(255, 0, 0);
}
if(color.equalsIgnoreCase("Blue")){
rob.setPenColor(0, 0, 255);
}
if(color.equalsIgnoreCase("Black")){
rob.setPenColor(0, 255, 0);
}

   	 // 2. set the pen width to 10
    	rob.setPenWidth(10);
   	 // 1. make the Robot draw a shape
   	 for (int i = 0; i < 4; i++) {
   		 rob.hide();
		rob.penDown();
		rob.move(80);
		rob.turn(90);
	}
    }

}
