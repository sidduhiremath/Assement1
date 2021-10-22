package ArisGlobal.Assessment1;

import java.io.IOException;

import org.testng.annotations.Test;

public class Tc01 extends Base{
@Test
	public void Tc01() throws IOException, InterruptedException {
		driver=Configuration();
		driver.get(properties.getProperty("vURL"));
		
		//Home Page
		if((driver.getTitle()).contains("BlazeDemo")) {
		HomePage hp=new HomePage(driver);
		Thread.sleep(2000);
		hp.FromCity("Boston");
		Thread.sleep(2000);
		hp.ToCity(4);
		Thread.sleep(2000);
		hp.findflight().click();
		Thread.sleep(2000);
		}
		
		
		//Choose Flight
		if((driver.getTitle()).contains("reserve")) {
		ChooseFlight cf=new ChooseFlight(driver);
		cf.chosedFlight().click();
		Thread.sleep(2000);
		}
		else {
			System.out.println("Invalid");
		}
		
		//Purchase Flight
		if((driver.getTitle()).contains("Purchase")) {
		PurchaseFlight pf=new PurchaseFlight(driver);
		Thread.sleep(2000);
		pf.FirstName().sendKeys("Siddu");
		Thread.sleep(2000);
		pf.CardNumber().sendKeys("2345675834");
		Thread.sleep(2000);
		pf.NameOnCard().sendKeys("Siddalingayya Hiremath");
		Thread.sleep(2000);
		pf.NameOnCard().clear();
		Thread.sleep(2000);
		pf.NameOnCard().sendKeys("Siddalingayya Hiremath");
		Thread.sleep(2000);
		pf.RememberMe().click();
		Thread.sleep(2000);
		pf.PurchseFlight().click();
		Thread.sleep(2000);
		}
		
		//Details
		if((driver.getTitle()).contains("Confirmation")) {
		Details dt=new Details(driver);
		System.out.println("Amount: "+dt.Amount().getText());
		Thread.sleep(2000);
		System.out.println("Card Number: "+dt.CardNumber().getText());
		Thread.sleep(2000);
		System.out.println("Expiry Date: "+dt.ExpiryDate().getText());
		Thread.sleep(2000);
		}
		
		driver.close();
	}

}
