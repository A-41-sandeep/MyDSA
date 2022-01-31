package dsaclass.recursion;

import javax.management.ObjectName;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class FindAllIndeces {
    public static int[] res(int arr[], int i, int value)
    {
        int[] ans=new int[arr.length];
        if(i==arr.length)
            return ans;

        ans=res(arr, i + 1, value);
            if(arr[i]==value)
                ans[i]=i;
            else
                ans[i]=-1;
            return ans;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
        }
        int[] ans=res(arr,0,7);
        for (int i = 0; i < ans.length; i++) {
            if(ans[i]!=-1)
            System.out.println(ans[i]);
        }

        }
    }


