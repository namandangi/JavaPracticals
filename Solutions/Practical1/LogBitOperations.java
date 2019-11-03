import java.util.*;
public class LogBitOperations 
{
	public static void main(String args[])
	{
		System.out.println("\n Enter three no.s :");
		Scanner sc = new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("\n The greatest of all is :");
		if(a>=b && b>=c)
			System.out.println(a);
		else if(b>=c && b>=a)
			System.out.println(b);
		else
			System.out.println(c);
		
		if(a==b || b==c || c==a)
			System.out.println("\n All numbers are not unique ");
		else if(a!=b || b!=c || c!=a)
			System.out.println("\n All numbers are unique ");
		else
			System.out.println("\n All numbers are equal");
		
		System.out.println("\n Enter two no.s x and y : ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		System.out.println("\n The AND of x and y is:");
		System.out.println(x&y);
		System.out.println("\n The OR of x and y is:");
		System.out.println(x|y);
		System.out.println("\n The EX-OR of x and y is:");
		System.out.println(x^y);
	
	}
}
