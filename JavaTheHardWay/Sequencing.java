import java.util.Scanner;

public class Sequencing {
	public static void main( String[] args ){
		//This code is broken until you fix it
		
		Scanner keyboard = new Scanner(System.in);
		double price, salesTax, total;
		
		System.out.print( "How much is the purchase price? " );
		price = keyboard.nextDouble();
		
		salesTax = price * 0.0825;
		total = price + salesTax;
		
		System.out.println( "Item price:\t" + price );
		System.out.println( "Sales tax:\t" + salesTax );
		System.out.println( "Total cost:\t" + total );
	}
}
/*After removing = 0 from line 8, it does not compile and the error message makes
since because we have salesTax = , and total = , but not a price = line. After moving
the two lines salesTax = and total = , the code runs. Now removing the = 0 from line
8, work fine. I think this is because = 0 is not needed in line 8.*/