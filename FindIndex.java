package dsaclass.recursion;

import java.util.Scanner;

public class FindIndex {
    public static int findInd(int arr[],int i,int value)
    {
        if(i==arr.length)
            return -1;
        if(arr[i]==value)
            return i;
        i=i+1;
        return findInd(arr,i,value);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
        }
        System.out.println("enter the value to be searched");
        int f=findInd(arr,0,s.nextInt());
        if(f==-1)
            System.out.println("value not present in array");
        else
            System.out.println("first occurrence of the value is  at index = "+f);
    }
}
