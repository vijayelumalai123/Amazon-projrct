package Baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mssms {
	
	
	
	 public static WebDriver driver ;
	//browserlaunch
	 public static WebDriver  browserlanuch(String value) {
		 if (value.equalsIgnoreCase("chrome")) {
			 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Chrome\\chromedriver.exe");
			 driver=new ChromeDriver();
		} else if (value.equalsIgnoreCase("gecko")) {
			
		} else if (value.equalsIgnoreCase("edge")) {
			
		}
			driver.manage().window().maximize();
		return driver ;
		
	 }
	
	
	
	
	
	public static void main(String[] args) {
		browserlanuch("chrome");
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
