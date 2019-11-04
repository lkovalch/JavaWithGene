package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import GMtesting.GmSitesTitleVerification1;
import GMtesting.TitleVerificationForLoop;
import GMtesting.TitleVerificationForLoop2;


public class GmTitleTestForLoop {
	
	GmSitesTitleVerification1 launch = new GmSitesTitleVerification1 ();
	TitleVerificationForLoop forloop = new TitleVerificationForLoop ();
	TitleVerificationForLoop2 forloop2 = new TitleVerificationForLoop2 ();
	
	WebDriver driver;
	
	
	@Test 
	public void verifyGmTitlesCorrect () {
	
		forloop2.oneForLoop();
	
		
	
}}
