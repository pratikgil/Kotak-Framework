package com.crm.pages.LiabilitiesCC;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.model.Log;
import com.crm.commonUtilities.CommonMethods;
import com.crm.commonUtilities.ScreenShot;
import com.crm.listeners.TestListeners;

public class NTBAndETBLeadCreation extends TestListeners 

{

	public NTBAndETBLeadCreation(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}
	
	public static Logger log =(Logger) LogManager.getLogger(NTBAndETBLeadCreation.class.getName());


	//NTB lead creation

	
	
	public void NTBleadJourney() throws Exception
	{
		extentInfo("NTB Lead Creation Intiated", "");
		Thread.sleep(2000);
		CommonMethods.mouseClick("Leadclick_XPATH");
		Thread.sleep(2000);
		CommonMethods.mouseClick("newclick_XPATH");
		Thread.sleep(2000);
		CommonMethods.mouseClick("others_XPATH");
		Thread.sleep(2000);
		CommonMethods.input("Firstname_XPATH", "NTBLeadJourney", "First Name", 1);
		CommonMethods.input("Lastname_XPATH", "NTBLeadJourney", "Last Name", 1);
		CommonMethods.input("MobNo_XPATH", "NTBLeadJourney", "Mobile No", 1);
		Thread.sleep(2000);
		CommonMethods.mouseClick("Product_XPATH");
		CommonMethods.selectByText("Product_XPATH", "NTBLeadJourney", "Product", 1);
		Thread.sleep(1000);
		CommonMethods.mouseClick("SaveAndProceed_XPATH");
		Thread.sleep(1000);
		CommonMethods.scrollAtBottom();
		Thread.sleep(1000);
		CommonMethods.mouseClick("EditBtn_XPATH");
		Thread.sleep(1000);
		CommonMethods.mouseClick("FollowUpNewBtn_XPATH");
		Thread.sleep(1000);
		CommonMethods.mouseClick("CalenderIcon_XPATH");
		CommonMethods.mouseClick("CalenderDate_XPATH");
		Thread.sleep(1000);
		CommonMethods.mouseClick("StopWatchIcon_XPATH");
		CommonMethods.mouseClick("SelectTime_XPATH");
		Thread.sleep(1000);
		CommonMethods.mouseClick("SaveAndProceed_XPATH");
		CommonMethods.scrollAtBottom();
		Thread.sleep(1000);
		CommonMethods.mouseClick("EditBtn_XPATH");
		Thread.sleep(1000);
		CommonMethods.mouseClick("LeadProcessing_XPATH");
		Thread.sleep(1000);
		CommonMethods.mouseClick("DocCollect_XPATH");
		Thread.sleep(1000);
		CommonMethods.mouseClick("SaveAndProceed_XPATH");
		Thread.sleep(1000);
		CommonMethods.scrollAtBottom();
		Thread.sleep(1000);
		CommonMethods.mouseClick("EditBtn_XPATH");
		Thread.sleep(1000);
		CommonMethods.mouseClick("LeadClsr_XPATH");
		Thread.sleep(1000);
		CommonMethods.mouseClick("LeadWon_XPATH");
		Thread.sleep(1000);
		CommonMethods.input("CoreCRN_XPATH", "NTBLeadJourney", "Core CRN", 1);
		Thread.sleep(1000);
		CommonMethods.mouseClick("SaveAndProceed_XPATH");
		Thread.sleep(1000);
		ScreenShot.takeSnapShot("Lead created", "Pass");
		Thread.sleep(9000);
		CommonMethods.scrollAtBottom();
		Thread.sleep(2000);
		CommonMethods.mouseClick("Close_XPATH");
		Thread.sleep(2000);
		log.info("Lead successfully created");
		

		
		





		
		
		
	}
	
	//ETB lead creation
	public void ETBLeadJourney(String Sheetname) throws Exception
	{
		extentInfo("ETB Lead Creation Intiated" , "");
		CommonMethods.mouseClick("Leadclick_XPATH");
		CommonMethods.mouseClick("newclick_XPATH");
		Thread.sleep(2000);
		CommonMethods.mouseClick("others_XPATH");
		
		//CommonMethods.input("CRNNo_Xpath", "VerifyCRMLogin", "CRN No", 1);
		//CommonMethods.mouseClick(ExistCust);
		//CommonMethods.selectByText("ExistCust_Xpath", "VerifyCRMLogin", "Existing Customer", 1);
		//Thread.sleep(2000);
		
		CommonMethods.input("Firstname_XPATH", "ETBLeadJourney", "First Name", 1);
		CommonMethods.input("Lastname_XPATH", "ETBLeadJourney", "Last Name", 1);
		CommonMethods.input("MobNo_XPATH", "ETBLeadJourney", "Mobile No", 1);
		Thread.sleep(2000);
		CommonMethods.mouseClick("Product_XPATH");
		CommonMethods.selectByText("Product_XPATH", "ETBLeadJourney", "Product", 1);
		Thread.sleep(1000);
		CommonMethods.mouseClick("SaveAndProceed_XPATH");
		Thread.sleep(1000);

		CommonMethods.scrollAtBottom();
		Thread.sleep(1000);

		CommonMethods.mouseClick("EditBtn_XPATH");
		Thread.sleep(1000);

		CommonMethods.mouseClick("FollowUpNewBtn_XPATH");
		Thread.sleep(1000);

		CommonMethods.mouseClick("CalenderIcon_XPATH");
		CommonMethods.mouseClick("CalenderDate_XPATH");
		Thread.sleep(1000);

		CommonMethods.mouseClick("StopWatchIcon_XPATH");
		CommonMethods.mouseClick("SelectTime_XPATH");
		Thread.sleep(1000);

		CommonMethods.mouseClick("SaveAndProceed_XPATH");
		
		CommonMethods.scrollAtBottom();
		Thread.sleep(1000);

		CommonMethods.mouseClick("EditBtn_XPATH");
		Thread.sleep(1000);

		CommonMethods.mouseClick("LeadProcessing_XPATH");
		Thread.sleep(1000);

		CommonMethods.mouseClick("DocCollect_XPATH");
		Thread.sleep(1000);

		CommonMethods.mouseClick("SaveAndProceed_XPATH");
		Thread.sleep(1000);

		CommonMethods.scrollAtBottom();
		Thread.sleep(1000);

		CommonMethods.mouseClick("EditBtn_XPATH");
		Thread.sleep(1000);

		CommonMethods.mouseClick("LeadClsr_XPATH");
		Thread.sleep(1000);

		CommonMethods.mouseClick("LeadWon_XPATH");
		Thread.sleep(1000);

		CommonMethods.input("CoreCRN_XPATH", "ETBLeadJourney", "Core CRN", 1);
		Thread.sleep(1000);

		CommonMethods.mouseClick("SaveAndProceed_XPATH");
		Thread.sleep(1000);

		ScreenShot.takeSnapShot("Lead created", "Pass");
		Thread.sleep(1000);

		CommonMethods.scrollAtBottom();
		Thread.sleep(1000);

		CommonMethods.mouseClick("Close_XPATH");
		log.info("Lead successfully created");
		

		
		
		
		
	}
}
   
