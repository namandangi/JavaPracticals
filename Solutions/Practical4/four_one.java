import java.util.*;
class Studentlib
{
	String name;
	int AccNo;
	int No;
	int fine;
	int days;
	Scanner sc = new Scanner(System.in);
	public void Info()
	{
		System.out.println("Enter Student's Name, 3 digit Account No. : ");
		name = sc.next();
		AccNo = sc.nextInt();
	}
	public void Issue()
	{
		if(No==3)
			System.out.println("Max No. of books issued");
		else
			No++;
	}
	public void Return()
	{
		No--;
		System.out.println("Enter no. of days after which you are returning the book : ");
		days = sc.nextInt();
	}
	public void Chargefine()
	{
		if(days<7)
			System.out.println("Your fine is : Rs.0");
		else
		{
			fine = (days-7)*10;
			if(fine<=500)
				System.out.println("Your fine is : Rs."+fine);
			else
				System.out.println("Your fine is : Rs.500");
	
		}
	}
}
public class four_one 
{
	public static void main(String args[])
	{
	Studentlib s1 = new Studentlib();
	Studentlib s2 = new Studentlib();
	Studentlib s3 = new Studentlib();
	s1.Info();
	s2.Info();
	s3.Info();
	int UserNo,choice;
	int counter=0;
	Scanner sc = new Scanner(System.in);
		do
		{
		System.out.println("Main Menu \n 1.Issue \n 2.Return \n 3.Charge fine \n 4.Exit ");
		choice = sc.nextInt();
		System.out.println("Enter your 3 Account Number :");
		UserNo = sc.nextInt();
		if(UserNo==s1.AccNo)
			counter=1;
		else if(UserNo==s2.AccNo)
			counter=2;
		else if(UserNo==s3.AccNo)
			counter=3;
		else
		{	System.out.println("Your Account no is not in database please enter correctly");
			counter=0;
		}
		switch(counter)
		{
		case 0:
			break;
		case 1:
			switch(choice)
			{
			case 1:
				s1.Issue();
				break;
			case 2:
				s1.Return();
				break;
			case 3:
				s1.Chargefine();
				break;
			}
			break;
		case 2:
			switch(choice)
			{
			case 1:
				s2.Issue();
				break;
			case 2:
				s2.Return();
				break;
			case 3:
				s2.Chargefine();
				break;
			}
			break;
		case 3:
			switch(choice)
			{
			case 1:
				s3.Issue();
				break;
			case 2:
				s3.Return();
				break;
			case 3:
				s3.Chargefine();
				break;
			}
			break;
		}
		}while(choice!=4);
	}
}
