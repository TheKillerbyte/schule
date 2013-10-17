package uebungsAufgaben.mittlere.aufgaben1.eingabeAuthorVergleich;

import javax.swing.JOptionPane;

public class EingabeAuthorVergleich {
	private static final String AUTHOR = "Alexander Heinisch";
	public static void main(String[] args) {
		String eingabe;
		
		eingabe = JOptionPane.showInputDialog(null, "Bitte geben sie den Author des Programmes an" , "z.b. Max Musterman");
		
		if(!eingabe.equals(AUTHOR)){
			System.exit(1);
		}
		System.out.println("Dieses Programm Läuft erfolgreich weiter");
		
		
	}
}
