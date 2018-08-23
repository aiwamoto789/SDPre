import java.util.Scanner;

public class ComparingNumbers {
  public static void main( String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double first, second;

    System.out.print( "Give me two numbers. First: ");
    first = keyboard.nextDouble();
    System.out.print( "Second: ");
    second = keyboard.nextDouble();

    if ( first < second )
      System.out.println( first + " is LESS THAN " + second );

    if ( first <= second )
      System.out.println( first + " is LESS THAN/EQUAL TO " + second );

    if ( first == second )
      System.out.println( first + " is EQUAL TO " + second );

    if ( first >= second )
      System.out.println( first + " is GREATER THAN/EQUAL TO " + second );

    if ( first > second )
      System.out.println( first + " is GREATER THAN " + second );

    if ( first != second ) {
      System.out.println( first + " is NOT EQUAL TO " + second );
      System.out.println( "Hey." );
    }
      //1.  The added line of code "Hey." runs no matter what.
      //    It is not a part of the if statement as it contains
      //    no declared variables
      //2.  Code works as previously except the "Hey." line only
      //    appears if the final if statement is true.
  }
}
