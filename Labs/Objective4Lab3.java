import java.util.Scanner;
public class Objective4Lab3{
  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    int userNum;

    System.out.println("PLease enter a number: ");
    userNum = scanner.nextInt();

    if(userNum == 0){
      System.out.println("The number is not Positive or Negative");
    }
    if(userNum > 0){
      System.out.println("The number is a positive");
    }
    if(userNum < 0){
      System.out.println("The number is a negative");
      scanner.close();
    }
  }
}
