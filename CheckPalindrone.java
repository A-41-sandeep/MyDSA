package dsaclass.linkedlist;

public class CheckPalindrone
{
public static boolean checkPalindrone(SinglyLinkedList obj) {
    if (obj.head == null || obj.head.next == null)
        return true;
    else
    {
        Node start=obj.head;
     Node last=CheckPalindrone.findMid(obj.head).next;
     last=reverse(last);
     while(last!=null)
     {
         if(start.data!=last.data)
             return false;
         start=start.next;
         last=last.next;
     }
     return true;
    }
    }
    public static Node reverse(Node mid)
    {
        if(mid==null || mid.next==null)
            return mid;
        else
        {
            Node cur=mid;
            Node prev=null;
            while(cur!=null)
            {
                Node next=cur.next;
                cur.next=prev;
                prev=cur;
                cur=next;
            }
            return prev;
        }

    }
    public static Node findMid(Node head)
    {
        Node turtle=head;
        Node hav=head;
        while(hav.next!=null && hav.next.next!=null)
        {
            turtle=turtle.next;
            hav=hav.next.next;
        }
        return turtle;
    }

    public static void main(String[] args) {
        SinglyLinkedList obj=new SinglyLinkedList();
        Node n1=new Node(10);
        obj.insertEnd(n1);
        Node n2=new Node(20);
        obj.insertEnd(n2);
        Node n3=new Node(20);
        obj.insertEnd(n3);
        Node n4=new Node(10);
        obj.insertEnd(n4);
        if(CheckPalindrone.checkPalindrone(obj))
            System.out.println("palindrone");
        else
            System.out.println("Not palindrone");

    }
}