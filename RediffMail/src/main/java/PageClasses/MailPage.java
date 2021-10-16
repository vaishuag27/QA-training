package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


import baseClasses.PageBaseClass2;
import baseClasses.TopMenuClass;

public class MailPage extends PageBaseClass2 {

	public TopMenuClass topmenu;

	public MailPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		topmenu = new TopMenuClass(driver, logger);
		PageFactory.initElements(driver, topmenu);
	}

	
	
	@FindBy(xpath = "//*[@id='boxscroll']/li[1]")
	public WebElement writemail;

	public MailWritePage clickwritemail() {
		logger.log(Status.INFO, "Clicking the writemail Link");
		writemail.click();
		logger.log(Status.PASS, "Clicked the WriteMail Link");
		MailWritePage mailwritepage = new MailWritePage(driver, logger);
		PageFactory.initElements(driver, mailwritepage);
		return mailwritepage;
	}

}
