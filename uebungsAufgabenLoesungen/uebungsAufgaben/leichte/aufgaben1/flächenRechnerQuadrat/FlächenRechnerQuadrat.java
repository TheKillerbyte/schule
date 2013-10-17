package uebungsAufgaben.leichte.aufgaben1.flächenRechnerQuadrat;

import javax.swing.JOptionPane;

public class FlächenRechnerQuadrat {
	public static void main(String[] args) {
		String stringA;
		stringA = JOptionPane.showInputDialog(null, "Bitte geben sie die Seiten größe ihres Quadrates an");
		
		double doubleA;
		doubleA = Double.parseDouble(stringA);
		
		double ergebnis;
		ergebnis = Math.pow(doubleA, 2); // Hier wird doubleA² gerechnet diese Methode werden wir später vielleicht öfter mal brauchen
		
		ergebnis = Math.round(ergebnis * 100) / 100;
		// 1. parameter meist null; 2. parameter ist der Text im öffnendem Fenster; 3. parameter ist der Title; 4. parameter wird hier mit einer statischen konstanten gefüttert später mehr dazu
		JOptionPane.showMessageDialog(null, "Der Flächeninhalt beträgt: " + ergebnis + " m²" , "Quadrat Rechner" , JOptionPane.OK_OPTION);
	}
}
