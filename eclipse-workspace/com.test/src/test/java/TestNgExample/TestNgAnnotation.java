package TestNgExample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

public class TestNgAnnotation {

	@Test(priority = 0)

	public void testcase1() {
		System.out.println("Hi test1");
	}
@Ignore
	@Test(priority = 1)
	public void Testcase2() {
		System.out.println("Hi test 2");
	}
	
	@Test(priority = -1)
	public void Testcase3() {
		System.out.println("Hi test 3");
	}
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("Hi before test");

	}
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("Hi After Test");

	}
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("Hi before class");

	}
	@AfterClass
	public void AfterClass()
	{
		System.out.println("Hi After Class");

	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("Hi Before Method");

	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("Hi After Method");

	}
	
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("Hi Before Suite");

	}
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("Hi After Suite");

	}


}
