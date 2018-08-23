import java.util.Scanner;

public class RudeQuestions{
  public static void main(String[] args){
    String name, color;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print( "Hello.  What is your name? " );
    name = keyboard.next();

    System.out.print( "Hi, " + name + "! How old are you?");
    age = keyboard.nextInt();

    System.out.println( "So you're " + age + ", eh?  That's not very old.");
    System.out.print( "How much do you weigh, " + name + "? ");
    weight = keyboard.nextDouble();

    System.out.println( weight + "! Better keep that quiet!!" );
    System.out.print("Finally, what's your income, " + name + "? ");
    income = keyboard.nextDouble();

    System.out.print( "Hopefully that is " + income + " per hour");
    System.out.println( " and not per year!");

    System.out.println("What is your favorite color?");
    color = keyboard.next();
    System.out.println("Your favorite color is " +  color + ".");
    System.out.print(" Interesting.");
    System.out.print( "Well, thanks for answering my rude questions, ");
    System.out.println( name + ".");
    //1.  No, because integer values are assumed to have a ".0" decimal using double
    //2.  No, because Strings accept any data said data will not be calculable
    //3.  First question won't blow up from keyboard input because Strings can be anything
    //    2nd question will blow up on letter value or non-integer number value because variable is "int"
    //    3rd question will blow up on letter value because variable is "double" and does not accept letters
  }
}
