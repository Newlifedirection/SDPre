import java.util.Scanner;

public class AgeMessages {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int age;

		System.out.print( "How old are you? ");
		age = keyboard.nextInt();

		System.out.println( "You are: " );
		if (age < 13 ) {
			System.out.println( "\ttoo young to create a Facebook account" );
		}
		if (age > 13 ) {
			System.out.println( "\told enough to create a Facebook account" );
		}
		if (age < 16 ) {
			System.out.println( "\ttoo young to get a driver's license" );
		}
		if (age > 16 ) {
			System.out.println( "\told enough to get a driver's license" );
		}
		if (age < 18 ) {
			System.out.println( "\ttoo young to get a tatoo" );
		}
		if (age > 18 ) {
			System.out.println( "\told enough to get a tatoo" );
		}
		if (age < 21 ) {
			System.out.println( "\ttoo young to drink alcahol" );
		}
		if (age > 21 ) {
			System.out.println( "\told enough to drink alcahol" );
		}
		if (age < 35 ) {
			System.out.println( "\ttoo youmg to run for President of the U.S. " );
		}
		if (age > 35 ) {
			System.out.println( "\told enough to run for President of the U.S. " );
		}
		if (age > 65 ) {
			System.out.println( "\tstill too youmg to retire  " );
			System.out.println( "\t\t(How sad!)" );
		}
	}
}
/*Type age greater than 35, ger How old are you? 36
you are*/
