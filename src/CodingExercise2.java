/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. 
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {
public static void main(String[] args) {
	int Age = Integer.parseInt(JOptionPane.showInputDialog("Age Please"));
if (Age > 29) {
	JOptionPane.showMessageDialog(null, "YOU ARE TOO OLD TO PLAY");
} else {
	JOptionPane.showMessageDialog(null, "You were born in " + (2016 - Age));
}

}
}
