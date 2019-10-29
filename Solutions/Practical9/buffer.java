import java.util.*;
import java.io.*;
 public class buffer
{
    public static void main(String args[])  throws Exception
    {
        int c=0;
        String s;        
        String lastName = new String();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your First Name : ");
        s = br.readLine();
        System.out.println("Enter your Last Name : ");
        lastName = br.readLine();
        String firstName = new String(s);
        StringBuffer sb = new StringBuffer(s);
        //String strObj = new String(firstName);
        System.out.println("Hello "+firstName.concat(lastName)); //String Concat : To join first name and last name
        System.out.println(sb.reverse());
        // for(int i=0;i<=s.length()-1;i++)
        // {
        //     if(firstName.charAt(i)!=firstName.charAt(strObj.length()-1-i))  //To check for palindrome function
        //         c++;
        // }
        // if(c==0)
        // System.out.println(firstName+" is a palindrome");
        // else
        // System.out.println(firstName+" is not a palindrome");
        if(sb.reverse().toString().equals(s))    //To check for palindrome function
        System.out.println(sb +" is Palindrome");
        else 
        System.out.println(sb.reverse() +" is not a Palindrome");
    }
}