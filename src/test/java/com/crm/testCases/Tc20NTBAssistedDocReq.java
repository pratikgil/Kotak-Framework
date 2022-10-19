package com.crm.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.CRMKotakCC.NTBAssisted_WithDocumentRequiredJourneyCC;
import com.crm.pages.CRMKotakCC.NTBAssisted_WithoutDocumentJourneyCC;
import com.crm.pages.LiabilitiesCC.ExampleLoginPage;

public class Tc20NTBAssistedDocReq extends SetUp
{
@Test
	
	public void NTBAssistedJourneyWithDocCC() throws Exception
	{
		//sheetName from Excel to pass the testdata
		String sheetName = "NTBAssistedJourneyWithDocCC";
		  
		 //To check  testcase runmode from excel (Yes/No)
		  if (!(CommonMethods.isTestRunnable("NTBAssistedJourneyWithDocCC",sheetName ))) {

				throw new SkipException(
						"Skipping the test NTBAssistedJourneyWithDoc as the Run mode is NO");
			}
		
		  ExampleLoginPage L=new ExampleLoginPage();
			L.CRMLogin(sheetName);
			
			NTBAssisted_WithDocumentRequiredJourneyCC NAJC = new NTBAssisted_WithDocumentRequiredJourneyCC();
			NAJC.NTBAssistedJourney();
			L.Logout();
}
}
