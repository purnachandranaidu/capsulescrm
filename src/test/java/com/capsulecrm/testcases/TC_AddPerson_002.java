package com.capsulecrm.testcases;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import capsulecrm.AddPerson;

public class TC_AddPerson_002 extends BaseClass {
	
	@Test(priority=2)
	public void Addnewperson() throws Exception
	{
		try {
			
			AddPerson person=new AddPerson();
			person.Add();
			Thread.sleep(1000);
			person.Add1();
			
			String Act=driver.findElement(By.xpath("//span[text()[normalize-space()='New Person']]")).getText();
			
			if(Act.equals("New Person"))
			{
				Assert.assertTrue(true);
				System.out.println("Add NewPerson page navigated successfully");
			}
			
			else {
				throw new Exception("Add New Person Page Navigaion fails");
			}
			
		} catch (Exception e) {
			errorMsg=e.getMessage();
			timestamp=new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
			capturescreen(driver,timestamp);
			System.out.println(e.getMessage());
			
			Assert.fail(e.getMessage());
			
		}
		
	}

}
