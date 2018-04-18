import javax.swing.JOptionPane;

public class testScore{

public static void main(String[] args) {
	
    String answer = JOptionPane.showInputDialog(null, "What Score Did You Get On The Test Between 0 - 100?");
    double num = Double.parseDouble(answer);
    
	if(num >= 97 && num <= 100){
		JOptionPane.showMessageDialog(null, "You Get An A+!");
	}else
	
	if(num >= 94 && num <= 96.99){
		JOptionPane.showMessageDialog(null, "You Get An A!");
	
	}else
	
	if(num >= 90 && num <= 93.99){
		JOptionPane.showMessageDialog(null, "You Get An A-!");
	
	}else
	
	if(num >= 87 && num <= 89.99){
		JOptionPane.showMessageDialog(null, "You Get An B+!");
	
	}else
	
	if(num >= 84 && num <= 86.99){
		JOptionPane.showMessageDialog(null, "You Get An B!");
	
	}else
	
	if(num >= 80 && num <= 83.99){
		JOptionPane.showMessageDialog(null, "You Get An B-!");
	
	}else
	
	if(num >= 77 && num <= 79.99){
		JOptionPane.showMessageDialog(null, "You Get An C+!");
	
	}else
	
	if(num >= 74 && num <= 76.99){
		JOptionPane.showMessageDialog(null, "You Get An C!");
	
	}else
	
	if(num >= 70 && num <= 73.99){
		JOptionPane.showMessageDialog(null, "You Get An C-!");
	
	}else
	
	if(num >= 67 && num <= 69.99){
		JOptionPane.showMessageDialog(null, "You Get An D+!");
	
	}else
	
	if(num >= 64 && num <= 66.99){
		JOptionPane.showMessageDialog(null, "You Get An D!");
	
	}else
	
	if(num >= 60 && num <= 63.99){
		JOptionPane.showMessageDialog(null, "You Get An D-!");
	
	}else
	
	if(num >= 0 && num <= 59.99){
		JOptionPane.showMessageDialog(null, "You Get An F!");
	
	}else {
		JOptionPane.showMessageDialog(null, "ERROR 314");
	}
	
}
}

