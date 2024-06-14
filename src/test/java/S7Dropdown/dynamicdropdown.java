package S7Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dynamicdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		//ex. after selection of country , state dropdowm will be visible 		xpath create randamly while selection
        // for one elelement showing 2 xpath then we can select any one i.e  (//li/a[@value="MAA"])[2]  we are choosing 2nd expath
    	//or we can give parent xpath and child xpath combine by giving single space in middle	
		//rightparent and child expath separatly and combine it using space"
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR\'] //li/a[contains(@text,'Bhopal')]")).click();
		 
		
		
	}
	

}
