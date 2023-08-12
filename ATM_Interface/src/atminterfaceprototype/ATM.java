//package for ATM interface application.
package atminterfaceprototype;

//importing required package
import java.util.Scanner;

//ATM class initialization
public class ATM 
{
	//creating public static Scanner object 's' so that we can use it in other locations.
	public static Scanner s = new Scanner(System.in);
	
	//Main method, program execution will start from here.
	public static void main(String args[])
	{
		//printing welcoming message onto the console.
		System.out.println("The PD Bank welcomes you");
		
		//taking some initial amount from user for transactions.
		System.out.println("Please enter some amount for transactions");
		float amount = s.nextFloat();
		
		//creating an object of UserAccount for calling ATM Interface methods.
		//if class has some methods which are not declare in interface will not available here
		ATM_Interface ob = new UserAccount(amount); 
		
		// if you create object using class name than all methods of UserAccount class is available here.
		//UserAccount ob = new UserAccount(amount); 
		
		//assigning boolean variable boo for executing while loop if value of boo is true.
		boolean boo = true;
		
		//while loop start with true initial condition.
		while(boo)
		{
			//Taking user choices for transactions.
			System.out.println("Press 0 for exit\nPress 1 for Withdraw amount\nPress 2 for Deposit amount\nPress 3 for Check Balance");
			int choice = s.nextInt();
			
			//switch cases execution
			switch (choice)
			{
			
			//for exit from while loop by setting boo = false.
			case 0:
				System.out.println("Thanks for using the PD Bank");
				boo = false;
				break;
				
			//calling withdraw method
			case 1:
				ob.withdraw();
				break;
			
			//calling deposit method
			case 2:
				ob.deposit();
				break;
				
			//calling check balance method
			case 3:
				ob.checkBalance();
			}
		}
		
		//disconnecting user input
		s.close();
		
		//System.exit(0);
	}

}
