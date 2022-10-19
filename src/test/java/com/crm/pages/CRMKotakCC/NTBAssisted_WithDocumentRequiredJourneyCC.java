package com.crm.pages.CRMKotakCC;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;

import com.crm.commonUtilities.CommonMethods;
import com.crm.commonUtilities.ExcelOperation;
import com.crm.listeners.TestListeners;

public class NTBAssisted_WithDocumentRequiredJourneyCC extends TestListeners
{

	LeadSearchPageCC_WithDoc LSC = new LeadSearchPageCC_WithDoc();
	DedupeClearWidget_WithDoc DCW= new DedupeClearWidget_WithDoc();
	GetOTPCC_WithoutDoc GOC = new GetOTPCC_WithoutDoc();

	public static String Title2CDJ;
	public static String OTPVerification;

	public static Logger log = (Logger) LogManager.getLogger(NTBAssisted_WithoutDocumentJourneyCC.class.getName());

	public void NTBAssistedJourney() throws Exception 
	{
		extentInfo("NTBAssistedJourney Intiated", "");
		Thread.sleep(2000);
		
		DCW.DedupeRule();                                                                //dedupe rule 
		
		driver.navigate().refresh();
		CommonMethods.mouseHover("QuickLinksCC_XPATH");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[2]/div/div[2]/div/div[2]/ul/li[8]/a/span[1]")).click();
		
		log.info("digital card journey initiated");
		CommonMethods.switchToWindow();                                                // digital card journey
		Thread.sleep(2000);
		
		CommonMethods.mouseClick("ProceedCC_XPATH");
		CommonMethods.mouseClick("DiningAndMoviesCC_XPATH");
		CommonMethods.selectByText("MonthlyIncomeCC_XPATH", "NTBAssistedJourneyWithDocCC", "Monthly Income", 1);
		CommonMethods.mouseClick("Proceed2CC_XPATH");
		CommonMethods.scrollAtBottom();
		CommonMethods.mouseClick("LeaguePlatinumCC_XPATH");
		CommonMethods.scrollAtBottom();
		CommonMethods.mouseClick("proceed3CC_XPATH");

		CommonMethods.input("FirstNameCC_XPATH", "NTBAssistedJourneyWithDocCC", "First Name", 1);    // basic detail 1
		CommonMethods.input("LastNameCC_XPATH", "NTBAssistedJourneyWithDocCC", "Last Name", 1);
		CommonMethods.highLight("PincodeCC_XPATH");
		CommonMethods.input("PincodeCC_XPATH", "NTBAssistedJourneyWithDocCC", "Pincode", 1);
		Thread.sleep(10000);

		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	
		CommonMethods.input("MobileNoCC_XPATH", "NTBAssistedJourneyWithDocCC", "Mobile No", 1);
		CommonMethods.input("EmailIdCC_XPATH", "NTBAssistedJourneyWithDocCC", "Work Email Id", 1);
		CommonMethods.mouseClick("proceed4CC_XPATH");

		String ReferanceNo = CommonMethods.getElementText("ReferanceNoCC_XPATH");
		ExcelOperation.setCellData("NTBAssistedJourneyWithDocCC", "ReferanceNo", 1, ReferanceNo);
		CommonMethods.highLight("ReferanceNoCC_XPATH");
		Thread.sleep(2000);
		
		String Title2CDJ=driver.getTitle();
		System.out.println(Title2CDJ);

		LSC.LeadSearch1();                                                         // CALLING LEAD SEARCH CLASS

		CommonMethods.mouseClick("Proceed4CC_XPATH");

		CommonMethods.mouseClick("CalenderIconCC_XPATH");                          // basic details
		CommonMethods.Click("CalenderIconCC_XPATH");
		Thread.sleep(1000);
		CommonMethods.Click("YearSelectCC_XPATH");
		CommonMethods.selectByText("YearSelectCC_XPATH", "NTBAssistedJourneyWithDocCC", "Year", 1);
		Thread.sleep(1000);
		CommonMethods.Click("MonthSelectCC_XPATH");
		CommonMethods.selectByText("MonthSelectCC_XPATH", "NTBAssistedJourneyWithDocCC", "Month", 1);
		Thread.sleep(1000);
		CommonMethods.mouseClick("DateSelectCC_XPATH");
		CommonMethods.selectByText("OccupationCC_XPATH", "NTBAssistedJourneyWithDocCC", "Occupation", 1);
		CommonMethods.input("CompanyNameCC_XPATH", "NTBAssistedJourneyWithDocCC", "Company Name", 1);
		CommonMethods.input("PANCardCC_XPATH", "NTBAssistedJourneyWithDocCC", "PAN Card", 1);
		CommonMethods.selectByText("GenderCC_XPATH", "NTBAssistedJourneyWithDocCC", "Gender", 1);
		CommonMethods.input("WorkEmailIdCC_XPATH", "NTBAssistedJourneyWithDocCC", "Work Email Id", 1);
		CommonMethods.selectByText("IndustryTypeCC_XPATH", "NTBAssistedJourneyWithDocCC", "Industry Type", 1);
		CommonMethods.input("PromoCodeCC_XPATH", "NTBAssistedJourneyWithDocCC", "Promo Code", 1);
		CommonMethods.mouseClick("LCL3CC_XPATH");
		Thread.sleep(3000);
		CommonMethods.mouseClick("Proceed5CC_XPATH");

		CommonMethods.input("MothersNameCC_XPATH", "NTBAssistedJourneyWithDocCC", "Mothers Name", 1);       // personal details
		CommonMethods.input("FathersNameCC_XPATH", "NTBAssistedJourneyWithDocCC", "Fathers Name", 1);
		CommonMethods.mouseClick("SingleCC_XPATH");
		CommonMethods.input("PermanentAddressCC_XPATH", "NTBAssistedJourneyWithDocCC", "Permanent Address", 1);
		CommonMethods.input("Pincode2CC_XPATH", "NTBAssistedJourneyWithDocCC", "Pincode", 1);
		Thread.sleep(3000);
		CommonMethods.mouseClick("CAisPACheckboxCC_XPATH");
		Thread.sleep(2000);
		CommonMethods.mouseClick("NextBtnCC_XPATH");

		CommonMethods.input("DesignationCC_XPATH", "NTBAssistedJourneyWithDocCC", "Designation", 1);        // EMPLOYMENT DETAILS
		CommonMethods.input("Pincode3CC_XPATH", "NTBAssistedJourneyWithDocCC", "Pincode", 1);
		Thread.sleep(2000);
		CommonMethods.input("AddressLine1CC_XPATH", "NTBAssistedJourneyWithDocCC", "Permanent Address", 1);
		CommonMethods.mouseClick("NextBtn2CC_XPATH");
		Thread.sleep(2000);

		CommonMethods.Click("CommunicationAddressCC_XPATH");
		CommonMethods.highLight("CommunicationAddressCC_XPATH");
		CommonMethods.selectByText("CommunicationAddressCC_XPATH", "NTBAssistedJourneyWithDocCC", "Communication Address", 1); // name on card
		Thread.sleep(2000);
		CommonMethods.Click("FeeCodeCC_XPATH");
		CommonMethods.highLight("FeeCodeCC_XPATH");
		CommonMethods.selectByText("FeeCodeCC_XPATH", "NTBAssistedJourneyWithDocCC", "Fee Code", 1);
		CommonMethods.mouseClick("Proceed6CC_XPATH");
                         
		CommonMethods.switchToWindowById(LeadSearchPageCC_WithoutDoc.WindowId);          //switch to lead search tab

		LSC.Leadsearch2();                                                    //refreshing lead search to get second NIU link
		
		Thread.sleep(3000);
		CommonMethods.mouseClick("EmailIdCheckBox_XPATH");                    //here comes document upload stage
		Thread.sleep(3000);
		CommonMethods.mouseClick("Proceed7CC_XPATH");
		Thread.sleep(2000);
		
	}
}
