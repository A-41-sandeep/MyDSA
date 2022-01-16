package dsaclass;

import java.util.Scanner;

public class ArrayFuction {
    public static boolean oddPair(int [] arr)
    {
        int m;
        for(int i=0;i<arr.length-1;i++)
        {
            m=arr[i]*arr[i+1];
            if(m%2!=0)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[]=new int[6];
        Scanner s=new Scanner(System.in);
        System.out.println("enter elements of array");
        for(int i=0;i<6;i++)
            arr[i]=s.nextInt();
        if(ArrayFuction.oddPair(arr))
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
