package dsaclass.recursion;

import java.util.Scanner;

public class ReplaceChar {
    public static String replaceCharofStr(String s,char c1,char c2,int index)
    {
        if(index==s.length())
        return "";
        if(s.charAt(index)==c1)
            return c2+replaceCharofStr(s.substring(1),c1,c2,index);
        return s.charAt(index)+replaceCharofStr(s.substring(1),c1,c2,index);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        char c1=s.next().charAt(0);
        char c2=s.next().charAt(0);
        System.out.println(replaceCharofStr(str,c1,c2,0));
    }
}
