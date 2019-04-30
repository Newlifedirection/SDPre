import java.util.Scanner;

public class RudeQuestions {
	public static void main( String[] args ) {
		String name;
		int age;
		double weight, income;
		String religion;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "Hello. What is your name? " );
		name = keyboard.next();
		
		System.out.println( "Hi, " + name + "! How old are you? " );
		age = keyboard.nextInt();
		
		System.out.println( "So you're " + age + ", eh? That's not very old. " );
		System.out.println( "How much do you weigh, " + name + "? " );
		weight = keyboard.nextDouble();
		
		System.out.println( weight + "! Better keep that quiet!!" );
		System.out.println( "What is the best religion? " );
		religion = keyboard.next();
		System.out.println( religion + "! You should tell everyone!!!" );
		System.out.println( "Finally, what's your income, " + name + "? " );
		income = keyboard.nextDouble();
		
		System.out.println( "Hopefully that is " + income + " per hour" );
		System.out.println( " and not per year!" );
		System.out.println( "Well, thanks for answering my rude questions,  " );
		System.out.println( name + "." );
	}
}
/*It does not blow up it I answer line 11 name with and int. I does blow up if I 
answer line 17 age double with a string. I would guess this is because the first 
question in the code doesn't specify string, int, etc. but the second question
code does expect Int answer. Everything (Int, Double, String) seems to work for
the first question. Second question does not like anything other than an Int.
Third question does not like a string answer. Fourth question does not like
string answer. I think the answers that did not work are because I typed an
answer type other than what is written in code that it expects. */ 
 