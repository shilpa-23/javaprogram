import java.util.Scanner;
public class Arraylarge 
{
    public static void main(String[] args) 
    {
        int n, large;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements of array:");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        large= a[0];
        for(int i = 0; i < n; i++)
        {
            if(large < a[i])
            {
                large = a[i];
            }
        }
        System.out.println("Largest value:"+large);
    }
}