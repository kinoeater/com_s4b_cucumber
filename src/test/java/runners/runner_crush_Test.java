package runners;

import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (
        features = {"src/test/resources/features/Crush_Test.feature"},
        glue = {"stepdefinitions"},
        plugin = {"pretty","com.cucumber.listener.ExtentCucumberFormatter:D:\\work\\eclipsprojects\\com_s4b_cucumber\\report1.html"}
        
       )
@Test
public class runner_crush_Test extends AbstractTestNGCucumberTests {

	
	
}
