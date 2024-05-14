package Test_cases;

import test_baseclass.Test_baseclass;
import utilities.Excelutilities;
import java.io.IOException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObject.Product_Page;

public class TC_02 extends Test_baseclass {
	public String gender="female";
	
	@Test(dependsOnMethods = "Test_cases.TC_01.test1", alwaysRun = true)
	//dependsOnMethods = "Test_cases.TC_01.test1", alwaysRun = true
	public void test2() throws InterruptedException, IOException {
		String path = ".\\Test_Data\\test.xlsx";
		String xlfile = path;
		String xlsheet = "Sheet1";
		String username = Excelutilities.getCellData(xlfile, xlsheet, 1, 0); 
		String Income =Excelutilities.getCellData(xlfile, xlsheet, 1, 8);
		String PPT = "5";
		String Email = Excelutilities.getCellData(xlfile, xlsheet, 1, 6);
		String Frequency =Excelutilities.getCellData(xlfile, xlsheet, 1, 5);
		String DOB=Excelutilities.getCellData(xlfile, xlsheet, 1, 1);
		SoftAssert sa = new SoftAssert();
		Product_Page pp = new Product_Page(driver);
			
		pp.selectGender(gender);
		pp.Email(Email);
		pp.cuDOB(DOB);
		pp.Annualincome(Income);
		pp.selectppt(PPT);
		//pp.proceed();
		pp.premiumfre(Frequency);
		pp.proceed();
		System.out.println(Income);
		sa.assertEquals(username, username);

	}

}
