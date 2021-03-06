package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InvalidInsertAdPOM {

private WebDriver driver; 
	
	public InvalidInsertAdPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="cyclosUsername")
	private WebElement cyclosUsername; 
	
	@FindBy(id="cyclosPassword")
	private WebElement cyclosPassword;
	
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
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submitbutton;
	
	@FindBy(xpath="//input[@id='memberUsername']")
	private WebElement memberUsername ;
	
	@FindBy(xpath="//li[@id='menu1']//span[@class='menuText']")
	private WebElement personal ;
	
	@FindBy(xpath="//li[@id='submenu1.2']//span[@class='subMenuText']")
	private WebElement advertisement ;
	
	@FindBy(xpath="//input[@id='newButton']")
	private WebElement submit1 ;
	
	@FindBy(xpath="//input[@value='OFFER']")
	private WebElement ofrbtn;
	
	@FindBy(xpath="//input[@name='ad(title)']")
	private WebElement titletxt;
	
	@FindBy(xpath="//select[@name='ad(category)']")
	private WebElement category;
	
	@FindBy(xpath="//input[@name='ad(price)']")
	private WebElement pricetxt;
	
	@FindBy(xpath="//input[@name='ad(permanent)']")
	private WebElement notexpchkbox;
	
	@FindBy(xpath="//input[@id='publicationDate']")
	private WebElement fromdate;

	@FindBy(xpath="//*[@id='expiryDate']")
	private WebElement expirydate;
	
	@FindBy(xpath="//iframe[@title='Rich text editor, descriptionText']")
	private WebElement description;
	
	@FindBy(xpath="//input[@id='saveButton']")
	private WebElement submitbtn;
	
	public void sendUserName(String userName) {
	
		this.cyclosUsername.sendKeys(userName);
	}
	
	public void sendPassword() {
	
		this.cyclosPassword.click(); 
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

	public void clicksubmitBtn() {
		this.submitbutton.click(); 
	}
	
	public void memberUsername(String aname) {
		this.memberUsername.sendKeys(aname); 
	}
	
	public void personal() {
		this.personal.click(); 
	}
	
	public void advertisement() {
		this.advertisement.click(); 
	}
	
	public void submit1() {
		this.submit1.click(); 
	}
	
	public void ofrbtn() {
		this.ofrbtn.click(); 
	}

	public void titletxt(String text) {
		this.titletxt.sendKeys(text); 
	}
	
	public void category(String categor) {
		this.category.click(); 
		Select sel=new Select(category);
		sel.selectByVisibleText("Example ad category");
	}
	
	public void pricetext(String ptext) {
		this.pricetxt.sendKeys(ptext); 
	}
	
	public void notexpchkbox() {
		this.notexpchkbox.click(); 
	}

	public void fromdate(String fdate) {
		this.fromdate.sendKeys(fdate); 
	}
	
	public void expirydate(String edate) {
		this.expirydate.sendKeys(edate); 
	}
	
	public void description(String description) {
		this.description.sendKeys(description); 
	}
	
	public void submitbtn() {
		this.submitbtn.click(); 
	}
}
