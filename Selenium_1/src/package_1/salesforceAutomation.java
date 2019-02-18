package package_1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforceAutomation {
	WebDriver driver;
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Selenium\\Chrome_Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/?ir=1");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void TaskToPerform() throws Exception{
		String main_window;
		Set<String> windows_set;
		main_window = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[@class = 'btn btn-lg btn-nav salesforce-sans-regular    ']")).click();
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
				driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("ishmeet" + Keys.ENTER);
			}
		}
		
	
	}
	
	public void DriverClose() {
		//driver.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		salesforceAutomation obj1 = new salesforceAutomation();
		obj1.setup();
		try {
			obj1.TaskToPerform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj1.DriverClose();

	}

}
