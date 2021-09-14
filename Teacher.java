import java.util.Scanner;

 class Employee{
	Scanner sc=new Scanner(System.in);
   int empid;
   String name;
   int salary;
   String add;
   
    Employee(){
	
	name=" ";
	empid=0;
	
	salary=0;
	add=" ";
	
   }
  public void input1(){
   
   System.out.println("Enter Empid:");
   empid=sc.nextInt();
   System.out.println("Enter Name:");
   name=sc.next();
   System.out.println("Enter Salary:");
   salary=sc.nextInt();
   System.out.println("Enter Address:");
   add=sc.next();
   } 
}

class Teacher extends Employee{
	Scanner sc= new Scanner(System.in);
	
	 String department;
	 String subtaught;

   Teacher(){
	  department=" ";
	  subtaught=" ";
   }
	  void input2()
	  {
	   System.out.println("Enter Department:");
	   department=sc.next();
	   System.out.println("Subject Taught:");
	   subtaught=sc.next();
   }
   
	void display()
	{
		System.out.println("Empid::"+empid);
		System.out.println("Name::"+name);
		System.out.println("Salary::"+salary);		
		System.out.println("Address::"+add);
		System.out.println("Department::"+department);
		System.out.println("Subject Taught::"+subtaught);
	
	}



   public static void main(String args[]){
	   
	  
	   int n;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter no of Emplyees:");
	   n=sc.nextInt();
	   Teacher t[]=new Teacher[n];
	 
	   for(int i=0;i<n;i++)
	   {
		   
		   t[i]=new Teacher();
		   t[i].input1();
		   t[i].input2();
		   
		   
		   }
	   System.out.println("---DETAILS---");
	   for(int i=0;i<n;i++)
	   {
		   
		   
		   t[i].display();
		   System.out.println("---------");
		   
		   }
	   
	   
	  
	   
	  
   }   
   

}