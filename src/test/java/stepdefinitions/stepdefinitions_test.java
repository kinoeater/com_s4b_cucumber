package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinitions_test {
	WebDriver driver;
			
	@Before
	public void setup ( ) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\work\\drivers\\2.36\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
	    options.setBinary("D:\\Users\\myol\\AppData\\Local\\Programs\\ConnectMe_S4B2015\\ConnectMe S4B2015.exe");
	    DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	   // options.addArguments("--headless");
	    options.addArguments("--no-sandbox");  // Bypass OS security model
	    options.addArguments("--disable-gpu"); // applicable to windows os only
	    driver = new ChromeDriver(options);
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ; 
	    driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	    Thread.sleep(6000);
	    for (String hand : driver.getWindowHandles()) {
                   driver.switchTo().window(hand);
			} 
		
	    JavascriptExecutor js = (JavascriptExecutor) driver;  
	    js.executeScript("require('electron').remote.BrowserWindow.getFocusedWindow().maximize();");    //maximize the window via JS
	     
	    
	}
	
	
	@Given("^Client is launched$")
	public void client_is_launched() throws Throwable {
		
		
	   
	   // for verifying if you are in the right page
	   //String login_button_label = driver.findElement(By.xpath("//*[@id='login-kandy']/div[2]")).getText();
	   System.out.println(driver.findElement(By.xpath("//*[@id='login-kandy']/div[2]")).getText());
	   //Assert.assertEquals(login_button_label, "LOGIN");
	    
	    
	}
	    		
		
	    
		
	@And("^User enters UC username$")
	public void user_enters_UC_username() throws Throwable {
	    
		driver.findElement(By.id("username-kandy")).sendKeys("3221001@cucm1.spidrmulti.netas.lab.nortel.com");
		
			    
		    
	}

	@And("^User enters UC_password$")
	public void user_enters_UC_password() throws Throwable {
		driver.findElement(By.id("password-kandy")).sendKeys("12345");
		
	}

	@When("^User presses UCLogin$")
	public void user_presses_UCLogin() throws Throwable {
		
		driver.findElement(By.xpath("//*[@id=\"login-kandy\"]/div[2]/button")).click();
		//Thread.sleep(3000);
	}

	@Then("^User can see Skype Login Page$")
	public void user_can_see_Skype_Login_Page() throws Throwable {
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 // for verifying if you are in the right page
		   System.out.println(driver.findElement(By.xpath("//*[@id=\'login-skype\']/div[1]/div[1]/label")).getText());
		 //  String skype_username = driver.findElement(By.xpath("//*[@id=\\'login-skype\\']/div[1]/div[1]/label")).getText();
		 //  Assert.assertEquals(skype_username, "Skype For Business Username");
	}

	@And("^User enters skype username$")
	public void user_enters_skype_username() throws Throwable {
		driver.findElement(By.id("username-skype")).sendKeys("myol@gbsolutions.work");
		
	}

	@And("^User enters skype password$")
	public void user_enters_skype_password() throws Throwable {
		driver.findElement(By.id("password-skype")).sendKeys("Lkjh1234");
		
	}

	@When("^User presses SKYPELogin$")
	public void user_presses_SKYPELogin() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"login-skype\"]/div[2]/button[1]")).click();
		//Thread.sleep(5000);
	}

	@And("^User presses NO for save credentials$")
	public void user_presses_NO_for_save_credentials() throws Throwable {
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("//*[@id=\'body\']/div[3]/div[2]/div[3]/button[2]")).click();
		
		//Thread.sleep(5000);
		
	/*	if(driver.findElement(By.xpath("//*[@id=\'body\']/div[3]/div[2]/div[3]/button[2]")).isDisplayed())
		{
			
			driver.findElement(By.xpath("//*[@id=\\'body\\']/div[3]/div[2]/div[3]/button[2]")).click();
		} */
		
	}

	@Then("^User gets into main page$")
	public void user_gets_into_main_page() throws Throwable {
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	    System.out.println(driver.findElement(By.xpath("//*[@id=\'undefined-header\']/div[1]/h1")).getText());
	    Thread.sleep(3000);
	}

	@And("^User switches to Settings TAB$")
	public void user_switches_to_Settings_TAB() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"navigation-tab-Settings\"]/div/i")).click();
	}

	@And("^User presses logout button$")
	public void user_presses_logout_button() throws Throwable {
	
		driver.findElement(By.xpath("//*[@id=\"settings-view-body\"]/div/div[1]/div[5]/div/div[2]/button")).click();
		
	}

	@When("^User presses popup logout button$")
	public void user_presses_popup_logout_button() throws Throwable {
		 driver.findElement(By.xpath("//*[@id=\"body\"]/div[3]/div[2]/div[3]/button[1]")).click();
	}
	
	@Then("^User can see UC Login Page$")
	public void user_can_see_UC_Login_Page() throws Throwable {
		
			
		    	Thread.sleep(2000);
		
		
	}
	
	
	@And("^User exits the client$")
	public void user_exits_the_client() throws Throwable {
		Thread.sleep(2000);
		driver.quit();
		
		
	}

	@And("^User presses YES for save credentials$")
	public void user_presses_YES_for_save_credentials() throws Throwable {
		
			  
		driver.findElement(By.xpath("//*[@id=\'body\']/div[3]/div[2]/div[3]/button[1]")).click();
		
		
		Thread.sleep(5000);
	}

	@And("^User switches to Instant Messages TAB$")
	public void user_switches_to_Instant_Messages_TAB() throws Throwable {
		driver.findElement(By.id("navigation-tab-Instant Messages")).click();
		Thread.sleep(3000);
		
		
	}

	@And("^User switches to Calls TAB$")
	public void user_switches_to_Calls_TAB() throws Throwable {
		
		driver.findElement(By.id("navigation-tab-Calls")).click();
	    Thread.sleep(3000);
	}

	@And("^User switches to See_Me Controller TAB$")
	public void user_switches_to_See_Me_Controller_TAB() throws Throwable {
	  
		driver.findElement(By.id("navigation-tab-SeeMe Controller")).click();
	    Thread.sleep(3000);
	}

	@And("^User switches to webEx_TAB$")
	public void user_switches_to_webEx_TAB() throws Throwable {
	 		
		driver.findElement(By.id("navigation-tab-WebEx")).click();
	    Thread.sleep(3000);
	}

	

	@And("^User finds a User in the contacts$")
	public void user_finds_a_User_in_the_contacts() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"undefined-header\"]/div[2]/button/i")).click();
		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("ecem");
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys(Keys.RETURN);
		
		
	}

	@And("^User sends IM to a User$")
	public void user_sends_IM_to_a_User() throws Throwable {
		
		driver.findElement(By.xpath("//*[@id=\'sip:ecemy@gbsolutions.work-contacts-view-list-pinnedGroup\']/div[2]/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("new-message")).sendKeys("hey hey");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'conversation-input\']/fieldset/div/button/i")).click();
		Thread.sleep(4000); 
	}

	@And("^User Starts a call via dialpad$")
	public void user_Starts_a_call_via_dialpad() throws Throwable {
	
	  driver.findElement(By.xpath("//*[@id=\'list-panel\']/div[3]/button")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("search")).click();
	  driver.findElement(By.id("search")).sendKeys("35522001");
	  driver.findElement(By.id("search")).sendKeys(Keys.RETURN);
	  Thread.sleep(5000);
	  
	}

	@And("^User ends the call via endcall button$")
	public void user_ends_the_call_via_endcall_button() throws Throwable {
	    driver.findElement(By.xpath("//*[@id=\"call-view\"]/div[3]/div/button")).click();
	    Thread.sleep(2000);
	}



}
