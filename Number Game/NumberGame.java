//importing required libraries.
import java.util.Scanner;
import java.lang.Math;


/*
//creating class for comparing user's guess with the system generated random int number.
class CompareUserGuess
{
	static int randomNum;
	static int userInputNum;
	static int i = 0;
	static int j=5;
	
	//initializing getRandomNum() method to get the random integer value.
	int getRandomNum()
		{
		//initializing two variables for given range.
		int maxNum = 3;
		int minNum = 1;
		
		//generating and storing an integer random number into a variable.
		randomNum = (int)(Math.random()*((maxNum-minNum+1)+minNum)); 

		return randomNum;
		}
		
	//initializing getUserInputNum() method to get the integer value input from the user.
	int getUserInputNum()
		{
		//creating scanner class object.
		Scanner s = new Scanner(System.in);

		//printing a messege on user's screen.
		System.out.println("Please enter an integer number in between 1 to 3");

		//taking user's input as guess 
		userInputNum = s.nextInt();

		//using while loop for repeating the process if user enter an invalid number and asking to re-enter a valid number.
		while (userInputNum<1 || userInputNum>100)
		{
			System.out.println("Please enter a valid integer number in between 1 to 3");
			userInputNum = s.nextInt();
		}

		return userInputNum;

		}

	//initializing compare() method to check the equality on numbers.
	void compare(int userInputNum, int randomNum)
		{
			if (userInputNum == randomNum){
			
				System.out.println("Guess is correct " + "\nYour score is : "+ (j)+"/5");
				i=5;

				}
			
			else if ((randomNum>userInputNum)){
			
				System.out.println("Guess is too low ");
				}
			
			
			else{
				
				 System.out.println("Guess is too high ");
				 }
		}

	//initializing fiveAttempts() method to run the entire process either upto equal nums or upto 4 more times.
	void fiveAttempts (int userInputNum, int randomNum)
		{
		
		while (i<4 /*&& userInputNum != randomNum)*/
			/*{
				j--;
				compare(getUserInputNum(),getRandomNum());
				i++;
				
				//if (userInputNum == randomNum)
				//break;
			}
		
		/*System.out.println("For play again please press 1 \n For exit please press 2");
		Scanner s = new Scanner(System.in);
		int choice = s.nextInt();
		switch(choice)
			{
				case 1:
					playAgain();
						
				case 2:
					System.out.println("EXIT");
					break;

			}
			*/
			
					
/*		}

	void playAgain(int j)
		{
		this.j = j;
			compare(getUserInputNum(),getRandomNum());
			//if (userInputNum != randomNum)
				//fiveAttempts (userInputNum, randomNum);
		}
		

}


class NumberGame
{
	public static void main(String[] args) 
	{
		//creating an object for class CompareUserGuess.
		CompareUserGuess ob = new CompareUserGuess();
		boolean b;
		String ply;
		Scanner sc = new Scanner(System.in);

		do
		{
		

		//calling compare() method using object reference variable 'ob'.
		ob.compare(ob.getUserInputNum(),ob.getRandomNum());

		// if nums are not equal then call method fiveAttempts()
		if (ob.userInputNum != ob.randomNum)
			ob.fiveAttempts (ob.userInputNum, ob.randomNum);
		System.out.println("For play again please press Y \n For exit please press N");
		ply = sc.nextLine();
		String chY = "Y";
		String chN = "N";
		if (ply==chY)
		{
			b = true;
		}
		if (ply==chN)
 		{
			b = false;
		}
		}
		while (b);

        //System.out.println("Your score is 0/5");
		//System.out.println("If you want to play again please press 1");

		/*System.out.println("For play again please press 1 \n For exit please press 2");
		Scanner s = new Scanner(System.in);
		int choice = s.nextInt();
		switch(choice)
			{
				case 1:
					int i=0;
					int j=5;
					while(i<5)
						{
							ob.playAgain(j);
							i++;
							j--;
							break;
							
						}
						break;
				case 2:
					System.out.println("EXIT");
					break;

			}
			
	}
}
*/




class GuessNumber
{
	

	//creating scanner class object.
	Scanner s = new Scanner(System.in);

	//initializing getRandomNum() method to get the random integer value.
	int getRandomNum()
		{
			//initializing two variables for given range.
			int maxNum = 3;
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
			System.out.println("Please enter an integer number in between 1 to 3");

			//taking user's input as guess 
			userInputNum = s.nextInt();

			//using while loop for repeating the process if user enter an invalid number and asking to re-enter a valid number.
			while (userInputNum<1 || userInputNum>100)
			{
				System.out.println("Please enter a valid integer number in between 1 to 3");
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

class NumberGame
{
	public static void main(String[] args) 
	{
		GuessNumber ob = new GuessNumber();
		ob.playGame();
	}
}