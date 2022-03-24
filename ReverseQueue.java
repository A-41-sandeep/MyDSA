import java.util.Scanner;
import java.util.Stack;

class Myqueue
        {
            int[] arr;
            int front,end;
            public Myqueue(int size)
            {
                arr=new int[size];
                front=end=-1;
            }
            public void enqueue(int data)
            {
                 if(front==-1)
                {
                    front=end=0;
                    arr[end]=data;
                }
                 else if(end==(arr.length-1))
                     System.out.println("queue is full");
                 else
                { end++;
                arr[end]=data;}
            }

            public int dequeue()
            {
                if(front==-1)
                   System.out.println("queue is empty");
                else if (front==end)
                {
                    int temp=arr[front];
                    front=end=-1;
                    return temp;
                }
                return arr[front++];
            }

            public void  displayQ()
            {
                for (int i:arr) {
                    System.out.print(i+" ");
                }
            }
        }

public class ReverseQueue {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,k;
        n=s.nextInt();
        k=s.nextInt();
        Stack<Integer> st=new Stack<>();
        Myqueue dupQ=new Myqueue(n-k);
        Myqueue q=new Myqueue(n);
        for(int i=0;i<n;i++)
        {
            q.enqueue(s.nextInt());
        }
        for(int i=0;i<k;i++)
           st.push(q.dequeue());

        for(int i=k;i<n;i++)
            dupQ.enqueue(q.dequeue());

        for(int i=0;i<k;i++)
            q.enqueue(st.pop());
        for(int i=k;i<n;i++)
            q.enqueue(dupQ.dequeue());

        q.displayQ();


    }
}
