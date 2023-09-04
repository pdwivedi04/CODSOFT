package scrsdatabase;
import java.io.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.*;
public class StudentDatabase 
{
	String sName, sId, sCourse;
	public StudentDatabase(String Name, String Id, String  Course)
	{
		this.sName = Name;
		this.sId = Id;
		this.sCourse = Course;
	}
	public void studentData() throws IOException
	{
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet studentdatasheet = wb.createSheet(" c ");
		XSSFRow row; 
		Scanner s = new Scanner(System.in);
		int rownum = 2;
		Map<String, Object[]> studentData = new TreeMap<String, Object[]>();
		studentData.put("1", new Object[] { "StudentId", "StudentName", "Registered Courses" });
		
			Object[] obj = new Object[] {sId, sName, sCourse };
			String rn=String.valueOf(rownum);
			studentData.put(rn, obj);
			rownum++;
		

		Set<String> keyid = studentData.keySet();

		int rowid = 0;

		

		for (String key : keyid) 
		{
			row = studentdatasheet.createRow(rowid++);
			Object[] objectArr = studentData.get(key);
			int cellid = 0;

			for (Object ob : objectArr) 
			{
				Cell cell = row.createCell(cellid++);
				cell.setCellValue((String)ob);
			}
		}

    
		FileOutputStream out = new FileOutputStream(new File("G:/NIT Rourkela/COMPANY/Internship/CodSoft/Student_Course_Registration_System/coursedatasheet.xlsx"));

    wb.write(out);
    out.close();
    wb.close();
    s.close();
}
}
