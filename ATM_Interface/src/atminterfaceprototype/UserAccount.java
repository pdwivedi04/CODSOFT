package atminterfaceprototype;
import java.util.Scanner;

public class UserAccount implements ATM_Interface 
{
	public Scanner s = new Scanner(System.in);
	
	private float balance = 1100000;
	float withdrawAmount;
	float depositAmount;
	int PinNumber = 1234;
	/*
	UserAccount()
	{
		this.balance = balance;
		this.withdrawAmount = withdrawAmount;
		this.depositAmount = depositAmount;
	}
	*/
	
	public void withdraw()
	{
		System.out.println("Please Enter the Amount");
		withdrawAmount = s.nextFloat();
		if (withdrawAmount>0)
		{
			if (balance>=withdrawAmount)
			{
				System.out.println("Enter your pin number");
				int UserPinNumber = s.nextInt();
				if (PinNumber == UserPinNumber)
				{
					balance -= withdrawAmount;
					System.out.println("Transaction is beeing processed\nPlease wait ....\nTransaction is successful\nPlease collect your amount\nDo you want to check your balance ?\nPress 1 for 'YES' and Press 2 for 'NO'.");
					int a = 1;
					int yes = s.nextInt();
					if (a == yes)
						System.out.println("Your current balance amount is : " + balance);
				}
				else
					System.out.println("Transaction failed...\nInvalid PIN ... Please try again");
			}
			else
			{
				System.out.println("Transaction failed...\nInsuficent Amount\nThanks for using PD Bank");
			}
		}
		else
		{
			System.out.println("please enter a valid amount");
		}	
	}
	
	public void deposit()
	{
		System.out.println("Please Enter the Amount");
		depositAmount = s.nextFloat();
		if (depositAmount>0)
		{
			System.out.println("Enter your pin number");
			int UserPinNumber = s.nextInt();
			if (PinNumber == UserPinNumber)
			{
					balance += depositAmount;
					System.out.println("Transaction is beeing processed\nPlease wait ....\nTransaction is successful\nDo you want to check your balance ?\nPress 1 for 'YES' and Press 2 for 'NO'.");
					int a = 1;
					int yes = s.nextInt();
					if (a == yes)
						System.out.println("Your current balance amount is : " + balance);
			}
			else
				System.out.println("Transaction failed...\nInvalid PIN ... Please try again");
		}
		else
		{
			System.out.println("please enter a valid amount");
		}
		
	}
	
	public void checkBalance()
	{
		System.out.println("Enter your pin number");
		int UserPinNumber = s.nextInt();
		if (PinNumber == UserPinNumber)
			System.out.println("Your current balance amount is : " + balance);
		else
			System.out.println("Transaction failed...\nInvalid PIN ... Please try again");
	}

}
