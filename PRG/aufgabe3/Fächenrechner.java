package aufgabe3;

import javax.swing.JOptionPane;

public class F�chenrechner {
	public static void main(String[] args) {
		String sA ;
		sA = JOptionPane.showInputDialog(null, "Bitte geben sie die L�nge in metern an." , "z.b. 4.5");
		
		String sB ;
		sB = JOptionPane.showInputDialog(null, "Bitte geben sie die Breite in metern an.", "z.b. 5.6");
		
		double a;
		a = Double.parseDouble(sA);
		
		double b;
		b = Double.parseDouble(sB);
		
		double ergebnis;
		ergebnis = a * b ;
		
		JOptionPane.showMessageDialog(null, "Der Fl�cheninhalt betr�gt: " + ergebnis + " m�");
	}
}
