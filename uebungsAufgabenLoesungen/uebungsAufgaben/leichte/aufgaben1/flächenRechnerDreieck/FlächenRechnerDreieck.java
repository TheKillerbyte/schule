package uebungsAufgaben.leichte.aufgaben1.fl�chenRechnerDreieck;

import javax.swing.JOptionPane;

public class Fl�chenRechnerDreieck {
	public static void main(String[] args) {
		String stringG;
		stringG = JOptionPane.showInputDialog(null, "Bitte geben sie die Grundseite ihres Dreiecks an");
		
		String stringH;
		stringH = JOptionPane.showInputDialog(null, "Bitte geben sie die H�he ihres Dreiecks an");
		
		double doubleG;
		doubleG = Double.parseDouble(stringG);
		
		double doubleH;
		doubleH = Double.parseDouble(stringH);
		
		double ergebnis;
		ergebnis = (doubleG * doubleH) / 2;
		
		ergebnis = Math.round(ergebnis * 100) / 100;
		// 1. parameter meist null; 2. parameter ist der Text im �ffnendem Fenster; 3. parameter ist der Title; 4. parameter wird hier mit einer statischen konstanten gef�ttert sp�ter mehr dazu
		JOptionPane.showMessageDialog(null, "Der Fl�cheninhalt betr�gt: " + ergebnis + " m�" , "Dreiecks Rechner" , JOptionPane.OK_OPTION);
	
	}
}
