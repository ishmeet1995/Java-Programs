package package_1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.jasypt.util.text.BasicTextEncryptor;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail_Program1 {
	WebDriver driver;	// Defining Chrome Web Driver
	WebDriverWait wait; // defining the wait object for Web Driver
	Properties prop = new Properties();
	BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
	Gmail_Program1() throws Exception {
		FileInputStream fil = new FileInputStream("D:\\Learning\\JAVA\\Code\\Selenium_1\\src\\package_1\\Login.Properties");
		prop.load(fil);
	}
	
	public void setup() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Selenium\\Chrome_Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		System.out.println("Chrome loaded");
	}
	
	public void login() throws InterruptedException {
		wait = new WebDriverWait(driver, 300);
		Thread.sleep(200);
		driver.findElement(By.xpath("//input[@type = 'email']")).sendKeys("ibindra1995@gmail.com" + Keys.ENTER);
		//Thread.sleep(200);
		//driver.findElement(By.xpath("//span[@class = 'RveJvd snByac' and contains(text(),'Next')]")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("//input[@name = 'password']")).sendKeys(textEncryptor.decrypt("doOhKUNFfcE4tLgGDlFP+WwuHLe9kL4g") + Keys.ENTER);
		//Thread.sleep(200);
		//driver.findElement(By.xpath("//span[contains(text(), 'Next')]")).click();
		System.out.println("Finished entering id and password");
				
	}
	
	public void performTest() {
		System.out.println("wait till the list of mail is loaded");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@id=':36']"))); //wait till the list of mail is loaded.
		driver.findElement(By.xpath("//tr[@id=':36']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@title='Back to Inbox']")));
		driver.findElement(By.xpath("//div[@title='Back to Inbox']")).sendKeys(Keys.ENTER);
	}
	
	public static void main(String args[]) throws Exception{
		Get_gmail_params obj1 = new Get_gmail_params(); //Load the file
		obj1.setup();	// open browser with Gmail link
		obj1.login();	// Login with credentials
		obj1.performTest(); // perform the test of opening the first mail.
		
	}
	

}
