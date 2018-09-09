package runners;

import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (
        features = {"src/test/resources/features/Message.feature"},
        glue = {"stepdefinitions"},
        plugin = {"pretty","com.cucumber.listener.ExtentCucumberFormatter:D:\\work\\eclipsprojects\\com_s4b_cucumber\\message_report.html"}
        
       )
@Test
public class message_Test extends AbstractTestNGCucumberTests {

	
	
}
