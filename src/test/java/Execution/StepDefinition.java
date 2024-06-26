package Execution;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pages.DriverFactory;
import Pages.PomClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition 
{
	PomClass Pom = new PomClass(DriverFactory.GetDriver());
	WebDriver driver;
	
	@Given("User should be at Login page")
	public void user_should_be_at_login_page() 
	{
	    driver = DriverFactory.GetDriver();
	    driver.get("https://rahulshettyacademy.com/practice-project");
	}

	@Then("User should be able to see Logo of the Application")
	public void user_should_be_able_to_see_logo_of_the_application() 
	{
	    boolean Logo = Pom.VerifyLogo();
	    Assert.assertTrue(Logo);
	}

	@When("User enters name as {string}")
	public void user_enters_name_as(String string) 
	{
	   Pom.EnterName(string);
	}

	@When("User enters email id as {string}")
	public void user_enters_email_id_as(String string)
	{
	    Pom.EnterEmailId(string);
	}

	@When("User clicks on the checkbox")
	public void user_clicks_on_the_checkbox() 
	{
	   Pom.ClickCheckbox();
	}

	@When("User clicks on Submit button")
	public void user_clicks_on_submit_button() 
	{
	   Pom.ClickSubmitButton();
	}

	@Then("User should get redirects to Project page")
	public void user_should_get_redirects_to_project_page() 
	{
	   boolean PracticeButton = Pom.VerifyPracticeButton();
	   Assert.assertTrue(PracticeButton);
	}

	
	
	

}
