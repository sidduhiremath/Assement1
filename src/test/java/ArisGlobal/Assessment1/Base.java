package ArisGlobal.Assessment1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Base {
public WebDriver driver;
public Properties properties;

public WebDriver Configuration() throws IOException {

	properties=new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\00005110\\eclipse-workspace\\Assessment1\\src\\test\\java\\ArisGlobal\\Assessment1\\Data.properties");
	properties.load(fis);
	String vBrowser=properties.getProperty("vBrowser");
	
	if(vBrowser.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00005110\\OneDrive - Arisglobal software pvt Ltd\\Desktop\\Selenium Components\\chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	else if(vBrowser.equalsIgnoreCase("Edge")) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\00005110\\OneDrive - Arisglobal software pvt Ltd\\Desktop\\Selenium Components\\edgedriver_win64\\msedgedriver.exe");	
		driver=new EdgeDriver();
	}
	else {
		System.out.println("Invalid Browser");
	}
	return driver;

}
}
