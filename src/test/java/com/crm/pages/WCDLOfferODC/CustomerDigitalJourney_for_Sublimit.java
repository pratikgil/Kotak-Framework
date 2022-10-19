package com.crm.pages.WCDLOfferODC;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.crm.commonUtilities.CommonMethods;
import com.crm.listeners.TestListeners;

public class CustomerDigitalJourney_for_Sublimit extends TestListeners
{
	public static Logger log = (Logger) LogManager.getLogger(CustomerDigitalJourney_for_Sublimit.class.getName());
	
	public void CustomerDigitalJourney() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(2));
	
		driver.get("https://kmb.crmnext.com/sng7/vividkotak/vividflow/run/WorkingCapital_flow?ProductType=WCSB&Channel=35");
		String Title2 = driver.getTitle();
		System.out.println(Title2);

		CommonMethods.input("RegisteredMobileNoODC_XPATH", "WCDLOffer_forSublimit", "Registered Mobile no", 1);
		CommonMethods.input("CRNODC_Sublimit_XPATH", "WCDLOffer_forSublimit", "CRN of individual", 1);
		CommonMethods.mouseClick("NextODC_XPATH");
		CommonMethods.mouseClick("CrossBar1ODC_XPATH");
		CommonMethods.input("EnterOTPODC_XPATH", "WCDLOffer_forSublimit", "Enter OTP", 1);
		CommonMethods.mouseClick("Submit1ODC_XPATH");
		
		/*CommonMethods.scrollAtBottom();
		CommonMethods.ExWait("GSTCheckBoxODC_Sublimit_XPATH");
		CommonMethods.mouseClick("GSTCheckBoxODC_Sublimit_XPATH");
		CommonMethods.mouseClick("Apply1ODC_XPATH");*/
		
		js.executeScript("window.scrollBy(0,600)");
		CommonMethods.ExWait("TermsandConditionODC_sublimit_XPATH");
		log.info(CommonMethods.getElementText("TermsandConditionODC_sublimit_XPATH"));
		Thread.sleep(2000);
		CommonMethods.highLight("GSTCheckBoxODC_Sublimit_XPATH");
		CommonMethods.Click("GSTCheckBoxODC_Sublimit_XPATH");
		//CommonMethods.mouseClick("GSTCheckBoxODC_Sublimit_XPATH");
		//driver.findElement(By.xpath("//div[@id='id_79584759598428']/label")).click();
		Thread.sleep(2000);
		CommonMethods.mouseClick("Apply1ODC_XPATH");
		//driver.findElement(By.xpath("//button[@id=\"c_85599692041\"]")).click();
}
}
