package com.selEasy.testCases.Intermediate;

import org.testng.annotations.Test;

import com.inetbanking.pages.BasicPage;
import com.inetbanking.pages.Intermediate;
import com.inetbanking.utilities.BaseClass;

public class Data_list_filter extends BaseClass{

	@Test
	public void test() throws InterruptedException
	{
		BasicPage Step1 = new BasicPage(driver);
		logger.info("Launching test site");
		Step1.fnLaunchTestSite();
		logger.info("Validating Launch");
		Step1.fnValidateLaunch();
		logger.info("Close pop up");
		Step1.fnClosePopup();
		Intermediate Step2 = new Intermediate(driver);
		Step2.fnDataFilter();
		Step2.fnFillDataFilter();
		
	}
}
