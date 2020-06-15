/*import java.util.Scanner;
import java.text.DecimalFormat;
public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            DecimalFormat ft = new DecimalFormat("####");
            ft = new DecimalFormat("000"); 
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                System.out.println(s1+"               "+ft.format(x));
            }
            System.out.print("================================");
    }
}

*/
import java.util.Scanner;

public class Solution {

public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");

}
}
