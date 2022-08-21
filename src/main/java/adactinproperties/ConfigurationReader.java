	package adactinproperties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigurationReader {
	Properties p;
	public ConfigurationReader() throws Throwable {
	File f =new File("C:\\Users\\vijay\\OneDrive\\Pictures\\vj\\adactinHotel\\src\\main\\java\\adactinproperties\\adactin.properties");
		FileInputStream fi=new FileInputStream(f);
 p=new Properties();
	 p.load(fi);
	

}
	public String getbrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}
	
	public String geturl() {
		String url = p.getProperty("url");
		return url;
	}
	

	public String getusername() {
		String username = p.getProperty("username");
		return username;
	}
	public String getpassword() {
		String password = p.getProperty("password");
		return password;
	}
	public String getcardno() {
		String cardno = p.getProperty("cardno");
		return cardno;
	}
	public String getcvvcard() {
		String cvvcard = p.getProperty("cvvcard");
		return cvvcard;
	}
	
}