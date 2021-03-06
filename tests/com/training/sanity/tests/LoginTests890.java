package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM890;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTests890 {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM890 loginPOM;
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
		loginPOM = new LoginPOM890(driver); 
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
		loginPOM.sendUserName("admin");
		loginPOM.button1();
		loginPOM.button2();
		loginPOM.button3();
		loginPOM.button4();
		loginPOM.submit();
		loginPOM.member1();
        //Thread.sleep(3000);
		
       loginPOM.grant1();  
       loginPOM.loan1();
       loginPOM.dep();
       loginPOM.subm();
       loginPOM.subm1();
       loginPOM.assert1();
       loginPOM.alert();
	}
	
	
	
}
