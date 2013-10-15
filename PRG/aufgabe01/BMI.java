package aufgabe01;

public class BMI {
	public static void main(String[] args) {
		double groesse;
		groesse = 1.8;
		
		double gewicht;
		gewicht = 70;
		
		double bmi;
		bmi = gewicht / (groesse * groesse);
		
		System.out.println("Ihr BMI beträgt:_" + bmi);
	}
}
