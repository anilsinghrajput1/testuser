package pageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Product_Page extends BaseClass {

	public Product_Page(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "(//span[contains(text(),'Male')])[1]")
	WebElement maleRadioButton;

	@FindBy(xpath = "(//span[contains(text(),'Female')])[1]")
	WebElement femaleRadioButton;

	@FindBy(id = "Email")
	WebElement email;

	@FindBy(id = "DOB")
	WebElement DOB;

	@FindBy(id = "AnnualIncome")
	WebElement income;

	@FindBy(id = "PremiumPayingTerm")
	WebElement ppt;
	
	@FindBy(id="BasicSumAssured")
	WebElement premium1;
	
	@FindBy(id="PolicyTerm")
	WebElement pt;
	
	@FindBy(id="ModeOfPremium")
	WebElement prefre;

	@FindBy(xpath = "//button[contains(text(),'Proceed')]")
	WebElement pro;
	
	@FindBy(id = "Pincode")
	WebElement pincode;
	
	@FindBy(xpath = "(//div)[83]")
	WebElement city;
	
	@FindBy(xpath = "//button[normalize-space()='Review Details']")
	WebElement reviewpro;

	public void selectGender(String gender) {
		if (gender.equals("male")) {
			maleRadioButton.click();
		} else {
			femaleRadioButton.click();
		}
	}

	public void Email(String mail) {
		email.sendKeys(mail);
	}

	public void cuDOB(String cDOB) {
		DOB.sendKeys(cDOB);
	}

	public void Annualincome(String Income) {
		income.sendKeys(Income);
	}

	public void selectppt(String seppt) {
		Select dropdown = new Select(ppt);
		dropdown.selectByValue(seppt);
	}
	public void selectpt(String sept) {
		Select dropdown=new Select(pt);
		dropdown.selectByValue(sept);
	}
	public void prem(String premium) {
		premium1.sendKeys(premium);
	}
	public void premiumfre(String frequency) {
		Select dropdown = new Select(prefre);
		dropdown.selectByVisibleText(frequency);
	}
	public void proceed() throws InterruptedException {
		Thread.sleep(2000);
		pro.click();
	}
	public void pin(String pinco) {
		pincode.sendKeys(pinco);
	}
	public void city() throws InterruptedException {
		//city.click();
		Thread.sleep(1000);
		reviewpro.click();
		Thread.sleep(2000);
		reviewpro.click();
		Thread.sleep(5000);
	}
	
	
}
