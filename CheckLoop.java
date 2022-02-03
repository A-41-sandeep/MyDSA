package dsaclass.linkedlist;

public class CheckLoop {
    public static boolean checkLoop(SinglyLinkedList obj)
    {
        Node turtle= obj.head;
        Node hav= obj.head;
        while(hav.next!=null)
        {
            turtle=turtle.next;
            hav=hav.next.next;
            if(turtle==hav)
                return true;
        }
        return false;
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
        Node temp= obj.head;
        while (temp.next!=null)
            temp=temp.next;
        temp.next= obj.head;
        boolean isloop=CheckLoop.checkLoop(obj);
            System.out.println(isloop);

    }
}
