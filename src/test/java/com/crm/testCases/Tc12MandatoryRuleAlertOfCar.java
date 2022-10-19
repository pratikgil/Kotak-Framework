package com.crm.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.LiabilitiesCC.AlertCheckOfCar;
import com.crm.pages.LiabilitiesCC.Loginpage;

public class Tc12MandatoryRuleAlertOfCar extends SetUp
{
	@Test
	public void MandatoryAlertOfCar() throws Exception
	{
		//sheetName from Excel to pass the testdata
				String sheetName = "MandatoryAlert";
				  
				 //To check  testcase runmode from excel (Yes/No)
				  if (!(CommonMethods.isTestRunnable("MandatoryAlertOfCar", sheetName))) {

						throw new SkipException(
								"Skipping the test MandatoryAlertOfCar as the Run mode is NO");

	}
		//setUpTest("ValidationAlert");
		  Loginpage L=new Loginpage(driver);
			L.CRMKotakLoginpage();
			AlertCheckOfCar AC = new AlertCheckOfCar(driver);
			AC. MandatoryAlertOfCar();
			L.CRMKotakLogoutpage();
	
}

	
	
	
	
}
