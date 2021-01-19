package application;

import javax.swing.JOptionPane;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class MainController {

	@FXML
	private TextField txtR;

	String str1 = "";
	String str2 = "";
	String operation = "";
	
	double n1=0;
	double n2=0;

	boolean flag = false;

	public void getNum(Event e) {
		
		Button b = (Button) e.getSource();

		String sb = b.getText();
		try {
			
			if ( sb.equals(".") || (Double.parseDouble(sb) >= 0 && Double.parseDouble(sb) <= 9) ) {
				if (flag == false) {
					str1 += sb;
					System.out.println(str1);
					txtR.setText(str1);
				} 				
				else {
					str2 += b.getText();
					txtR.setText(str1 +" "+ operation +" "+ str2);
				}
			
				}
			
	
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null,ex.getMessage());
			
		}
	}

	public void getOper(Event e) {

		RadioButton rb = (RadioButton) e.getSource();

		operation = rb.getText();

		txtR.setText(str1 +" "+ operation);
		flag = true;
		rb.setSelected(false);
	}

	public void opSelect(Event e) {

		double display = 0;

		double n1 = Double.parseDouble(str1);
		double n2 = Double.parseDouble(str2);

		// RadioButton rb = (RadioButton)e.getSource();
		// String operation= b.getText();
	

			switch (operation) {
			case "+":

				display = MathOp.add(n1, n2);
				txtR.setText(String.valueOf("The Result:    " + display));
				break;

			case "-":

				display = MathOp.sub(n1, n2);
				txtR.setText(String.valueOf("The Result:    "+ display));
				break;
			case "*":

				display = MathOp.mul(n1, n2);
				txtR.setText(String.valueOf("The Result:    " + display));
				break;
				
			case "/":

				display = MathOp.div(n1, n2);
				txtR.setText(String.valueOf("The Result:    " + display));
				break;

			default:
				txtR.setText("Error");
				break;
			}
			
			str1 ="";
			str2= "";
			flag=false;
			System.out.println(flag);
			
			
			

		}
	
	public void clearSreen() {
		txtR.setText("");
		str1 ="";
		str2= "";
		flag=false;
				
	}

	
}
