import java.util.Scanner;
 
public class Employe {
 
 int eno;
 String ename;
 float esalary;
 
 public void Data() {
 
  Scanner in = new Scanner(System.in);
  System.out.print("Enter the eno : ");
  eno = in.nextInt();
  System.out.print("Enter the ename : ");
  ename = in.next();
  System.out.print("Enter the esalary : ");
  esalary = in.nextFloat();
 }
 
 public void display() {
 
  System.out.println("Employee no : " + eno);
  System.out.println("Employee name : " + ename);
  System.out.println("Employee salary : " + esalary);
 }
 
 public static void main(String[] args) {
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of Employees:");
 n=sc.nextInt();
  Employe e[] = new Employe[n];
 
  for(int i=0; i<n; i++) {
   
   e[i] = new Employe();
   e[i].Data();
  }
  System.out.println("---Details---");
  for(int i=0; i<n; i++) {
 e[i].display();

  }
  System.out.println("enter the eno of the employee to be searched:");
  int el=sc.nextInt();
  int flag=0;
 System.out.println("---Details---");
  for(int i=0; i<n; i++) {
 if(e[i].eno==el){
 flag=1;
 break;
 }
  }
  if(flag==1)
 
  {
 for(int i=0; i<n; i++) {
 
 if(e[i].eno==el)
 e[i].display();
 
  }
  }
 else
 System.out.print("Invalid");

  }
 
 
 }
