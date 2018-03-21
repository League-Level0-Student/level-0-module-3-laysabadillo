
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "June 7th";
		String dadsBirthday = "June 9th";
		String myBirthday = "April 12th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String input = JOptionPane.showInputDialog(null, "What Birthday Do You Want?");
		
		// 3. Print out what the user typed
		System.out.println(input);
		
		// 4. if user asked for "mom"
			//print mom's birthday
		if(input.equals("Mom")) {
			JOptionPane.showMessageDialog(null, "June 7th");
			
			System.exit(0);
		}
		
		// 5. if user asked for "dad"
			// print dad's birthday
		if (input.equals("Dad")) {
			JOptionPane.showMessageDialog(null, "June 9th");
			
			System.exit(0);
		}
		
		// 6. if user asked for your name
			// print myBirthday
		if(input.equals("Mine")) {
			JOptionPane.showMessageDialog(null, "April 12th");
			
			System.exit(0);
		}
		

		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		 else {JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday!");
			
		}
		
	} 
}
