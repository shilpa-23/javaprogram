import java.util.Scanner;
public class Odd
{
    public static void main(String[] args) 
    {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  number:");
        x = sc.nextInt();
        if(x%2==0){
        	System.out.print(x+" is Even Number");
        	
        }
        else
        {
        	System.out.print(x+" is Odd Number");
        }
        	
    }
}