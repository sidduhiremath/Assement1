package ArisGlobal.Assessment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Details {
	public WebDriver driver;
Details(WebDriver driver){
	this.driver=driver;
}

By amount=By.xpath("//td[text()='555 USD']");
By cardnumber=By.xpath("//td[text()='xxxxxxxxxxxx1111']");
By expirationdate=By.xpath("/html/body/div[2]/div/table/tbody/tr[5]/td[2]");

public WebElement Amount() {
	return driver.findElement(amount);
}

public WebElement CardNumber() {
	return driver.findElement(cardnumber);
}

public WebElement ExpiryDate() {
	return driver.findElement(expirationdate);
	}

}
