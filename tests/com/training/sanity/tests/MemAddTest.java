package com.training.sanity.tests;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.pom.AdddvertisementPOM;
import com.training.pom.AdminPOM;
import com.training.pom.MemAddPOM;
import com.training.pom.LogPOM;
import com.training.pom.MemPayPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class MemAddTest {
  
	private WebDriver driver;
	private String baseUrl;
	private MemAddPOM addpom;
	private LogPOM logpom;
	private MemPayPOM mempom;
	private AdminPOM adminpom;
	private static Properties properties;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		addpom = new MemAddPOM(driver);
		logpom = new LogPOM(driver);
		mempom = new MemPayPOM(driver);
		adminpom = new AdminPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		driver.get(baseUrl);
	}
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(1000);
		//driver.quit();
	}
	
	
	@Test (priority = 1)
	public void Step1() {
		
		logpom.sendcyclosUsername("Kavya");
		logpom.clickcyclosPassword();
		logpom.clickButton1();
		logpom.clickButton2();
		logpom.clickButton3();
		logpom.clickButton4();
		logpom.clickButton5();
		logpom.clickButton6();
		logpom.clickSubmitbtn();
		
		addpom.clickPersonal();
		addpom.clickContacts();
		addpom.sendMemLogin("Kavya");
	//	compom.sendMemName("Kavya");
		addpom.clickSubtn1();
		addpom.clickAddContact();
		addpom.clickSubtn2();
		addpom.sendAmount("5");
	    addpom.sendDescription("Welcom");
	    addpom.clickSubtn3();
	    addpom.clickSubtn4();
	    addpom.clickLogOut();
	
	    logpom.sendcyclosUsername("Kavya");
		logpom.clickcyclosPassword();
		logpom.clickButton1();
		logpom.clickButton2();
		logpom.clickButton3();
		logpom.clickButton4();
		logpom.clickButton5();
		logpom.clickButton6();
		logpom.clickSubmitbtn();
	    
		mempom.Account();
		mempom.clickInfo();
		addpom.clickView();
	    
		addpom.clickBack();
	}
}