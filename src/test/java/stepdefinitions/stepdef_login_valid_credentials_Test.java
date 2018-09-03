package stepdefinitions;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;

public class stepdef_login_valid_credentials_Test  {
	
	
	
	
	WebDriver driver;
	
	@Before
	public void launchapp () throws InterruptedException {
	ChromeOptions options = new ChromeOptions();
    options.addArguments("--start-maximized");
    System.setProperty("webdriver.chrome.driver", "D:\\work\\eclipsprojects\\com_s4b_cucumber\\src\\drivers\\chromedriver.exe");
    options.setBinary("D:\\Users\\myol\\AppData\\Local\\Programs\\ConnectMe_S4B2015\\ConnectMe S4B2015.exe");
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("chromeOptions", options);
    driver = new ChromeDriver(options);
    //driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
    Thread.sleep(5000);
    
    
    
	}
	
	@After
	public void exitapp()
	
	{
		
		driver.quit();
	}
	
	@Given("^S(\\d+)B is launched$")
	public void s_B_is_launched(int arg1) throws Throwable {
		
		//Thread.sleep(5000);
	
		System.out.println(driver.getWindowHandles());
		int count1=1;
		
		while(count1<2) {

        for (String hand : driver.getWindowHandles()) {
                  	
             driver.switchTo().window(hand);
            
        }
        count1 = driver.getWindowHandles().size();
		}
            
        
       
	}

	
	@When("^Enter valid UC_username$")
	public void enter_valid_UC_username() throws Throwable {
		 driver.findElement(By.id("username-kandy")).sendKeys("3221001@cucm1.spidrmulti.netas.lab.nortel.com");
	}

	@And("^Enter valid UC_paserword$")
	public void enter_valid_UC_paserword() throws Throwable {
		 driver.findElement(By.id("password-kandy")).sendKeys("12345");
	}

	@And("^Click on UC_login button$")
	public void click_on_UC_login_button() throws Throwable {
		 driver.findElement(By.xpath("//*[@id=\"login-kandy\"]/div[2]/button")).click();
	}

	@Then("^application navigates to  S(\\d+)B skype login page$")  // check for unified communications "//*[@id="login-kandy"]/div[1]/div[1]/label"
	public void application_navigates_to_S_B_skype_login_page(int arg1) throws Throwable {
		
		
	}

	@And("^Enter valid skype_username$")
	public void enter_valid_skype_username() throws Throwable {
		 driver.findElement(By.id("username-skype")).sendKeys("myol@gbsolutions.work");
	}

	@And("^Enter valid skype_pasword$")
	public void enter_valid_skype_pasword() throws Throwable {
		 driver.findElement(By.id("password-skype")).sendKeys("Lkjh1234");
		 
	}

	@When("^Click on skype_login button$")
	public void click_on_skype_login_button() throws Throwable {
		 driver.findElement(By.xpath("//*[@id=\"login-skype\"]/div[2]/button[1]")).click();
		 
		}
		 
		 
		 
	

	@Then("^save credentials  message appears$")
	public void save_credentials_message_appears() throws Throwable {
		
		
		/*System.out.println("before 10 secs");
		 System.out.println(driver.getWindowHandles());
		 System.out.println("active window");
		 System.out.println(driver.getWindowHandle());
		 System.out.println(driver.getPageSource()); */
		
		 
		
		 /*System.out.println("after 10 secs");
		 System.out.println(driver.getWindowHandles());
		 System.out.println("active window");
		 System.out.println(driver.getWindowHandle());
		 System.out.println(driver.getPageSource());*/
		 
	            }
		
		
			
			
	

	@When("^Click Ok button$")   //changed the xpath to say NO, not to save the credentials
	public void click_Ok_button() throws Throwable {
		
		/*System.out.println("before pressing save credentials button");
		 System.out.println(driver.getWindowHandles());
		 System.out.println("active window");
		 System.out.println(driver.getWindowHandle());
		 System.out.println(driver.getPageSource()); */
		 
			 driver.findElement(By.xpath("//*[@id=\"body\"]/div[3]/div[2]/div[3]/button[2]")).click();
	}

	@Then("^user reaches the main page$")
	public void user_reaches_the_main_page() throws Throwable {
		
		/*System.out.println("after pressing save credentials button");
		 System.out.println(driver.getWindowHandles());
		 System.out.println("active window");
		 System.out.println(driver.getWindowHandle());
		 System.out.println(driver.getPageSource()); */
		
		String main_page_check = driver.findElement(By.xpath("//*[@id=\"undefined-header\"]/div[1]/h1")).getText();
		if (main_page_check.contains("Contacts"))    // Contacts
		{ 
		    System.out.println("Successfully logged in, welcome to S4B");
		}
		else {
			
			System.out.println("cannot found the contacts");
			
		}
		}
	
	@And("^Click on settings_button$")
	public void Click_on_settings_button() throws Throwable {
		
		 driver.findElement(By.xpath("//*[@id=\"navigation-tab-Settings\"]/div/i")).click();
	}
	
	@And("^Click on logout_button$")
	public void Click_on_logout_button() throws Throwable {
		 driver.findElement(By.xpath("//*[@id=\"settings-view-body\"]/div/div[1]/div[5]/div/div[2]/button")).click();
	}
	
	@And("^Click on popup_logout_button$")
	public void Click_on_popup_logout_button() throws Throwable {
		 driver.findElement(By.xpath("//*[@id=\"body\"]/div[3]/div[2]/div[3]/button[1]")).click();
	}
	
	@Then("^quit the app$") 
	public void quit_the_app() throws Throwable
	{
		
		
		
	}
	}
			
	


