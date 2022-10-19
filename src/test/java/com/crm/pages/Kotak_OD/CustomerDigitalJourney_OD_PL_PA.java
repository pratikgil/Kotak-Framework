package com.crm.pages.Kotak_OD;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.JavascriptExecutor;

import com.crm.listeners.TestListeners;

public class CustomerDigitalJourney_OD_PL_PA extends TestListeners
{
	public static Logger log = (Logger) LogManager.getLogger(CustomerDigitalJourney_OD_PL_PA.class.getName());

	public void CustomerDigitalJourney() throws Exception 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(2));
		
		driver.get("https://kmb.crmnext.com/sng7/vividkotak/vividflow/run/personal_loan?ProductID=150&ProductCategoryID=148&Channel=35");
		String Title2 = driver.getTitle();
		System.out.println(Title2);

	}
}
