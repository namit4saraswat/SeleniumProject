package com.inetbanking.testCases.Basic;

import org.testng.annotations.Test;

import com.inetbanking.pages.BasicPage;
import com.inetbanking.utilities.BaseClass;

public class BootStrap_Modal extends BaseClass {

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
		Step1.fnBootstrapModal();
		Step1.fnFillBootstrapModal();
	}
}