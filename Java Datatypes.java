import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                long l1=(long)Math.pow(-2,63);
                long l2=(long)Math.pow(2,63);
                //long l2=9223372036854775807;
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)
                System.out.println("* byte");
                if(x>=-32768 && x<=32767)
                System.out.println("* short");
                if(x>=-2147483648 && x<=2147483647)
                System.out.println("* int");
                if(x>=l1 && x<=l2)
                System.out.println("* long");
                
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}



