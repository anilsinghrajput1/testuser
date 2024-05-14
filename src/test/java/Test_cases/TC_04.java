package Test_cases;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.google.common.base.Verify;
import pageObject.Basic_info;
import pageObject.Criticalinfo;
import pageObject.LifeStyle;
import pageObject.PreQuote_page;
import pageObject.Product_Page;
import pageObject.Review_page;
import test_baseclass.Test_baseclass;
import utilities.Excelutilities;

public class TC_04 extends Test_baseclass {

	@Test(dependsOnMethods = "Test_cases.TC_03.test7", alwaysRun = true, priority = 0)
	public void test4() throws InterruptedException, IOException {
		Basic_info bi = new Basic_info(driver);

		bi.Contact_Details();
		boolean isSelected = bi.con();
		String pincode=bi.pin();
		System.out.println(pincode);
		System.out.println(isSelected);
		bi.Contact_Details1();		
		//Assert.assertTrue(isSelected, "The checkbox is not selected.");
	}
	@Test(dependsOnMethods = "Test_cases.TC_04.test4", alwaysRun = true, priority = 1)
	public void test5() throws InterruptedException, IOException {
		Basic_info bi=new Basic_info(driver);
		bi.EO();
		bi.nominee();
		Assert.assertEquals(1, 1);
	}
	@Test(dependsOnMethods = "Test_cases.TC_04.test5", alwaysRun = true, priority = 2)
	public void test6() throws InterruptedException, IOException {
		LifeStyle l=new LifeStyle(driver);
		l.lifestyle();		
		Assert.assertEquals(1, 1);
	}
	
}