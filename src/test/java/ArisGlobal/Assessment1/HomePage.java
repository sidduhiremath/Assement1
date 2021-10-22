package ArisGlobal.Assessment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends Base {
	Select city;
HomePage(WebDriver driver){
	super();
	this.driver=driver;
}

 By FromCity=By.xpath("(//select[@Class='form-inline'])[1]");
 By ToCity=By.xpath("(//select[@Class='form-inline'])[2]");
 By findflight=By.xpath("/html/body/div[3]/form/div/input");
 
 public void FromCity(String Fcity) {
	 Select city=new Select(driver.findElement(FromCity));
	 city.selectByValue(Fcity);
	 
 }
 
 public void ToCity(int index) {
	 Select city=new Select(driver.findElement(ToCity));
	 city.selectByIndex(index);
	 
 }
 
 public WebElement findflight() {
	 return driver.findElement(findflight);
 }
}
