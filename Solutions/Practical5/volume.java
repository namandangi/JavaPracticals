import java.util.*;
public class volume
{
	double v;
	final double pi =3.142;
	public static void main(String []args)
	{
		int c,s,l,b,h;
		Scanner sc = new Scanner(System.in);
		volume ob = new volume();
		do{
			System.out.println("Enter your choice");
			System.out.println("0. EXIT");
			System.out.println("1. CUBE");
			System.out.println("2. CUBOID");
			c =sc.nextInt();
		switch(c)
		{
			case 0:
			break;
		
			case 1:
			{
				System.out.println("Enter the side");
				s=sc.nextInt();
				ob.volume(s);
				break;
			}
			case 2:
			{
				System.out.println("Enter the length");
				l=sc.nextInt();
				System.out.println("Enter the breadth");
				b=sc.nextInt();
				System.out.println("Enter the height");
				h=sc.nextInt();
				ob.volume(l,b,h);
				break;			
		 	}
			default:
				System.out.println("Please check your input");
		}
		
		}while(c!=0);
	}
		void volume(int s)
			{
			v=s*s*s;
			System.out.println("volume is : "+v);
		}
		void volume(int l,int b,int h)
		{
			v=l*b*h;
			System.out.println("volume is : "+v);
		}	
	}			
