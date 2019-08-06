import java.util.*;
public class two_2
{
	public static void main(String[] args)
	{
		float x,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("sinx :x-x^3/3!+x^5/5!....");
		System.out.println("Enter value of x in radians");
		x=sc.nextFloat();
		r=x-(x*x*x)/6+(x*x*x*x*x)/120-(x*x*x*x*x*x*x)/5040;
		System.out.println("Sin("+x+") = "+r);
	}
}

//FYI 30 degrees in radians is approximately 0.5236666666