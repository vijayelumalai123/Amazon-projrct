package com.Adactinloctors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {
	
	public static WebDriver driver;

	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement firstname;
	
	
	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement lastname;
	
	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement address;
	
	@FindBy(xpath = "//input[contains(@name,'cc_num')]")
	private WebElement cardno;
	
	@FindBy(xpath = "//select[contains(@name,'cc_type')]")
	private WebElement bank;
	
	
	@FindBy(xpath = "//select[contains(@name,'cc_exp_month')]")
	private WebElement expiremonth;
	
	@FindBy(xpath = "//select[contains(@name,'cc_exp_year')]")
	private WebElement expireyear;
	
	@FindBy(xpath = "//input[contains(@id,'cc_cvv')]")
	private WebElement cvvcard;
	
	@FindBy(xpath = "(//input[@type='button'])[1]")
	private WebElement Booknow;
	
	public BookHotel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement getfirstname() {
return firstname;
	}
	public WebElement getlastname() {
		return lastname;
	}
		public WebElement getaddress() {
			return address;
				}	
	public WebElement getcardno() {
		return cardno;
			}
	
	public WebElement getbank() {
		return bank;
			}
	public WebElement getexpiremonth() {
		return expiremonth;
			}
	public WebElement getexpireyear() {
		return expireyear;
			}
	
	public WebElement getcvvcard() {
		return cvvcard;
			}
	public WebElement getBooknow() {
		return Booknow;
			}
	
	
	}	
	
	
	
	
	

