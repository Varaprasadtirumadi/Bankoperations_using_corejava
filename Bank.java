package user;
import java.util.Scanner;
import RBI.R;
import RBI.SBI.Sbi;
class User extends R implements Sbi
{	
	static Scanner sc = new Scanner(System.in);
	static int amount = 1000;
	static int cibil=780;
	public void deposit()
	{
		System.out.println("Enter amount");
		int a = sc.nextInt();
		amount = amount + a;
		System.out.println("Amount has been created into your account and available balance is: "+amount);
	}

	public void withdraw()
	{
		System.out.println("Enter amount");
		int a = sc.nextInt();
		amount = amount - a;
		System.out.println("Amount has been debited into your account and available balance is: "+amount);
	}
	
	public void checkbalance()
	{
		System.out.println("Enter your account number");
		int a = sc.nextInt();
		if(a==accNum)
		{
			System.out.println("Available balance is: "+amount);
		}
		else
		{
			System.out.println("Invalid Account number");
		}
	}
	public void loan()
	{
		System.out.println("Do you want to take loan enter\n1.Personal Loan\n2.car Loan\n3.home Loan");
		
		int a = sc.nextInt();
		if(a==1)
		{
			if(cibil>750)
			{
				System.out.println("Your pre approved loan amount is 500000/-");
				System.out.println("Enter amount do you want");
				int b=sc.nextInt();
				int r;
				System.out.println("Enter 1.one year plan\nEnter 2.two years plan\nEnter 3.three years plan");
				switch(sc.nextInt())
				{
					case 1:
						System.out.println("rate of interest for one year plan is 7%");
						r=500*50;
						System.out.println("Monthly interest amount is "+r);
						break;
					case 2:
						System.out.println("rate of interest for two years plan is 14%");
						break;
					case 3:
						System.out.println("rate of interest for three years plan is 27%");
						break;
				}
			}
			else
			{
				System.out.println("Your pre approved loan amount is 200000/-");
				System.out.println("Enter 1.one year\nEnter 2.two years\nEnter 3.three years");
				switch(sc.nextInt())
				{
					case 1:
						System.out.println("rate of interest for one year plan is 10%");
						break;
					case 2:
						System.out.println("rate of interest for two years plan is 20%");
						break;
					case 3:
						System.out.println("rate of interest for three years plan is 35%");
						break;
				}
			}
		}
		else if(a==2)
		{
			if(cibil>=750)
			{
				System.out.println("Your pre approved loan amount is 500000/-");
				System.out.println("Enter 1.one year\nEnter 2.two years\nEnter 3.three years");
				switch(sc.nextInt())
				{
					case 1:
						System.out.println("rate of interest for one year plan is 7%");
						break;
					case 2:
						System.out.println("rate of interest for two years plan is 14%");
						break;
					case 3:
						System.out.println("rate of interest for three years plan is 27%");
						break;
				}
			}
			else
			{
				System.out.println("Your pre approved loan amount is 200000/-");
				System.out.println("Enter 1.one year\nEnter 2.two years\nEnter 3.three years");
				switch(sc.nextInt())
				{
					case 1:
						System.out.println("rate of interest for one year plan is 10%");
						break;
					case 2:
						System.out.println("rate of interest for two years plan is 20%");
						break;
					case 3:
						System.out.println("rate of interest for three years plan is 35%");
						break;
				}
			}
		}
		else
		{
			if(cibil>700)
			{
				System.out.println("Your pre approved loan amount is 500000/-");
				System.out.println("Enter 1.one year\nEnter 2.two years\nEnter 3.three years");
				switch(sc.nextInt())
				{
					case 1:
						System.out.println("rate of interest for one year plan is 7%");
						break;
					case 2:
						System.out.println("rate of interest for two years plan is 14%");
						break;
					case 3:
						System.out.println("rate of interest for three years plan is 27%");
						break;
				}
			}
			else
			{
				System.out.println("Your pre approved loan amount is 200000/-");
				System.out.println("Enter 1.one year\nEnter 2.two years\nEnter 3.three years");
				switch(sc.nextInt())
				{
					case 1:
						System.out.println("rate of interest for one year plan is 10%");
						System.out.println("Monthly interst for the loan is");
						break;
					case 2:
						System.out.println("rate of interest for two years plan is 20%");
						break;
					case 3:
						System.out.println("rate of interest for three years plan is 35%");
						break;
				}
			}
		}
	}

	public void sbi()
	{
		System.out.println("Enter 1 for proceed to you old customer\nEnter 2 for opening new Account");
		long a = sc.nextLong();
		if(a==1)
		{
			System.out.println("Enter your Account number");
			a = sc.nextLong();
			if(a==accNum)
			{
				System.out.println("Your Account number is Matched");
			}
			else
			{
				System.out.println("Account number is wrong");
			}
		}
		else
		{
			System.out.println("Enter your name");
			String name = sc.next();
			System.out.println("Enter your phone number");
			long phno = sc.nextLong();
			System.out.println("Your account number is created and the number is 3423456");
		}
	}
	public void icici()
	{
	System.out.println("icici");
	}
	public void yesbank()
	{
	System.out.println("yesbank");
	}
	public static void main(String[] args)
	{
		System.out.println("Welcome to Banking Domain");
		System.out.println("Choose Bank you Want to Do Banking");
		System.out.println("1.SBI\n2.ICICI\n3.YESBANK");
		System.out.println("Enter a Number to select bank");
		int a = sc.nextInt();
		User obj = new User();
		switch(a)
		{
			case 1:
					obj.sbi();
					System.out.println("Select the following operations");
					System.out.println("1.Deposit\n2.withdraw\n3.checkBalance\n4.loan");
					a=sc.nextInt();
					if(a==1)
					{
						obj.deposit();
					}
					else if(a==2)
					{
						obj.withdraw();
					}
					else if(a==3)
					{
						obj.checkbalance();
					}
					else if(a==4)
					{
						obj.loan();
					}
					break;
			case 2:
					obj.icici();
					break;
			case 3:
					obj.yesbank();
					break;
			default:
					System.out.println("Invalid");
		}
	}
}