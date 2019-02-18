package package_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables_practice2 {
	static WebDriver driver = null;
	 static String search_item = "Einstien";
	
	 public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Selenium\\Chrome_Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://html.com/tables/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	public void TaskToPerform() throws Exception{
		WebElement tableElement = driver.findElement(By.xpath("//div[@class = 'render']//table//tbody//tr[2]//td[2]"));
		System.out.println(tableElement.getText());
		
	}

	
	public void DriverClose() throws Exception{
		driver.close();
		driver.quit();
	}
	public static void main(String args[]) throws Exception{
		Tables_practice2 obj1 = new Tables_practice2();
		obj1.setup();
		obj1.TaskToPerform();
		obj1.DriverClose();
	}

	
	

}
