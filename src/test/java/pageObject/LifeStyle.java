package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LifeStyle extends BaseClass {

	public LifeStyle(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//*[@id=\"MainContent_UCLifeStyle1_ddlHeightInFeet\"]/option[6]")
	WebElement h1;
	@FindBy(xpath = "//*[@id=\"MainContent_UCLifeStyle1_ddlHeightInches\"]/option[9]")
	WebElement h2;
	@FindBy(id="MainContent_UCLifeStyle1_txtWeight")
	WebElement weight;
	@FindBy(id="btnGeneral")
	WebElement lisubmit1;
	@FindBy(id="btnPolicyNext")
	WebElement lisubmit2;
	@FindBy(xpath = "//*[@id=\"SectionFamilyHistory\"]/div[3]/button[2]")
	WebElement lisubmit3;
	@FindBy(id = "MainContent_UCLifeStyle1_Button1")
	WebElement lisubmit;
	
	
	public void lifestyle() throws InterruptedException {
		h1.click();
		h2.click();
		weight.sendKeys("63");
		lisubmit1.click();
		lisubmit2.click();
		lisubmit3.click();
		Thread.sleep(2000);
		lisubmit.click();
		Thread.sleep(2000);
	}
	

}
