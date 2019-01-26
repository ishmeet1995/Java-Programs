package package_1;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMenu {
	static WebDriver driver;	
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Selenium\\Chrome_Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	public void test_case() throws Exception{
		Select obj1 = new Select(driver.findElement(By.xpath("//select[@name = 'country']")));
		List<WebElement> list1 = obj1.getOptions();
		obj1.selectByIndex(5);
		//Using normal for
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i).getText());
		}
		//Using for each
		for (WebElement state_1:list1) {
			System.out.println("For each " + state_1.getText());
		}
	}
	
	public static void main(String args[])  throws Exception{
		DropDownMenu obj1 = new DropDownMenu();
		obj1.setup();
		obj1.test_case();
		driver.close();
	}
}
