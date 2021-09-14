import Graphics.*;
import java.util.Scanner;
   public class Areainterface {  
       public static void main(String[] args) {  
         area1 obj = new area1(); 
            Scanner s=new Scanner(System.in);
            int g, h,m,t1,t2;
             double n;  
             System.out.println ("__________ENTER VALUES__________");  
            System.out.println ("Enter the length:");  
            g = s.nextInt();  
            System.out.println("Enter the breadth :");  
            h =s.nextInt();
            System.out.println("Enter the  radius :");  
            n =s.nextDouble();
            System.out.println("Enter the side of square :");  
            m =s.nextInt();
            System.out.println("Enter the  Triangle Height :");  
            t1 =s.nextInt();
            System.out.println("Enter the Triangle base :");  
            t2 =s.nextInt();
            obj.rect(g, h);  
            obj.cir(n);  
            obj.sqr(m);  
           obj.tri(t1, t2);
            obj.display();  
             
        }  
    }  
