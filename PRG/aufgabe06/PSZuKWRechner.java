package aufgabe06;

import javax.swing.JOptionPane;

public class PSZuKWRechner {
	public static void main(String[] args) {
		String eingabe;
		eingabe = JOptionPane.showInputDialog(null, "Bitte geben sie die PS ihres Wagens an", "z.b. 100.56");
		
		double dPS;
		dPS = Double.parseDouble(eingabe);
		
		dPS = Math.round(dPS * 0.735);
		
		JOptionPane.showMessageDialog(null, "Die KW Ihres Wagens beträgt: " + dPS);
		
		
	}
}
