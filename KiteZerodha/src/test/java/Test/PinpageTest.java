package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaDashBoard;
import POM.ZerodhaPinpage;
import POM.Zerodhaloginpage;
import Utility.Prametrization;

public class PinpageTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() 
	{
		 driver=Browser.openBrowser();
		
	}
@Test
public void loginzerodhawithpinpage() throws EncryptedDocumentException, IOException, InterruptedException {
	Zerodhaloginpage zerodhaloginpage=new Zerodhaloginpage(driver);

	String b=Prametrization.Getsheet(0, 1);
	zerodhaloginpage.Entreuserid(b);		
	
	
	String c=Prametrization.Getsheet(1, 1);
	zerodhaloginpage.Entrepass(c);
	
	Thread.sleep(3000);
	zerodhaloginpage.Clicklogin();
	
	
	ZerodhaPinpage zerodhapinpage=new ZerodhaPinpage(driver);
	Thread.sleep(3000);
	String D=Prametrization.Getsheet(2, 1);
	zerodhapinpage.Entrepin(D);
	
	
	
	zerodhapinpage.ClickonContinue();
}


	public void Dash() {""},enabled=false
	{
		ZerodhaDashBoard zerodhadashboard=new ZerodhaDashBoard(driver);
		 zerodhadashboard.ClickonSearchBox("Tata");
		 zerodhadashboard.MoveToElement(driver);
		 zerodhadashboard.ClickOnBuy();
		
	}

	
	
	
	
	
	
	
	
}
