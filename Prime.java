import java.util.Scanner;
class Prime
{
   public static void main (String[] args)
   {		
      Scanner sc = new Scanner(System.in);
      int i,count,n,j;
      
      
      System.out.println("Enter the limit:");
      n = sc.nextInt();
      System.out.println("Prime Numbers are:");
      for (i = 2; i <= n; i++)  	   
      { 		 		  
    	   count=0; 	  
         for(j =1; j<=i; j++)
         {
	    if(i%j==0)
	    {
		count++;
	    }
	 } 
	 if (count ==2)
	 {
		 System.out.println(i);
	      
	 }	
      }	
      
   }
}