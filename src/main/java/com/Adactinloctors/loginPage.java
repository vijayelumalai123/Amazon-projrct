package com.Adactinloctors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

public static WebDriver driver;
	
	@FindBy(id = "username")
	private WebElement username;
	
	@FindBy (id= "password")
	private WebElement password;

@FindBy (id= "login")
private WebElement login;

	public loginPage(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}

public WebElement getusernmae() {
return  username;
}


public WebElement getpassword() {
return  password;
}

public WebElement getlogin() {
return  login;
}

}
