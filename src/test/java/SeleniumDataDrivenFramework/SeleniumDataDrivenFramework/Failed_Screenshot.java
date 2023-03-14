package SeleniumDataDrivenFramework.SeleniumDataDrivenFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Failed_Screenshot {
	WebDriver driver;
	
	@Test
	public void captureSceenshot() {
		
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\CZL\\eclipse-workspace\\Selenium__Automation\\Driver\\chromedriver.exe");
	  		driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			Utility.captureScreenshot(driver, "FacebookLogin");
	        driver.findElement(By.name("email1")).sendKeys("vani123");
		}
	
	@AfterMethod
	public void tearDown(ITestResult result) {
		if(ITestResult.FAILURE==result.getStatus()) {
			Utility.captureScreenshot(driver, result.getName());
		}
		driver.close();
		
	}
	

}
