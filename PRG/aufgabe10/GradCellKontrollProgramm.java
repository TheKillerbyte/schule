package aufgabe10;

import javax.swing.JOptionPane;

public class GradCellKontrollProgramm {
	public static void main(String[] args) {
		int gradCell;
		String sGradCell;
		sGradCell = JOptionPane.showInputDialog(null, "Bitte geben sie die Auﬂen Temperatur an.", "Eingabe Aufforderung");
		gradCell = Integer.parseInt(sGradCell);
		if(gradCell <= 0){
			JOptionPane.showMessageDialog(null, "es friert");
		}else if (gradCell < 22){
			JOptionPane.showMessageDialog(null, "es ist angenehm");
		}else{
			JOptionPane.showMessageDialog(null, "es ist sommerlich");
		}
	}
}
