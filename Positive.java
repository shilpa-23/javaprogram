import java.util.Scanner;

public class Positive {
  public static void main(String[] args) {
    
    Scanner reader=new Scanner(System.in);
    System.out.print("Enter a number:");
    int x=reader.nextInt();
    String result = (x > 0) ? "Positive Number" : (x<0) ? "Negative Number":"Zero";
    System.out.println(result);
  }
}