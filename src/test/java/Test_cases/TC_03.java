package Test_cases;

import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObject.Basic_info;
import pageObject.Pg_page;
import pageObject.PreQuote_page;
import pageObject.Product_Page;
import pageObject.Review_page;
import test_baseclass.Test_baseclass;
import utilities.Excelutilities;

public class TC_03 extends Test_baseclass {
	
	SoftAssert sa = new SoftAssert();
	String path = ".\\Test_Data\\test.xlsx";
	String xlfile = path;
	String xlsheet = "Sheet1";
	String Frequency = "Monthly";

	@Test(dependsOnMethods = "Test_cases.TC_02.test2", alwaysRun = true, priority = 0)
	public void test3() throws InterruptedException, IOException {
		//String username = Excelutilities.getCellData(xlfile, xlsheet, 1, 0);
		String Pincode = "828122";
		Product_Page pp = new Product_Page(driver);
		pp.pin(Pincode);
		Thread.sleep(2000);
		pp.city();
		
		Assert.assertEquals(1, 1);
		
	}

	@Test(dependsOnMethods = "Test_cases.TC_03.test3", alwaysRun = true, priority = 1)
	public void test4() throws InterruptedException, IOException {
		// Excelutilities.setCellData(xlfile, xlsheet, 1, 9, "test");
		Review_page rp = new Review_page(driver);
		Thread.sleep(5000);
		rp.scrollToElement();
		rp.checkCheckbox();
		rp.proceedrev();
		Assert.assertEquals(1, 1);
	}

	@Test(dependsOnMethods = "Test_cases.TC_03.test4", alwaysRun = true, priority = 2)
	public void test5() throws InterruptedException {
		Pg_page pg = new Pg_page(driver);
		pg.bank();
		Assert.assertEquals(1, 1);

	}

	@Test(dependsOnMethods = "Test_cases.TC_03.test5", alwaysRun = true, priority = 3)
	public void test6() throws InterruptedException {
		Basic_info bi = new Basic_info(driver);
		bi.basicdetails();
		Assert.assertEquals(1, 1);

	}

	@Test(dependsOnMethods = "Test_cases.TC_03.test6", alwaysRun = true, priority = 4)
	public void test7() throws InterruptedException {
		Basic_info bi = new Basic_info(driver);
		bi.Family_Details();
		Assert.assertEquals(1, 1);
	}

}
