package december_1;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven {

	public static void main(String[] args) throws Exception{
		FileInputStream fin = new FileInputStream("POI_Test_Sheet.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fin);
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFRow row = sheet.getRow(0);
		System.out.println(row);
		workbook.close();
		
		
	
		
	}
	

}
