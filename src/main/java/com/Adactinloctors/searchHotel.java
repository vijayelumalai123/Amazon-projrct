package com.Adactinloctors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchHotel {

	public static WebDriver driver;
	
	@FindBy(id="location")
	private WebElement Location;
	
	@FindBy(id="hotels")
	private WebElement Hotel;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id="room_nos")
	private WebElement Noofroom;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement date;
	
	@FindBy(id="adult_room")
	private WebElement adroom;
	
	@FindBy(id="child_room")
	private WebElement childroom;
	

	@FindBy(xpath="//input[@type='submit']")
	private WebElement Sumbit;
	
	
	public searchHotel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

public WebElement getLocation() {
return  Location;
}
	

public WebElement getHotel() {
return  Hotel;
}
	

public WebElement getroomtype() {
return  roomtype;
}


public WebElement getNoofroom(){
return  Noofroom;
}


public WebElement getdate() {
return  date;
}

public WebElement getadroom(){
return  adroom;
}

public WebElement getchildroom(){
return  childroom;
}
public WebElement getSumbit(){
return  Sumbit;
}

	
}
