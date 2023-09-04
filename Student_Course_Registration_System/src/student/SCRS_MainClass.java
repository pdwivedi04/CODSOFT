package student;

import java.io.IOException;

import registration.CourseListing;
import scrsdatabase.*;
public class SCRS_MainClass {

	public static void main(String[] args) throws IOException 
	{
		CourseDatabase CD = new CourseDatabase();
		CourseListing CL = new CourseListing();
		CD.courseData();
		CL.courseList();
		
	}

}
