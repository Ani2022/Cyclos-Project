package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveAdPOM {
	private WebDriver driver; 
	
	public RemoveAdPOM(WebDriver driver) {
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
	
	@FindBy(xpath="//input[@id='memberUsername']")
	private WebElement memberUsername ;
	
	@FindBy(xpath="//input[@linkurl='memberAds?memberId=9']")
	private WebElement menberads;
	
	@FindBy(xpath="//img[@title='Remove']")
	private WebElement removebtn;
	
	 
	
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
	
	public void memberUsername(String aname) {
		this.memberUsername.sendKeys(aname); 
	}
	
	public void menberads() {
		this.menberads.click(); 
	}
	
	public void removeBtn() {
		this.removebtn.click(); 
	}

	}
