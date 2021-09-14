class Linkedlist {
    Node head; 
    class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
 
   
    void delete(int val)
    {
        
        Node temp = head, prev = null;
 
        
        if (temp != null && temp.data == val) {
            head = temp.next; 
            return;
        }
 
        
        while (temp != null && temp.data != val) {
            prev = temp;
            temp = temp.next;
        }
 
       
        if (temp == null)
            return;
 
        
        prev.next = temp.next;
    }
 
   
    public void insert(int val)
    {
        Node newnode = new Node(val);
        newnode.next = head;
        head = newnode;
    }
 
   
    public void display()
    {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }
 
   
    public static void main(String[] args)
    {
        Linkedlist list = new Linkedlist();
 
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(10);
 
        System.out.println("\n Linked list is:");
        list.display();
 
        list.delete(2);
        list.delete(3);
        list.delete(4);
        list.delete(10);
 
        System.out.println(
            "\nLinked List after Deletion of 2,3,4,10 is:");
        System.out.println(
                "\nEmpty");
        list.display();
        
    }
}
