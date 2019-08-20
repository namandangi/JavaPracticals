import java.util.*;
class greatViaObjs
{
	int a,b;
	greatViaObjs()
	{
		a = 0;
		b = 0;
	}
	int greater(greatViaObjs o)
	{
		if (o.a>o.b)
		return o.a;
		else 
		return o.b;
	}
	
public static void main(String[] args)
	{
		int g;
		greatViaObjs ob1 = new greatViaObjs();		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two no to find out the greatest ");
		ob1.a = sc.nextInt();
		ob1.b = sc.nextInt();
		g = ob1.greater(ob1);
		System.out.println("The greater number is : "+g);
	}
}
