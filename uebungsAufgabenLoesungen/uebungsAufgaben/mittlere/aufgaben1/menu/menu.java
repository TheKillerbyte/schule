package uebungsAufgaben.mittlere.aufgaben1.menu;

import javax.swing.JOptionPane;

public class menu {
	public static void main(String[] args) {
		variante2();
	}
	
	private static void variante1(){
		String eingabe;
		eingabe = JOptionPane.showInputDialog(null, "Bitte geben sie an was sie berrechnen wollen\nd = Dreieck\nv = Viereck\nq = Quadrat", "Auswahl");
		for (int i = 0; i < eingabe.length(); i++) {
			
		}
	}
	
	private static void variante2(){
		// die rückgabe werte entsprechen den Wert des Index in der Array Java fängt bei 0 an und dann 1 ...
		
		String[] options = {"Dreieck" , "Viereck" , "Quadrat"};
		int auswahl = JOptionPane.showOptionDialog(null, "bitte geben sie an was sie Prgorammieren wollen", "Auswahl", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, 0);
		
		switch (auswahl) {
		case 1:
			JOptionPane.showMessageDialog(null, "starte Dreiecks Berrechnung");
			// hier steht extra noch nichts bis wir Methoden , Konstruktoren und Parameter besser besprochen haben
			break;
		case 2:
			JOptionPane.showMessageDialog(null , "starte Vierecks Berrechnung");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "starte Quadrat Berrechnung");
			break;
		default:
			JOptionPane.showMessageDialog(null, "sie scheinen dieses Programm nicht mehr zu wollen");
			break;
		}
	}
}
