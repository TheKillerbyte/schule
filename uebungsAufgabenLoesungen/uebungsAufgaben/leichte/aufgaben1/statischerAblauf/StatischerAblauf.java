package uebungsAufgaben.leichte.aufgaben1.statischerAblauf;

import javax.swing.JOptionPane;

public class StatischerAblauf {
	// Dies ist eine private Variable sie existiert also nur in der Klasse und kann auch nur intern von einer Methode aufgerufen werden z.b. der main Methode
	// Dies ist eine Statische Variable sie kann ohne Objekt angesteuert werden
	// Dies ist außerdem eine Klassenweite Variable ungleich der Variablen in der main Methode
	private static double d1;
	private static String eingabe;
	public static void main(String[] args) {
		eingabe = JOptionPane.showInputDialog(null, "Bitte geben sie ihre Auswahl an\na = start\nb = credits\nc = ende");
		switch (eingabe.charAt(0)) {
		case 'a': case 'A':
			d1 = 0;
			break;
		case 'b': case 'B':
			d1 = 1;
			break;
		case 'c': case 'C':
			// beendet das Programm ohne es zu ende laufen zu lasen
			// ähnelt einen break oder return beendet aber das gesamte program
			System.exit(0);
			break;
		default:
			// Beendet das Programm mit dem Fehlercode 1 was einfach nur sagt hier ist etwas nicht richtig gelaufen
			System.exit(1);
			break;
		}
		auswahl();
		
		
	}
	
	private static void auswahl(){
		if (d1 == 0){
			JOptionPane.showConfirmDialog(null, "Ich habe gehört sie wollen mein Programm starten?");
		}else if(d1 == 1){
			JOptionPane.showMessageDialog(null, "Diese einfachen Aufgaben sind ausgedacht von,\nAlexander Heinisch\nich hoffe ihnen gefallen diese Aufgaben.");
		}
		
		// hier existieren sowohl d1 wie auch eingabe
	}
}
