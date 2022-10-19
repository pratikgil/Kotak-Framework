package com.crm.pages.CRMKotakCC;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.JavascriptExecutor;

import com.crm.commonUtilities.CommonMethods;
import com.crm.commonUtilities.ScreenShot;
import com.crm.listeners.TestListeners;

public class DedupeClearWidget_WithoutDoc extends TestListeners 
{

public static Logger log =(Logger) LogManager.getLogger(GetOTPCC_WithoutDoc.class.getName());
	
	public void DedupeRule () throws Exception
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		driver.get("https://crmmobileuat.kotak.com/sn/app/Widget/RenderWidget?x=6negmvntcw2b9hyncdql8vsjln9g72ratccgtuxvw97ck7y9934q&winpop=1");
		
		CommonMethods.input("MobileNoInDedupeCC_XPATH", "NTBAssistedJourneyWithoutDocCC", "Mobile No", 1);
		CommonMethods.mouseClick("FetchBtnInDedupeCC_XPATH");
		Thread.sleep(2000);
		ScreenShot.takeSnapShot("Lead has been cleared", "Pass");
		Thread.sleep(2000);
		
		CommonMethods.switchToWindow();
		
		
	}
}
