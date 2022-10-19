package com.crm.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.LiabilitiesCC.Loginpage;
import com.crm.pages.LiabilitiesCC.NTBAndETBLeadCreation;

public class Tc01NTB extends SetUp {


	@Test
	
	public void NTBLeadJourney() throws Exception
	{
		//sheetName from Excel to pass the testdata
		String sheetName = "NTBLeadJourney";
		  
		 //To check  testcase runmode from excel (Yes/No)
		  if (!(CommonMethods.isTestRunnable("NTBLeadJourney",sheetName ))) {

				throw new SkipException(
						"Skipping the test NTBLeadJourney as the Run mode is NO");
			}
		
			Loginpage L=new Loginpage(driver);
			L.CRMKotakLoginpage();

			NTBAndETBLeadCreation N = new NTBAndETBLeadCreation(driver);
			N.NTBleadJourney();
			L.CRMKotakLogoutpage();
	}
	

	
	
	
}
