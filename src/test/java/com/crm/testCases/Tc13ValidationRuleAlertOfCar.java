package com.crm.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.LiabilitiesCC.AlertCheckOfCar;
import com.crm.pages.LiabilitiesCC.Loginpage;

public class Tc13ValidationRuleAlertOfCar extends SetUp 
{
	@Test
	public void ValidationAlertOnCar() throws Exception
	{
		//sheetName from Excel to pass the testdata
		String sheetName = "ValidationAlert";
		  
		 //To check  testcase runmode from excel (Yes/No)
		  if (!(CommonMethods.isTestRunnable("ValidationAlertOnCar", sheetName))) {

				throw new SkipException(
						"Skipping the test ValidationAlertOnCar as the Run mode is NO");
	}
			//setUpTest("ValidationAlert");
			  Loginpage L=new Loginpage(driver);
				L.CRMKotakLoginpage();
				AlertCheckOfCar AC = new AlertCheckOfCar(driver);
				AC.ValidationAlertOnCar();
				L.CRMKotakLogoutpage();


}
		
	
	
	
	
	
}
