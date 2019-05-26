package capsulecrm;

import org.apache.commons.codec.binary.Base32;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capsulecrm.testcases.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='login:usernameDecorate:username']")WebElement LoginUsername;
	@FindBy(xpath="//input[@id='login:passwordDecorate:password']")WebElement Loginpassword;
	@FindBy(xpath="//input[@id='login:login']")WebElement LoginBtn;
	
	public void setusername()
	{
		LoginUsername.sendKeys("naidupcn");
	}
	public void setpassword()
	{
		Loginpassword.sendKeys("Guntur!9");
	}
	
	public void clicksubmit()
	{
		LoginBtn.click();
	}

}
