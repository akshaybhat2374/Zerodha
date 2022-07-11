package POJO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
public static WebDriver openBrowser() {
	System.setProperty("webdriver.chrome.driver", "E:\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(); //Upcasting chrome driver class to webdriver
	driver.get("https://kite.zerodha.com/");//Method of webdriver interface
	driver.manage().window().maximize();
	return driver;
}
}
