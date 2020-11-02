class LinkedList 
{
    static Node head;
    class Node 
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
void deleteKey(int key)
    {
        Node temp = head, prev = null;
        while (temp != null && temp.data == key) 
        {
            head = temp.next; // Changed head
            temp = head; // Change Temp
        }
        while (temp != null) 
        {
            while (temp != null && temp.data != key) 
            {
                prev = temp;
                temp = temp.next;
            }
            if (temp == null)
                return;
            prev.next = temp.next;
            temp = prev.next;
        }
    }
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public void printList()
    {
        Node tnode = head;
        while (tnode != null) 
        {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }
    public static void main(String[] args)
    {
        LinkedList llist = new LinkedList();
 
        llist.push(1);
        llist.push(2);
        llist.push(6);
        llist.push(3);
        llist.push(4);
        llist.push(5);
        llist.push(6);
 
        int key = 6; // key to delete
 
        System.out.println("Created Linked list is:");
        llist.printList();
        llist.deleteKey(key);
 
        System.out.println("\nLinked List after Deletion is:");
        llist.printList();
    }
}
 
