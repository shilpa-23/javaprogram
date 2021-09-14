import java.util.Scanner;
public class Search_array
{
    public static void main(String[] args) 
    {
        int n, x, count = 0, i ;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements  in the  array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        System.out.print("Enter the element  to be  searched:");
        x = s.nextInt();
        for(i = 0; i < n; i++)
        {
            if(a[i] == x)
            {
                count = 1;
                break;
            }
            else
            {
                count = 0;
            }
        }
        if(count == 1)
        {
            System.out.println("Element found at position:"+(i + 1));
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}