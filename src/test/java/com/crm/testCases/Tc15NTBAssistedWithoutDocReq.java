package com.crm.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.CRMKotakCC.NTBAssisted_WithoutDocumentJourneyCC;
import com.crm.pages.LiabilitiesCC.ExampleLoginPage;
import com.crm.pages.LiabilitiesCC.Loginpage;


public class Tc15NTBAssistedWithoutDocReq extends SetUp
{
@Test
	
	public void NTBAssistedJourneyWithoutDocCC() throws Exception
	{
		//sheetName from Excel to pass the testdata
		String sheetName = "NTBAssistedJourneyWithoutDocCC";
		  
		 //To check  testcase runmode from excel (Yes/No)
		  if (!(CommonMethods.isTestRunnable("NTBAssistedJourneyWithoutDocCC",sheetName ))) {

				throw new SkipException(
						"Skipping the test NTBAssistedJourneyWithoutDocCC as the Run mode is NO");
			}
		
		  ExampleLoginPage L=new ExampleLoginPage();
			L.CRMLogin(sheetName);
			
			NTBAssisted_WithoutDocumentJourneyCC NAJC = new NTBAssisted_WithoutDocumentJourneyCC();
			NAJC.NTBAssistedJourney();
			L.Logout();
	
}
}
