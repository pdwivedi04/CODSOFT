package registration;
import java.util.*;
import java.io.*;
//import org.apache.poi.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class CourseListing 
{
	public void courseList() throws IOException
	{
		try
        {
            FileInputStream file = new FileInputStream(new File("coursedatasheet.xlsx"));
 
            //Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook wb_cds = new XSSFWorkbook(file);
 
            //Get first/desired sheet from the workbook
            XSSFSheet sheet = wb_cds.getSheetAt(0);
 
            //Iterate through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) 
            {
                Row row = rowIterator.next();
                //For each row, iterate through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();
                 
                while (cellIterator.hasNext()) 
                {
                    Cell cell = cellIterator.next();
                    //Check the cell type and format accordingly
                    switch (cell.getCellType()) 
                    {
                        case NUMERIC:
                            System.out.print(cell.getNumericCellValue() +" "+"\t");
                            break;
                        case STRING:
                            System.out.print(cell.getStringCellValue() +" "+"\t");
                            break;
					default:
						break;
                    }
                }
                System.out.println("");
            }
            file.close();
            wb_cds.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
	}
	
	
	
	public void scheduleList() throws IOException
	{
		try
        {
            FileInputStream file = new FileInputStream(new File("schedulesheet.xlsx"));
 
            //Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook wb_ss = new XSSFWorkbook(file);
 
            //Get first/desired sheet from the workbook
            XSSFSheet sheet = wb_ss.getSheetAt(0);
 
            //Iterate through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) 
            {
                Row row = rowIterator.next();
                //For each row, iterate through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();
                 
                while (cellIterator.hasNext()) 
                {
                    Cell cell = cellIterator.next();
                    //Check the cell type and format accordingly
                    switch (cell.getCellType()) 
                    {
                        case NUMERIC:
                            System.out.print(cell.getNumericCellValue() +" "+"\t");
                            break;
                        case STRING:
                            System.out.print(cell.getStringCellValue() +" "+"\t");
                            break;
					default:
						break;
                    }
                }
                System.out.println("");
            }
            file.close();
            wb_ss.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
	
	}
	
}






