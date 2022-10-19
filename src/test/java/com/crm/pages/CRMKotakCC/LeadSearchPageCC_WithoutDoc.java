package com.crm.pages.CRMKotakCC;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.crm.commonUtilities.CommonMethods;
import com.crm.commonUtilities.ScreenShot;
import com.crm.listeners.TestListeners;

public class LeadSearchPageCC_WithoutDoc extends TestListeners 
{
	public static String WindowId;
	public static String OTPVerification;
	GetOTPCC_WithoutDoc GOC = new GetOTPCC_WithoutDoc();

	public static Logger log =(Logger) LogManager.getLogger(LeadSearchPageCC_WithoutDoc.class.getName());
	
	public void LeadSearch1() throws Exception
	{
		extentInfo("Lead search initiated", null);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(3));
		
		driver.get("https://crmmobileuat.kotak.com/sn");
		
		CommonMethods.input("Username_XPATH", "LoginData", "Username", 3);
		CommonMethods.input("password_XPATH", "LoginData", "Password", 3);
		try {
			CommonMethods.mouseClick("loginBtn_XPATH");
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.info("logged in fail because" + e);
		}
		
		
		ScreenShot.takeSnapShot("loginpage for lead search from admin", "pass");
		
		String LeadSearch=driver.getTitle();
		System.out.println(LeadSearch);
		
		CommonMethods.mouseClick("AdvanceSearchIcon_InLead_CC_XPATH");
		CommonMethods.input("LeadIdCC_XPATH", "NTBAssistedJourneyWithoutDocCC", "ReferanceNo", 1);
		CommonMethods.mouseClick("SearchBtn");
		CommonMethods.mouseClick("ToggleBtnCC_XPATH");
		
		 WindowId=driver.getWindowHandle();
		System.out.println(WindowId);
		
		String SMSbody= CommonMethods.getElementText("SMSBodyCC_XPATH");
		String[] str=SMSbody.split("here ");
		String[] str2 =str [1].split(" to");
		String link=str2[0];
		System.out.println(link);
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open()");
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(4));
		driver.get(link);
		
		CommonMethods.mouseClick("CheckBoxCC_XPATH");
		CommonMethods.mouseClick("IAgreeCC_XPATH");
		ScreenShot.takeSnapShot("Thank you for confirmation page", "pass");
		
		CommonMethods.switchToWindowByTitle("Customer Digital Journey");
		
	}
	
	public void Leadsearch2() throws Exception
	{
	
		driver.navigate().refresh();
		driver.navigate().refresh();
		String NIU = CommonMethods.getElementText("NIUCC_XPATH");
		String[] Str = NIU.split("click on ");
		String[] Str1 = Str[1].split(" to");
		String IAcceptLink = Str1[0];
		System.out.println( "link of NUI is  " + IAcceptLink);

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(5));
		driver.get(IAcceptLink);
		Thread.sleep(3000);
		
		 OTPVerification =driver.getWindowHandle();
		System.out.println(" handle for OTP verification is " + OTPVerification);
		
		GOC.GetOTP();
		
		CommonMethods.switchToWindowById(OTPVerification);
		CommonMethods.input("6DigitOTPCC_XPATH","NTBAssistedJourneyWithoutDocCC", "OTP", 1);
		CommonMethods.mouseClick("SubmitBtnCC_XPATH");
		
	}
	
}
