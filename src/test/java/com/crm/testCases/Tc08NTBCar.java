package com.crm.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.LiabilitiesCC.Loginpage;
import com.crm.pages.LiabilitiesCC.NTBandETBLeadCreationOfCar;


public class Tc08NTBCar extends SetUp 
{
	@Test
	public void NTBLeadJourneyForCar() throws Exception
	{
		//sheetName from Excel to pass the testdata
				String sheetName = "NTBLeadJourney";
				  
				 //To check  testcase runmode from excel (Yes/No)
				  if (!(CommonMethods.isTestRunnable("NTBLeadJourneyForCar", sheetName)))
				  {

						throw new SkipException(
								"Skipping the test NTBLeadJourneyForCar as the Run mode is NO");
				  	}
					Loginpage L=new Loginpage(driver);
					L.CRMKotakLoginpage();

					NTBandETBLeadCreationOfCar NC = new NTBandETBLeadCreationOfCar(driver);
					NC.NTBLeadJourneyForCar();
					L.CRMKotakLogoutpage();
}
}