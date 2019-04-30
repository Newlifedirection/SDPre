public class ThereAndBackAgain {
	public static void main( String[] args ) {
		System.out.println( "Here." );
		erebor();
		System.out.println( "Back first time." );
		//erebor();
		System.out.println( "Back second time," );
	}
	
	public static void erebor() {
		System.out.println( "There." );
	}
}
//Take out parentheses on 4, error and won't compile.
//I think it will not show "Back second time".
//I was wrong, it skipped "there" the second time, but showed "Back second..."