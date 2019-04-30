import java.util.Scanner;

public class EnterPIN {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		String password, typed;
		int pin, entry;
		
		password = "milehigh";
		pin = 12345;
		
		System.out.println( "WELCOME TO THE BANK OF JAVA.");
		
		System.out.println( "ENTER YOUR PASSWORD:");
		typed ( !password.equals("milehigh") );
		System.out.print( "ENTER YOUR PIN: ");
		entry = keyboard.nextInt();
		
		while ( typed !"milehigh".equals(password) ) {
			System.out.println( "\nINCORRECT PASSWORD, TRY AGAIN.");
			System.out.print( "ENTER YOUR PASSWORD: ");
			typed ( !password.equals("milehigh") );
		}
		while ( entry != pin) {
			System.out.println( "\nINCORRECT PIN. TRY AGAIN.");
			System.out.print( "ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
		}
		
		System.out.println( "\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
	}
}