/**
 * 
 */
package com.automation.testscripts;

import org.testng.annotations.Test;
import com.automation.baseclass.BaseClass;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.utlity.GlobalParameters;

/**
 * @author Janmejay
 *
 */
public class LoginTest extends BaseClass{

	HomePage homePage ;
	LoginPage loginPage;
		
	@Test
	public void login()
	{
		homePage = new HomePage();
		if(GlobalParameters.runType.equalsIgnoreCase("web"))
		{
			loginPage = homePage.clickOnSignIn();
		}else
		{
			loginPage = new LoginPage();
		}
		// Validating the API Response with APK Attribute
	}
}
