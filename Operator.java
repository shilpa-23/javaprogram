import  arithmetic.*;
import java.util.Scanner;
  public  class Operator {  
       public static void main(String[] args) {  
         math obj = new math(); 
            Scanner s=new Scanner(System.in);
            int m, n;  
            System.out.println ("Enter the first Number :");  
            m = s.nextInt();  
            System.out.println("Enter the second Number :");  
            n =s.nextInt();  
            obj.add(m, n);  
            obj.sub(m, n);  
            obj.mul(m, n);  
            obj.divi(m, n);  
            obj.display();  
             
        }  
    }  
