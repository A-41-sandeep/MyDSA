package dsaclass.recursion;

import java.util.Scanner;

public class StringtoNUmber {
    public static int stringToNum(String s,int ans) {
        if (s.length() == 0)
            return ans;
        ans=ans*10 + Integer.parseInt(s.substring(0, 1));
        return  stringToNum(s.substring(1),ans);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        int ans=stringToNum(str,0);
        System.out.println(ans);
    }
}
