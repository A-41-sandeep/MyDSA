package dsaclass.linkedlist;
class Node1{
    Node1 next;
    int data;
    Node1(int data)
    {
        this.data=data;
    }
}
class SinglyLinkedList1
{
    Node1 head;
    public void insertEnd(Node1 obj)
    {
        if(head==null)
        { head=obj;
            }
        else
        {
            Node1 temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=obj;

        }
    }
    //reverse of list
    public  Node1 reverse()
    {
        if(head==null || head.next==null)
            return head;
        else
        {
            Node1 curr=head;
            Node1 prev=null;
            while (curr!=null)
            {
                Node1 next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;

            }
            return prev;
        }

    }
    public void display()
    {
        Node1 temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
public class ReverseLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList1 obj = new SinglyLinkedList1();

        Node1 n1 = new Node1(10);
        obj.insertEnd(n1);
        Node1 n2 = new Node1(20);
        obj.insertEnd(n2);
        Node1 n3 = new Node1(30);
        obj.insertEnd(n3);
        obj.head=obj.reverse();
        obj.display();



    }
}
