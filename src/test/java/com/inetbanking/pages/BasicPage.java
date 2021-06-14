package com.inetbanking.pages;



import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
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


public class BasicPage extends BaseClass {
	
	Actions action = new Actions(driver);
	WebDriverWait wait=new WebDriverWait(driver, 20);
	
	//***************Element List Start ******************//
	
	//********Home Page**********//
	WebDriver ldriver;
	@FindBy(xpath="//*[contains(@class, 'two')]//*[contains(@class, 'glyphicon')]")
	WebElement btnDownArrow;
	
	//********Simple Form**********//
	@FindBy(xpath="//div[@class='list-group']//a[text()='Input Form with Validations']")
	WebElement lblSimpleforDemo;
	@FindBy(xpath="//div[text()='Single Input Field']")
	WebElement lblSingleInputFld;
	@FindBy(xpath="//a[@id='at-cv-lightbox-close']")
	WebElement btnClosePopUp;
	@FindBy(xpath="//input[@id='user-message']")
	WebElement txtUsrMsg;
	@FindBy(xpath="//button[text()='Show Message']")
	WebElement btnShowMsg;
	@FindBy(xpath="//*[@id='display']")
	WebElement lblUserMsg;
	@FindBy(xpath="//input[@id='sum1']")
	WebElement txtValuea;
	@FindBy(xpath="//input[@id='sum2']")
	WebElement txtValueb;
	@FindBy(xpath="//button[text()='Get Total']")
	WebElement btnSum;
	@FindBy(xpath="//*[@id='displayvalue']")
	WebElement lblCalculatedSum;
	
	//********CheckBox Demo**********//
	@FindBy(xpath="//div[@class='list-group']//a[text()='Check Box Demo']")
	WebElement lblCheckBoxDemo;
	@FindBy(xpath="//div[text()='Single Checkbox Demo']")
	WebElement lblSingleCheckBoxDemo;
	@FindBy(xpath="//input[@id='isAgeSelected']")
	WebElement chkSingle;
	@FindBy(xpath="//div[@id='txtAge']")
	WebElement lblChckSingleMsg;
	@FindBy(xpath="//input[@id='check1']")
	WebElement btnChkAll;
	@FindBy(xpath="//label[text()='Option 1']")
	WebElement chkOption1;
	
	//********Radio Button ***********//
	@FindBy(xpath="//div[@class='list-group']//a[text()='Radio Buttons Demo']")
	WebElement lblRadioBtnDemo;
	@FindBy(xpath="//div[text()='Radio Button Demo']")
	WebElement lblRadioBtnPageDemo;
	@FindBy(xpath="//input[@name='optradio'  and @value='Male']")
	WebElement chkMale;
	@FindBy(xpath="//button[@id='buttoncheck']")
	WebElement btnCheckValue;
	@FindBy(xpath="//p[contains(text(),'Radio button')]")
	WebElement lblConfirmBtn;
	@FindBy(xpath="//*[@name='gender' and @value='Male']")
	WebElement chkGrpMale;
	@FindBy(xpath="//*[@value='15 - 50']")
	WebElement chkAgeGrp;
	@FindBy(xpath="//button[text()='Get values']")
	WebElement btnGetValues;
	@FindBy(xpath="//p[@class='groupradiobutton']")
	WebElement lblConfValues;
	
	//*******Drop down demo********//
	@FindBy(xpath="//div[@class='list-group']//a[text()='Select Dropdown List']")
	WebElement lblDropDownDemo;
	@FindBy(xpath="//div[text()='Select List Demo']")
	WebElement lblDropDownPageDemo;
	@FindBy(xpath="//select[@id='select-demo']")
	WebElement selectDropDown;
	@FindBy(xpath="//p[contains(text(),'Day selected')]")
	WebElement lblDaySelected;
	@FindBy(xpath="//select[@id='multi-select']//*[@value='Florida']")
	WebElement lblFlorida;
	@FindBy(xpath="//select[@id='multi-select']//*[@value='New Jersey']")
	WebElement lblNewJersey;
	@FindBy(xpath="//button[@id='printMe']")
	WebElement btnPrintMe;
	@FindBy(xpath="//button[@id='printAll']")
	WebElement btnPrintAll;
	@FindBy(xpath="//p[contains(text(),'Options')]")
	WebElement lblSelectedOpt;
	
	//*********JSAlert***********//
	@FindBy(xpath="//div[@class='list-group']//a[text()='Javascript Alerts']")
	WebElement lblJSdemo;
	@FindBy(xpath="//p[text()='Click the button to display an alert box:']")
	WebElement lblJSAlertPageDemo;
	@FindBy(xpath="//button[@onclick='myAlertFunction()']")
	WebElement btnClkMe;
	@FindBy(xpath="//button[@onclick='myConfirmFunction()']")
	WebElement btnConfirmClkMe;
	@FindBy(xpath="//button[@onclick='myPromptFunction()']")
	WebElement btnPromptClkMe;
	@FindBy(xpath="//p[@id='confirm-demo']")
	WebElement lblConfirmClk;
	@FindBy(xpath="//p[@id='prompt-demo']")
	WebElement lblConfirmPromptClk;
	
	//******WindowPopup*******//
	@FindBy(xpath="//div[@class='list-group']//a[text()='Window Popup Modal']")
	WebElement lblWinPopupdemo;
	@FindBy(xpath="//h3[contains(text(),'Single Window Popup')]")
	WebElement lblSinglePopup;
	@FindBy(xpath="//a[contains(text(),'Follow On Twitter')]")
	WebElement btnFlwTwitter;
	@FindBy(xpath="//a[contains(text(),'Like us On Facebook')]")
	WebElement btnFlwFb;
	@FindBy(xpath="//a[contains(text(),'Follow Twitter & Facebook')]")
	WebElement btnFlwFBandTwit;
	@FindBy(xpath="//a[contains(text(),'Follow All')]")
	WebElement btnFlwAll;
	
	//*******Bootstrap Alerts*******//
	@FindBy(xpath="//div[@class='list-group']//a[text()='Bootstrap Alerts']")
	WebElement lblBootStrapAlert;
	@FindBy(xpath="//h2[text()='Bootstrap Alert messages']")
	WebElement lblBootStrapPages;
	@FindBy(xpath="//h2[text()='Bootstrap Alert messages']")
	WebElement lblBootStrapPage;
	
	//******Bootstrap Modal******//
	@FindBy(xpath="//div[@class='list-group']//a[text()='Bootstrap Modals']")
	WebElement lblBootStrapModal;
	@FindBy(xpath="//a[@href='#myModal0']")
	WebElement btnSingleModal;
	@FindBy(xpath="//a[@href='#myModal']")
	WebElement btnMultiModal;
	@FindBy(xpath="//*[@id='myModal0']//a[text()='Save changes']")
	WebElement btnSaveChanges;
	@FindBy(xpath="//a[@href='#myModal2']")
	WebElement btnlaunchModal;
	@FindBy(xpath="//*[@id='myModal2']//a[text()='Save changes']")
	WebElement btnSaveChanges2;
	
	
	//***************Element List End ******************//
	
	public BasicPage(WebDriver rdriver){
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//Method to Launch Test Site
	public void fnLaunchTestSite() {
		driver.get(url);
	}
	
	//Method to validate the Launch
	public void fnValidateLaunch() {
		
		if (driver.getTitle().contains("Selenium Easy"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	//CLosing the pop up
	public void fnClosePopup() {
		wait.until(ExpectedConditions.visibilityOf(btnClosePopUp));
		if (btnClosePopUp.isDisplayed()) {
			btnClosePopUp.click();
		Assert.assertTrue(btnDownArrow.isDisplayed(), "Pop is closed");
		}
	}
	
	//open Form and validate form is open
	public void fnOpenForm()  {
		wait.until(ExpectedConditions.visibilityOf(btnDownArrow));
		action.moveToElement(btnDownArrow);
		btnDownArrow.click();
		action.moveToElement(lblSimpleforDemo);
		wait.until(ExpectedConditions.visibilityOf(lblSimpleforDemo));
		Assert.assertTrue(lblSimpleforDemo.isDisplayed(), "Verify if SimpleForm Demo label is displayed");
		logger.info("Down arrow button is clicked");
		lblSimpleforDemo.click();
		wait.until(ExpectedConditions.visibilityOf(lblSingleInputFld));
		Assert.assertTrue(lblSingleInputFld.isDisplayed(), "Verify if lblSingleInputFld label is displayed");
		logger.info("Simple Form has been opened");
	}
	
	//Fill form
	public void fnFillForm() {
		
		String msg="This is selenium automation";
		int a=5;
		int b=7;
		txtUsrMsg.sendKeys(msg);
		btnShowMsg.click();
		wait.until(ExpectedConditions.visibilityOf(lblUserMsg));
		Assert.assertTrue(lblUserMsg.getText().trim().equals(msg), "Message entered is matching the displayed message");
		action.moveToElement(lblSimpleforDemo);
		
		action.moveToElement(txtValuea);
		txtValuea.sendKeys(String.valueOf(a));
		txtValueb.sendKeys(String.valueOf(b));
		btnSum.click();
		wait.until(ExpectedConditions.visibilityOf(lblCalculatedSum));
		Assert.assertTrue(lblCalculatedSum.getText().trim().equals(String.valueOf(a+b)), "Summation is working correctly");
	}
	
	//open checkBox demo
	public void fnCheckBoxDemo()  {
		wait.until(ExpectedConditions.visibilityOf(btnDownArrow));
		action.moveToElement(btnDownArrow);
		btnDownArrow.click();
		action.moveToElement(lblCheckBoxDemo);
		wait.until(ExpectedConditions.visibilityOf(lblCheckBoxDemo));
		Assert.assertTrue(lblCheckBoxDemo.isDisplayed(), "Verify if SimpleForm Demo label is displayed");
		logger.info("Down arrow button is clicked");
		lblCheckBoxDemo.click();
		wait.until(ExpectedConditions.visibilityOf(lblSingleCheckBoxDemo));
		Assert.assertTrue(lblSingleCheckBoxDemo.isDisplayed(), "Verify if lblSingleInputFld label is displayed");
		logger.info("Check Box demo is opened");
	}
	
	public void fnFillCheckBoxDemo() {
		chkSingle.click();
		wait.until(ExpectedConditions.visibilityOf(lblChckSingleMsg));
		Assert.assertTrue(lblChckSingleMsg.isDisplayed(), "Verify if the Single Check box message is diplayed");
		action.moveToElement(btnChkAll);
		btnChkAll.click();
		Assert.assertTrue(btnChkAll.getText().trim().equals("Uncheck All"), "Verify if button is changed to Uncheck All");
		chkOption1.click();
		Assert.assertTrue(btnChkAll.getText().trim().equals("Check All"), "Verify if button is changed to Check All");
	}
	
	public void fnRadioBtnDemo() {
		wait.until(ExpectedConditions.visibilityOf(btnDownArrow));
		action.moveToElement(btnDownArrow);
		btnDownArrow.click();
		action.moveToElement(lblRadioBtnDemo);
		wait.until(ExpectedConditions.visibilityOf(lblRadioBtnDemo));
		Assert.assertTrue(lblRadioBtnDemo.isDisplayed(), "Verify if Radio Button Demo label is displayed");
		logger.info("Down arrow button is clicked");
		lblRadioBtnDemo.click();
		wait.until(ExpectedConditions.visibilityOf(lblRadioBtnPageDemo));
		Assert.assertTrue(lblRadioBtnPageDemo.isDisplayed(), "Verify if Radio Button Demo is displayed");
		logger.info("Radio Button demo is opened");
	}
	
	public void fnFillRadioButton() {
		chkMale.click();
		btnCheckValue.click();
		wait.until(ExpectedConditions.visibilityOf(lblConfirmBtn));
		Assert.assertTrue(lblConfirmBtn.getText().trim().contains("Male"));
		chkGrpMale.click();
		chkAgeGrp.click();
		btnGetValues.click();
		wait.until(ExpectedConditions.visibilityOf(lblConfValues));
		Assert.assertTrue(lblConfValues.getText().trim().contains("Male"));
	}
	
	public void fnDropDown() {
		wait.until(ExpectedConditions.visibilityOf(btnDownArrow));
		action.moveToElement(btnDownArrow);
		btnDownArrow.click();
		action.moveToElement(lblDropDownDemo);
		wait.until(ExpectedConditions.visibilityOf(lblDropDownDemo));
		Assert.assertTrue(lblDropDownDemo.isDisplayed(), "Verify if Drop down Demo label is displayed");
		logger.info("Down arrow button is clicked");
		lblDropDownDemo.click();
		wait.until(ExpectedConditions.visibilityOf(lblDropDownPageDemo));
		Assert.assertTrue(lblDropDownPageDemo.isDisplayed(), "Verify if Drop down Demo is displayed");
		logger.info("Drop down demo is opened");
	}
	
	public void fnFillDropDown() throws InterruptedException {
		Select drpdwn = new Select(selectDropDown);
		drpdwn.selectByIndex(3);
		Thread.sleep(3000);
		Assert.assertTrue(lblDaySelected.getText().trim().contains("Tuesday"));
		lblNewJersey.click();
		btnPrintMe.click();
		Thread.sleep(3000);
		Assert.assertTrue(lblSelectedOpt.getText().trim().contains("New Jersey"));
		lblNewJersey.click();
		lblNewJersey.sendKeys(Keys.LEFT_CONTROL);
		lblFlorida.click();
		lblFlorida.sendKeys(Keys.LEFT_CONTROL);
		btnPrintAll.click();
		Thread.sleep(3000);
		Assert.assertTrue(lblSelectedOpt.isDisplayed());
	}
	
	public void fnJavaScriptsAlert() {
		wait.until(ExpectedConditions.visibilityOf(btnDownArrow));
		action.moveToElement(btnDownArrow);
		btnDownArrow.click();
		action.moveToElement(lblJSdemo);
		wait.until(ExpectedConditions.visibilityOf(lblJSdemo));
		Assert.assertTrue(lblJSdemo.isDisplayed(), "Verify if JSAlert Demo label is displayed");
		logger.info("Down arrow button is clicked");
		lblJSdemo.click();
		wait.until(ExpectedConditions.visibilityOf(lblJSAlertPageDemo));
		Assert.assertTrue(lblJSAlertPageDemo.isDisplayed(), "Verify if JSAlert Demo is displayed");
		logger.info("JSAlert demo is opened");
	}
	
	public void fnfillJSAlert() throws InterruptedException {
		btnClkMe.click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		wait.until(ExpectedConditions.visibilityOf(btnConfirmClkMe));
		btnConfirmClkMe.click();
		Thread.sleep(3000);
		driver.switchTo().alert();
		alert.accept();
		wait.until(ExpectedConditions.visibilityOf(lblConfirmClk));
		Assert.assertTrue(lblConfirmClk.getText().trim().contains("OK!"));
		wait.until(ExpectedConditions.visibilityOf(btnPromptClkMe));
		btnPromptClkMe.click();
		driver.switchTo().alert();
		Thread.sleep(3000);
		alert.sendKeys("Namit");
		alert.accept();
		Assert.assertTrue(lblConfirmPromptClk.getText().trim().contains("Namit"));
	}
	
	public void fnWindowPopup() {
		wait.until(ExpectedConditions.visibilityOf(btnDownArrow));
		action.moveToElement(btnDownArrow);
		btnDownArrow.click();
		action.moveToElement(lblJSdemo);
		wait.until(ExpectedConditions.visibilityOf(lblWinPopupdemo));
		Assert.assertTrue(lblWinPopupdemo.isDisplayed(), "Verify if Window Popup Demo label is displayed");
		logger.info("Down arrow button is clicked");
		lblWinPopupdemo.click();
		wait.until(ExpectedConditions.visibilityOf(lblSinglePopup));
		Assert.assertTrue(lblSinglePopup.isDisplayed(), "Verify if Window popup Demo is displayed");
		logger.info("Window popup demo is opened");
	}
	
	public void fnFillWindowPopup() throws InterruptedException {
		btnFlwTwitter.click();
		fnWindowIterator();
		btnFlwFb.click();
		fnWindowIterator();
		btnFlwFBandTwit.click();
		fnWindowIterator();
		btnFlwAll.click();
		fnWindowIterator();
	}
	
	public void fnWindowIterator() throws InterruptedException 
	{
		String currentwindow = driver.getWindowHandle();
		logger.info("Current window " + currentwindow);
		logger.info("Current window Title " + driver.getTitle());
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> i = allWindows.iterator();
	      while(i.hasNext())
	      {
	         String childwindow = i.next();
	         if(!childwindow.equalsIgnoreCase(currentwindow))
	         {
	            driver.switchTo().window(childwindow);
	            driver.close();
	            driver.switchTo().window(currentwindow);
	            Thread.sleep(3000);
	         } 
	         else 
	         {
	        	 logger.info("There is no child window opened");
	         }
	      }
	      
	      
	}
	
	public void fnBootStrapAlerts() {
		wait.until(ExpectedConditions.visibilityOf(btnDownArrow));
		action.moveToElement(btnDownArrow);
		btnDownArrow.click();
		action.moveToElement(lblBootStrapAlert);
		wait.until(ExpectedConditions.visibilityOf(lblBootStrapAlert));
		Assert.assertTrue(lblBootStrapAlert.isDisplayed(), "Verify if BootStrap Alert Demo label is displayed");
		logger.info("Down arrow button is clicked");
		lblBootStrapAlert.click();
		wait.until(ExpectedConditions.visibilityOf(lblBootStrapPages));
		Assert.assertTrue(lblBootStrapPages.isDisplayed(), "Verify if BootStrap Alert Demo is displayed");
		logger.info("BootStrap Alert demo is opened");
	}
	
	public void fnFillBootStrapAlerts() {
		///work on it 
	
	}
	
	public void fnBootstrapModal() {
		wait.until(ExpectedConditions.visibilityOf(btnDownArrow));
		action.moveToElement(btnDownArrow);
		btnDownArrow.click();
		action.moveToElement(lblBootStrapModal);
		wait.until(ExpectedConditions.visibilityOf(lblBootStrapModal));
		Assert.assertTrue(lblBootStrapModal.isDisplayed(), "Verify if Modal Demo label is displayed");
		logger.info("Down arrow button is clicked");
		lblBootStrapModal.click();
		wait.until(ExpectedConditions.visibilityOf(btnSingleModal));
		Assert.assertTrue(btnSingleModal.isDisplayed(), "Verify if Modal Demo is displayed");
		logger.info("Window popup demo is opened");
	}
	
	public void fnFillBootstrapModal() throws InterruptedException {
		btnSingleModal.click();
		wait.until(ExpectedConditions.visibilityOf(btnSaveChanges));
		Thread.sleep(3000);
		btnSaveChanges.click();
		Thread.sleep(3000);
		action.moveToElement(btnMultiModal);
		btnMultiModal.click();
		Thread.sleep(3000);
		btnlaunchModal.click();
		Thread.sleep(3000);
		btnSaveChanges2.click();
		Thread.sleep(3000);
	}
	
}
