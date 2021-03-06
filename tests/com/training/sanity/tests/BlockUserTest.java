package com.training.sanity.tests;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


import com.training.generics.ScreenShot;
import com.training.pom.BlockUserPOM;

import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class BlockUserTest {
	
		private WebDriver driver;
		private String baseUrl;
		private BlockUserPOM  login1POM;
		private static Properties properties;
		private ScreenShot screenShot;

		@BeforeClass
		public  static void setUpBeforeClass() throws IOException {
			properties = new Properties();
			FileInputStream inStream = new FileInputStream("./resources/others.properties");
			properties.load(inStream);
		}

		
		@BeforeMethod
		public void setUp() throws Exception {
			driver = DriverFactory.getDriver(DriverNames.CHROME);
			login1POM = new BlockUserPOM(driver); 
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
		
		@Test
		public void validLoginTest() throws InterruptedException {
			login1POM.sendUserName("admin");
			login1POM.sendPassword();
			login1POM.clickBtna();
			login1POM.clickBtnb();
			login1POM.clickBtnc();
			login1POM.clickBtnd();
			login1POM.clicksubmitBtn();
			login1POM.clicksettings();
			login1POM.clickalertsettings();
			login1POM.clickchangeBtn();
			
			login1POM.clickGVDBtn();
			login1POM.cleartxt();
			login1POM.gvdvalue();
			login1POM.clicksavebtn();
			
			 Alert a = driver.switchTo().alert();
			  String act = a.getText();
			  a.accept();
			  Thread.sleep(1000);
			  JavascriptExecutor jse=(JavascriptExecutor)driver;
			     jse.executeScript("window.scrollBy(0,500)");
			     Thread.sleep(1000);

			  login1POM.clicklogout();
			  Thread.sleep(1000);
			  a.accept();
			/*Thread.sleep(1000);
			 JavascriptExecutor jse=(JavascriptExecutor)driver;
		     jse.executeScript("window.scrollBy(0,500)");
		     Thread.sleep(1000);*/
			  for(int i=0;i<3;i++){
			  login1POM.sendUserName("vsr123");
				login1POM.sendPassword();
				login1POM.clickBtnv();
				login1POM.clickBtns();
				login1POM.clickBtnr();
				login1POM.clickBtn1();
				login1POM.clickBtn2();
				login1POM.clickBtn2();
				login1POM.clicksubmitBtn();
				login1POM.clickback();
				login1POM.cleartxt1();   //Your login is now temporarily blocked
				
		}
		}
}
		
			  
			 
		

