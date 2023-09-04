//importing required libraries.
import java.util.Scanner;
import java.lang.Math;

public class GuessNumber 
{
	//creating scanner class object.
		Scanner s = new Scanner(System.in);

		//initializing getRandomNum() method to get the random integer value.
		int getRandomNum()
			{
				//initializing two variables for given range.
				int maxNum = 100;
				int minNum = 1;
				int randomNum;
			
				//generating and storing an integer random number into a variable.
				randomNum = (int)(Math.random()*((maxNum-minNum+1)+minNum)); 

				return randomNum;
			}

		//initializing getUserInputNum() method to get the integer value input from the user.
		int getUserInputNum()
			{
				int userInputNum;

				//printing a messege on user's screen.
				System.out.println("Please enter an integer number in between 1 to 100");

				//taking user's input as guess 
				userInputNum = s.nextInt();

				//using while loop for repeating the process if user enter an invalid number and asking to re-enter a valid number.
				while (userInputNum<1 || userInputNum>100)
				{
					System.out.println("Please enter a valid integer number in between 1 to 100");
					userInputNum = s.nextInt();
				}

				return userInputNum;

			}

		void compareNums()
		{
			System.out.println("How many times you want to guess the number ?");
			int k = s.nextInt();

			
			for (int i = 0; i<k; i++)
			{
				int a = getRandomNum();
				int b = getUserInputNum();

				if (a == b)
					{
						System.out.println("Guess is correct " + "\nYour score is : "+ (k-i)+"/"+k);
						break;
					}
				
				else if (a>b)
					{
						System.out.println("Guess is too low ");
						//System.out.println("Your score is : 0/5");
					}
				
				else
					{
						System.out.println("Guess is too high ");
						//System.out.println("Your score is : 0/5");
					}

				if (i==(k-1) && a != b)
					{
						//System.out.println("Guess is too high ");
						System.out.println("Your score is : 0/"+k);
					}
				
			}
			
			
		}

		void playGame()
		{
			boolean boo = false;
			do
			{
				
				compareNums();
				
				System.out.println("For play again please press 1 \nFor exit please press 2");
				int y = 1;
				int d = s.nextInt();
				boo = (y == d);

				//boo = s.nextBoolean();

				//Scanner sc = new Scanner(System.in);
				//String d = sc.nextLine();
				//String d = s.nextLine();
				//boo = d.equalsIgnoreCase("YES");
				

			}
			while (boo);
		}
}
