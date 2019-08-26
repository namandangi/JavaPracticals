import java.util.*;
public class stringFunction
{
    public static void main(String args[])
    {
        String s,s1;
        StringBuffer s2=new StringBuffer();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        s = sc.nextLine();
        StringBuffer ss = new StringBuffer(s);
        String ss1 = new String(s);
        s1 = (s.charAt(0)+"").toUpperCase();
        System.out.println(ss.replace(0,1,s1));

        for(int j=1;j<ss.length();j++)
        {
            if(j%5==0)
            s2 = ss.insert(j,'@');
        }
        System.out.println(s2);
        
        
        String []sSplit = ss1.split("\\s");
        for(int i=0;i<sSplit.length;i++)
        {
            System.out.println(sSplit[i]);
        }
    }
}