import java.util.Scanner;

public class EnterPIN{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    String attempt, password;
    int pin, entry;

    password = "Shoryuken";

    System.out.println("WELCOME TO THE BANK OF JAVA.");
    System.out.println("ENTER YOUR PASSWORD: ");
    attempt = keyboard.next();

    while ( ! attempt.equals("Shoryuken") ){
      System.out.println("INCORRECT PASSWORD.  TRY AGAIN.");
      System.out.println("ENTER YOUR PASSWORD: ");
      attempt = keyboard.next();
    }

    pin = 12345;

    System.out.println("ENTER YOUR PIN: ");
    entry = keyboard.nextInt();

    while ( entry != pin ){
      System.out.println("\nINCORRECT PIN. TRY AGAIN.");
      System.out.println("ENTER YOUR PIN: ");
      entry = keyboard.nextInt();
    }

    System.out.println("\nPIN ACCEPTED.  YOUR ACCOUNT BALANCE IS $425.17");
  }
}
