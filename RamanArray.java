package dsaclass;

import java.util.Arrays;
import java.util.Scanner;

public class RamanArray  {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int size;
        System.out.println("enter the size of first array");
        size=s.nextInt();
        int arr1[]=new int[size];
        System.out.println("enter elements of array");
        for (int i = 0; i < size; i++) {
            arr1[i]=s.nextInt();
        }
        System.out.println("enter size of another element");
        size=s.nextInt();
        int arr2[]=new int[size];
        System.out.println("enter elements of another array");
        for (int i = 0; i < size; i++) {
            arr2[i]=s.nextInt();
        }
        Arrays.sort(arr2);
        int c=0;
        for (int k : arr1) {
            for (int j = 0; j < arr2.length; j++) {
                if (k<=arr2[j]) {
                    c=arr2.length - j;
                    break;
                }
            }
            System.out.print(c+" ");
            c=0;

        }
    }
}
