package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Screenshot {
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://vctcpune.com/selenium/practice.html");
	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File destination =new File("D:\\JAVA\\Screenshot\\a.jpg");
	FileHandler.copy(source, destination);  //IOException select
		
	}

	

}
