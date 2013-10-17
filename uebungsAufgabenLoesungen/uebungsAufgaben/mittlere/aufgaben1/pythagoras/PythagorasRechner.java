package uebungsAufgaben.mittlere.aufgaben1.pythagoras;

import javax.swing.JOptionPane;

public class PythagorasRechner {
	public static void main(String[] args) {
		String eingabe;
		eingabe = JOptionPane.showInputDialog(null, "Bitte geben sie die Länge von a in cm an" , "z.b. 5.5");
		
		double doubleA;
		doubleA = Double.parseDouble(eingabe);
		
		eingabe = JOptionPane.showInputDialog(null, "Bitte geben sie die Länge von b in cm an." , "z.b. 4.5");
		
		double doubleB;
		doubleB = Double.parseDouble(eingabe);
		
		double ergebnis;
		ergebnis = Math.sqrt(Math.pow(doubleA, 2) + Math.pow(doubleB, 2));
		
		ergebnis = Math.round(ergebnis * 1000) / 1000;
		
		JOptionPane.showMessageDialog(null, "Das Die Seite C beträgt: " + ergebnis + "");
	}
}
