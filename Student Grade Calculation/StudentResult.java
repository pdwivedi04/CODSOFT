import java.util.*;
class StudentGradeCalculation
{
	float submark;
	boolean b = false;
	Map<String,Float> map = new LinkedHashMap<>();
	StudentGradeCalculation()
	//Map<String,Float> readData()
		{ 
			ArrayList<String> subList = new ArrayList<String>();
				subList.add("hindi");
				subList.add("english");
				subList.add("math");
				subList.add("physics");
				subList.add("chemistry");
				subList.add("Computer");
			Scanner s = new Scanner(System.in);
			int i = 0;
			//Map<String,Float> map = new LinkedHashMap<>();
			while (i<6)
				{ 
					System.out.println("Please Enter "+subList.get(i)+" Marks");
					//float submark = s.nextFloat();
					submark = s.nextFloat();
					if (submark<=0 || submark>=100)
					{
						System.out.println("Please enter correct value");
						continue;
					}
					//map= new LinkedHashMap<>();
					map.put(subList.get(i),submark);
					i++;
				}

				//return map;
				this.map = map;
		}

	float totalMarksCalculation()
		{
			float totalmarks = 0.0f;
			for (float f : map.values()) 
			//for (float f : readData().values()) 
				{
					totalmarks+=f;
				}

			return totalmarks;
		}

	float percentageCalculation()
		{
			float percentage = ((float)(totalMarksCalculation()*100)/600);

			return percentage;
		}

	boolean m2()
			{
				//boolean b = false;
				
				if (submark>=0 && submark<35)
					b = true;
				return b;	
			}

	String gradeCalculation(float  g, boolean h)
		{
			g = percentageCalculation();
			h = m2();
			
			if (h ==true)
			{
				return "fail";
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
				return "Fail";
			}
			
		}

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
	public static void main(String[] args) 
	{
		StudentGradeCalculation ob = new StudentGradeCalculation();
		ob.resultDisplay();
		//System.out.println("Hello World!");
	}
}
