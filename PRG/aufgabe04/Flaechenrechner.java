package aufgabe04;

import javax.swing.JOptionPane;

public class Flaechenrechner {
	public static void main(String[] args) {
		String sA ;
		sA = JOptionPane.showInputDialog(null, "Bitte geben sie die Länge in metern an." , "z.b. 4.5");
		
		String sB ;
		sB = JOptionPane.showInputDialog(null, "Bitte geben sie die Breite in metern an.", "z.b. 5.6");
		
		double a;
		a = Double.parseDouble(sA);
		
		double b;
		b = Double.parseDouble(sB);
		
		double ergebnis;
		ergebnis = a * b ;
		
		ergebnis = Math.round(ergebnis * 1000) / 1000;
		
		JOptionPane.showMessageDialog(null, "Der Flächeninhalt beträgt: " + ergebnis + " m²");
	}
}
