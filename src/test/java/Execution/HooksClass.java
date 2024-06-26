package Execution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import Pages.DriverFactory;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class HooksClass 
{
	static WebDriver driver;
	static DriverFactory DF;
	
	@BeforeAll
	public static void OpenBrowser()
	{
		 DF = new DriverFactory();
		driver = DF.InitializeBrowser("Chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	
	@AfterAll
	public static void CloseBrowser()
	{
		driver.close();
	}
	

}
