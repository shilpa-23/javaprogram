import java.lang.Runnable;
import java.lang.Thread;
import java.util.Scanner;

class Fib implements Runnable{
    public void run(){
    	Scanner reader=new Scanner(System.in);
        int n , first= 0,second= 1,sum;
        System.out.println("Enter the limit:");
         n=reader.nextInt();
    System.out.println("Fibonacci Series till " + n + " terms:");

    for (int i = 1; i <= n; ++i) {
      System.out.print(first + ", ");

      
      sum = first+ second;
      first= second;
      second= sum;
    }
    }
}

class Even implements Runnable{
    public void run(){
    	Scanner reader = new Scanner(System.in);
    	System.out.println("Enter the limit of Even Numbers :\n");
    	int n=reader.nextInt();
    	System.out.println("Even Numbers:");
    	for(int i=1;i<=n;i++)
    	{
    		if(i%2==0){
    	
           System.out.println(i);
        }
    	}
    }
}
public class  RunnablePrgrm {

    public static void main(String[] args) { 
        Fib r = new Fib();
        Thread t = new Thread(r);
        t.start();
        Even r2 = new Even();
        Thread t2 = new Thread(r2);
        t2.start();
    }
}
