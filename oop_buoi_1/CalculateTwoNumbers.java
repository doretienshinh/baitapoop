import javax.swing.JOptionPane;

public class CalculateTwoNumbers {
	public static void main(String[] args) {
		String strNum1, strNum2;
		String quotient;
		
		strNum1 = JOptionPane.showInputDialog(null,
				"Please input the first number: ","Input the first number",
				JOptionPane.INFORMATION_MESSAGE);
		
		strNum2 = JOptionPane.showInputDialog(null,
				"Please input the second number: ","Input the second number",
				JOptionPane.INFORMATION_MESSAGE);
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
		if (num2 == 0) {
			quotient = "Không chia được cho 0!!!"; 
		}
		else {
			quotient = "Thương: " + num1/num2;
		}
		
		JOptionPane.showMessageDialog(null, 
				"Tổng: " + (num1 + num2) +
				"\nHiệu: " + (num1 - num2) +
				"\nTích: " + num1 * num2 + 
				"\n" +  quotient,
				"Show Calculate Numbers", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
