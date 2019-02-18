package package_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	WebDriver driver = null;
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Selenium\\Chrome_Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	public void TaskToPerform(){
		driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("Record" + Keys.ENTER);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().alert().dismiss();
		
	}
	
	public void DriverClose() {
		driver.close();
	}
	
	public static void main(String args[]) {
		alert obj1 = new alert();
		obj1.setup();
		obj1.TaskToPerform();
		obj1.DriverClose();
		
	}
	
}
