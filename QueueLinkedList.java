package dsaclass.queue;
//defining the node for LinkedList
class node
{
    char data;
    node next;
    public node(char data)
    {
        this.data=data;
    }
}

//Queue using LinkedList
public class QueueLinkedList {
    node front;
    node rear;
    // insertion in queue
    public void enqueue(char data)
    {
        node n1=new node(data);
        if(front==null || rear==null)
        {
            front=rear=n1;
        }
        else
        {
            rear.next=n1;
            rear=n1;
        }
    }
    //traversing
    public void display()
    {
        node temp=front;
        while(temp!=null)
        {
            System.out.print(temp.data);
            temp=temp.next;
        }
    }
}
//main class  ,input = ABCDE
class demo
{
    public static void main(String[] args) {
        int data;
        QueueLinkedList Queue=new QueueLinkedList();
        //inserting odd unicode characters
        for(int i=0;i<args[0].length();i++)
        {
            data=args[0].charAt(i);
            if(data%2!=0)
            {
                Queue.enqueue(args[0].charAt(i));
            }
        }
        //inserting even unicode characters
        for(int i=0;i<args[0].length();i++)
        {
            data=args[0].charAt(i);
            if(data%2==0)
            {
                Queue.enqueue(args[0].charAt(i));
            }
        }
        //content of queue
        Queue.display();
    }

}