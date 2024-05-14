package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class docupload extends BaseClass{
	public docupload(WebDriver driver) {
		super(driver);		
	}
	@FindBy(xpath = "//*[@id=\"main-container\"]/div[2]/div[1]/div/div/div[3]/div[2]")
	WebElement viewdetails;
	
	@FindBy(xpath = "lblApplicationNo")
	WebElement appno;
}
