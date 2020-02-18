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

import com.training.generics.ScreenShot;
import com.training.pom.RemoveAdPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RemoveAdTest {

	private WebDriver driver;
	private String baseUrl;
	private RemoveAdPOM removeAdPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	
	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		removeAdPOM = new RemoveAdPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void validLoginTest() throws InterruptedException {
		removeAdPOM.sendUserName("admin");
		removeAdPOM.sendPassword();
		removeAdPOM.clickBtna();
		removeAdPOM.clickBtnb();
		removeAdPOM.clickBtnc();
		removeAdPOM.clickBtnd();
		removeAdPOM.clicksubmitBtn();
		Thread.sleep(1000);
		 JavascriptExecutor jse=(JavascriptExecutor)driver;
	     jse.executeScript("window.scrollBy(0,500)");
	     Thread.sleep(1000);
	     removeAdPOM.memberUsername("manzoor");
	     removeAdPOM.menberads();
	     removeAdPOM.removeBtn();
		
	     Alert al=driver.switchTo().alert();
	       String alertmessage= al.getText();
	       al.accept();
	       al.accept();
	     //  driver.close();
		
		//screenShot.captureScreenShot("First");
	}
}
