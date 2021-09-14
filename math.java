package arithmetic;

 interface op
{  
          void add(int a, int b);  
         void mul(int a, int b);  
         void divi(double a, double b);  
        void display();  
    }  
   public  class math implements op{  
        int a1, a2, a3;  
        double d;  
        public void add(int a, int b) {  
           
            a1 = a + b;  
        }  
       public void sub(int a, int b) {  
            
            a2 = a - b;  
        }  
       public void mul(int a, int b) {  
           
            a3= a * b;  
        }  
        public void divi(double a, double b) {  
            
            d = a / b;  
        }  
        public void display() {  
            System.out.println("Addition :" + a1);  
            System.out.println("Subtraction :" + a2);  
            System.out.println("Multiplication :" + a3);  
            System.out.println("Division :" + d);  
        }  
    } 