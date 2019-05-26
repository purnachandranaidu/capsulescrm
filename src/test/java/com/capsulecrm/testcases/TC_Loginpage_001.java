package com.capsulecrm.testcases;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import capsulecrm.LoginPage;

import com.capsulecrm.testcases.BaseClass;


public class TC_Loginpage_001 extends BaseClass {
	
	@Test(priority=1)
	public void UserLogin() throws Exception
	{
		try {
			
			LoginPage login=new LoginPage();
			login.setusername();
			login.setpassword();
			login.clicksubmit();
			String Act=driver.findElement(By.xpath("//SPAN[@class='nav-bar-username'][text()='purna challa']")).getText();
			if (Act.equals("purna challa")) {
				Assert.assertTrue(true);
				System.out.println("login sucess");	
			}
			
			else
			{
				throw new Exception("Login Faild");
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
