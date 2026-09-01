package tests;

import org.testng.SkipException;

//import static org.junit.Assert.assertThat;

import org.testng.annotations.Test;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest2 extends BaseTest {

	@Test
	public void loginTest1() {
		LoginPage loginpage = new LoginPage(page);
		HomePage homepage = new HomePage(page);

		test.info("Navigating to login page");
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		test.info("Adding Username");
		loginpage.addUsername("Admin");
		
		test.info("Adding Password");
		loginpage.addPassword("admin123");
		
		test.info("Clicking login button");
		loginpage.clickLoginButton();
		
		test.info("Checking homepage");
		homepage.clickTimeLink();
		
		test.info("All steps completed");
	}
	
	@Test
	public void loginTest2() {
		
		test.skip("skipping this test");
		throw new SkipException("skipping this test");
		
//		LoginPage loginpage = new LoginPage(page);
//		HomePage homepage = new HomePage(page);
//
//		test.info("Navigating to login page");
//		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		
//		test.info("Adding Username");
//		loginpage.addUsername("Admin");
//		
//		test.info("Adding Password");
//		loginpage.addPassword("admin123");
//		
//		test.info("Clicking login button");
//		loginpage.clickLoginButton();
//		
//		test.info("Checking homepage");
//		homepage.clickTimeLink();
//		
//		test.info("All steps completed");

	}
	
	@Test
	public void loginTest3() {
		LoginPage loginpage = new LoginPage(page);
//		HomePage homepage = new HomePage(page);

		test.info("Navigating to login page");
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		test.info("Adding Username");
		loginpage.addUsername("Admin");
		
		test.info("Adding Password");
		loginpage.addPassword("admin123");
		
		test.info("Clicking login button");
		loginpage.clickLoginButton();
		
		test.info("Checking homepage");
//		homepage.clickTimeLink();

//		//test failed here
		test.info("Verifying element that does not exist");
		org.testng.Assert.assertTrue(
			page.isVisible("text=ThisElementDoesNotExist12345"),
			"Intentional failure to capture screenshot"
		);
		
		test.info("All steps completed");
	}
}
