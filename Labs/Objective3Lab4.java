import java.util.Scanner;
public class Objective3Lab4 {
  public static void main(String[] args){
    String firstName;
    String lastName;
    int age;

    Scanner input = new Scanner(System.in);
      System.out.println("What is your first name?");
        firstName = input.nextLine();
      System.out.println("What is your last name?");
        lastName = input.nextLine();
      System.out.println("What is your age?");
        age = input.nextInt();
      System.out.println("First Name: " + firstName + "," + "\t Last Name: " + lastName + "," + "\tAge: " +age);

    input.close();
  }
}
