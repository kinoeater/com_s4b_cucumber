package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class login {
	
	@Test
	public void launch() throws InterruptedException
	{
		WebDriver driver;
		ChromeOptions options = new ChromeOptions();
	    System.setProperty("webdriver.chrome.driver", "D:\\work\\drivers\\2.36\\chromedriver.exe");
	    options.setBinary("D:\\Users\\myol\\AppData\\Local\\Programs\\ConnectMe_S4B2015\\ConnectMe S4B2015.exe");
	    DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setCapability("chromeOptions", options);
	    driver = new ChromeDriver(options);
	    Thread.sleep(5000);
	
	    for (String hand : driver.getWindowHandles()) {
           	
            driver.switchTo().window(hand);
		}
	    
		driver.findElement(By.id("username-kandy")).sendKeys("3221001@cucm1.spidrmulti.netas.lab.nortel.com");
		driver.findElement(By.id("password-kandy")).sendKeys("12345");
		driver.findElement(By.xpath("//*[@id=\"login-kandy\"]/div[2]/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("username-skype")).sendKeys("myol@gbsolutions.work");
		driver.findElement(By.id("password-skype")).sendKeys("Lkjh1234");
		driver.findElement(By.xpath("//*[@id=\"login-skype\"]/div[2]/button[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"body\"]/div[3]/div[2]/div[3]/button[2]")).click();
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//*[@id=\"sip:musanmaz@gbsolutions.work-contacts-view-list-Other Contacts\"]/div[2]/div")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@id=\"contacts-conversation-view-header\"]/button/i")).click();
		//driver.findElement(By.xpath("//*[@id=\"new-message\"]")).sendKeys("otomasyon");
		//driver.findElement(By.xpath("//*[@id=\"conversation-input\"]/fieldset/div/button/i")).click();
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@id=\"navigation-tab-Instant Messages\"]/div/i")).click();
		driver.findElement(By.id("navigation-tab-Instant Messages")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@style=\'background-image: url(\'filesystem:https://sr1.genband.com/persistent/photoCache/cahit.yigit%40gbsolutions.work\');\'")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'new-message\']")).sendKeys("merhaba dunyali");
		driver.findElement(By.xpath("//*[@id=\"conversation-input\"]/fieldset/div/button/i")).click();
		
	}
    
}

	


