import java.util.Scanner;
public class Factorial
{
    public static void main(String[] args) 
    {
        int x,i,fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  number:");
        x = sc.nextInt();
        for(i=1;i<=x;i++)
        {
        	fact=fact*i;
        }
        System.out.print(x +"Factorial is" +fact);
    }
    }
        