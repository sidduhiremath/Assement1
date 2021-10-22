package ArisGlobal.Assessment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChooseFlight extends Base{
	ChooseFlight(WebDriver driver){
		super();
		this.driver=driver;
	}

	 By ChooseFlight=By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[1]/input");
	 
	 public WebElement chosedFlight() {
		return driver.findElement(ChooseFlight);
		 
	 }
}
