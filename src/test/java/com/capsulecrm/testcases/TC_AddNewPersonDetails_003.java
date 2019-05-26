package com.capsulecrm.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import capsulecrm.AddNewPersonDetails;

import com.capsulecrm.Utility.XLUtilites;

public class TC_AddNewPersonDetails_003 extends BaseClass {
	
	@Test(priority=3,dataProvider="registerdata",dataProviderClass=XLUtilites.class)
	public void AddDetails(String fnames,String lnames,String jtitles,String mblnumbs,String emails)
	{
		try {
			AddNewPersonDetails details=new AddNewPersonDetails();
			details.fname(fnames);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			details.lname(lnames);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			details.jtitle(jtitles);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			details.org();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			details.mbl(mblnumbs);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			details.mail(emails);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			details.submit();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}

}
