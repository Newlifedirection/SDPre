public class Objective2Lab5 {
  public static void main(String[] args) {
    double side1 = Math.sqrt (10.1 * 10.1);
    double side2 = Math.sqrt (8 * 8);
    double hypotenuse;

    side1 = 10.1;
    side2 = 8.0;
    hypotenuse = Math.sqrt((side1 * side1) + (side2 * side2));

    System.out.print("The hypotenuse of a triagle with sides " + side1 + " and " +side2 + " is " + hypotenuse);
  }
}
