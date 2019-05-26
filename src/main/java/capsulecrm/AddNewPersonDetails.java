package capsulecrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.capsulecrm.testcases.BaseClass;

public class AddNewPersonDetails extends BaseClass {
	
	public AddNewPersonDetails(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="party:fnDecorate:fn")WebElement Firstname;
	@FindBy(name="party:lnDecorate:ln")WebElement Lastname;
	@FindBy(name="party:roleDecorate:jobTitle")WebElement Jobtitle;
	@FindBy(name="party:orgDecorate:org")WebElement Organisation;
	@FindBy(name="party:j_id304:0:phnDecorate:number")WebElement Phone;
	@FindBy(name="party:j_id321:0:emlDecorate:nmbr")WebElement Email;
	@FindBy(name="party:save")WebElement Savebtn;
	
	public void fname(String ffname)
	{
		Firstname.sendKeys(ffname);
	}
	public void lname(String llname)
	{
		Lastname.sendKeys(llname);
	}
	public void jtitle(String jname)
	{
		Jobtitle.sendKeys(jname);
	}
	public void org()
	{
		Select dropdown = new Select(driver.findElement(By.name("party:orgDecorate:org")));
		dropdown.selectByVisibleText("Microsoft");
	}
	public void mbl(String mblnum)
	{
		Phone.sendKeys(mblnum);
	}
	public void mail(String mmail)
	{
		Email.sendKeys(mmail);
	}
	
	public void submit()
	{
		Savebtn.click();
	}
	

}
