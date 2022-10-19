package com.crm.pages.Kotak_OD;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.crm.commonUtilities.CommonMethods;
import com.crm.listeners.TestListeners;

public class KMBClearScript_OD_PL_PA extends TestListeners
{
	public static Logger  log =(Logger) LogManager.getLogger(KMBClearScript_OD_PL_PA.class.getName());

	public void ClearOffer() throws Exception
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get("https://kmb.crmnext.com/sng7/app/Widget/RenderWidget?x=6negmvntcw2b9yzqlcanste7lmj4l8gqqwzhbazm9hf6ambewvda&winpop=1");
		String Title3 = driver.getTitle();
		System.out.println(Title3);
		
		Thread.sleep(2000);
		CommonMethods.input("CRN_text_Box_XPATH", "Kotak_OD_PL_PA", "CRN of individual", 1);
		Thread.sleep(2000);
		CommonMethods.mouseClick("Fetch_Button_XPATH");
		Thread.sleep(4000);
		CommonMethods.mouseClick("ReFetch_Button_XPATH");
		Thread.sleep(4000);
		WebElement CRN_txtbox= driver.findElement(By.xpath("//input[@data-autoid='100000000_ctrl']"));
		CRN_txtbox.clear();
		//Thread.sleep(4000);
		//CommonMethods.input("CRN_text_Box_XPATH", "Kotak_OD_PL_PA", "CRN of borrowing entity", 1);
		//Thread.sleep(4000);
		//CommonMethods.mouseClick("Fetch_Button_XPATH");
		//Thread.sleep(4000);
		//CommonMethods.mouseClick("ReFetch_Button_XPATH");
		//Thread.sleep(5000);
		driver.navigate().refresh();
		
		CommonMethods.input("Offer_Id_text_Box_XPATH", "Kotak_OD_PL_PA", "Offer Id", 1);
		Thread.sleep(5000);
		CommonMethods.mouseClick("Fetch_Button_XPATH");
		
		CommonMethods.switchToWindowByTitle("CRMnext - Smart.Easy.Complete"); 
	}

}
