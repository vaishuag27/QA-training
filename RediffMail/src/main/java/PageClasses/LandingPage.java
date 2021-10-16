package PageClasses;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


import baseClasses.PageBaseClass2;
import baseClasses.TopMenuClass;

public class LandingPage extends PageBaseClass2 {

	public LandingPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
	}

	@FindBy(xpath = "//a[contains(text(),'Rediffmail')]")
	public WebElement rediffmail;
	
	

	public RediffMailPage clickrediffmail() {
		logger.log(Status.INFO, "Clicking the  Rediff mail, Present in Header");
		rediffmail.click();
		logger.log(Status.PASS, "Clicked the Rediff mail");
		RediffMailPage redifflogin = new  RediffMailPage(driver, logger);
		PageFactory.initElements(driver, redifflogin);
		return redifflogin;
	}

	
}
