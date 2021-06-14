package com.inetbanking.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.inetbanking.utilities.BaseClass;

public class Intermediate extends BaseClass {
	
	Actions action = new Actions(driver);
	WebDriverWait wait=new WebDriverWait(driver, 20);
	
	//***************Element List Start ******************//
	
	//********Home Page**********//
	WebDriver ldriver;
	@FindBy(xpath="//*[contains(@class, 'three')]//*[contains(@class, 'glyphicon')]")
	WebElement btnDownArrowInt;

	//*******Input Form*********//
	@FindBy(xpath="//div[@class='list-group']//a[text()='Input Form with Validations']")
	WebElement lblInputformDemo;
	@FindBy(xpath="//input[@name='first_name']")
	WebElement txtFirstname;
	@FindBy(xpath="//input[@name='last_name']")
	WebElement txtLastname;
	@FindBy(xpath="//input[@name='email']")
	WebElement txtEmail;
	@FindBy(xpath="//input[@name='phone']")
	WebElement txtPhone;
	@FindBy(xpath="//input[@name='address']")
	WebElement txtAddress;
	@FindBy(xpath="//input[@name='city']")
	WebElement txtCity;
	@FindBy(xpath="//select[@name='state']")
	WebElement selectState;
	@FindBy(xpath="//input[@name='zip']")
	WebElement txtZip;
	@FindBy(xpath="//input[@name='website']")
	WebElement txtWebSite;
	@FindBy(xpath="//input[@name='hosting' and @value='yes']")
	WebElement btnHosting;
	@FindBy(xpath="//textarea[@name='comment']")
	WebElement txtArea;
	@FindBy(xpath="//button[contains(text(),'Send')]")
	WebElement btnSend;
	
	//*********Data Filter**********//
	@FindBy(xpath="//div[@class='list-group']//a[text()='Data List Filter']")
	WebElement lblDataFilterDemo;
	@FindBy(xpath="//input[@id='input-search']")
	WebElement txtInputSearch;
	@FindBy(xpath="//span[contains(text(),'321-456-1111')]")
	WebElement lblPhoneTyreese;
	@FindBy(xpath="//span[contains(text(),'644-555-2222')]")
	WebElement lblPhoneBrenda;
	
	//*******Progress Bar********//
	@FindBy(xpath="//div[@class='list-group']//a[text()='Progress Bar Modal']")
	WebElement lblProgressbar;
	@FindBy(xpath="//button[contains(@onclick,'2000')]")
	WebElement btnshowDialog1;
	@FindBy(xpath="//button[contains(@onclick,'3000')]")
	WebElement btnshowDialog2;
	@FindBy(xpath="//button[contains(@onclick,'5000')]")
	WebElement btnshowDialog3;
	@FindBy(xpath="//div[contains(@class,'progress-bar')]")
	WebElement barProgressBar;
	//***************Element List End ******************//
	
	public Intermediate(WebDriver rdriver){
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	public void fnOpenForm(WebElement element, WebElement elementConf) throws InterruptedException {
		logger.info("Inside fnOpenForm");
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(btnDownArrowInt));
		action.moveToElement(btnDownArrowInt);
		btnDownArrowInt.click();
		action.moveToElement(element);
		wait.until(ExpectedConditions.visibilityOf(element));
		Assert.assertTrue(element.isDisplayed(), "Verify if the link to open page is displayed");
		logger.info("Down arrow button is clicked");
		element.click();
		wait.until(ExpectedConditions.visibilityOf(elementConf));
		Assert.assertTrue(elementConf.isDisplayed(), "Verify if the page is opened");
		logger.info("page has been opened");
		
	}
	
	public void  fnInputForm() throws InterruptedException {
		fnOpenForm(lblInputformDemo,txtFirstname);
		Thread.sleep(3000);
	}
	
	public void fnFillInputForm() throws InterruptedException {
		txtFirstname.sendKeys("FirstName");
		txtLastname.sendKeys("LastName");
		txtEmail.sendKeys("First_Last@test.com");
		txtPhone.sendKeys("(312)3123312");
		txtAddress.sendKeys("AddressStreetCityStateEarth");
		Select drpdwn = new Select(selectState);
		drpdwn.selectByIndex(4);
		txtCity.sendKeys("Iova");
		txtZip.sendKeys("24234");
		txtWebSite.sendKeys("FirstName@mozambi.com");
		btnHosting.click();
		txtArea.sendKeys("This is my comment - AddressStreetCityStateEarth");
		btnSend.click();
		Thread.sleep(5000);
		
	}
	
	public void  fnDataFilter() throws InterruptedException {
		fnOpenForm(lblDataFilterDemo,txtInputSearch);
		Thread.sleep(3000);
	}
	
	public void fnFillDataFilter() throws InterruptedException {
		txtInputSearch.sendKeys("Tyreese");
		Assert.assertTrue(lblPhoneTyreese.isDisplayed());
		Assert.assertFalse(lblPhoneBrenda.isDisplayed());
		Thread.sleep(3000);
	}
	
	public void fnProgressBar() throws InterruptedException {
		fnOpenForm(lblProgressbar,btnshowDialog1);
		Thread.sleep(3000);
	}
	
	public void fnFillProgressbar() {
		btnshowDialog1.click();
		wait.until(ExpectedConditions.invisibilityOf(barProgressBar));
		wait.until(ExpectedConditions.visibilityOf(btnshowDialog2));
		btnshowDialog2.click();
		wait.until(ExpectedConditions.invisibilityOf(barProgressBar));
		wait.until(ExpectedConditions.visibilityOf(btnshowDialog3));
		btnshowDialog3.click();
		wait.until(ExpectedConditions.invisibilityOf(barProgressBar));
	}
}
