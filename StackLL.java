class Node1
{
    int data;       
    Node1 next;      
}
 
class StackList
{
    Node1 top;
 
    public StackList() {
        this.top = null;
    }
 
   
    public void push(int val)        
    {
        
        Node1 node = new Node1();
 
        if (node == null)
        {
            System.out.print("\nstack Overflow");
            return;
        }
 
        System.out.println("push:" + val);
 
        
        node.data = val;
 
       
        node.next = top;
 
       
        top = node;
    }
 
 
    public boolean isEmpty() {
        return top == null;
    }
 
    
    public int peek()
    {
      
        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("The stack is empty");
            return -1;
        }
    }
 
    
    public void pop()        
    {
      
        if (top == null)
        {
            System.out.print("\nStack Underflow");
            return;
        }
 
        System.out.println("pop: " + peek());
 
        
        top = (top).next;
    }
}
 
class StackLL
{
    public static void main(String[] args)
    {
        StackList stack = new StackList();
 
        stack.push(1);
        stack.push(2);
        stack.push(3);
 
        System.out.println("The top element is " + stack.peek());
 
        stack.pop();
        stack.pop();
        stack.pop();
 
        if (stack.isEmpty()) {
            System.out.print("The stack is empty");
        }
        else {
            System.out.print("The stack is not empty");
        }
    }
}