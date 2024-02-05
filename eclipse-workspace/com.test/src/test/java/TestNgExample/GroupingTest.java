package TestNgExample;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class GroupingTest {


		@Test(groups = "car")
		public void car1() {
			System.out.println("Hi test car1");
		}

		@Test(groups = "car")
		public void car2() {
			System.out.println("Hi test car2");
		}
		@Test(groups = "car")
		public void car3() {
			System.out.println("Hi test car3");
		}
		
		@Test(groups = "3Wheeler")
		public void Riksaw() {
			System.out.println("Hi test Riksaw");
		}
		
		@Test(groups = "3Wheeler")
		public void AutoRiksaw() {
			System.out.println("Hi test AutoRiksaw");
		}
		
		@Test(groups = {"Sedan","car"})
		public void sedan() {
			System.out.println("Hi test Sedan");
		}


	
	}

