package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.SearchMemberPOM;
//import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class SearchMemberTest {

private WebDriver driver;
private String baseUrl;
//private LoginPOM loginPOM;
private SearchMemberPOM mediumPOM1;
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
//loginPOM = new LoginPOM(driver);
 mediumPOM1 = new SearchMemberPOM(driver);
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
public void validLoginTest() throws Exception {
	
	mediumPOM1.sendUsername("manzoor");
	mediumPOM1.password1();
	mediumPOM1.password2();
	mediumPOM1.password3();
	mediumPOM1.password4();
	mediumPOM1.clickLoginBtn();
	mediumPOM1.clickAccount();
	mediumPOM1.accountInformation();
	mediumPOM1.modeButton();
	mediumPOM1.memberUsername("manzoor");
	mediumPOM1.memberName("manzoor");
	mediumPOM1.description("loan");
	mediumPOM1.dateBox("12/02/2019");
	mediumPOM1.dateBox1("12/02/2019");
	mediumPOM1.sel1();
	mediumPOM1.submitBtn1();
	driver.close();
}}
	
	

