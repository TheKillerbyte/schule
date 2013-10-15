package aufgabe05;

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
		
		bmi = Math.round(bmi * 100) / 100;
		
		if (bmi < 20){
			JOptionPane.showMessageDialog(null, "Ihr Bmi beträgt: " + bmi + " infolge dessen sind sie untergewichtig." );
		}else if (bmi > 25){
			JOptionPane.showMessageDialog(null, "Ihr Bmi beträgt: " + bmi + " infolge dessen sind sie übergewichtig." );
		}else{
			JOptionPane.showMessageDialog(null, "Ihr Bmi beträgt: " + bmi + " infolge dessen sind sie normalgewichtig." );
		}
	}
}
