package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaForgotLink {
 @FindBy(xpath="//a[text()=\"Forgot user ID or password?\"]")private WebElement Forgotuserid;
 @FindBy(xpath="//label[@class='su-radio-label']")private WebElement rememberuserid1;
 @FindBy(xpath="//label[@for='radio-31']")private WebElement forgotuserid2;
 @FindBy(xpath="(//label[@class='su-radio-label'])[1]")private WebElement userid2;
 @FindBy(xpath="//input[@placeholder='PAN']")private WebElement pan;
 @FindBy(xpath="(//label[@class='su-radio-label'])[3]")private WebElement radioemail;
 @FindBy(xpath="(//label[@class='su-radio-label'])[4]")private WebElement radiosms;
 @FindBy(xpath="//input[@placeholder='E-mail (as on account)']")private WebElement enteremail;
 @FindBy(xpath="//button[@class='button-orange wide']")private WebElement Reset;
 @FindBy(xpath="//a[@class='text-xsmall text-light reset-account-button']")private WebElement backtologin;
 
 public  ZerodhaForgotLink(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
 //public void ClickonForgotuser() 
 //{
	// Forgotuserid.click();
 //}
 public void ClickonRememberuserid() 
 {
	 rememberuserid1.click();
 } 
 
 public void EnterUserid1( String Userid ) 
 {
	userid2.sendKeys(Userid);
 }
 public void EnterPan(String Pan)
 {
	pan.sendKeys(Pan); 
 }
 public void ClickRadioemail() 
 {
	 radioemail.click(); 
 }
 public void EnterEmail(String Entermail)
 {
	 enteremail.sendKeys(Entermail);
 }
 public void ClickonReset() 
 {
	 Reset.click();
 }
 public void ClickonBacktologin() 
 {
	backtologin.click(); 
 }

	
}

