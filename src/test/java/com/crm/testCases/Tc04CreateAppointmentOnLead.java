package com.crm.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.LiabilitiesCC.ActivityCreationOnLead;
import com.crm.pages.LiabilitiesCC.Loginpage;



public class Tc04CreateAppointmentOnLead extends SetUp
{
	@Test
	public void CreateAppointmentOnLead() throws Exception
	{
		//sheetName from Excel to pass the testdata
		String sheetName = "ActivityCreationOnLead";
		  
		 //To check  testcase runmode from excel (Yes/No)
		  if (!(CommonMethods.isTestRunnable("CreateAppointmentOnLead", sheetName))) {

				throw new SkipException(
						"Skipping the test CreateAppointmentOnLead as the Run mode is NO");

	}
		  //setUpTest("ActivityCreationOnLead");
		  Loginpage L=new Loginpage(driver);
			L.CRMKotakLoginpage();
			ActivityCreationOnLead ACL = new ActivityCreationOnLead(driver);
			ACL. CreateAppointmentOnLead();
			L.CRMKotakLogoutpage();
	
	
	
	}
	}
