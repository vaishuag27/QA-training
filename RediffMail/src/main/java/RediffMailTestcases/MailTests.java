package RediffMailTestcases;



import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import PageClasses.LandingPage;
import PageClasses.MailPage;
import PageClasses.MailWritePage;
import PageClasses.RediffMailPage;
import baseClasses.BaseTestClass;
import baseClasses.PageBaseClass2;
import utilities.ConstantValue;



public class MailTests extends BaseTestClass {
	LandingPage landingPage;
	MailPage mailpage;
	MailWritePage mailwritepage;
	RediffMailPage rediffmailPage;
	
	@Test
	public void mailsendRediff() throws InterruptedException{
    logger = Reporter.createTest("Add Mail: ");
    
    invokeBrowser("chrome");
    PageBaseClass2 pagebase = new PageBaseClass2(driver,logger);
    PageFactory.initElements(driver, pagebase);
	landingPage = pagebase.OpenApplication();
	rediffmailPage = landingPage.clickrediffmail();	
	//waitForPageLoad();
	Thread.sleep(20000);
	mailpage = rediffmailPage.doLogin(ConstantValue.userName, ConstantValue.password);
	
	waitForPageLoad();
	mailwritepage = mailpage.clickwritemail();
	
	mailwritepage.to_text("vgadewar27@rediffmail.com");
	mailwritepage.subject_method("Official mail");
	//pageBase.switchframe(driver,"//iframe[@class-'cke_wysiwyg_frame cke_");
	mailwritepage.msg_method("Welcome to IT Sector");
	//pageBase.switchtodefault();
	mailwritepage = mailwritepage.submitMail();
	
	waitForPageLoad();
	}
     
     
}
