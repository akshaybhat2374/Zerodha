package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaPinpage {

	@FindBy(xpath="//Input[@id='pin']")private WebElement Pin;
	@FindBy(xpath="//button[@class='button-orange wide']")private WebElement Submit;
	@FindBy(xpath="//a[text()=\"Forgot 2FA?\"]")private WebElement Forgot;
	@FindBy(xpath="//a[@class='text-light']") private WebElement Signup;
	
	
	public ZerodhaPinpage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	public void Entrepin(String pinNo) 
	{
		Pin.sendKeys(pinNo);
	}
	public void ClickonContinue() 
	{
		Submit.click();
	}
	public void ClickForgot() 
	{
		Forgot.sendKeys();
	}
	public void ClickInSignup()
	{
		Signup.click();
	}
}
