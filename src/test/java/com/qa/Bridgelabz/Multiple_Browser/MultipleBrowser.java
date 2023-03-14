package com.qa.Bridgelabz.Multiple_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultipleBrowser {

	WebDriver driver;
	@Test
	public void multipleBrowser() {
		
		//Chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CZL\\eclipse-workspace\\Selenium__Automation\\Driver\\chromedriver.exe");
  		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println("Chrome Browser");
		
		//Edge broser
		System.setProperty("webdriver.edge.driver","C:\\Users\\CZL\\eclipse-workspace\\SeleniumDataDrivenFramework\\Driver\\msedgedriver.exe");
  		WebDriver driver1 = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		System.out.println("Edge Browser");
		
		//Firefox browser
		System.setProperty("webdriver.gecko.driver","C:\\Users\\CZL\\eclipse-workspace\\SeleniumDataDrivenFramework\\Driver\\geckodriver.exe");
  		WebDriver driver2 = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("Firefox Browser");
	}
	
}
	


