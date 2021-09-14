import java.util.Scanner;

class AscendingNumbers { 
	 public static void main(String[] args) 
	    {
	      int n,temp;
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter number of elements in the array:");
          n = sc.nextInt();
          int a[] = new int[n];
          System.out.println("Enter elements of array:");
       for(int i = 0; i < n; i++)
      {
        a[i] = sc.nextInt();
      }
            
           
        System.out.println("Elements of  array: ");    
        for (int i = 0; i < n; i++) {     
            System.out.print(a[i] + " ");    
        }    
            
        
        for (int i = 0; i < n; i++) {     
            for (int j = i+1; j < n; j++) {     
               if(a[i] > a[j]) {    
                   temp = a[i];    
                   a[i] = a[j];    
                   a[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
            
      
        System.out.println("Elements of array in ascending order: ");    
        for (int i = 0; i < n; i++) {     
            System.out.print(a[i] + " ");    
        }    
    }    
}    