package pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class HomePage {

	private Page page;

	public HomePage(Page page)
	{
		this.page = page;
	}

	public void clickTimeLink()
	{
		page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Time")).click();
	}
}