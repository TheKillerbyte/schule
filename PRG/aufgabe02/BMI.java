package aufgabe02;

import javax.swing.JOptionPane;

public class BMI {
	public static void main(String[] args) {
		String sGroesse;
		sGroesse = JOptionPane.showInputDialog(null, "Bitte geben sie ihre Größe an." , "z.b. 1.75");
		
		String sGewicht;
		sGewicht = JOptionPane.showInputDialog(null, "bitte geben sie ihr Gewicht an.", "z.b. 70.5");
		
		double groesse;
		groesse = Double.parseDouble(sGroesse);
		
		double gewicht;
		gewicht = Double.parseDouble(sGewicht);
		
		double bmi;
		bmi = gewicht / (groesse * groesse);
		
		JOptionPane.showMessageDialog(null, "Ihr bmi beträgt: " + bmi);
	}
}
