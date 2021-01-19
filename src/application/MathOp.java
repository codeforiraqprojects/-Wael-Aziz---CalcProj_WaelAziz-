package application;

import javax.swing.JOptionPane;

public class MathOp {
	
	public static double add(double t1, double t2)
	{
		return t1 + t2;
	}
	
	public static double sub(double t1, double t2)
	{
		return t1 - t2;
	}
	public static double mul(double t1, double t2)
	{
		return t1 * t2;
	}
	public static double div(double t1, double t2)
	{
		
		if (t2 != 0)
		{
		return t1 /t2;
		}
		
		else 
			{
			JOptionPane.showMessageDialog(null, "Error Divide By Zero");
			return 0;
			}
	}

}
