package Test_cases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.Criticalinfo;
import test_baseclass.Test_baseclass;

public class TC_05 extends Test_baseclass{
	
	@Test
	public void test2() throws InterruptedException {		
		Thread.sleep(2000);
		Assert.assertEquals(1, 1);
	}
	@Test
	public void test3() throws InterruptedException {		
		Thread.sleep(2000);
		Assert.assertEquals(1, 1);
	}
	@Test
	public void test4() throws InterruptedException {		
		Thread.sleep(2000);
		Assert.assertEquals(1, 1);
	}
	@Test
	
	public void test5() throws InterruptedException {		
		Thread.sleep(2000);
		Assert.assertEquals(1, 1);
	}@Test
		public void test6() throws InterruptedException {		
		Thread.sleep(2000);
		Assert.assertEquals(1, 1);
	}@Test
	
	public void test7() throws InterruptedException {		
		Thread.sleep(2000);
		Assert.assertEquals(1, 1);
	}
	@Test
	public void test8() throws InterruptedException {		
		Thread.sleep(2000);
		Assert.assertEquals(1, 1);
	}
	@Test
	public void test9() throws InterruptedException {		
		Thread.sleep(2000);
		Assert.assertEquals(1, 1);
	}
	@Test
	public void test10() throws InterruptedException {		
		Thread.sleep(2000);
		Assert.assertEquals(1, 1);
	}
	@Test
	public void test11() throws InterruptedException {		
		Thread.sleep(2000);
		Assert.assertEquals(1, 1);
	}
	
	@Test(dependsOnMethods = "Test_cases.TC_04.test6", alwaysRun = true,priority = 0)
	public void test12() throws InterruptedException {		
		Criticalinfo ci=new Criticalinfo(driver);		
		Thread.sleep(5000);
		ci.criticalsection();		
		Assert.assertEquals(1, 1);
	}
	@Test
	public void test13() {
		Criticalinfo ci=new Criticalinfo(driver);
		try {
			ci.BankDetails("472010110010793", "HDFC0000321");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test14() {
		Criticalinfo ci=new Criticalinfo(driver);
		ci.decleration();
		Assert.assertEquals(1, 1);
	}
	@Test
	public void test15() {
		Criticalinfo ci=new Criticalinfo(driver);
		ci.savecritical();
		Assert.assertEquals(1, 1);
	}
}
