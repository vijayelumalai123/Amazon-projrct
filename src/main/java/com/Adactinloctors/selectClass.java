package com.Adactinloctors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selectClass {
	public static WebDriver driver;

	@FindBy(id="radiobutton_0")
	private WebElement radiobtn;
	
	@FindBy(id="continue")
	private WebElement continuebtn;


	
	
	public selectClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	

public WebElement getradiobtn() {
return  radiobtn;
}
	

public WebElement getcontinuebtn() {
return  continuebtn;
	
}
}