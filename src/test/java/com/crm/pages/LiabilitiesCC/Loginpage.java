package com.crm.pages.LiabilitiesCC;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.commonUtilities.CommonMethods;
import com.crm.commonUtilities.ScreenShot;
import com.crm.listeners.TestListeners;


public class Loginpage extends TestListeners
{
	public Loginpage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public static Logger log =LogManager.getLogger(NTBAndETBLeadCreation.class.getName());

	
	
	//loginpage

	
	
	
	public void CRMKotakLoginpage() throws Exception
	{
		CommonMethods.input("Username_XPATH", "LoginData", "Username", 1);
		CommonMethods.input("password_XPATH", "LoginData", "Password", 1);
		try {
			CommonMethods.mouseClick("loginBtn_XPATH");
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.info("logged in fail because" + e);
		}
		ScreenShot.takeSnapShot("loginpage", "pass");

	}
	
	
	public void CRMKotakLogoutpage() throws Exception
	{
		try 
		{
			Thread.sleep(2000);
			CommonMethods.mouseClick("ProfileBtn_XPATH");
			Thread.sleep(2000);
			CommonMethods.mouseClick("logoutBtn_XPATH");

		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.info("Logged out failed because" + e);
		}
		ScreenShot.takeSnapShot("logoutpage", "Pass");
	}

	
}
