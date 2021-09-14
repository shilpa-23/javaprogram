import java.util.Scanner;
class Shapes
{
	void area(float x)
	{
		System.out.println("Area Of Squre:"+Math.pow(x,2));
	}
	void area( float x1,float y)
	{
		System.out.println("Area Of Rectangle:"+x1*y);
	}
	void area( double x2)
	{
		System.out.println("Area of Circle:"+3.14*x2*x2);
	}
}
class Area
{
	public static void main(String[] args)
	{
		float x,x1,y;
		double x2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Side Of Square x:");
		x=sc.nextFloat();
		System.out.println("Enter The Length and Breadth Of Rectangle x1 and y:");
		x1=sc.nextFloat();
		y=sc.nextFloat();

		System.out.println("Enter The Radius Of Circle x:");
		x2=sc.nextDouble();
		Shapes ob=new Shapes();
		System.out.println("---RESULTS---");
		ob.area(x);
		ob.area(x1, y);
		ob.area(x2);
		
	}
}