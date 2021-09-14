import java.util.Scanner;
class Addition
{
	void sum(int x,int y)
	{
		int r=x+y;
		
		System.out.println("sum:"+r);
	}
	void sum( int x1,int x2,int x3)
	{
		int r=x1+x2+x3;
		System.out.println("sum:"+r);
	}
	void sum( float z,float z1)
	{
		float r=z+z1;
		System.out.println("sum:"+r);
	}
}
class Add
{
	public static void main(String args[])
	{
		int x,x1,y,x2,x3;
		float z,z1;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the value of x and y");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("enter the value of x1");
		x1=sc.nextInt();
		System.out.println("enter the value of x2");
		x2=sc.nextInt();
		System.out.println("enter the value of x3");
		x3=sc.nextInt();
		System.out.println("enter the value of z");
		z=sc.nextFloat();
		System.out.println("enter the value of z1");
		z1=sc.nextFloat();
		Addition ob=new Addition();
		ob.sum(x,y);
		ob.sum(x1, x2,x3);
		ob.sum(z,z1);
		
	}
}