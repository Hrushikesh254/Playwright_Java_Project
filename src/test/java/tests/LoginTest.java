package tests;


//import static org.junit.Assert.assertThat;

import org.testng.annotations.Test;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import base.BaseTest;

public class LoginTest extends BaseTest{

	@Test
	public void test() {
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		page.getByPlaceholder("Username").click();
		page.getByPlaceholder("Username").fill("Admin");
		page.getByPlaceholder("Password").click();
		page.getByPlaceholder("Password").fill("admin123");
		page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Time")).click();
//		assertThat(page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Performance"))).isVisible();
//		assertThat(page.getByLabel("Sidepanel").getByRole(AriaRole.LIST)).containsText("Leave");

		
//		this is something new for github
	}
}
