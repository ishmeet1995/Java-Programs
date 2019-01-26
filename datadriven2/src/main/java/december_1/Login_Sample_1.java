// This just gets the value statically from a row. It needs to know the position of the UserName and Password columns

package december_1;


import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Sample_1 {
	static FileInputStream fin;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static XSSFRow row;
	static XSSFCell cell;
	WebDriver driver;
	static int password_pos;
	static int username_pos;
	@SuppressWarnings("deprecation")
	
	public int find_password_pos() {
		String get_val;
		boolean found = false;
		int i= 0;
		while(!found) {
			
			CellType cellType = null;
			//Reading the cells in the first row one by one just and finding headers.
			//There might be a possibility that a blank cell is encountered. In that case 
			//a null point exception is thrown. To prevent the program to throw the error,
			//following try.catch block is implemented. Now, command next to try/catch is not
			//executed. do it simply loops back.
			try {cellType = row.getCell(i).getCellType();}
				catch (NullPointerException e) {	i++;	}
			
			if(cellType == CellType.STRING)
			{
				if (row.getCell(i).getStringCellValue().equalsIgnoreCase("Password")) {
					found = true;
				}
				else {
					found = false;
					i++;
				}
			}	
		}
		return(i);
	}
	public int Find_userName_pos() {
		String get_val;
		boolean found = false;
		int i= 0;
		while(!found) {
			CellType cellType = null;
			//Reading the cells in the first row one by one just and finding headers.
			//There might be a possibility that a blank cell is encountered. In that case 
			//a null point exception is thrown. To prevent the program to throw the error,
			//following try.catch block is implemented. Now, command next to try/catch is not
			//executed. do it simply loops back.
			try {cellType = row.getCell(i).getCellType();}
				catch (NullPointerException e) {	i++;	}
			
			if(cellType == CellType.STRING)
			{
				if (row.getCell(i).getStringCellValue().equalsIgnoreCase("UserName")) {
					found = true;
				}
				else {
					found = false;
					i++;
				}
			}
		}
		return(i);
	}
	
	public String return_excelData(int pos) {
		return(row.getCell(pos).getStringCellValue());
	}
	
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Selenium\\Chrome_Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void TaskToPerform() throws Exception{
		
		WebElement userName = driver.findElement(By.xpath("//input[@id = 'user_login']"));
		WebElement userPass = driver.findElement(By.xpath("//input[@id = 'user_pass' ]"));
		
		userName.sendKeys(return_excelData(username_pos));
		userPass.sendKeys(return_excelData(password_pos));
		
	
	}
	
	public void DriverClose() {
		//driver.close();
	}
	
	
	public static void main(String[] args) throws Exception{
		Login_Sample_1 obj1 = new Login_Sample_1();
		fin = new FileInputStream("C:\\Users\\ibindra\\Desktop\\UserPass.xlsx" );
		workbook = new XSSFWorkbook(fin);	//accessing workbook
		sheet = workbook.getSheetAt(0);		//accessing sheet from workbook
		row = sheet.getRow(0);				//accessing row from sheet
		password_pos = obj1.find_password_pos();
		username_pos = obj1.Find_userName_pos();
		
		row = sheet.getRow(1);
		obj1.setup();
		obj1.TaskToPerform();
		obj1.DriverClose();
		
		
		workbook.close();
		fin.close();
	

	}

}
