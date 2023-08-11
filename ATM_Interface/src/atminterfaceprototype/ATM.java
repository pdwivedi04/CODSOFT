package atminterfaceprototype;
import java.util.Scanner;

public class ATM 
{
	public static Scanner s = new Scanner(System.in);
	public static void main(String args[])
	{
		ATM_Interface ob = new UserAccount();
		boolean boo = true;
		System.out.println("Welcome to the PD Bank");
		while(boo)
		{
			System.out.println("Press 0 for exit\nPress 1 for Withdraw amount\nPress 2 for Deposit amount\nPress 3 for Check Balance");
			int choice = s.nextInt();
			switch (choice)
			{
			case 0:
				System.out.println("Thanks for using the PD Bank");
				boo = false;
				break;
				
			case 1:
				ob.withdraw();
				break;
				
			case 2:
				ob.deposit();
				break;
			case 3:
				ob.checkBalance();
			}
		}
	}

}
