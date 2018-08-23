public class CreatingVariables{
  public static void main(String[] args ){
    int x, y, z, age;
    double seconds, e, checking, year;
    String firstName, lastName, title, make, model;

    x = 10;
    y = 400;
    z = 666;
    age = 39;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    year = 1970.5;

    firstName = "Graham";
    lastName = "Mitchell";
    title = "Mr.";
    make = "Dodge";
    model = "Challenger";

    System.out.println("The variable x contains " + x);
    System.out.println("The value " + y + "is stored in the variable y.");
    System.out.println("the experiment took "  + seconds + "seconds.");
    System.out.println("A favorite irrational # is Euler's number:" + e);
    System.out.println("Hopefully you have more than $" + checking + "!");
    System.out.println("My name's " + title + " " + firstName + lastName );
    System.out.println("I drive a " + year + " " + make + " " + model);
    System.out.println("The number of the beast is " + z);
  }
}
