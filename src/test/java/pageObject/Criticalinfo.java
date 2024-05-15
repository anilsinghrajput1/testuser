package pageObject;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import Test_cases.TC_02;

public class Criticalinfo extends BaseClass {

	public Criticalinfo(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "divAnyOtherDisorder")
	WebElement scroll;

	@FindBy(xpath = "//div[@id='stCongenitalDefect']//div//div//label[@class='rectangelRadioLabel nobutton']")
	WebElement congenital;
	@FindBy(xpath = "//div[@id='divGeneticTesting']//div//div//div//label[@class='rectangelRadioLabel nobutton']")
	WebElement genetic;

	@FindBy(xpath = "//div[@id='stCurrentlyPregnant']//div//div//label[@class='rectangelRadioLabel nobutton']")
	WebElement Pregnant;

	@FindBy(xpath = "//h4[@id='h4BankDetails']")
	WebElement Bankscroll;

	@FindBy(xpath = "//input[@id='txtBankAccountNo']")
	WebElement accno;

	@FindBy(xpath = "//input[@id='txtBankIFSC']")
	WebElement ifsc;

	@FindBy(xpath = "//input[@name='ctl00$MainContent$UCcriticalInfo$txtAccountHolderName']")
	WebElement ifscfetch;

	@FindBy(id = "divProposerDeclaration")
	WebElement checkboxscroll;

	@FindBy(id = "btnSave")
	WebElement critical_save;

	@FindBy(xpath = "//span[@id='spnchkDeclaration']")
	WebElement checkbox;

	@FindBy(xpath = "//h4[text()='Customer Identity Verification']")
	WebElement OTPpagetext;

	@FindBy(xpath = "//input[@name='ctl00$MainContent$UCDocumentUpload1$txtOTP']")
	WebElement otp;

	@FindBy(xpath = "//*[@id=\"divCustomerVerification\"]/div[1]/button")
	WebElement otpsubmitbutton;

	public void criticalsection() throws InterruptedException {

		TC_02 t = new TC_02();
		String gender = t.gender;

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", scroll);
		Thread.sleep(2000);
		Boolean status = false;
		while (!status) {
			driver.switchTo().defaultContent();
			congenital.click();
			Thread.sleep(2000);
			if (gender.equals("female")) {
				System.out.print("gender is female");
				js.executeScript("arguments[0].scrollIntoView();", Pregnant);

				FluentWait<WebDriver> myWait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10))
						.pollingEvery(Duration.ofSeconds(1)).ignoring(ElementClickInterceptedException.class);

				try {
					WebElement element = myWait.until(ExpectedConditions.elementToBeClickable(genetic));
					JavascriptExecutor executor = (JavascriptExecutor) driver;
					executor.executeScript("arguments[0].click();", element);
				} catch (TimeoutException e) {
					// Handle timeout exception
					System.out.println("Timeout waiting for element to be clickable.");
				} catch (ElementClickInterceptedException e) {
					System.out.println("Element is clickable but still intercepted.");
				}

				try {
					WebElement element1 = myWait.until(ExpectedConditions.elementToBeClickable(Pregnant));
					JavascriptExecutor executor = (JavascriptExecutor) driver;
					executor.executeScript("arguments[0].click();", element1);
				} catch (TimeoutException e) {
					System.out.println("Timeout waiting for element to be clickable.");
				}
				Thread.sleep(2000);

				// js.executeScript("arguments[0].scrollIntoView();", Bankscroll);

			}
		}

	}

	public void BankDetails(String Acc, String ifscs) throws InterruptedException {
		accno.sendKeys(Acc);
		Thread.sleep(2000);
		ifsc.sendKeys(ifscs);
		Thread.sleep(2000);
		ifscfetch.click();

	}

	public void decleration() {
		try {			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", checkboxscroll);
			checkbox.click();
		} catch (Exception ex) {

		}
	}

	public void savecritical() {
		critical_save.click();
	}

	public String OTPpage() {

		String txtotp = OTPpagetext.getText();
		return txtotp;

	}

	public void OTPinput() {
		otp.sendKeys("1234");

	}

	public void OTPsubmit() {
		otpsubmitbutton.click();

	}

}