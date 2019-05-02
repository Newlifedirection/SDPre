import java.util.Scanner;
public class Objective3Lab5 {
  public static void main(String[] args){

    double numPancakes, numEggs, numTotal;

      numPancakes = 0;
      numEggs = 0;

    Scanner input = new Scanner(System.in);
      System.out.println("How many pancakes did you eat? ");
        numPancakes = input.nextDouble();
      System.out.println("How many eggs did you have? ");
        numEggs = input.nextDouble();
      System.out.println("You had " + numPancakes + "\tand " + numEggs + "\tThat's" + (numPancakes + numEggs) + "\tenough for an army!");
    input.close();
  }
}
