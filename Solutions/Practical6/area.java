import java.util.*;
public class area
{
	double a;
	final double pi =3.142;
	public static void main(String []args)
	{
		int c,s,l,b;
		float r;
		Scanner sc = new Scanner(System.in);
		area ob = new area();
		do{
			System.out.println("Enter your choice");
			System.out.println("0. EXIT");
			System.out.println("1. SQUARE");
			System.out.println("2. CIRCLE");
			System.out.println("3. RECTANGLE");
			c =sc.nextInt();
		switch(c)
		{
			case 0:
			break;
		
			case 1:
			{
				System.out.println("Enter the side");
				s=sc.nextInt();
				ob.area(s);
				break;
			}
			case 2:
			{
				System.out.println("Enter the radius");
				r=sc.nextInt();
				ob.area(r);
				break;
			}
			case 3:
			{
				System.out.println("Enter the length");
				l=sc.nextInt();
				System.out.println("Enter the breadth");
				b=sc.nextInt();
				ob.area(l,b);
				break;			
		 	}
			default:
				System.out.println("Please check Yo input");
		}
		
		}while(c!=0);
	}
		void area(int s)
			{
			a=s*s;
			System.out.println("Area is : "+a);
		}
		void area(float r)
		{
			a=pi*r*r;
			System.out.println("Area is : "+a);
		}
		void area(int l,int b)
		{
			a=l*b;
			System.out.println("Area is : "+a);
		}	
	}			
