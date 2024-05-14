package Test_cases;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.Criticalinfo;
import test_baseclass.Test_baseclass;

public class TC_06 extends Test_baseclass {
	@Test
	public void test17() {
		Criticalinfo ci = new Criticalinfo(driver);
		String otppagetitle = ci.OTPpage();
		System.out.print(otppagetitle);
		String title="Customer Identity Verification";
		Assert.assertEquals(title, otppagetitle);
	}
	@Test
	public void test18() {
		Criticalinfo ci = new Criticalinfo(driver);
		ci.OTPinput();
		Assert.assertTrue(true);
	}
	@Test
	public void test19() {
		Criticalinfo ci = new Criticalinfo(driver);
		ci.OTPsubmit();
		Assert.assertTrue(true);
	}
}
