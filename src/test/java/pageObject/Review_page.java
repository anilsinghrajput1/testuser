package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Review_page extends BaseClass {

	public Review_page(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//*[@id=\"paymentModeForm\"]/div[2]/div[1]/div[1]/div[2]/ul/li[1]/div[2]")
	WebElement username;
	@FindBy(xpath = "/html/body/form/div[2]/div[1]/div[1]/div[2]/ul/li[3]//div[2]")
	WebElement income;
	@FindBy(xpath = "/html/body/form/div[2]/div[1]/div[1]/div[2]/ul/li[4]//div[2]")
	WebElement Pincode;
	@FindBy(xpath = "/html/body/form/div[2]/div[1]/div[1]/div[2]/ul/li[3]//div[2]")
	WebElement gender;
	@FindBy(xpath = "/html/body/form/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div[2]")
	WebElement planname;
	@FindBy(xpath = "/html/body/form/div[2]/div[1]/div[2]/div[2]/ul/li[2]/div[2]")
	WebElement WithdrawAfter;
	@FindBy(xpath = "/html/body/form/div[2]/div[1]/div[2]/div[2]/ul/li[3]/div[2]")
	WebElement Payfor;
	@FindBy(xpath = "/html/body/form/div[2]/div[1]/div[2]/div[2]/ul/li[4]/div[2]")
	WebElement MOP;
	@FindBy(xpath = "//*[@id=\"divDeclaration\"]/label/span[1]")
	WebElement checkbox;
	@FindBy(xpath="(//button[normalize-space()='Checkout'])[1]")
	WebElement revproceed;

	public String usernametxt() {
		String txt = username.getText();
		return txt;
	}

	public String incometxt() {
		String txt = income.getText();
		return txt;
	}

	public String Pincodetxt() {
		String txt = Pincode.getText();
		return txt;
	}

	public String gendertxt() {
		String txt = gender.getText();
		return txt;
	}

	public String plannametxt() {
		String txt = planname.getText();
		return txt;
	}

	public String WithdrawAftertxt() {
		String txt = WithdrawAfter.getText();
		return txt;
	}

	public String Payfortxt() {
		String txt = Payfor.getText();
		return txt;
	}

	public String MOPtxt() {
		String txt = MOP.getText();
		return txt;
	}

	public void checkCheckbox() {
		if (!checkbox.isSelected()) {
			checkbox.click();
		}
	}
	public void proceedrev() {
		revproceed.click();
	}
	public void scrollToElement() {
	JavascriptExecutor js = (JavascriptExecutor) driver;	
	js.executeScript("arguments[0].scrollIntoView();", checkbox);
}
	}
