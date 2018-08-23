import java.util.Scanner;

public class BMICalculator {
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    double feet, inches, pounds, m, kg, bmi;

    System.out.print("Your height in feet: ");
    feet = keyboard.nextDouble();

    System.out.print( "Your height in inches: ");
    inches = keyboard.nextDouble();

    System.out.print( "Your weight in pounds: ");
    pounds = keyboard.nextDouble();

    m = (((feet * 12) + inches) * 0.0254);
    kg = (pounds * 0.454);

    bmi = kg / (m*m);

    System.out.println( "Your BMI is " + bmi);
  }
}
