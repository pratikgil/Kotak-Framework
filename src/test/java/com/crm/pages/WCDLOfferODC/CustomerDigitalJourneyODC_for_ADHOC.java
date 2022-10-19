package com.crm.pages.WCDLOfferODC;


import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.crm.commonUtilities.CommonMethods;
import com.crm.commonUtilities.ScreenShot;
import com.crm.listeners.TestListeners;

public class CustomerDigitalJourneyODC_for_ADHOC extends TestListeners {
	public static Logger log = (Logger) LogManager.getLogger(CustomerDigitalJourneyODC_for_ADHOC.class.getName());

	public void CustomerDigitalJourney() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(2));
	
		driver.get("https://kmb.crmnext.com/sng7/vividkotak/vividflow/run/WorkingCapital_flow?ProductType=WCAD&Channel=35");
		String Title2 = driver.getTitle();
		System.out.println(Title2);

		CommonMethods.input("RegisteredMobileNoODC_XPATH", "WCDLOffer_forAdhoc", "Registered Mobile no", 1);
		Thread.sleep(2000);
		CommonMethods.input("CRNODC_XPATH", "WCDLOffer_forAdhoc", "CRN of individual", 1);
		Thread.sleep(2000);
		CommonMethods.mouseClick("NextODC_XPATH");
		Thread.sleep(2000);
		CommonMethods.mouseClick("CrossBar1ODC_XPATH");
		Thread.sleep(2000);
		CommonMethods.input("EnterOTPODC_XPATH", "WCDLOffer_forAdhoc", "Enter OTP", 1);
		Thread.sleep(2000);
		CommonMethods.mouseClick("Submit1ODC_XPATH");
		Thread.sleep(30000);
		
		
		CommonMethods.ExWait("GSTCheckBoxODC_XPATH");
		WebElement element1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[1]/div/div[2]/div[3]/div[1]/div/input"));     
        js.executeScript("arguments[0].scrollIntoView();",element1 );
        Actions actions = new Actions(driver);
        actions.moveToElement(element1).click().perform();
        Thread.sleep(4000);
        CommonMethods.mouseClick("Apply1ODC_XPATH");
        Thread.sleep(1000);
        WebElement element2 = driver.findElement(By.xpath("//input[@id='checkcheckbox2']"));
        js.executeScript("arguments[0].click();", element2);
      
		Thread.sleep(2000);
		CommonMethods.mouseClick("IagreeAndAcceptODC_XPATH");
		Thread.sleep(2000);
		CommonMethods.mouseClick("Submit2ODC_XPATH");
		Thread.sleep(2000);
		
		
		ScreenShot.takeSnapShot("Journey completed", "pass");




	}

}
