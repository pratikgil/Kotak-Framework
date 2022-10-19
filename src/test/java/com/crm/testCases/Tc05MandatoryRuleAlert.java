package com.crm.testCases;


import org.testng.SkipException;
import org.testng.annotations.Test;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.LiabilitiesCC.AlertCheck;
import com.crm.pages.LiabilitiesCC.Loginpage;



public class Tc05MandatoryRuleAlert extends SetUp 
{
	@Test
	public void MandatoryRuleAlert() throws Exception
	{
		//sheetName from Excel to pass the testdata
				String sheetName = "MandatoryAlert";
				  
				 //To check  testcase runmode from excel (Yes/No)
				  if (!(CommonMethods.isTestRunnable("MandatoryRuleAlert", sheetName))) {

						throw new SkipException(
								"Skipping the test MandatoryRuleAlert as the Run mode is NO");

	}
		//setUpTest("ValidationAlert");
		  Loginpage L=new Loginpage(driver);
			L.CRMKotakLoginpage();
			AlertCheck AC = new AlertCheck(driver);
			AC. MandatoryAlert();
			L.CRMKotakLogoutpage();
	
}
}