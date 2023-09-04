package scrsdatabase;
import java.io.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.*;
public class CourseDatabase 
{
	public void courseSchedule() throws IOException
	{
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet schedulesheet = wb.createSheet("Schedule");
		//int rownum = 0;
		XSSFRow row; 
		Map<String, Object[]> scheduleData = new TreeMap<String, Object[]>();

		scheduleData.put("1", new Object[] {"Day"+"\" "+"Time", "09:00", "13:00", "17:00" });

		scheduleData.put("2", new Object[] { "Mon", "Core Java", "HTML", "SQL" });

		scheduleData.put("3", new Object[] { "Tue", "Core Java", "SQL", "HTML" });

		scheduleData.put("4", new Object[] { "Wed", "HTML", "SQL", "Core Java" });

		scheduleData.put("5", new Object[] { "Thu", "SQL", "Core Java", "HTML" });

		scheduleData.put("6", new Object[] { "Fri", "Core Java", "SQL", "HTML" });

		Set<String> keyid = scheduleData.keySet();

		int rowid = 0;

		// writing the data into the sheets...

		for (String key : keyid) 
		{
			row = schedulesheet.createRow(rowid++);
			Object[] objectArr = scheduleData.get(key);
			int cellid = 0;

			for (Object obj : objectArr) 
			{
				Cell cell = row.createCell(cellid++);
				cell.setCellValue((String)obj);
			}
		}

    // .xlsx is the format for Excel Sheets...
    // writing the workbook into the file...
		FileOutputStream out = new FileOutputStream(new File("G:/NIT Rourkela/COMPANY/Internship/CodSoft/Student_Course_Registration_System/schedulesheet.xlsx"));

    wb.write(out);
    out.close();
    wb.close();
}


	
	
	
	
	
	public void courseData() throws IOException
	{
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet coursedatasheet = wb.createSheet(" CourseData ");
		XSSFRow row; 
		Scanner s = new Scanner(System.in);
		int rownum = 2;
		Map<String, Object[]> courseData = new TreeMap<String, Object[]>();
		courseData.put("1", new Object[] { "Course Code", "Course Title", "Course Description", "Course Capacity" });
		for (int i = 0; i<3; i++)
		{
			System.out.println("...........Please Enter Course Details..........");
			System.out.println("Please Enter Course Code");
			String cCode = s.nextLine();
			System.out.println("Please Enter Course Title");
			String cTitle = s.nextLine();
			System.out.println("Please Enter Course Description");
			String cDescription = s.nextLine();
			System.out.println("Please Enter Course Capacity");
			int cCapacity = Integer.parseInt(s.nextLine());
			String cc=String.valueOf(cCapacity);
			//System.out.println("Please Enter Course Schedule");
			//String cSchedule = s.nextLine();
			Object[] obj = new Object[] {cCode, cTitle, cDescription, cc };
			String rn=String.valueOf(rownum);
			courseData.put(rn, obj);
			rownum++;
		}


		Set<String> keyid = courseData.keySet();

		int rowid = 0;

		// writing the data into the sheets...

		for (String key : keyid) 
		{
			row = coursedatasheet.createRow(rowid++);
			Object[] objectArr = courseData.get(key);
			int cellid = 0;

			for (Object obj : objectArr) 
			{
				Cell cell = row.createCell(cellid++);
				cell.setCellValue((String)obj);
			}
		}

		FileOutputStream out = new FileOutputStream(new File("G:/NIT Rourkela/COMPANY/Internship/CodSoft/Student_Course_Registration_System/coursedatasheet.xlsx"));

    wb.write(out);
    out.close();
    wb.close();
    s.close();
}
	
}
