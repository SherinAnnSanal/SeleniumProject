package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BasicTest {
	@Test
	@BeforeTest
		public void beforeTest()
		{
			System.out.println("BeforeTest");
		}
		
		@AfterTest

		public void afterTest()
		{
			System.out.println("AfterTest");
		}
		
		
		
		/*
		 * @Test
		 * 
		 * @Parameters({"para1","para2","para3","para4"}) public void testCase01(int a,
		 * int b, int c,String d) { System.out.println(a); System.out.println(b);
		 * System.out.println(c); System.out.println(d);
		 * //System.out.println("Testcase 1 eexecuted");
		 * 
		 * }
		 */
		@Test
		public void testCase02() {
			System.out.println("Testcase 2 eexecuted");
		}

		@Test
		public void testCase03() {
			System.out.println("Testcase 3 eexecuted");
		}

		@Test
		public void testCase04() {
			System.out.println("Testcase 4 eexecuted");
		}
		
		@DataProvider (name = "data-provider")
		public Object[][] dpMethod(){
			return new Object[][] {{2, 3,5}, {5, 7,8},{10,15,5},{20,22,44}};
		}

	}

	

