package dsaclass.mystack;
//implementation using array
class Stack
{
    private int top;
    private int arr[];
    public Stack(int size)
    {
         arr=new int[size];
        top=-1;
    }
    public boolean isEmpty()
    {
        if(top==-1)
            return true;
        return false;
    }
    public boolean isFull()
    {
        if(top==(arr.length-1))
            return true;
        return false;
    }
    public void push(int value)
    {
        if(isFull()) {
            System.out.println("StackOverFlow");
        }
        else
        {
            top+=1;
            arr[top] = value;
            System.out.println("value entered");
        }
    }
    public void pop()
    {
        if(isEmpty())
            System.out.println("Stack is empty");
        else
        {
            System.out.println(arr[top]);
            arr[top]=0;
            top-=1;
        }
    }
    //traverse stack
    public void display()
    {
        if(isEmpty())
            System.out.println("stack is empty");
        else {
            int temp = top;
            while (temp != -1)
                System.out.println(arr[temp--]);
        }
    }
}

public class StackStructure {
    public static void main(String[] args) {
        Stack obj=new Stack(10);
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.display();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();

    }
}
