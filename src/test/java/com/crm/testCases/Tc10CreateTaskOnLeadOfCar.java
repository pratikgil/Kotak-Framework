package com.crm.testCases;


import org.testng.SkipException;
import org.testng.annotations.Test;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.LiabilitiesCC.ActivityCreationOnLeadOfCar;
import com.crm.pages.LiabilitiesCC.Loginpage;


public class Tc10CreateTaskOnLeadOfCar extends SetUp
{
	@Test
	public void CreateTaskOnLeadOfCar() throws Exception
	{
		//sheetName from Excel to pass the testdata
				String sheetName = "ActivityCreationOnLead";
				  
				 //To check  testcase runmode from excel (Yes/No)
				  if (!(CommonMethods.isTestRunnable("CreateTaskOnLeadOfCar", sheetName))) {

						throw new SkipException(
								"Skipping the test CreateTaskOnLead as the Run mode is NO");

	}
				 // setUpTest("ActivityCreationOnLead");
				  
				  	Loginpage L=new Loginpage(driver);
					L.CRMKotakLoginpage();
					ActivityCreationOnLeadOfCar ACL = new ActivityCreationOnLeadOfCar(driver);
					ACL.CreateTaskOnLeadOfCar();
					L.CRMKotakLogoutpage();
	
	
}

}
