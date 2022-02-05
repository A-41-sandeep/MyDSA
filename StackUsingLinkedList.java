package dsaclass.mystack;

class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
    }
}
//structure of stack
class Stack1
{
    Node top;
    public boolean isEmpty()
    {
        if(top==null)
            return true;
        return false;
    }
    public void push(int value)
    {
        Node n1=new Node(value);
        n1.next=top;
        top=n1;
        System.out.println("value pushed");
    }
    public void pop()
    {
        if(isEmpty())
            System.out.println("stack is empty");
        else {
            System.out.println(top.data);
            top = top.next;
        }
    }
    public void display()
    {
        if(top==null)
            System.out.println("stack is empty");
        else
        {
            Node temp=top;
            while (temp!=null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
}

public class StackUsingLinkedList {
    public static void main(String[] args) {
        Stack1 obj=new Stack1();
        obj.push(50);
        obj.push(60);
        obj.push(70);
        obj.push(80);
        obj.display();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
    }
}
