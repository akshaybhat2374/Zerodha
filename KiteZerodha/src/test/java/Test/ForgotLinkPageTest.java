package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.ZerodhaForgotLink;
import POM.Zerodhaloginpage;
import Utility.Prametrization;
import POJO.Browser;
public class ForgotLinkPageTest {
 WebDriver driver;
 @BeforeMethod
 public void Browser() 
 {
	 driver=Browser.openBrowser();
 }
 @Test
 public void ClickonForgotUser() throws EncryptedDocumentException, IOException 
 {
	 ZerodhaForgotLink zerodhaforgotlink=new ZerodhaForgotLink (driver);
	 
	 zerodhaforgotlink.ClickonForgotuser();
	// zerodhaforgotlink.ClickonRememberuserid();
	
	 //Zerodhaloginpage zerodhaloginpage=new Zerodhaloginpage(driver);
	 
     String x=Prametrization.Getsheet(0, 1);
     zerodhaforgotlink.EnterUserid1(x);
	   
 }		
}
