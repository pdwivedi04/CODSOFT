//package for ATM interface application.
package atminterfaceprototype;
//import java.util.Scanner;

public class UserAccount implements ATM_Interface 
{
	//No need to create object here once created in other class use that object reference using interface.class.obj.
	//public static Scanner s = new Scanner(System.in);
	
	//private float balance = 1100000;
	
	//declaring variables for this class
	private float balance;
	float withdrawAmount;
	float depositAmount;
	
	//pin number for using account verification
	int PinNumber = 1234;
	
	//class constructor to set the balance while creating object
	UserAccount(float amount)    
	{
		this.balance = amount;
	}
	
	//withdraw money method 
	public void withdraw()
	{
		//taking withdraw amount from the user.
		System.out.println("Please Enter the Amount");
		withdrawAmount = atminterfaceprototype.ATM.s.nextFloat();
		
		//condition to check withdraw amount should be greater than 0
		if (withdrawAmount>0)
		{
			//condition for checking sufficient balance in user account
			if (balance>=withdrawAmount)
			{
				//taking user pin for verification
				System.out.println("Enter your pin number");
				int UserPinNumber = atminterfaceprototype.ATM.s.nextInt();
				
				//verifying the user pin, if verified then execute the method.
				if (PinNumber == UserPinNumber)
				{
					System.out.println("Account verified\nTransaction is beeing processed\nPlease wait ....");
					balance -= withdrawAmount;
					System.out.println("Please collect your amount\nTransaction is successful\nDo you want to check your balance ?\nPress 1 for 'YES' and Press 2 for 'NO'.");
					
					//option given to user for checking the balance
					int a = 1;
					int yes = atminterfaceprototype.ATM.s.nextInt();
					if (a == yes)
						System.out.println("Your current balance amount is : " + balance);
				}
				//else block will execute if user pin is invalid.
				else
					System.out.println("Transaction failed...\nInvalid PIN ... Please try again");
			}
			//else block will execute if balance is not sufficient.
			else
			{
				System.out.println("Transaction failed...\nInsuficent Amount\nThanks for using PD Bank");
			}
		}
		//else block will execute if user wrongly enter a negative amount. Entering negative amount not possible in ATM Machine. 
		else
		{
			System.out.println("please enter a valid amount");
		}	
		//atminterfaceprototype.ATM.s.close();
	}
	
	//deposit money method 
	public void deposit()
	{
		//taking deposit amount from the user.
		System.out.println("Please Enter the Amount");
		depositAmount = atminterfaceprototype.ATM.s.nextFloat();
		
		//condition to check deposit amount should be greater than 0
		if (depositAmount>0)
		{
			//taking user pin for verification
			System.out.println("Enter your pin number");
			int UserPinNumber = atminterfaceprototype.ATM.s.nextInt();
			
			//verifying the user pin, if verified then execute the method.
			if (PinNumber == UserPinNumber)
			{
				System.out.println("Account verified\nTransaction is beeing processed\nPlease wait ....");
				balance += depositAmount;
				System.out.println("Transaction is successful\nDo you want to check your balance ?\nPress 1 for 'YES' and Press 2 for 'NO'.");
				
				//option given to user for checking the balance
				int a = 1;
				int yes = atminterfaceprototype.ATM.s.nextInt();
				if (a == yes)
					System.out.println("Your current balance amount is : " + balance);
			}
			//else block will execute if user pin is invalid.
			else
				System.out.println("Transaction failed...\nInvalid PIN ... Please try again");
		}
		//else block will execute if user wrongly enter a negative amount. Entering negative amount not possible in ATM Machine. 
		else
		{
			System.out.println("please enter a valid amount");
		}
		//atminterfaceprototype.ATM.s.close();
		
	}
	
	//check balance method 
	public void checkBalance()
	{
		//taking user pin for verification
		System.out.println("Enter your pin number");
		int UserPinNumber = atminterfaceprototype.ATM.s.nextInt();
		
		//verifying the user pin, if verified then execute the method.
		if (PinNumber == UserPinNumber)
		{
			System.out.println("Account verified\nTransaction is beeing processed\nPlease wait ....");
			System.out.println("Your current balance amount is : " + balance);
		}
		//else block will execute if user pin is invalid.
		else
			System.out.println("Transaction failed...\nInvalid PIN ... Please try again");
	}
	
}
