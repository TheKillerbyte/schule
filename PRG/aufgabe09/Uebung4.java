package aufgabe09;

import javax.swing.JOptionPane;

public class Uebung4 {
	public static void main(String[] args) {
		String eingabe;
		eingabe = JOptionPane.showInputDialog(null,"Bitte geben sie den Monat an", "minimum ist 1 maximum ist 12");

		int iEingabe;
		iEingabe = Integer.parseInt(eingabe);

		String wiedergabe ="";
		switch (iEingabe) {
		case 1:
			wiedergabe = "Januar";
			break;
		case 2:
			wiedergabe = "Feburar";
			break;
		case 3:
			wiedergabe = "März";
			break;
		case 4:
			wiedergabe = "April";
			break;
		case 5:
			wiedergabe = "Mai";
			break;
		case 6:
			wiedergabe = "Juni";
			break;
		case 7:
			wiedergabe = "Juli";
			break;
		case 8:
			wiedergabe = "August";
			break;
		case 9:
			wiedergabe = "September";
			break;
		case 10:
			wiedergabe = "Oktober";
			break;
		case 11:
			wiedergabe = "November";
			break;
		case 12:
			wiedergabe = "Dezember";
			break;

		default:
			System.err.println("");
			System.exit(1);
			break;
		}
		
		wiedergabe = "Der " + iEingabe + " Monat hat den Namen " + wiedergabe;
		JOptionPane.showMessageDialog(null, wiedergabe);
	}
}
