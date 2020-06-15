import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int n=A.length();
        StringBuffer sb=new StringBuffer(A);
        //String a=sb.reverse();
        String a="";
        char ch=' ';
        for(int i=0;i<n;i++)
        {
            ch=A.charAt(i);
            a=ch+a;
        }
        if(A.equals(a))
        System.out.println("Yes");
        else
        System.out.println("No");
        
    }
}



