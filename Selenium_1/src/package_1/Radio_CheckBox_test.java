package package_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_CheckBox_test {
static WebDriver driver = null;
	
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Selenium\\Chrome_Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	public void test_case() throws Exception{
		driver.findElement(By.xpath("//input[@id='vfb-7-1']")).click();
		driver.findElement(By.xpath("//input[@id='vfb-6-0']")).click();
	}
	public static void main(String args[]) throws Exception {
		Radio_CheckBox_test obj1 = new Radio_CheckBox_test();
		obj1.setup();
		obj1.test_case();
	}
}
