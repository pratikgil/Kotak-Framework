package com.crm.testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.crm.base.SetUp;
import com.crm.commonUtilities.CommonMethods;
import com.crm.pages.Kotak_OD.OD_PL_PA_Jouney;
import com.crm.pages.LiabilitiesCC.ExampleLoginPage;


public class TC19OD_PL_PA extends SetUp
{
@Test
	
	public void Kotak_OD_PL_PA() throws Exception
	{
		//sheetName from Excel to pass the testdata
		String sheetName = "Kotak_OD_PL_PA";
		  
		 //To check  testcase runmode from excel (Yes/No)
		  if (!(CommonMethods.isTestRunnable("Kotak_OD_PL_PA",sheetName ))) {

				throw new SkipException(
						"Skipping the test WCDLOffer_forRenewal as the Run mode is NO");
			}
		
		  ExampleLoginPage L=new ExampleLoginPage();
			L.CRMLogin(sheetName);
			
			OD_PL_PA_Jouney OPPJ=new OD_PL_PA_Jouney();
			OPPJ.OD_PL_PA();
			L.Logout();
	}

}
