import java.util.*;
public class two_1
{
	public static void main(String[] args)
	{
		int n,n1,i,j,k;
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		n=sc.nextInt();
		n1=n;
		System.out.println("THE PATTERN IS ----->");
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			for(k=i;k<=n;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println("");
		}
		for(i=1;i<=n;i++)
		{
			for(k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			n1=n-i+1;
			for(j=1;j<=i;j++)
			{
				System.out.print(n1+" ");
				n1++;
			}
			System.out.println();
		}
	}
}
