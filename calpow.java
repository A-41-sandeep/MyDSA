package dsaclass.recursion;

import java.util.Scanner;

public class calpow {
    public static int  pow(int x,int n)
    {
        if(n==0) return 1;
        if(x==0) return 0;

        int fact1=pow(x,n-1);
        int fact=x*fact1;
        return fact;

    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int n=s.nextInt();
        int p=1;
        System.out.println(pow(x,n));
    }
}
