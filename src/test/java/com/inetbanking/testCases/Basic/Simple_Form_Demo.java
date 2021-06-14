package com.inetbanking.testCases.Basic;
import org.testng.annotations.Test;

import com.inetbanking.pages.BasicPage;
import com.inetbanking.utilities.BaseClass;

public class Simple_Form_Demo extends BaseClass {
	
	@Test
	public void test()
	{
	BasicPage Step1 = new BasicPage(driver);
	logger.info("Launching test site");
	Step1.fnLaunchTestSite();
	logger.info("Validating Launch");
	Step1.fnValidateLaunch();
	logger.info("Close pop up");
	Step1.fnClosePopup();
	logger.info("Opening Simple Form");
	Step1.fnOpenForm();
	logger.info("Filling form");
	Step1.fnFillForm();
	
	}

}
