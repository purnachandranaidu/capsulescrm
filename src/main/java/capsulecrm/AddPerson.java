package capsulecrm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capsulecrm.testcases.BaseClass;

public class AddPerson extends BaseClass {
	
	public AddPerson()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@id='ember18']") WebElement AddPerson;
	@FindBy(xpath="//a[text()='Add Person']")WebElement Addperson1;
	
	public void Add()
	{
		AddPerson.click();
		
	}
	
	public void Add1() throws Exception
	{
		Thread.sleep(1000);
		Addperson1.click();
		
	}
	
	
	

}
