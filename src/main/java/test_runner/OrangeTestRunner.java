package test_runner;

import org.junit.runner.RunWith;

//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features = the path of the feature file
		features = "C:\\Users\\Lajja Patel\\OneDrive\\Desktop\\MySelenium57\\Cucumber\\CucumberWorkspace\\OrangeHrmBDDFm\\src\\main\\java\\features\\orange_pim.feature",  
		glue = {"step_definition"},
		monochrome = true, 
		dryRun = false // to check the mapping is proper between feature file and step defination file
		)
public class OrangeTestRunner {

}
