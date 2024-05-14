package Test_cases;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import test_baseclass.Test_baseclass;

public class TC_07 extends Test_baseclass{
	@Test
public void test7() {
		WebDriverWait myw=new WebDriverWait(driver, Duration.ofSeconds(10));
		myw.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		
	}
}
