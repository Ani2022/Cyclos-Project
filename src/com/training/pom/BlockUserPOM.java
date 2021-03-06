package com.training.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BlockUserPOM {
		
	private WebDriver driver; 
		
		public BlockUserPOM(WebDriver driver) {
			this.driver = driver; 
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id="cyclosUsername")
		private WebElement cyclosUsername; 
		
		@FindBy(id="cyclosPassword")
		private WebElement cyclosPassword;
		
		@FindBy(xpath="//input[@value='a']")
		private WebElement buttona;
		
		@FindBy(xpath="//input[@value='b']")
		private WebElement buttonb;
		
		@FindBy(xpath="//input[@value='c']")
		private WebElement buttonc;
		
		@FindBy(xpath="//input[@value='d']")
		private WebElement buttond;
		
		@FindBy(xpath="//input[@type='submit']")
		private WebElement submitbutton;
		
		@FindBy(xpath="//*[@id='menu9']/span[2]")
		private WebElement clicksetting;
		
		
		@FindBy(xpath="//li[@id='submenu9.1']//span[@class='subMenuText']")
		private WebElement clickalert;
		
		
		@FindBy(id="modifyButton")
		private WebElement clickchange;
		
		
		@FindBy(name="setting(givenVeryBadRefs)")
		private WebElement clickenable;
		
		@FindBy(name="setting(givenVeryBadRefs)")
		private WebElement clear;
		
		@FindBy(name="setting(givenVeryBadRefs)")
		private WebElement clickvalue;
		
		
		@FindBy(id="saveButton")
		private WebElement clicksave;
		
		@FindBy(xpath="//li[@id='menu15']")
		private WebElement clicklogout;
		
		
		@FindBy(xpath="//input[@value='v']")
		private WebElement buttonv;
		
		@FindBy(xpath="//input[@value='s']")
		private WebElement buttons;
		
		@FindBy(xpath="//input[@value='r']")
		private WebElement buttonr;
		
		@FindBy(xpath="//input[@value='1']")
		private WebElement button1;
		
		@FindBy(xpath="//input[@value='2']")
		private WebElement button2;
		
		@FindBy(xpath="//input[@id='btn']")
		private WebElement backbtn;
		
		@FindBy(id="cyclosUsername")
		private WebElement clearcyclosUsername;


		//@FindBy(xpath="//input[@value='3']")
		//private WebElement button3;
		
		
		//@FindBy(xpath="//input[@type='submit']")
		//private WebElement submitbutton;
		
		
		public void sendUserName(String userName) {
			
			this.cyclosUsername.sendKeys(userName);
		}
		
		public void sendPassword() {
		
			this.cyclosPassword.click(); 
		}
		
		public void clickBtna() {
			this.buttona.click(); 
		}
		
		public void clickBtnb() {
			this.buttonb.click(); 
		}
		
		public void clickBtnc() {
			this.buttonc.click(); 
		}
		
		public void clickBtnd() {
			this.buttond.click(); 
		}
		
		public void clicksubmitBtn() {
			this.submitbutton.click(); 
		}

		public void clicksettings() {
			this.clicksetting.click(); 
		}
		
		public void clickalertsettings() {
			this.clickalert.click(); 
		}
		
		public void clickchangeBtn() {
			this.clickchange.click(); 
		}
		public void clickGVDBtn() {
			this.clickenable.click(); 
		}
		
		public void cleartxt() {
			this.clear.clear(); 
		}
		
		public void gvdvalue() {
			this.clickvalue.click(); 
		}
		
		public void clicksavebtn() {
			this.clicksave.click(); 
		}
		
		public void clicklogout() {
			this.clicklogout.click(); 
		}
			public void clickBtnv() {
				this.buttonv.click(); 
			}
			
			public void clickBtns() {
				this.buttons.click(); 
			}
			
			public void clickBtnr() {
				this.buttonr.click(); 
			}
			
			public void clickBtn1() {
				this.button1.click(); 
			}
			
			public void clickBtn2() {
				this.button2.click(); 
			}
			
			public void clickback() {
				this.backbtn.click(); 
			}

			public void cleartxt1() {
				this.clearcyclosUsername.clear(); 
			}
			public void AssertHandler()
			{
				//Assert asrt = new Assert
				// String exp = "Your login is now temporarily blocked" ;
				 // Assert.assertEquals(exp, act);

			}
			
		}



	

