import javax.swing.JOptionPane;

public class SolveEquation {
	public static void main(String[] args) {
		String stra, strb, strc;
		String result;
		do {
			String lc = JOptionPane.showInputDialog(null,
					"1. Giải phương trình bậc nhất 1 biến" +
					"\n2. Giải phương trình bậc nhất 2 biến" +
					"\n3. Giải phương trình bậc hai 1 biến" +
					"\nPlease input your choie: ","Input your choice",
					JOptionPane.INFORMATION_MESSAGE);
			System.out.print(lc);
			if (lc.equals("1")) {
				stra = JOptionPane.showInputDialog(null,
						"Please input a: ","Input a",
						JOptionPane.INFORMATION_MESSAGE);
				strb = JOptionPane.showInputDialog(null,
						"Please input b: ","Input b",
						JOptionPane.INFORMATION_MESSAGE);
				double a = Double.parseDouble(stra);
				double b = Double.parseDouble(strb);
				if (a == 0 && b == 0) {
					result = "Phương trình vô số nghiệm";
				}
				else if (a == 0) {
					result = "Phương trình vô nghiệm";
				}
				else {
					result = "Phương trình có nghiệm: x = " + b/a;
				}
				JOptionPane.showMessageDialog(null, 
						result,
						"Show Calculate Numbers", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			else if (lc.equals("2")) {
				stra = JOptionPane.showInputDialog(null,
						"Please input a: ","Input a",
						JOptionPane.INFORMATION_MESSAGE);
				strb = JOptionPane.showInputDialog(null,
						"Please input b: ","Input b",
						JOptionPane.INFORMATION_MESSAGE);
				strc = JOptionPane.showInputDialog(null,
						"Please input c: ","Input c",
						JOptionPane.INFORMATION_MESSAGE);
				double a = Double.parseDouble(stra);
				double b = Double.parseDouble(strb);
				double c = Double.parseDouble(strc);
				if (a == 0) {
		            if (b == 0) {
		            	if (c == 0) {
		            		result = "Phương trình vô số nghiệm";
		            	}
		            	else {
		            		result = "Phương trình vô nghiệm";
		            	}
		            } else {
		            	result = "Phương trình có nghiệm: x bất kì, y = " + c/b;
		            }
		        }
				else {
					if (b == 0) {
						result = "Phương trình có nghiệm: x = " + c/a +", y bất kì";
					}
					else {
						result = "Phương trình vô số nghiệm";
					}
				}
				JOptionPane.showMessageDialog(null, 
						result,
						"Show Calculate Numbers", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			else if (lc.equals("3")) {
				stra = JOptionPane.showInputDialog(null,
						"Please input a: ","Input a",
						JOptionPane.INFORMATION_MESSAGE);
				strb = JOptionPane.showInputDialog(null,
						"Please input b: ","Input b",
						JOptionPane.INFORMATION_MESSAGE);
				strc = JOptionPane.showInputDialog(null,
						"Please input c: ","Input c",
						JOptionPane.INFORMATION_MESSAGE);
				double a = Double.parseDouble(stra);
				double b = Double.parseDouble(strb);
				double c = Double.parseDouble(strc);
				if (a == 0) {
		            if (b == 0) {
		            	if (c == 0) {
		            		result = "Phương trình vô số nghiệm";
		            	}
		            	else {
		            		result = "Phương trình vô nghiệm";
		            	}
		            } else {
		                result = "Phương trình có một nghiệm: "
		                        + "x = " + (-c / b);
		            }
		        }
				else {
					double delta = (b*b - 4*a*c);
					double x1;
					double x2;
			        
			        if (delta > 0) {
			            x1 = ((-b + Math.sqrt(delta)) / (2*a));
			            x2 = ((-b - Math.sqrt(delta)) / (2*a));
			            result = "Phương trình có 2 nghiệm là: "
			                    + "x1 = " + x1 + " và x2 = " + x2;
			        } else if (delta == 0) {
			            x1 = (-b / (2 * a));
			            result = "Phương trình có nghiệm kép: "
			                    + "x1 = x2 = " + x1;
			        } else {
			            result = "Phương trình vô nghiệm";
			        }
				}
				JOptionPane.showMessageDialog(null, 
						result,
						"Nghiệm của phương trình", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			else {
				JOptionPane.showMessageDialog(null, 
						"Vui lòng nhập lại!!!!",
						"Error", JOptionPane.INFORMATION_MESSAGE);
			}
		} while (true);
	}
}
