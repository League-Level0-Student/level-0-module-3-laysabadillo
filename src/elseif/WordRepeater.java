package elseif;

import javax.swing.JOptionPane;

public class WordRepeater {

	public static void main(String[] args) {
		
	String word = JOptionPane.showInputDialog(null, "Can you type in a word?");

	String number = JOptionPane.showInputDialog(null, "Can you type in a number?");
	
	int x = Integer.parseInt(number);
	
	for(int i = 0; i < x; i++) {
		System.out.println(word);
	}
	
	}
}
