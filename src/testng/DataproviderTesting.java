package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderTesting {
	
	/*
	 * @DataProvider(name = "data-provider") // Data provider in same class public
	 * Object[][] dpMethod() { return new Object[][] { { 2, 3, 5 }, { 5, 7, 8 }, {
	 * 10, 15, 5 }, { 20, 22, 44 } }; }
	 */

//	@Test(dataProvider= "data-provider")//Invoked Data provider in same class
	@Test(dataProvider="data-provider",dataProviderClass=BasicTest.class)//Dataprovider from different class BasicTest. Parameters passing from different class
	public void testCase01(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}

}


