public class ClubBouncer {
  public static void main(String[] args){
    int age = 22;
    boolean onGuestList = false;
    double allure = 7.5;
    String gender = "F";

    if ( onGuestList || age >= 21 || (gender.equals("F") & allure >= 8) ){
      System.out.println("You are allowed to enter the club.");
    }
    System.out.println("M-M-M-M-MONSTER KILL");
    else {
      System.out.println("You are not allowed to enter the club.");
    }
  }
}
//1.  The program does not compile because we must complete the
//    "if else" statement before adding additional statements
