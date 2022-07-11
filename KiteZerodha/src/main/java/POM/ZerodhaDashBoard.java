package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaDashBoard {
	@FindBy(xpath="")private WebElement SearchBox;
	@FindBy(xpath="")private WebElement Tata;
	@FindBy(xpath="")private WebElement Buy;
	
	public ZerodhaDashBoard(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
 public void ClickonSearchBox(String name) 
 {
	 SearchBox.click();
	 SearchBox.sendKeys(name);
 }
 public void MoveToElement(WebDriver driver) 
 {
	 Actions act=new Actions(driver);
	 act.moveToElement(Tata);
	 act.perform();
 }
 public void ClickOnBuy() 
 {
	 Buy.click();
 }
}
