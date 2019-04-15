package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_1 {

	@BeforeTest
	public void b_test() {
		System.out.println("Executing the before loop");
	}
	
	@Test(priority = 1, testName = "test1")
	public void test_1() {
		System.out.println("Inside test1");
	}
	
	@Test(priority = 6, testName = "test2")
	public void test_2() {
		System.out.println("Inside test2");
	}
	
	@Test(priority = 5, testName = "test3")
	public void test_3() {
		System.out.println("Inside test3");
	}
	@Test(priority = 3, testName = "test4")
	public void test_4() {
		System.out.println("Inside test4");
	}
	@Test(priority = 4, testName = "test5")
	public void test_5() {
		System.out.println("Inside test5");
	}
	@Test(priority = 2, testName = "test6")
	public void test_6() {
		System.out.println("Inside test6");
	}
	@AfterTest
	public void a_test() {
		System.out.println("After Test");
	}
	
}