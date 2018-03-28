//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot Sausage = new Robot();
		Sausage.penDown();
		Sausage.hide();
		Sausage.setSpeed(100);
		Sausage.setPenColor(238, 34, 34);
		
		//3. Ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog(null, "What Color Would You Like?");	 
		
		//5. Use an if/else statement to set the pen color that the user requested
		//6. If the user doesn’t enter anything, choose a random color
		 //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		if(color.equals("red")) {
			Sausage.setPenColor(238, 34, 34);
			
			if(color.equals("brown")) {
				Sausage.setPenColor(51, 204, 51);
			}
		}
		else { 
			Sausage.setRandomPenColor();
		}
		
		//4. Set the pen width to 10
		Sausage.setPenWidth(10);
		
	    //2. Make the robot draw a shape (this will take more than one line of code)
		for(int i = 0; i < 5; i++) {
		Sausage.move(50);
		Sausage.turn(90);
		}
	}
}
