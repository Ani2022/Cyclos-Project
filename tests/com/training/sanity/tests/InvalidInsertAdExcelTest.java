package com.training.sanity.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.InvalidInsertAdPOM;
import com.training.pom.RemoveAdPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


public class InvalidInsertAdExcelTest {
 
	private WebDriver driver;
	private String baseUrl;
	private InvalidInsertAdPOM adPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public  void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		adPOM = new InvalidInsertAdPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}
	@Test()
	public void validLoginTest() throws InterruptedException {
		adPOM.sendUserName("vsr12");
		adPOM.sendPassword();
		adPOM.clickBtnv();
		adPOM.clickBtns();
		adPOM.clickBtnr();
		adPOM.clickBtn1();
		adPOM.clickBtn2();
		adPOM.clicksubmitBtn();
		Thread.sleep(1000);
		adPOM.personal();
	}
		
		@Test(priority = 1,dataProvider="cyclos",dataProviderClass=LoginDataProviders.class)
		public void validLoginTest(String Title,String category, String Price,String fdate,String edate,String Description) throws InterruptedException {
			{	
	     
	    adPOM.advertisement();
	    adPOM.submit1();
	    adPOM.ofrbtn();
	    adPOM.titletxt(Title);
	    adPOM.category(category);
	    
	    adPOM.pricetext(Price);
	    adPOM.notexpchkbox();
	    adPOM.fromdate(fdate);
	    adPOM.expirydate(edate);
	    driver.switchTo().parentFrame();
	    adPOM.description(Description);
	    adPOM.submitbtn();
	    Thread.sleep(1000);

	   Alert al=driver.switchTo().alert();
	       String alertmessage= al.getText();
	       al.accept();
	     
		    	}
		}
}

	
