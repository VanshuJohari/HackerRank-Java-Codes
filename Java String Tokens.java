import java.io.*;
import java.util.*;

public class Solution {
public static ArrayList<String> tokens(String s){
int l = s.length();
char ch;
String temp="";
int tokenLen=0;
ArrayList<String> tokenList = new ArrayList<String>();
for(int i=0;i<l;i++){
ch = s.charAt(i);
if(Character.isLetter(ch))
temp+=ch;
else{
if(temp != ""){
//System.out.println(temp + "added!");
tokenList.add(tokenLen++, temp);
temp = "";
}
}

}
if(temp != "")
tokenList.add(tokenLen++, temp);
return tokenList;
}


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String delims="[ !,?._'@]+";
        //Solution s=new Solution();
        ArrayList<String> str=tokens(s);
        int l=str.size();
        System.out.println(l);
        for(int x=0;x<l;x++)
        System.out.println(str.get(x));
        /*String result[]=s.split(delims);
        System.out.print(result.length);
        for(int i=0;i<(result.length);i++)
        {
            System.out.print("\n"+result[i]);
        }
       // System.out.println(result[result.length]);
        scan.close();*/
    }
}
