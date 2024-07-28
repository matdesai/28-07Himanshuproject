package Execution;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features = {"src\\test\\resources\\FeatureFiles\\RahulShettyApplication.feature"},
		
		publish = true,

		plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
		
)




public class RunnerClass extends AbstractTestNGCucumberTests
{

}
