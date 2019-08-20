import operator.*;
import java.util.*;

public class calculator
{
	public static void main(String args[])
	{
		int a,b,s=0;
		addition obj = new addition();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		s = obj.add(a,b);
		System.out.println("The sum of "+a+" and "+b+" is : "+s);
	}
}