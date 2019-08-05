import java.util.*;
class three_one
{
	public static void main(String args[])
	{
		int i,j,k,m,p,n,l,c,s=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("1. 1D ARRAY");
		System.out.println("2. 2D ARRAY");
		c=sc.nextInt();
		switch(c)
		{
			case 1:
			{
				System.out.println("Enter the size of array");
				l=sc.nextInt();
				int a[] = new int[l];
				System.out.println("Display the sum of all numbers");
				for(i=0;i<l;i++)
				{
					System.out.println("Enter a number");
					a[i] = sc.nextInt();
					s+=a[i];
				}
				System.out.println("Sum of all numbers is : "+s);
				break;
			}	
			case 2:
			{
				System.out.println("Array Multiplication");
				System.out.println("Arrays []mxn X []nxp");
				System.out.println("Enter values of m , n and p ");
				m=sc.nextInt();
				n=sc.nextInt();
				p=sc.nextInt();
				int arr1[][] = new int[m][n];
				int arr2[][] = new int[n][p];
				int pr[][] = new int[m][p];
				System.out.println("Enter data for Array 1 column-wise ---> ");
				for(i=0;i<m;i++)
				{
					for(j=0;j<n;j++)
					{
						arr1[i][j] = sc.nextInt();
					}
				}
				
				System.out.println("Enter data for Array 2 column-wise ---> ");
				for(i=0;i<n;i++)
				{
					for(j=0;j<p;j++)
					{
						arr2[i][j] = sc.nextInt();
					}
				}

				for(i=0;i<m;i++)
				{
					for(j=0;j<p;j++)
					{
						for(k=0;k<n;k++)
						{
							pr[i][j]+= arr1[i][k]*arr2[k][j];	
						}
						
					}
				}

				System.out.println("The product of the matrices is :");
				for(i=0;i<m;i++)
				{
					for(j=0;j<p;j++)
					{
						System.out.print(pr[i][j]+"\t");
					}
					System.out.println();
				}

				break;
			}//Case 2 ends here
			
			default:
			System.out.println("Please check your input!");
				
		}//Switch ends here
		
	}//main method ends here

}//class ends here