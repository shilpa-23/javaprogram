import java.util.Scanner;
import java.lang.Thread;
class Multiplication extends Thread
{
public void run()
{
int result;
for(int i=1;i<=10;i++)
{
result=i*5;
System.out.println(i+"*5="+result);
}
}
}
class PrimeNum extends Thread
{
public void run()
{

Scanner sc = new Scanner(System.in);
System.out.println("Enter the limit:");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{

System.out.println("Prime numbers");
for(i=2;i<=n;i++)
{
int count=0;
for(int j=1;j<=i;j++)
{
    if(i%j==0)
    {
        count++;
    }
}
         	
if(count==2)
{
    System.out.print(i+" ");
}
}

}
}
}
public class Mul
{
public static void main(String args[])
{
	Multiplication m=new Multiplication();
	m.start();
	PrimeNum p=new PrimeNum();
	p.start();
	
}
}
