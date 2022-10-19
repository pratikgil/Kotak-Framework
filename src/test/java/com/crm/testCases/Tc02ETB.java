package com.crm.testCases;


import org.testng.SkipException;
import org.testng.annotations.Test;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.LiabilitiesCC.Loginpage;
import com.crm.pages.LiabilitiesCC.NTBAndETBLeadCreation;



public class Tc02ETB extends SetUp
{
	@Test
	
	public void ETBLeadJourney() throws Exception
	{
		//sheetName from Excel to pass the testdata
		String sheetName = "ETBLeadJourney";
		  
		 //To check  testcase runmode from excel (Yes/No)
		  if (!(CommonMethods.isTestRunnable("ETBLeadJourney", sheetName))) {

				throw new SkipException(
						"Skipping the test ETBLeadJourney as the Run mode is NO");
			}
		  
		//setUpTest("ETBLeadJourney");
		Loginpage L=new Loginpage(driver);
		L.CRMKotakLoginpage();

		NTBAndETBLeadCreation N = new NTBAndETBLeadCreation(driver);
		N.ETBLeadJourney(sheetName);
		L.CRMKotakLogoutpage();
	}
	

	

	
}
