import java.util.Scanner;

public class BMICalculator {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double in, lbs;
		double m, kg, bmi;
		
		System.out.print( "Your height in in: " );
		//m = keyboard.nextDouble();
		in = keyboard.nextDouble();
		
		m = in * 0.0254;
		
		System.out.print( "Your weight in lbs: " );
		//kg = keyboard.nextDouble();
		lbs = keyboard.nextDouble();
		
		kg = lbs * 0.45;
		
		bmi = kg / (m*m);
		
		System.out.println( "Your BMI is " + bmi );
	}
}