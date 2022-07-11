package Test;


import java.io.IOException;
import POJO.Browser;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.ZerodhaDashBoard;
import POM.ZerodhaPinpage;
import POM.Zerodhaloginpage;
import Utility.Prametrization;
 
public class LoginPageTest {
	WebDriver driver;
	@BeforeMethod
	public void Browser() 
	{
		 driver=Browser.openBrowser();
	}
	@Test
	public void loginPageTest() throws IOException, InterruptedException 
	{
		Zerodhaloginpage zerodhaloginpage=new Zerodhaloginpage(driver);
		

		String b=Prametrization.Getsheet(0, 1);
		zerodhaloginpage.Entreuserid(b);		
		
		
		String c=Prametrization.Getsheet(1, 1);
		zerodhaloginpage.Entrepass(c);
		
		//Thread.sleep(3000);
		zerodhaloginpage.Clicklogin();
	}
	
	public void Pinpagetest() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		
		ZerodhaPinpage zerodhapinpage=new ZerodhaPinpage(driver);
		Thread.sleep(3000);
		String D=Prametrization.Getsheet(2, 1);
		zerodhapinpage.Entrepin(D);
		
		
		
		zerodhapinpage.ClickonContinue();
		
	}
	
	@Test
	public void Login() 
	{
		System.out.println("12345");
	}
	@Test
	public void Signup()
	{
		System.out.println(" 5678");
	}
	

	
	
}
