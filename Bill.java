import java.util.Date;
import java.util.Scanner;

interface interbill {
	void input();
    void output();
    float cal();
    
}
class bills implements interbill{
    float price, net = 0;
    int p_id,qty;
    String name;
    Scanner sc = new Scanner(System.in);

    public void input(){
        System.out.print("\nEnter product id: ");
        p_id = sc.nextInt();
        System.out.print("Enter product name: ");
        name = sc.next();
        System.out.print("Enter product quantity: ");
        qty = sc.nextInt();
        System.out.print("Enter price: ");
        price = sc.nextFloat();
    }
    public void output(){
        float total=qty*price;
        System.out.print("\n" +p_id+"             "+name+"                 "+qty+"                 "+price+"              "+total);
    }

    public float cal(){
        net=qty*price;
        return net;
    }
}
class Bill{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i,n,orderno;
        System.out.print("Enter order number: ");
        orderno = sc.nextInt();
        Date date=new Date();
        System.out.print(" Enter number of products: ");
        n = sc.nextInt();
       
        bills b[] = new bills[n];
        
        for (i = 0; i < n; i++) {
            b[i] = new bills();
            b[i].input();
        }
        System.out.println("Order Number: " +orderno);
        System.out.println("Date: " +date.toString());
        System.out.println("PRODUCT ID        NAME        QUANTITY         UNIT PRICE        TOTAL");
        System.out.println("_______________________________________________________________________");
        for (i = 0; i < n; i++) {
            b[i].output();
        }
        System.out.println("\n_______________________________________________________________________");
        float totalnet = 0;
        for (i = 0; i < n; i++) {
            b[i].cal();
            totalnet = totalnet + b[i].net;
        }
        if(i==n) {
            System.out.print("\nNET AMOUNT: "+totalnet);
        }
    }
}