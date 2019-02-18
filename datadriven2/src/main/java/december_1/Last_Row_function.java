package december_1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Last_Row_function {

	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("C:\\Users\\ibindra\\Desktop\\POI.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fin);
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFRow row;
		int a = sheet.getLastRowNum();
		System.out.println(a);
		for (int i = 0; i <= a ; i++) {
			row = sheet.getRow(i);
			System.out.println("Name = " + row.getCell(0));
 			System.out.println("Age = "  + row.getCell(1));
		}
		

	}

}
