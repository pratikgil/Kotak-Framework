package com.crm.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.LiabilitiesCC.Loginpage;
import com.crm.pages.LiabilitiesCC.NTBandETBLeadCreationOfCar;

public class Tc09ETBCar extends SetUp
{
	@Test
	public void ETBLeadJourneyForCar() throws Exception
	{
		//sheetName from Excel to pass the testdata
		String sheetName = "ETBLeadJourney";
		  
		 //To check  testcase runmode from excel (Yes/No)
		  if (!(CommonMethods.isTestRunnable("ETBLeadJourneyForCar", sheetName)))
		  {

				throw new SkipException(
						"Skipping the test ETBLeadJourneyForCar as the Run mode is NO");
		  	}
		  
		  Loginpage L=new Loginpage(driver);
			L.CRMKotakLoginpage();

			NTBandETBLeadCreationOfCar NC = new NTBandETBLeadCreationOfCar(driver);
			NC.ETBLeadJourneyForCar();
			L.CRMKotakLogoutpage();

	}
	
}
