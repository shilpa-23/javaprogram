
class Nodes
{
    int data;       
    Nodes next;      
 
    public Nodes(int data)
    {
        
        this.data = data;
        this.next = null;
    }
}
 
class Queue
{
    private static Nodes rear = null, front = null;
 
    
    public static int dequeue()     
    {
        if (front == null)
        {
            System.out.print("\nQueue Underflow");
            System.exit(1);
        }
 
        Nodes temp = front;
        System.out.println( temp.data);
 
       
        front = front.next;
 
       
        if (front == null) {
            rear = null;
        }
 
        
        int item = temp.data;
        return item;
    }
 
  
    public static void enqueue(int item)    
    {
    	
       
        Nodes node = new Nodes(item);
        
        
        System.out.println( item);
 
       
        if (front == null)
        {
            
            front = node;
            rear = node;
        }
        else {
          
            rear.next = node;
            rear = node;
        }
    }
 
  
    public static int peek()
    {
       
        if (front != null) {
            return front.data;
        }
        else {
            System.exit(1);
        }
 
        return -1;
    }
 
   
    public static boolean isEmpty() {
        return rear == null && front == null;
    }
}
 
class QueueLL
{
    public static void main(String[] args)
    {
    	System.out.println("VALUES");
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
 
        System.out.println(q.peek());
        System.out.println("DELETED VALUES");
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
 
        if (Queue.isEmpty()) {
            System.out.print("The queue is empty");
        }
        else {
            System.out.print("The queue is not empty");
        }
    }
}