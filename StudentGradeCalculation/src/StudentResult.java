import java.util.*;
public class StudentResult 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		boolean boo = false;
		//Scanner s = new Scanner(System.in);
		do
		{
			StudentGradeCalculation ob = new StudentGradeCalculation();
			ob.resultDisplay();
			System.out.println("If you want to calculate other student's result press 1 otherwise press 2 to quit the calculation");
			int t = s.nextInt();
			int f =1;
			boo = (t == f);
			
		}
		while (boo);
		//ob.resultDisplay();
		//System.out.println("Hello World!");

	}

}
