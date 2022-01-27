package dsaclass;

import java.util.Scanner;

public class Lexicographical {
    public static void lexic(int start,int end)
    {
        if(start>end)
            return;
        System.out.println(start);
        int i=0;
        if(start==0)
            i=1;
        while(i<10) {
            lexic(10 * start + i, end);
            i++;
        }
    }

    public static void main(String[] args) {
        lexic(0,100);
    }
}
