package uebungsAufgaben.leichte.aufgaben1.flächenRechnerDreieck;

import javax.swing.JOptionPane;

public class FlächenRechnerDreieck {
	public static void main(String[] args) {
		String stringG;
		stringG = JOptionPane.showInputDialog(null, "Bitte geben sie die Grundseite ihres Dreiecks an");
		
		String stringH;
		stringH = JOptionPane.showInputDialog(null, "Bitte geben sie die Höhe ihres Dreiecks an");
		
		double doubleG;
		doubleG = Double.parseDouble(stringG);
		
		double doubleH;
		doubleH = Double.parseDouble(stringH);
		
		double ergebnis;
		ergebnis = (doubleG * doubleH) / 2;
		
		ergebnis = Math.round(ergebnis * 100) / 100;
		// 1. parameter meist null; 2. parameter ist der Text im öffnendem Fenster; 3. parameter ist der Title; 4. parameter wird hier mit einer statischen konstanten gefüttert später mehr dazu
		JOptionPane.showMessageDialog(null, "Der Flächeninhalt beträgt: " + ergebnis + " m²" , "Dreiecks Rechner" , JOptionPane.OK_OPTION);
	
	}
}
