package december_1;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reading_XSLX {

	public static void main(String[] args) throws Exception{
		FileInputStream fin = new FileInputStream("D:\\Learning\\JAVA\\Code\\datadriven2\\src\\main\\java\\december_1\\POI.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fin);
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFRow row = sheet.getRow(1);
		System.out.println(row.getCell(0).getStringCellValue());
		
		CellType a = row.getCell(1).getCellType();
		if(row.getCell(0).getCellType().equals(XSSFCell.CELL_TYPE_STRING)) {
		System.out.println(row.getCell(1).getStringCellValue());
		}
		else
		{
			System.out.println("nope");
		}
		workbook.close();
		
		
	
		
	}
	

}
