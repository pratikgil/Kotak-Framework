package com.crm.pages.CRMKotakCC;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.JavascriptExecutor;

import com.crm.commonUtilities.CommonMethods;
import com.crm.commonUtilities.ExcelOperation;
import com.crm.listeners.TestListeners;

public class GetOTPCC_WithDoc extends TestListeners 
{
	
	public static Logger log =(Logger) LogManager.getLogger(GetOTPCC_WithDoc.class.getName());
	
	public void GetOTP () throws Exception
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(6));
		
		driver.get("https://crmmobileuat.kotak.com/sn/app/Widget/RenderWidget?x=6negmvntcw2bf3gmm3xhvv3nmdn4s5588sf3pdwaa58h3mlmayha&winpop=1");
	
		CommonMethods.input("V_MobileNoCC_XPATH", "NTBAssistedJourneyWithoutDocCC", "Mobile No", 1);
		CommonMethods.mouseClick("FetchCC_XPATH");
		
		String OTP= CommonMethods.getElementText("OTPCC_XPATH");
		CommonMethods.highLight("OTPCC_XPATH");
		ExcelOperation.setCellData("NTBAssistedJourneyWithoutDocCC", "OTP", 1, OTP);
		
		Set<String> handles =driver.getWindowHandles();
		Iterator<String> H =handles.iterator();
		while(H.hasNext())
		{
			System.out.println(H.next());
		}
		
		System.out.println(LeadSearchPageCC_WithDoc.OTPVerification);
		
		
		
		
	}
}
