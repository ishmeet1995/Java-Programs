package december_1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Creating_XLSX_FILE {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		FileOutputStream file1 = new FileOutputStream(new File("D:\\Learning\\JAVA\\Code\\datadriven2\\src\\main\\java\\december_1\\Workbook.xlsx"));
		workbook.write(file1);
		workbook.close();
			
	}
	
}
