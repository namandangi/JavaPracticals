import java.util.*;
class one_three
{
	public static void main(String[] args)
	{
		int a,b,c;
		double s1=0,s2=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Equation : ax^2+bx+c");
		System.out.println("Enter a,b,c");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if((b*b-4*a*c)<0)
		System.out.println("No real solution");
		else
		{
			s1=(-b+Math.sqrt((b*b)-4*a*c))/(2*a);
			s2=(-b-Math.sqrt((b*b)-4*a*c))/(2*a);
			System.out.println("The first root is :"+s1);
			System.out.println("The second root is :"+s2);
		}
	}
}
