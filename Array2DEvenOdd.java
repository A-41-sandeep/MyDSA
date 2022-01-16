package dsaclass;

import java.util.ArrayList;
import java.util.Scanner;

public class Array2DEvenOdd {
    public static void main(String[] args) {
        int row,column;
        Scanner s=new Scanner(System.in);
        System.out.println("enter no of rows");
        row=s.nextInt();
        System.out.println("enter no of column");
        column=s.nextInt();
        int [][] arr=new int[row][column];
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        System.out.println("enter elements of array");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                arr[i][j] = s.nextInt();
                if(arr[i][j]%2==0) {
                    even.add(arr[i][j]);
                }
                else
                {
                    odd.add(arr[i][j]);

                }
            }
        }
        System.out.print("even elements are: ");
        for (int i:even)
            System.out.print(i+" ");
        System.out.print("\nodd elements are: ");
        for(int i:odd)
            System.out.print(i+" ");
    }
}
