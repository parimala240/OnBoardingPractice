package Utills;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Hashtable;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.log4j.Logger;
import org.testng.SkipException;

public class TestUtil {

	//public static Logger APPLICATION_LOGS = Logger.getLogger(TestUtil.class);

	// Function to check is Test Executable or not
	public static boolean isExecutable(Xls_Reader xlsfile, String sheet,String testName) {
		try {
			for (int rowNum = 2; rowNum<= xlsfile.getRowCount(sheet); rowNum++) {
				if (xlsfile.getCellData(sheet, "TCID", rowNum).equals(testName)) {
					if (xlsfile.getCellData(sheet, "Runmode", rowNum).equalsIgnoreCase("yes"))
						return true;
					else
						return false;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	// Function to to check the RunMode of Test
	public static void checkRunMode(String sheetName, String testName) {
		Xls_Reader xls = new Xls_Reader(Constants.TEST_DATA_FILE, sheetName);

		if (!TestUtil.isExecutable(xls, sheetName, testName))
			throw new SkipException("Test not found");
	}

	// Function to get Test Data form Excel File for a particular Test case
	public static Object[][] getData(String sheetName, String testName) throws IOException {

		//Excel xlsData = new Xls_Reader(Constants.TEST_DATA_FILE, sheetName);
		FileInputStream fs = new FileInputStream(Constants.TEST_DATA_FILE);
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		Object[][] data = null;
		Sheet sheet1 = wb.getSheet(sheetName);
		Hashtable<String, String>datatable = null;	

		if(testName !=null && !testName.isEmpty()) {
			int testStartRow = -1;
			data = new Object [1] [1];
			// To find the Row Number from where our Test is being start
			for (int rNum = 1; rNum<= sheet1. getPhysicalNumberOfRows(); rNum++) {
				if (sheet1.getRow(rNum).getCell(1).getStringCellValue().equalsIgnoreCase(testName)) {
					testStartRow = rNum;
					//APPLICATION_LOGS.debug("Test Case " + testName+ " starts from Row Number " + testStartRow + "in sheet" + sheetName);
					break;
				}
			}			
			if (testStartRow >= 0){
				datatable = new Hashtable<String, String>();
				datatable.put("SheetName", sheetName);
				for(int col = 0; col <= sheet1.getRow(testStartRow).getLastCellNum(); col++) {
					datatable.put(sheet1.getRow(0).getCell(col).getStringCellValue(), sheet1.getRow(testStartRow).getCell(col).getStringCellValue());
					System.out.print(sheet1.getRow(0).getCell(col).getStringCellValue()+"      "+sheet1.getRow(testStartRow).getCell(col).getStringCellValue());
					
				}
				/* It will put the Data into the Table for Each row and then 
				 * put the table inside the Two dimensional Array*/
				
				data[0][0]=datatable;
			}
			else {
				//APPLICATION_LOGS.error("Data is not provided properly");
			}			
		}
		//if Test case is not provided
		else {
			int totalRows = sheet1. getPhysicalNumberOfRows();
			int dataIndex =0;	
			data = new Object [totalRows-1][1];
			
			for (int rNum = 2; rNum<= totalRows; rNum++) {
				datatable = new Hashtable<String, String>();
				datatable.put("SheetName", sheetName);
				for(int col = 0; col <= sheet1.getRow(rNum).getLastCellNum(); col++) {
					datatable.put(sheet1.getRow(0).getCell(col).getStringCellValue(), sheet1.getRow(rNum).getCell(col).getStringCellValue());
					System.out.print(sheet1.getRow(0).getCell(col).getStringCellValue());
				}
				System.out.println("");
				data[dataIndex][0]=datatable;
				dataIndex++;
			}
			
		}
		return data;
	}
}
