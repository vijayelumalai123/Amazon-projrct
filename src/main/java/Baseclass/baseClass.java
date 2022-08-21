package Baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class baseClass {
	
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
		return driver;
		
	}
	 //lanuchurl
	 public static void lanuchUrl(String value) {
     driver.get(value);
	}
	 //getTitle
	 public static  void getTitle(String value) {
     String title =driver.getTitle();
     System.out.println("The title of the page is :"+title);
	}
	 //geturl
	 public static  void geturl(String value) {
String url=driver.getCurrentUrl();
System.out.println(url);
	}
	 //navigateto
	 public static  void navigateTo(String value) {
driver.navigate().to(value);
	}
	 //navigateback
	 public static void navigateBack() {
driver.navigate().back();
	}
	 //navigateforward
	 public static  void navigateForward() {
driver.navigate().forward();
	}
	 //refresh
	 public static void refresh() {
driver.navigate().refresh();
	}	 
	 //selected statement
       public static void elementIsSelected(WebElement element) {
boolean selected = element.isSelected();
System.out.println("check whether the element is selected or not"+selected);
	}
       
       public static  void isDisplayed(WebElement element ) {
boolean isDisplayed = element.isDisplayed();
System.out.println("check whether the element is displayed or not"+isDisplayed);
	}
       
      public static  void isEnable(WebElement element ) {
boolean enabled = element.isEnabled();
System.out.println("check whether the element is enable or not"+enabled);
	}
      //getattribute
      public static  void getAttribute(WebElement element,String value) {
String text=element.getAttribute(value);
System.out.println(text);
	}
      //sleep
      public static  void sleep() throws InterruptedException {
Thread.sleep(3000);
	}
      //implicitywait
      public static  void implicitywait() {
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
      //userinput
      public static  void userInput(WebElement element, String value) {
element.sendKeys(value);
	}
      //clickonelement
      public static void clickOnElement(WebElement element) {
element.click();
	}
      //clearonelement
      public static void clearOnElemnt(WebElement element) {
    	  element.clear();
    	  	}
      //radioBtn
public static  void radioBtn(WebElement element) {
element.click();
}      
//quit

      public static void quit() {
driver.quit();
	}
      //selectcase
      public static void selectCase(WebElement element ,String value,String text) {
Select sc =new Select(element);
if (value.equalsIgnoreCase("Index")) {
	int a = Integer.parseInt(text);
	sc.selectByIndex(a);
}else if (value.equalsIgnoreCase("value")) {
	sc.selectByValue(value);
}else if (value.equalsIgnoreCase("text")) {
	sc.selectByVisibleText(text);
}
	} 
       //keyword
       public static void keyWord() throws AWTException {
Robot v = new Robot();
v.keyPress(KeyEvent.VK_ENTER);
v.keyRelease(KeyEvent.VK_ENTER);
	}
       //downkey
       public static void downkey() throws AWTException {
    	   Robot v = new Robot();
    	   v.keyPress(KeyEvent.VK_DOWN);
    	   v.keyRelease(KeyEvent.VK_DOWN);
    	   	}
       //Actions
       public static  void moveToElement(WebElement element) {
Actions ac =new Actions(driver);
ac.moveToElement(element).perform();
	}
       //actyinsclick
       public static void ActionClick(WebElement element) {
Actions ac=new Actions(driver);
ac.click().perform();

	}
       
       public static void contextClick(WebElement element) {
Actions ac = new Actions(driver);
ac.contextClick(element);
	}
       public static  void doubleClick(WebElement element) {
Actions ac =new Actions(driver);
ac.doubleClick(element);
	}
       
       public static void dragAndDrop(WebElement drag,WebElement drop) {
Actions ac =new Actions(driver);
ac.dragAndDrop(drag, drop);
	}
       //alertaccpet
public static void alertAccept() {
	Alert ac=driver.switchTo().alert();
	ac.accept();
}       
//dismiss
public static  void alertDismiss() {
Alert ac=driver.switchTo().alert();
ac.dismiss();
}
       

public static void promptAlert(String value) {
	Alert ac=driver.switchTo().alert();
    ac.getClass();
    ac.sendKeys(value);
    ac.accept();
}   
       //singleframe
       public static void singleFrame(WebElement element) {
driver.switchTo().frame(element);
	}
       //parentframe
       
       public static void parentFrame() {
driver.switchTo().parentFrame();
	}
       //singlewindow
       public static  void singleWindow() {
String WindowHandle =driver.getWindowHandle();
System.out.println(WindowHandle);
	}
       //multihandles
       public static void multihandles() {
Set<String> windowHandles = driver.getWindowHandles();
for (String s : windowHandles) {
	String title = driver.switchTo().window(s).getTitle();
	System.out.println(title);
}
       }
       //scroll
       public static void scrollntoView(WebElement element) {
((JavascriptExecutor)driver).executeScript("arguments[0],scrollIntoView(true);",element);
	}
       //javacript sendkey
     public static void JsSendkey(WebElement element,String strvalue) {
JavascriptExecutor javascriptExecutor = ((JavascriptExecutor)driver);
javascriptExecutor.executeScript("arguments[0].value=arguments[1]", element, strvalue);
	}  
       
 public static void jsClick(WebElement element)throws InterruptedException {
JavascriptExecutor executor = (JavascriptExecutor) driver;
executor.executeScript("arguments[0].click();", element);
}      
       
        public static void screenshot(String value) {
Date d= new Date();
  

		}
}

