import java.util.*;
class one_one
{
	public static void main(String args[])
	{
		int a,b,c,r;
		float re;
		Scanner sc = new Scanner(System.in);
		System.out.print("\tEnter the value of a : \n\t");
		a = sc.nextInt();
		System.out.print("\tEnter the value of b : \n\t");
		b = sc.nextInt();
		do
		{
		System.out.println("\tEnter your choice : \t");
		System.out.println("\t0. EXIT");
		System.out.println("\t1. ADDITION");
		System.out.println("\t2. SUBTRACTION");
		System.out.println("\t3. MULTIPLICATION");
		System.out.print("\t4. DIVISION\n\t");
		c = sc.nextInt();
			switch(c)
			{
				case 0:break;
				case 1:
				{
					System.out.println("\tThe sum is : "+(a+b));
					break;
				}
				case 2:
				{
					System.out.println("\tThe result is : "+(a-b));
					break;
				}
				case 3:
				{
					System.out.println("\tThe product is : "+(a*b));
					break;
				}
				case 4:
				{
					if(b!=0)
					System.out.println("\tThe sum is : "+(a/b));
					else
					System.out.println("Dividing by zero is invalid.");
					break;
				}
				default:
				System.out.println("\tPlease check your input");
			}
		}while(c!=0);
	}
}