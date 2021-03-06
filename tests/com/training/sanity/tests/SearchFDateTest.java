package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.SearchFDatePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class SearchFDateTest {

	private WebDriver driver;
	private String baseUrl;
	private SearchFDatePOM loginPOM;
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
		loginPOM = new SearchFDatePOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
		//System.out.println("welcome");
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test
	public void validLoginTest() throws InterruptedException  {
		//System.out.println("hello");
		loginPOM.sendUserName("manzoor");
		//loginPOM.cyclosPassword();
		loginPOM.Password1();
		loginPOM.Password2();
		loginPOM.Password3();
		loginPOM.Password4();
		Thread.sleep(3000);
		loginPOM.clickLoginBtn(); 
		loginPOM.account();
		loginPOM.manageinv();
		//loginPOM.selects();
		//screenShot.captureScreenShot("First");
		loginPOM.search();
		
		
	}
}
