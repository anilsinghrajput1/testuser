package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pg_page extends BaseClass {

	public Pg_page(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "(//div[@id='22'])[1]")
	WebElement Ax_bank;
	@FindBy(id = "paynb")
	WebElement propayment;
	
	@FindBy(id="username")
	WebElement Bankid;
	@FindBy(id="password")
	WebElement bnkpass;
	@FindBy (xpath = "//input[@type='submit']")
	WebElement bnksub;
	@FindBy(name="authenticate")
	WebElement bnksub2;
	
	@FindBy(xpath = "//button[normalize-space()='Success']")
	WebElement paypost;
	@FindBy(xpath = "//li[@id='netbanking']")
	WebElement netbank;
	@FindBy(xpath  = "//*[@id=\"otherbank\"]/option[2]")
	WebElement otherbnk;		
	@FindBy(id = "acc-number")
	WebElement accno;
	@FindBy(id = "confirm-acc-number")
	WebElement conaccno;
	@FindBy(id = "acc-ifcs-code")
	WebElement ifscno;
	@FindBy(id = "acc-holder-name")
	WebElement accusername;
	@FindBy(id = "mobile-number")
	WebElement accuserno;
	@FindBy(xpath="(//button[@disable='false'][contains(text(),'Register')])[4]")
	WebElement Autopaypro;
	
	@FindBy(xpath = "//button[@id='redesign-v15-cta']")
	WebElement savsubmit;
	public void bank() throws InterruptedException {
		final String acc_no="325457935";
		final String IfSC="HDFC0000321";
		final String AccHolder="Test Test";
		final String mob="9876948739";
		Ax_bank.click();
		propayment.click();
		Bankid.sendKeys("payu");
		bnkpass.sendKeys("payu");
		Thread.sleep(5000);
		bnksub.click();
		bnksub2.click();
		Thread.sleep(8000);
		netbank.click();
		otherbnk.click();
		String parent = driver.getWindowHandle();
		accno.sendKeys(acc_no);
		conaccno.sendKeys(acc_no);
		ifscno.sendKeys(IfSC);
		accusername.sendKeys(AccHolder);
		accuserno.sendKeys(mob);
		Thread.sleep(5000);
		Autopaypro.click();
		Thread.sleep(1000);	
		driver.switchTo().frame(0);
		Thread.sleep(1000);	
		savsubmit.click();
		for (String windowHandle : driver.getWindowHandles()) {
		    if (!windowHandle.equals(parent)) {
		        driver.switchTo().window(windowHandle);
		        break;
		    }
		}
		driver.findElement(By.xpath("/html/body/form/button[1]")).click();
		driver.switchTo().window(parent);
	}	
}
