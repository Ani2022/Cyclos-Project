package com.training.sanity.tests;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.GrantLoanMemberPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;


public class GrantLoanMemberTest {

private WebDriver driver;
private String baseUrl;
private GrantLoanMemberPOM complexPOM;
private static Properties properties;
private ScreenShot screenShot;

@BeforeClass
public static void setUpBeforeClass() throws IOException  {
properties = new Properties();
FileInputStream inStream = new FileInputStream("./resources/others.properties");
properties.load(inStream);
}

@BeforeMethod
public void setUp()throws Exception {
driver = DriverFactory.getDriver(DriverNames.CHROME);
complexPOM = new GrantLoanMemberPOM(driver);
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
@Test(dataProvider="cyclos",dataProviderClass=LoginDataProviders.class)
public void ComplexTesto(String Member_Login,String Amount,String Description){
	complexPOM.cyclosUsername("admin");
	complexPOM.cyclosPassword();
	complexPOM.password1();
	complexPOM.password2();
	complexPOM.password3();
	complexPOM.password4();
	complexPOM.login();
	complexPOM.membername(Member_Login);
	complexPOM.grant();
	complexPOM.amount(Amount);
	complexPOM.description(Description);
	complexPOM.submit1();
	complexPOM.submit2();

	
	
	
}}