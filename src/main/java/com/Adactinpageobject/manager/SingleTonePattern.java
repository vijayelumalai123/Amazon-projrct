package com.Adactinpageobject.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Adactinloctors.BookHotel;
import com.Adactinloctors.loginPage;
import com.Adactinloctors.searchHotel;
import com.Adactinloctors.selectClass;

public class SingleTonePattern {
	public static WebDriver driver;
	
	public  SingleTonePattern(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
public loginPage loginPage() {
loginPage l=new loginPage(driver);
return l;
	}

public searchHotel searchhotel() {

	searchHotel sh=new searchHotel(driver);
	return sh;
}

public selectClass selectClass() {

	selectClass sc=new selectClass(driver);
	return sc;
}

public BookHotel BookHotel() {
BookHotel bh =new BookHotel(driver);
return bh;
}




}
