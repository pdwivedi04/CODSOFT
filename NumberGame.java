//importing required libraries.
import java.util.Scanner;
import java.lang.Math;

//creating class for comparing user's guess with the system generated random int number.
class CompareUserGuess
{
	static int randomNum;
	static int userInputNum;
	static int i = 0;
	
	//initializing getRandomNum() method to get the random integer value.
	static int getRandomNum()
		{
		//initializing two variables for given range.
		int maxNum = 3;
		int minNum = 1;
		
		//generating and storing an integer random number into a variable.
		randomNum = (int)(Math.random()*((maxNum-minNum+1)+minNum)); 

		return randomNum;
		}
		
	//initializing getUserInputNum() method to get the integer value input from the user.
	static int getUserInputNum()
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
			
				System.out.println("Guess is correct" + randomNum);
				i=5;
				}
			
			else if ((randomNum>userInputNum)){
			
				System.out.println("Guess is too low" + randomNum);
				}
			
			
			else{
				
				 System.out.println("Guess is too high"+ randomNum);
				 }
		}

	//initializing fiveAttempts() method to run the entire process either upto equal nums or upto 4 more times.
	void fiveAttempts (int userInputNum, int randomNum)
		{
		while (i<4)
			{
				compare(getUserInputNum(),getRandomNum());
				i++;
				//if (userInputNum == randomNum)
				//break;
			}
					
		}

}


class NumberGame
{
	public static void main(String[] args) 
	{
		//creating an object for class CompareUserGuess.
		CompareUserGuess ob = new CompareUserGuess();

		//calling compare() method using object reference variable 'ob'.
		ob.compare(ob.getUserInputNum(),ob.getRandomNum());

		// if nums are not equal then call method fiveAttempts()
		if (ob.userInputNum != ob.randomNum)
			ob.fiveAttempts (ob.userInputNum, ob.randomNum);

        System.out.println("If you want to play again please press 1");
	}
}