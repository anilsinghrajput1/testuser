package Test_cases;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.common.base.Verify;

import pageObject.PreQuote_page;
import test_baseclass.Test_baseclass;

public class TC_01 extends Test_baseclass  {

	@Test
	public void test1() throws InterruptedException {
		String username="Test Test";
		String usermobile="8521763380";
		String userCity="Dhanbad";
		String age="24";		
		PreQuote_page pq=new PreQuote_page(driver);
		pq.setname(username);
		pq.setmobile(usermobile);
		pq.proc();
		Thread.sleep(10000);
		if(pq.isCityPopupDisplayed()) {
		pq.setCity(userCity);
		pq.setAge(age);
		pq.setIncome();	}
		else {
			System.out.print("popup not found");
		}
		pq.select_plan();
		pq.select_plan1();	
		Thread.sleep(5000);
		String actual=pq.Plannametxt();
		SoftAssert sa=new SoftAssert();		
		String prod=pq.proPlannametxt();
		sa.assertEquals(actual, prod);
		
	}
}



