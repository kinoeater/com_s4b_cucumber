package runners;

import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (
        features = {"src/test/resources/features/Login_Logout.feature"},
        glue = {"stepdefinitions"},
        plugin = {"pretty","com.cucumber.listener.ExtentCucumberFormatter:D:\\work\\eclipsprojects\\com_s4b_cucumber\\login_report.html"}
        
       )
@Test
public class runner_login_Test extends AbstractTestNGCucumberTests {

	
	
}
