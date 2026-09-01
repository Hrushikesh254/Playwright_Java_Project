package pages; 

import com.microsoft.playwright.Page;

public class LoginPage {

private Page page;
	
//	Locators
	private final String usernameTextBox = "input[name='username']";
	private final String passwordTextBox = "input[name='password']";
	private final String loginButton = "button[type='submit']";
	
//	constructor
	public LoginPage(Page page)
	{
		this.page = page;
	}
	
	public void addUsername(String username)
	{
		page.fill(usernameTextBox, username);
	}
	
	public void addPassword(String password)
	{
		page.fill(passwordTextBox, password);
	}
	
	public void clickLoginButton()
	{
		page.click(loginButton);
	}
	
	public void login(String username, String password)
	{
		page.fill(usernameTextBox, username);
		page.fill(passwordTextBox, password);
		page.click(loginButton);
	}
}
