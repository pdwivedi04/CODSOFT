package registration;
import scrsdatabase.*;

import java.io.IOException;
import java.util.*;
public class StudentRegistration 
{
	void registerStudent() throws IOException
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter Your Name");
		String Name = s.nextLine();
		System.out.println("Please Enter Your id");
		String Id = s.nextLine();
		System.out.println("Please Enter Courses");
		String Course = s.nextLine();
		StudentDatabase sd = new StudentDatabase(Name, Id, Course);
		CourseListing cl = new CourseListing();
		cl.courseList();
		cl.scheduleList();
		sd.studentData();
		s.close();
	}
}
