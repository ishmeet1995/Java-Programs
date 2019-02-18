package package_1;

import java.util.*;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pop_up_windows_practice {
	WebDriver driver;
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Selenium\\Chrome_Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	public void TaskToPerform() throws Exception{
		String main_window;
		Set<String> windows_set;
		driver.findElement(By.xpath("//a[@target = '_blank']")).click();
		main_window = driver.getWindowHandle();
		windows_set = driver.getWindowHandles();
		Iterator <String> in1 = windows_set.iterator();
		System.out.println(main_window);
		System.out.println(windows_set);
		
		for(String windows1:windows_set) {
			System.out.println(windows1);
		}
		while(in1.hasNext()) {
			String childWindow = in1.next();
			if(!main_window.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("ibindra@gmail.com" + Keys.ENTER);
			}
		}
		
	
	}
	
	public void DriverClose() {
		driver.close();
	}
	
	public static void main(String args[]) throws Exception {
		pop_up_windows_practice obj1 = new pop_up_windows_practice();
		obj1.setup();
		obj1.TaskToPerform();
		obj1.DriverClose();
		
	}

}
