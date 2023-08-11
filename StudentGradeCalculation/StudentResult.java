//importing required library.
import java.util.*;

//initializing sub class for Student Grade Calculation.
class StudentGradeCalculation
{

	//initializing instance variables of sub class 'Student Grade Calculation'.
	float submark;
	float totalmarks = 0.0f;
	boolean b = false;

	//initializing instance map variable for sub class 'Student Grade Calculation' which can store data as key-value pair.
	Map<String,Float> map = new LinkedHashMap<>();

	//initializing constructor
	StudentGradeCalculation()

	//Map<String,Float> readData() //it will use if method named 'readData()' will use instead of constructor
								   //the problem, here is for every calculation we need to call this method.
							//to remove this issue we initialize a constructor and read all data once and store it into a instance variable map.
						    // now we can use map variable in every methods without reading data again and again for each method.
		{ 
			//initializing an array list named as 'subList' to store subject names
			ArrayList<String> subList = new ArrayList<String>();
				subList.add("hindi");
				subList.add("english");
				subList.add("math");
				subList.add("physics");
				subList.add("chemistry");
				subList.add("Computer");

			//no need to create obj for scanner class here, bcz we already created 
			//an object in main class so call that reference using main class name

			//Scanner s = new Scanner(System.in);

			//local variable for while loop.
			int i = 0;

			//Map<String,Float> map = new LinkedHashMap<>(); // make it instance so we can share it in all methods

			//while loop for reading data from keyboard
			while (i<6)
				{ 
					System.out.println("Please Enter "+subList.get(i)+" Marks");
					//float submark = s.nextFloat();
					submark = StudentResult.s.nextFloat();
					if (submark<=0 || submark>=100)
					{
						System.out.println("Please enter correct value");
						continue;
					}
					//map= new LinkedHashMap<>(); // already initialized

					//put the data into map variable.
					map.put(subList.get(i),submark);
					i++;
				}

				//return map;
				this.map = map;
		}
	
	//initializing a float return type method for Total Marks Calculation and returning total marks.
	float totalMarksCalculation()
		{
			//float totalmarks = 0.0f;
			for (float f : map.values()) 
			//for (float f : readData().values()) 
				{
					totalmarks+=f;
				}

			return totalmarks;
		}

	//initializing a float return type method for percentage Calculation and returning percentage.
	float percentageCalculation()
		{
			float percentage = ((float)(totalmarks*100)/600);

			return percentage;
		}

	//initializing a boolean return type method for checking each sub marks
	//and if any sub has marks in between 0 and 35 return true value so that we can declare result fail.
	boolean m2()
			{
				//boolean b = false;

				for(Map.Entry<String, Float> entry : map.entrySet())
					{
					if(entry.getValue() >= 0 && entry.getValue()<35)
						{
				
				/*for (float f : map.values()) 
			//for (float f : readData().values()) 
				{
					if (f>=0 && f<35)
						b = true;
						break;

				}
				//if (submark>=0 && submark<35)
					
				*/
							b = true;
							break;
						 }
					}
				return b;	
			}

	//initializing a String return type method for grade Calculation and returning corresponding grade.
	String gradeCalculation(float  g, boolean h)
		{
			g = percentageCalculation();
			h = m2();
			
			if (h ==true)
			{
				return "The result is fail";
			}
			else if (g>= 70 && g<=100)
			{
				return "Distinction, EX";
			}
			else if (g>= 60 && g<=70)
			{
				return "First Class, A";
			}
			else if (g>= 50 && g<=60)
			{
				return "Second Class, B";
			}
			else if (g>= 35 && g<=50)
			{
				return "Third Class, C";
			}
			else
			{
				return "The result is fail";
			}
			
		}

	//initializing a void means non return type method for display all results of a student.
	void resultDisplay()
		{
			//Set<Map.Entry<String, Float> > dataSet = readData().entrySet();
			Set<Map.Entry<String, Float> > dataSet = map.entrySet();


			Iterator itr = dataSet.iterator();

			while(itr.hasNext())
				{
					System.out.println(itr.next());
				}
			
			System.out.println("The total marks is " + totalMarksCalculation());

			System.out.println("The percentage is " + percentageCalculation());

			System.out.println("The grade is " + gradeCalculation(percentageCalculation(), m2()));

		}

}

class StudentResult 
{
	Scanner s = new Scanner(System.in);
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
