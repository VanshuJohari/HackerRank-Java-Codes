import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int s=0,s1=0;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            s1=0;
            for(int x=0;x<n;x++)
            {
                s=(((int)Math.pow(2,x))*b);
                if(x==0)
                {
                    s1=s1+a+s;
                }
                else
                s1+=s;
                System.out.print(s1+" ");

            }
            System.out.println();
        }
        in.close();
    }
}

