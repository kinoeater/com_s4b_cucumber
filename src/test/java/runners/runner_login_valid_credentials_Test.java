package runners;

import org.testng.annotations.Test;
import cucumber.api.testng.AbstractTestNGCucumberTests; 
import cucumber.api.CucumberOptions;

@CucumberOptions (features = {"src/test/resources/features/login.feature"}, glue = {"stepdefinitions"}, plugin = {"pretty","com.cucumber.listener.ExtentCucumberFormatter:D:\\work\\eclipsprojects\\com_s4b_cucumber\\report1.html"})

@Test
public class runner_login_valid_credentials_Test extends AbstractTestNGCucumberTests {

}
