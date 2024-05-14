package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PreQuote_page extends BaseClass {

	public PreQuote_page(WebDriver driver) {
		super(driver);

	}

	// PreQuote Element
	@FindBy(id = "txtCustomerName")
	WebElement name;

	@FindBy(id = "txtMobileNo")
	WebElement mobile;

	@FindBy(xpath = "//button[normalize-space()='View Plans']")
	WebElement proc;

	// Quote page Element
	@FindBy(id = "txtCity")
	WebElement City;

	@FindBy(id = "main-container")
	WebElement cityPopup;

	@FindBy(id = "txtCustomerAge")
	WebElement age;

	@FindBy(xpath = "/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-quote-query-modal[1]/div[1]/div[2]/div[2]/div[2]")
	WebElement Income1;

	@FindBy(xpath = "//button[@id='btn_74881']")
	WebElement select_plan;

	@FindBy(xpath = "//button[normalize-space()='Proceed']")
	WebElement select_plan1;

	
	
	// Action Method
	public void setname(String username) {
		name.sendKeys(username);
	}
	public void setmobile(String usermobile) {
		mobile.sendKeys(usermobile);
	}
	public void proc() {
		proc.click();
	}
	public boolean isCityPopupDisplayed() {
		try {
			return cityPopup.isDisplayed();
		} catch (Exception Ex) {
			return false;
		}
	}
	public void setCity(String userCity) {				
			City.sendKeys(userCity);
			City.sendKeys(Keys.ENTER);		
	}
	public void setAge(String Age) {
		age.sendKeys(Age);
		age.sendKeys(Keys.ENTER);
	}
	public void setIncome() {	
			Income1.click();		
	}
	public String Plannametxt() {		
		WebElement txt=driver.findElement(By.xpath("(//label[contains(text(),'Capital Guarantee Solution')])[1]"));		
		return txt.getText();		
	}
	public void select_plan() {
		try {
			select_plan.click();
		} catch (Exception Ex) {

		}
	}
	public void select_plan1() {
		select_plan1.click();
	}
	public String proPlannametxt() {		
		WebElement txt=driver.findElement(By.xpath("(//span[contains(text(),'Capital Guarantee Solution')])[2]"));		
		return txt.getText();		
	}
}
