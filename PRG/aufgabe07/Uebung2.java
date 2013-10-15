package aufgabe07;

import javax.swing.JOptionPane;
public class Uebung2 {
	public static void main(String[] args) {
		String eingabe;
		eingabe = JOptionPane.showInputDialog(null, "Bitte geben sie einen Bestellwert an.", "z.b. 125.45");
		
		double dBestellWert;
		dBestellWert = Double.parseDouble(eingabe);
		
		
		double dZuschlag;
		if(dBestellWert < 200){
			dZuschlag = 5.5;
		}else{
			dZuschlag = 0;
		}
		
		String ausgabe;
		ausgabe = "Bei einem Bestellwert von " + eingabe + "€";
		ausgabe += "\nwerden " + dZuschlag + "€ an Versandkosten veranschlagt";
		ausgabe += "\nwas dazu führt das die Gesamtkosten " +(dBestellWert + dZuschlag) + "€ betragen";
	
		JOptionPane.showMessageDialog(null, ausgabe);
	}
}
