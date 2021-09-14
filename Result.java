import java.util.Scanner;
 interface sports
{
	 
	 void inputsports();
	
	
}
class student1 {
	 int rollno;
	 
	 float m1;
	 float m2;
	 
	   
	     void data1(){
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter the Roll No ");
	        rollno=s.nextInt();
	     }
	     void display1()
	     {
		        System.out.println("Rollno is:" + rollno);
	     }
	     void mark()
	     
	     {
	    	 Scanner s = new Scanner(System.in);
	    	 System.out.println("Enter Mark1: ");
		        m1=s.nextFloat();
		        System.out.println("Enter Mark2 :");
		        m2=s.nextFloat();
	    	 
	    	
	    	 
	     }
	     void mark2()
	     {
	    	 System.out.println("Mark1:"+m1);
	    	 System.out.println("Mark2:"+m2);
	     }
 }
 
 class result1 extends student1 implements sports
 {
	 Scanner s=new Scanner(System.in);
	 float total,sportsmark;
	 public void inputsports()
	 {
		 System.out.println("Enter Sports Mark");
		 sportsmark=s.nextFloat();
	 }
	 void display()
	 {
		 
		 System.out.println("Sports Mark"+sportsmark);
		 total=m1+m2+sportsmark;
		 System.out.println("Total  Mark of Roll No  "  + rollno  +  "is:" + total);
	 }
 }
 class Result
 {
	 public static void main(String args[])
	 {
		 result1 r=new result1();
		 r.data1();
		 r.display1();
		 r.mark();
		 r.mark2();
		 r.inputsports();
		 r.display();
		 
		 
		
	}
 }

 
  