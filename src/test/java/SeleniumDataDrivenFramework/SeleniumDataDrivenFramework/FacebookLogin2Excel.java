package SeleniumDataDrivenFramework.SeleniumDataDrivenFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;


public class FacebookLogin2Excel {
	
	@Test
	public void facebookToLogin() throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/"); 
        driver.findElement(By.id("email")).sendKeys("shivanikorwan63232@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("vani123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
        Assert.assertTrue(	driver.getTitle().contains("Facebook"));
        System.out.println("Page Title Verified-User is able to login successfully");
    	   driver.close();      
	}
	
    @DataProvider(name = "wordpressData")
	public Object[][] passData(){
    ExcelDataConfig config = new ExcelDataConfig("C:\\Users\\CZL\\eclipse-workspace\\SeleniumDataDrivenFramework\\TestData\\wordpress.xlsx");
		Object[][] data=new Object[3][2];
		
		data[0][0]="admin1";
		
		data[0][1]="demo1";
		
        data[1][0]="admin";
		
		data[1][1]="demo123";
		
        data[2][0]="admin2";
		
		data[2][1]="demo123";
		
		return data;
		
		
	}
		

}
