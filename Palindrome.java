import java.util.Scanner;
public class Palindrome
{
    public static void main(String[] args) 
    {
        int x;
        int sum=0,rem;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  number:");
        x = sc.nextInt();
        int temp=x;
        while(x>0)
        {
        	rem=x%10;
        	sum=(sum*10)+rem;
        	x=x/10;
        	
        	
        }
        if(temp==sum)
        {
        	System.out.print("Palindrome number");
        }
        else
        {
        	System.out.print("Not palindrome number");
        }
    }
        }