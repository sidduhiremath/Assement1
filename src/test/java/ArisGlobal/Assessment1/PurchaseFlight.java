package ArisGlobal.Assessment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PurchaseFlight {
 public WebDriver driver;
	PurchaseFlight(WebDriver driver){
		super();
		this.driver=driver;		
	}
	
	By Fname=By.xpath("//input[@id='inputName']");
	By cardnumber=By.id("creditCardNumber");
	By nameoncard=By.xpath("//*[@id='nameOnCard']");
	By rememberme=By.xpath("//*[@name='rememberMe']");
	By purchaseflight=By.xpath("//*[@value='Purchase Flight']");
	
	public WebElement FirstName() {
		return driver.findElement(Fname);
	}
	
	public WebElement CardNumber() {
		return driver.findElement(cardnumber);
	}
	
	public WebElement NameOnCard() {
		return driver.findElement(nameoncard);
	}
	
	public WebElement PurchseFlight() {
		return driver.findElement(purchaseflight);
	}
	
	public WebElement RememberMe() {
		return driver.findElement(rememberme);
	}
}
