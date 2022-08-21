package AdactinProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Adactinloctors.searchHotel;
import com.Adactinpageobject.manager.SingleTonePattern;

import Baseclass.baseClass;
import adactinproperties.ConfigurationHelper;
import adactinproperties.ConfigurationReader;

public class adactinProject extends baseClass{
public static void main(String[] args) throws Throwable {
	String getbrowser = ConfigurationHelper.getIntanceCr().getbrowser();
	browserlanuch(getbrowser);
	String url = ConfigurationHelper.getIntanceCr().geturl();
	lanuchUrl(url);
	implicitywait();
	
	
	// loginpage :: pageno1
	SingleTonePattern stp= new SingleTonePattern(driver);
	String getusername = ConfigurationHelper.getIntanceCr().getusername();
	userInput(stp.loginPage().getusernmae(),getusername);
	
	String getpassword = ConfigurationHelper.getIntanceCr().getpassword();
userInput(stp.loginPage().getpassword(), getpassword);	
		clickOnElement(stp.loginPage().getlogin());
		
	//searchHotel	::pageno2
		searchHotel s=new searchHotel(driver);
		
	selectCase(stp.searchhotel().getLocation(), "index", "6");
	selectCase(stp.searchhotel().getHotel(), "index", "2");
	selectCase(stp.searchhotel().getroomtype(), "text", "Double");
	Thread.sleep(2000);
	selectCase(stp.searchhotel().getNoofroom(), "index", "2");
	jsClick(s.getdate());
	selectCase(stp.searchhotel().getadroom(), "index", "2");
	selectCase(stp.searchhotel().getchildroom(), "index", "2");
	Thread.sleep(1000);
	
	clickOnElement(s.getSumbit());
	
	//SelectHotel ::pageno3
	
	clickOnElement(stp.selectClass().getradiobtn());
	clickOnElement(stp.selectClass().getcontinuebtn());
	
	//Book Hotel ::pageno4
	
	JsSendkey(stp.BookHotel().getfirstname(),"vijay");
	JsSendkey(stp.BookHotel().getlastname(), "elumalai");
	JsSendkey(stp.BookHotel().getaddress(), "4a,nehru street,ambattur");
	String cardno = ConfigurationHelper.getIntanceCr().getcardno();
	JsSendkey(stp.BookHotel().getcardno(),cardno);
	selectCase(stp.BookHotel().getbank(), "text", "VISA");
	selectCase(stp.BookHotel().getexpiremonth(), "index", "4");
	selectCase(stp.BookHotel().getexpireyear(), "index", "12");
	String CvvNo = ConfigurationHelper.getIntanceCr().getcvvcard();
	JsSendkey(stp.BookHotel().getcvvcard(),CvvNo);
	Thread.sleep(3000);

clickOnElement(stp.BookHotel().getBooknow());
	Thread.sleep(3000);
	
quit();

//	
//	
//	//
//	
//	
	
}

}