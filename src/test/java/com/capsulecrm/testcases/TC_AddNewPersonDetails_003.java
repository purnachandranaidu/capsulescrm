package com.capsulecrm.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import capsulecrm.AddNewPersonDetails;
import capsulecrm.AddPerson;

import com.capsulecrm.Utility.XLUtilites;

public class TC_AddNewPersonDetails_003 extends BaseClass {
	
	@Test(priority=3,dataProvider="registerdata",dataProviderClass=XLUtilites.class,enabled=false)
	public void AddDetails(String  fnames,String  lnames,String  jtitles,String  mblnumbs,String  emails)
	{
		try {
			AddNewPersonDetails details=new AddNewPersonDetails();
			details.fname(fnames);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			details.lname(lnames);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			details.jtitle(jtitles);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			//details.org();
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
	
	@Test(priority=4)
	
	public void verfication_person()
	{
		try {
			AddPerson add=new AddPerson();
			add.Add();
			String name=driver.findElement(By.xpath("//TD[@id='ember237']")).getText();
			
			System.out.println(name);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		
	}

}
