package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zerodhaloginpage {

	@FindBy(xpath="//input[@id='userid']") private WebElement Userid;
	@FindBy(xpath="//input[@id='password']")private WebElement Pass;
	@FindBy(xpath="//button[@class='button-orange wide']")private WebElement login;
	@FindBy(xpath="//a[text()=\"Forgot user ID or password?\"]")private WebElement forgot;
	@FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]")private WebElement signup;
	
	public Zerodhaloginpage(WebDriver driver)
	{ 
		PageFactory.initElements(driver, this);
	}
	public void Entreuserid(String userid)
	{
		//Userid.click();
		Userid.sendKeys(userid);
	}
	public void Entrepass(String pass)
	{
		Pass.sendKeys(pass);
	}
	public void Clicklogin() 
	{
		login.click();
	}
	public void clickForgot()
	{
		forgot.click();
	}
	public void ClickSignup() 
	{
		signup.click();
	}
}
