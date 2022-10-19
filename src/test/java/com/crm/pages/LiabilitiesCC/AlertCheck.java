package com.crm.pages.LiabilitiesCC;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.crm.commonUtilities.CommonMethods;
import com.crm.commonUtilities.ScreenShot;
import com.crm.listeners.TestListeners;

public class AlertCheck extends TestListeners
{
	public AlertCheck(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public static Logger log =(Logger) LogManager.getLogger(AlertCheck.class.getName());

	//check mandatory rule

	
	
	public void MandatoryAlert() throws Exception
	{
		extentInfo("Mandatory alert check Intiated", null);
		CommonMethods.mouseClick("Leadclick_XPATH");
		CommonMethods.mouseClick("newclick_XPATH");
		Thread.sleep(2000);
		CommonMethods.mouseClick("others_XPATH");
		Thread.sleep(2000);
		CommonMethods.mouseClick("SaveAndProceed_XPATH");
		Thread.sleep(2000);

		
		try {
			ScreenShot.takeSnapShot("screenshot for alert of mandatory rule 1", "Pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonMethods.Click("CrossBar_XPATH");
		CommonMethods.input("Firstname_XPATH", "ValidationAlert", "First Name", 1);
		CommonMethods.input("Lastname_XPATH", "ValidationAlert", "Last Name", 1);
		CommonMethods.input("MobNo_XPATH", "ValidationAlert", "Mobile No", 1);
		CommonMethods.input("CRNNo_XPATH", "ValidationAlert", "CRN No", 1);
		Thread.sleep(2000);
		CommonMethods.mouseClick("Product_XPATH");
		CommonMethods.selectByText("Product_XPATH", "ValidationAlert", "Product", 1);
		Thread.sleep(1000);
		CommonMethods.mouseClick("Assignto_XPATH");
		Thread.sleep(1000);
		CommonMethods.mouseClick("AssigntoName_XPATH");
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
		CommonMethods.mouseClick("SaveAndProceed_XPATH");
		Thread.sleep(2000);

		try {
			ScreenShot.takeSnapShot("screenshot for alert of mandatory rule 2", "Pass");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		CommonMethods.Click("CrossBar_XPATH");
		CommonMethods.input("CoreCRN_XPATH", "ValidationAlert", "Core CRN", 1);
		Thread.sleep(1000);
		CommonMethods.mouseClick("SaveAndProceed_XPATH");
		Thread.sleep(1000);
		CommonMethods.scrollAtBottom();
		Thread.sleep(1000);
		CommonMethods.mouseClick("Close_XPATH");
		extentInfo("mandatory rule checked", null);
		

		
	}
	
	
	public void ValidationAlert() throws Exception
	{
		extentInfo("Mandatory alert check Intiated", null);
		CommonMethods.mouseClick("Leadclick_XPATH");
		CommonMethods.mouseClick("newclick_XPATH");
		Thread.sleep(2000);
		CommonMethods.mouseClick("others_XPATH");
		Thread.sleep(2000);
		CommonMethods.input("Firstname_XPATH", "ValidationAlert", "First Name2", 1);
		CommonMethods.input("Lastname_XPATH", "ValidationAlert", "Last Name2", 1);
		CommonMethods.input("MobNo_XPATH", "ValidationAlert", "Mobile No2", 1);
		CommonMethods.scrollDown(10);
		CommonMethods.input("CRNNo_XPATH","ValidationAlert", "Core CRN2", 1);
		Thread.sleep(2000);
		CommonMethods.mouseClick("Product_XPATH");
		CommonMethods.selectByText("Product_XPATH", "ValidationAlert", "Product2", 1);
		Thread.sleep(1000);
		CommonMethods.mouseClick("SaveAndProceed_XPATH");
		Thread.sleep(3000);
		ScreenShot.takeSnapShot("screenshot for alert of Validation rule 1", "Pass");
			CommonMethods.Click("CrossBar_XPATH");
			CommonMethods.input("Firstname_XPATH", "ValidationAlert", "First Name", 1);
			CommonMethods.input("Lastname_XPATH", "ValidationAlert", "Last Name", 1);
			CommonMethods.input("MobNo_XPATH", "ValidationAlert", "Mobile No", 1);
			Thread.sleep(2000);
			CommonMethods.scrollDown(2);
			CommonMethods.mouseClick("Assignto_XPATH");
			Thread.sleep(3000);
			CommonMethods.switchToWindow();
			CommonMethods.mouseClick("AssigntoName_XPATH");
			Thread.sleep(1000);
			CommonMethods.switchToWindow();
			Thread.sleep(1000);
			CommonMethods.mouseClick("Product_XPATH");
			CommonMethods.selectByText("Product_XPATH", "ValidationAlert", "Product", 1);
			Thread.sleep(1000);
			CommonMethods.input("CRNNo_XPATH","ValidationAlert", "Core CRN", 1);
			Thread.sleep(2000);
			CommonMethods.mouseClick("SaveAndProceed_XPATH");
			Thread.sleep(1000);	
			CommonMethods.scrollAtBottom();
			Thread.sleep(1000);
			CommonMethods.mouseClick("EditBtn_XPATH");
			Thread.sleep(1000);
			CommonMethods.mouseClick("FollowUpNewBtn_Xpath");
			Thread.sleep(1000);
			CommonMethods.mouseClick("CalenderIcon_Xpath");
			CommonMethods.mouseClick("CalenderDate_Xpath");
			Thread.sleep(1000);
			CommonMethods.mouseClick("StopWatchIcon_Xpath");
			CommonMethods.mouseClick("SelectTime_Xpath");
			Thread.sleep(1000);
			CommonMethods.mouseClick("SaveAndProceed_XPATH");
			CommonMethods.scrollAtBottom();
			Thread.sleep(1000);
			CommonMethods.mouseClick("EditBtn_XPATH");
			Thread.sleep(1000);
			CommonMethods.mouseClick("LeadProcessing_Xpath");
			Thread.sleep(1000);
			CommonMethods.mouseClick("DocCollect_Xpath");
			Thread.sleep(1000);
			CommonMethods.mouseClick("SaveAndProceed_XPATH");
			Thread.sleep(1000);
			CommonMethods.scrollAtBottom();
			Thread.sleep(1000);
			CommonMethods.mouseClick("EditBtn_XPATH");
			Thread.sleep(1000);
			CommonMethods.mouseClick("LeadClsr_Xpath");
			Thread.sleep(1000);
			CommonMethods.mouseClick("LeadWon_Xpath");
			Thread.sleep(1000);
			CommonMethods.input("CoreCRN_XPATH", "ValidationAlert", "Core CRN2", 1);
			CommonMethods.mouseClick("SaveAndProceed_XPATH");
			Thread.sleep(3000);
			ScreenShot.takeSnapShot("screenshot for alert of Validation rule 2", "Pass");
		
			CommonMethods.Click("CrossBar_XPATH");
			Thread.sleep(1000);
			CommonMethods.input("CoreCRN_XPATH", "ValidationAlert", "Core CRN", 1);
			CommonMethods.mouseClick("SaveAndProceed_XPATH");
			Thread.sleep(1000);
			CommonMethods.scrollAtBottom();
			Thread.sleep(1000);
			CommonMethods.mouseClick("Close_Xpath");
			extentInfo("vlidation rule checked", null);
			

	}
	
	
	public void DedupeRuleAlert() throws Exception
	{
		extentInfo("Dedupe rule check Intiated", null);
		CommonMethods.mouseClick("Leadclick_XPATH");
		CommonMethods.mouseClick("newclick_XPATH");
		Thread.sleep(2000);
		CommonMethods.mouseClick("others_XPATH");
		Thread.sleep(2000);
		CommonMethods.input("Firstname_XPATH", "ValidationAlert", "First Name", 1);
		CommonMethods.input("Lastname_XPATH", "ValidationAlert", "Last Name", 1);
		CommonMethods.input("MobNo_XPATH", "ValidationAlert", "Mobile No", 1);
		Thread.sleep(2000);
		CommonMethods.mouseClick("Product_XPATH");
		CommonMethods.selectByText("Product_XPATH", "ValidationAlert", "Product", 1);
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
		CommonMethods.input("CoreCRN_XPATH", "ValidationAlert", "Core CRN", 1);
		Thread.sleep(1000);
		CommonMethods.mouseClick("SaveAndProceed_XPATH");
		Thread.sleep(1000);
		ScreenShot.takeSnapShot("Lead created", "Pass");
		Thread.sleep(1000);
		CommonMethods.scrollAtBottom();
		Thread.sleep(1000);
		CommonMethods.mouseClick("Close_XPATH");
		CommonMethods.mouseClick("Leadclick_XPATH");
		CommonMethods.mouseClick("newclick_XPATH");
		Thread.sleep(2000);
		CommonMethods.mouseClick("others_XPATH");
		Thread.sleep(2000);
		CommonMethods.input("Firstname_XPATH", "ValidationAlert", "First Name", 1);
		CommonMethods.input("Lastname_XPATH", "ValidationAlert", "Last Name", 1);
		CommonMethods.input("MobNo_XPATH", "ValidationAlert", "Mobile No", 1);
		Thread.sleep(2000);
		CommonMethods.mouseClick("Product_XPATH");
		CommonMethods.selectByText("Product_XPATH", "ValidationAlert", "Product", 1);
		Thread.sleep(1000);
		CommonMethods.mouseClick("SaveAndProceed_XPATH");
		Thread.sleep(2000);
		ScreenShot.takeSnapShot("screenshot for alert of dedupe rule 2", "Pass");

		
	}
}
