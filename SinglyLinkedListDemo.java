package dsaclass.linkedlist;
class Node{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
    }
}

class SinglyLinkedList{
    Node head;
    int size=0;
    //insert a node in the beginning
    public  void insertStart(Node obj)
    {
        obj.next=head;
        head=obj;
        size++;
    }

    //insert a node in the end
    public void insertEnd(Node obj)
    {
        if(head==null)
        { head=obj;
            size++;}
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=obj;
            size++;
        }
    }

    //insert node at position k
    public void insertAtPos(int k,Node obj) {
        Node temp = head;
        if (size < k - 1)
            System.out.println("List do not have sufficient nodes");
        else {
            while (k > 2) {
                temp = temp.next;
                k -= 1;
            }
            obj.next = temp.next;
            temp.next = obj;
            size++;
        }
    }
    //deletion from beginning
    public void deleteStart()
    {
        head=head.next;
        size--;
    }
    //deletion from end
    public void deleteEnd()
    {
        Node temp=head;
        if(head==null)
            System.out.println("List is empty");
        else
        {
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
        size--;
    }
    }

    //deletion from a position
    public void deleteFrom(int position)
    {
        if(position>size && position<0)
            System.out.println("Invalid position");
        else
        {
            Node temp=head;
            while (position>2)
            {
                temp=temp.next;
                position--;
            }
            temp.next=temp.next.next;
            temp.next.next=null;
            size--;
        }
    }
    //Traverse the List
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}


public class SinglyLinkedListDemo {
    public static void main(String[] args) {
        SinglyLinkedList List=new SinglyLinkedList();
        Node element1=new Node(10);
        List.insertStart(element1);
        Node element2=new Node(20);
        List.insertEnd(element2);
        Node element3=new Node(30);
        List.insertAtPos(2,element3);
        //List.deleteStart();
        //List.deleteEnd();
        List.deleteFrom(2);
        List.display();
    }

}
