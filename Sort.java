import java.util.Scanner;
public class Sort {
    public static void main(String args[]) {
        int n;
        String temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  array size: ");
        n = sc.nextInt();
        System.out.print("Enter values: ");

        String[] s1= new String[n];
        for(int i = 0;i < n;i++)
        {
            s1[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            for (int  j = i + 1; j < n; j++) {
                if (s1[i].compareTo(s1[j]) > 0) {
                     temp = s1[i];
                    s1[i] = s1[j];
                    s1[j] = temp;
                }
            }
        }
        System.out.print("Strings in Sorted Order:");
        for ( int i = 0; i <n ; i++)
        {
            System.out.print(s1[i] + ", ");
        }
    }
}