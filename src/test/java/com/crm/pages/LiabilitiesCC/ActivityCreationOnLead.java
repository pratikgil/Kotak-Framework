package com.crm.pages.LiabilitiesCC;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.crm.commonUtilities.CommonMethods;
import com.crm.commonUtilities.ScreenShot;
import com.crm.listeners.TestListeners;

public class ActivityCreationOnLead extends TestListeners 

{
	public ActivityCreationOnLead(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public static org.apache.logging.log4j.Logger log =LogManager.getLogger(ActivityCreationOnLead.class.getName());
	
	//Activity creation on Lead

	
	
	public void CreateTaskOnLead() throws Exception
	{
		extentInfo("Task on lead Intiated", null);
		CommonMethods.mouseClick("Leadclick_XPATH");
		CommonMethods.mouseClick("newclick_XPATH");
		Thread.sleep(2000);
		CommonMethods.mouseClick("others_XPATH");
		Thread.sleep(2000);
		CommonMethods.input("Firstname_XPATH", "ActivityCreationOnLead", "First Name", 1);
		CommonMethods.input("Lastname_XPATH", "ActivityCreationOnLead", "Last Name", 1);
		CommonMethods.input("MobNo_XPATH", "ActivityCreationOnLead", "Mobile No", 1);
		Thread.sleep(2000);
		CommonMethods.mouseClick("Product_XPATH");
		CommonMethods.selectByText("Product_XPATH", "ActivityCreationOnLead", "Product", 1);
		Thread.sleep(1000);
		CommonMethods.mouseClick("SaveAndProceed_XPATH");
		Thread.sleep(1000);
		CommonMethods.mouseClick("ToggleBtn_XPATH");
		Thread.sleep(1000);
		CommonMethods.mouseClick("ActivityTab_XPATH");
		Thread.sleep(1000);
		CommonMethods.mouseClick("NewTask_XPATH");
		CommonMethods.switchToWindow();
		Thread.sleep(1000);
		CommonMethods.mouseClick("Subject_XPATH");
		CommonMethods.input("Subject_XPATH", "ActivityCreationOnLead", "Task", 1);
		CommonMethods.mouseClick("Popup_SaveBtn_XPATH");
		CommonMethods.switchToWindow();
		Thread.sleep(2000);
		extentInfo("New task created", null);
		Thread.sleep(1000);
		CommonMethods.mouseClick("ToggleBtn_XPATH");
		CommonMethods.ExWait("ActivityPage_XPATH");
		Thread.sleep(2000);
		ScreenShot.takeSnapShot("task creation successfull screenshot", "pass");
		CommonMethods.mouseClick("Close_XPATH");

		

	}
	
	public void CreateAppointmentOnLead () throws Exception
	{
		extentInfo("Appointment on lead Intiated", null);
		CommonMethods.mouseClick("Leadclick_XPATH");
		CommonMethods.mouseClick("newclick_XPATH");
		Thread.sleep(2000);
		CommonMethods.mouseClick("others_XPATH");
		Thread.sleep(2000);
		CommonMethods.input("Firstname_XPATH", "ActivityCreationOnLead", "First Name", 1);
		CommonMethods.input("Lastname_XPATH", "ActivityCreationOnLead", "Last Name", 1);
		CommonMethods.input("MobNo_XPATH", "ActivityCreationOnLead", "Mobile No", 1);
		Thread.sleep(2000);
		CommonMethods.mouseClick("Product_XPATH");
		CommonMethods.selectByText("Product_XPATH", "ActivityCreationOnLead", "Product", 1);
		Thread.sleep(1000);
		CommonMethods.mouseClick("SaveAndProceed_XPATH");
		Thread.sleep(1000);
		CommonMethods.mouseClick("ToggleBtn_XPATH");
		Thread.sleep(1000);
		CommonMethods.mouseClick("ActivityTab_XPATH");
		Thread.sleep(1000);
		CommonMethods.mouseClick("NewAppointment_XPATH");
		CommonMethods.switchToWindow();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		CommonMethods.mouseClick("Popup_CalenderIcon_XPATH");
		CommonMethods.mouseClick("Popup_CalenderDate_XPATH");
		Thread.sleep(1000);
		CommonMethods.mouseClick("Popup_TimerIcon_XPATH");
		CommonMethods.mouseClick("Popup_Time_XPATH");
		Thread.sleep(2000);
		CommonMethods.scrollAtBottom();
		CommonMethods.mouseClick("Subject_XPATH");
		CommonMethods.input("Subject_XPATH", "ActivityCreationOnLead", "Appointment", 1);
		Thread.sleep(2000);
		CommonMethods.mouseClick("Popup_SaveBtn_XPATH");
		CommonMethods.switchToWindow();
		Thread.sleep(3000);
		ScreenShot.takeSnapShot("check appointment creation", "pass");
		CommonMethods.mouseClick("ToggleBtn_XPATH");
		CommonMethods.ExWait("ActivityPage_XPATH");
		Thread.sleep(5000);
		ScreenShot.takeSnapShot("Appointment successfully created screenshot", "pass");



		
		
	}
}
