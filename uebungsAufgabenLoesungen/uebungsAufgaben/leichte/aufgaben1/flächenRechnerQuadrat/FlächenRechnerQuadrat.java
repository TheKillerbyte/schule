package uebungsAufgaben.leichte.aufgaben1.fl�chenRechnerQuadrat;

import javax.swing.JOptionPane;

public class Fl�chenRechnerQuadrat {
	public static void main(String[] args) {
		String stringA;
		stringA = JOptionPane.showInputDialog(null, "Bitte geben sie die Seiten gr��e ihres Quadrates an");
		
		double doubleA;
		doubleA = Double.parseDouble(stringA);
		
		double ergebnis;
		ergebnis = Math.pow(doubleA, 2); // Hier wird doubleA� gerechnet diese Methode werden wir sp�ter vielleicht �fter mal brauchen
		
		ergebnis = Math.round(ergebnis * 100) / 100;
		// 1. parameter meist null; 2. parameter ist der Text im �ffnendem Fenster; 3. parameter ist der Title; 4. parameter wird hier mit einer statischen konstanten gef�ttert sp�ter mehr dazu
		JOptionPane.showMessageDialog(null, "Der Fl�cheninhalt betr�gt: " + ergebnis + " m�" , "Quadrat Rechner" , JOptionPane.OK_OPTION);
	}
}
