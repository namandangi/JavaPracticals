import java.util.*;
public class one_two
{
	public static void main(String args[])
	{
		int s=0;
		if(args.length!=0)
		{
			for(int i=0;i<args.length;i++)
			{
				System.out.println("The elements are :"+args[i]);
				s+=Integer.parseInt(args[i]);
			}
			System.out.println("The sum is :"+s);
		}
	}
}

