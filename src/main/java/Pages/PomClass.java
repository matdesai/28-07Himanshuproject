package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass 
{
	WebDriver driver;
	
	@FindBy (xpath = "//div[@class='pull-left logo-outer']") private WebElement Logo;
	@FindBy (id = "name") private WebElement EnterName;
	@FindBy (id = "email") private WebElement EnterEmail;
	@FindBy (id = "agreeTerms") private WebElement Checkbox;
	@FindBy (id = "form-submit") private WebElement Submit;
	@FindBy (xpath = "(//li[@class='current'])[1]") private WebElement PracticeButton;
	
	
	public PomClass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	public boolean VerifyLogo()
	{
		boolean VerifyLogo = Logo.isDisplayed();
		return VerifyLogo;
	}
//------------------------------------------------------------------------------------------------------------------------	
	public void EnterName(String Name)
	{
		EnterName.sendKeys(Name);
	}
	public void EnterEmailId(String Email)
	{
		EnterEmail.sendKeys(Email);
	}
	public void ClickCheckbox()
	{
		Checkbox.click();
	}
	public void ClickSubmitButton()
	{
		Submit.click();
	}
	public boolean VerifyPracticeButton()
	{
		boolean Practicebutton = PracticeButton.isDisplayed();
		return Practicebutton;
	}
//------------------------------------------------------------------------------------------------------------------------	

	
	
}
