import java.util.Scanner;
interface fig {
   
    void area(double x,double y);
    void perimeter(double x,double y);
    void area(double x);
    void perimeter(double x);
    double pi=3.14;
}
class Rect implements fig{
    
    public void area(double x, double y) {
        System.out.print ("Area of rectangle is: "+(x*y));
    }
    public void perimeter(double x,double y){
        System.out.print ("Perimeter of rectangle is: "+(2*(x+y)));
    }
    public void area(double x){ }
    public void perimeter(double x){ }
}
class Cir implements fig{
    public void area(double x){
        System.out.print ("Area of circle is: "+(pi*x*x));
    }
    public void perimeter(double x){
        System.out.print ("Perimeter of rectangle is: "+(2*pi*x));
    }
    public void area(double x, double y) {}
    public void perimeter(double x, double y) {}
}
class Areaoffigures{
    public static void main(String arg[]){
        Rect r=new Rect();
        Cir c=new Cir();
        int ch;
        double le,bt,rd;
        Scanner sc= new Scanner(System.in);
        while(true)
        {
        System.out.print("\n--MENU-- \n1. Area of rectangle \n2.Area of circle \n3.Perimeter of rectangle \n4.Perimeter of circle \nEnter your choice:\n");
        ch= sc.nextInt();
        switch (ch)
        {
            case 1: System.out.print("Enter the length and breadth of rectangle: ");
                    le=sc.nextDouble();
                    bt=sc.nextDouble();
                    r.area( le, bt);
                    break;
            case 2: System.out.print("Enter the radius of circle: ");
                    rd=sc.nextDouble();
                    c.area(rd);
                    break;
            case 3: System.out.print("Enter the length and breadth of rectangle: ");
                    le=sc.nextDouble();
                    bt=sc.nextDouble();
                    r.perimeter( le, bt);
                    break;
            case 4: System.out.print("Enter the radius of circle: ");
                    rd=sc.nextDouble();
                    c.perimeter(rd);
                    break;
            default:System.out.print("Invalid choice");
            return;
        }
        }
    }
}
