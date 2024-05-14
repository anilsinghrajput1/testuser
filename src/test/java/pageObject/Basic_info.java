package pageObject;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Excelutilities;

public class Basic_info extends BaseClass {

	private String panno;

	public Basic_info(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "MainContent_btnSubmit")
	WebElement Paythanks;
	@FindBy(id = "closebtnekycpopup")
	WebElement Close_Ekyc;
	@FindBy(id = "txtPanNumber")
	WebElement pan;
	@FindBy(xpath = "//*[@id=\"ddlAddressProof\"]/option[5]")
	WebElement POR;
	@FindBy(id = "txtAddressProofIdNo")
	WebElement PORNo;
	@FindBy(xpath = "//*[@id=\"pnlBasic\"]/div[3]/div[2]/button[2]")
	WebElement subbasic;

	// Family_Details
	@FindBy(xpath = "//select[@id='ddlMaritalStatus']//child::option[@value='1']")
	WebElement selectmarital;
	@FindBy(id = "txtFatherFirstName")
	WebElement ffirstname;
	@FindBy(id = "txtFatherLastName")
	WebElement flastname;
	@FindBy(id = "txtMotherFirstName")
	WebElement mfirstname;
	@FindBy(id = "txtMotherLastName")
	WebElement mlastname;
	@FindBy(xpath = "//*[@id=\"secPerFamilyInfo\"]/div[3]/div[2]/button[2]")
	WebElement proceedfamily;

	// Contact Details
	@FindBy(id = "txtMailingAddress")
	WebElement mailing;
	@FindBy(id = "txtMailingAddress2")
	WebElement mailing2;
	@FindBy(id = "txtMailingAddress3")
	WebElement mailing3;
	@FindBy(id="txtMailingPinCode")
	WebElement pincode;
	@FindBy(xpath = "//*[@id=\"divPermanentAddress\"]/label/span[1]")
	WebElement sameasmailing;
	@FindBy(xpath = "//*[@id=\"secPerContactInfo\"]/div[3]/button[2]")
	WebElement proceedcontact;
	@FindBy(xpath = "//*[@id=\"divPEPQuestion\"]/div[2]/div/label[2]/span/span")
	WebElement PEP;
	
	
	//Education & Occupation
	@FindBy(xpath = "//*[@id=\"ddlOccupation\"]/option[5]")
	WebElement selectocupation;
	@FindBy(xpath = "//*[@id=\"ddlEducation\"]//option[3]")
	WebElement selectedu;
	@FindBy(xpath = "//*[@id=\"divPEPQuestion\"]/div[2]/div/label[2]/span/span")
	WebElement pep;
	@FindBy(xpath = "//*[@id=\"secPerEducationInfo\"]/div[3]/button[2]")
	WebElement EOproceed;
	
	
	
	
	
	//Nominee Details
	@FindBy(id = "txtNomineeFirstName1")
	WebElement nofirstname;
	@FindBy(id="txtNomineeLastName1")
	WebElement nolastname;
	@FindBy(xpath = "//*[@id=\"ddlRelationship1\"]/option[3]")
	WebElement rela;
	@FindBy(xpath = "//select[@id='ddlNomineeDay1']//option[2]")
	WebElement date;	
	@FindBy(xpath = "//select[@id='ddlNomineeMonth1']//option[2]")
	WebElement month;
	@FindBy(xpath = "//select[@id='ddlNomineeYear1']//option[56]")
	WebElement year;
	@FindBy(id="txtPercentageEntitlement1")
	WebElement pershare;
	@FindBy(name = "ctl00$MainContent$UCPersonalInfo1$btnNextProceed")
	WebElement noproceed;

	public void exceldata() throws IOException {
		String path = ".\\Test_Data\\test.xlsx";
		String xlfile = path;
		String xlsheet = "Sheet1";
		panno = Excelutilities.getCellData(xlfile, xlsheet, 1, 10);
		System.out.println("panno" + panno);
	}

	public void basicdetails() throws InterruptedException {
		Paythanks.click();

		Thread.sleep(5000);
		WebDriverWait my = new WebDriverWait(driver, Duration.ofSeconds(10));
		my.until(ExpectedConditions.visibilityOf(Close_Ekyc));
		Close_Ekyc.click();
		pan.sendKeys("PPPPP1111P");
		POR.click();
		PORNo.sendKeys("8668");
		subbasic.click();
	}

	public void Family_Details() throws InterruptedException {
		selectmarital.click();
		ffirstname.sendKeys("Test");
		flastname.sendKeys("father");
		mfirstname.sendKeys("Test");
		mlastname.sendKeys("mother");
		Thread.sleep(2000);
		proceedfamily.click();
	}

	public void Contact_Details() throws InterruptedException {

		mailing.sendKeys("aaaaa");
		mailing2.sendKeys("bbbbb");
		mailing3.sendKeys("ccccc");

	}
	public String pin() {
		String st= pincode.getText();
		return st;
	}

	public void Contact_Details1() throws InterruptedException {
		Thread.sleep(3000);
		proceedcontact.click();
	}

	public boolean con() {
		return sameasmailing.isSelected();
	}
	
	public void EO() {
		selectocupation.click();
		selectedu.click();
		pep.click();
		EOproceed.click();			
	}	
	public void nominee() {
		nofirstname.sendKeys("test");
		nolastname.sendKeys("nominee");
		rela.click();
		date.click();
		month.click();
		year.click();
		pershare.sendKeys("100");
		noproceed.click();
	
	}
}
