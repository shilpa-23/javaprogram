package Graphics;
interface arith1
{  
        void rect(int a, int b);  
        void cir(double a);  
        void sqr(int a);  
        void tri(int a,int b);
        void display();  
    }  
   public  class area1 implements arith1{  
        int x,  z;
        double y,r;
        
        
        public void rect(int a, int b) {  
           
            x = a * b;  
        }  
       public void cir(double a) {  
            
            y = 3.14*a*a;  
        }  
       public void sqr(int a) {  
           
            z = a*a;  
        }  
       public void tri(int a,int b) {  
           
           r= 0.5*a*b;  
       }  
       
        public void display() {  
            System.out.println("Area of Rectangle:" + x);  
            System.out.println("Area of Circle:" + y);  
            System.out.println("Area of Square:" + z);  
            System.out.println("Area of Triangle:" + r);  
           
        }  
    }  