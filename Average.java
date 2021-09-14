import java.lang.Exception;
import java.util.Scanner;
class Avgexception extends Exception
{
    public Avgexception(String str)
    {
    	 
        super(str);
    }
}
public class Average{
    public static void main(String[] args){
    	
        try {
        	int i, n; 
        	double sum=0;
            double average=0;
            int a[]=new int[50];
            
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of elements: ");
            n = sc.nextInt();
            System.out.println("Enter elements: ");
            for (i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                
            }
            for(i=0;i<n;i++) {
                if (a[i] >= 0) {
                    sum = a[i] + sum;
                }
                else
                    throw new Avgexception("\nNumber is negative");
            }
                
                average = sum/n;
                System.out.println("\nAverage is " +average);
        }
        catch (Avgexception e) {
           System.out.println(e);
        }
    }
}