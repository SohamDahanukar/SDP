import java.util.Scanner;
class DO_WHILE {
  public static void main(String[] args) {
    double balance = 0;
    double minbal = 500;
    double depositAmt = 0;
    Scanner sc = new Scanner(System.in);
    
    do {
      System.out.println("Enter the amount to be deposit");
      depositAmt = sc.nextInt();
    } while(depositAmt < minbal);
    balance = depositAmt;
    System.out.println("Your deposit was successful");
  }
}
