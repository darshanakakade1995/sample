package s5_32locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class S6_41travelssibling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("Webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		//navigation from one sitte to another
		driver.get("https://www.wikipedia.org/");
		driver.navigate().back();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		/*driver.findElement(By.id("inputUsername")).sendKeys("rahulshettyacademy");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();*/
		
        driver.manage().window().maximize();		
		//Travels from brother to brother // sibling not use for parent child travel 
		driver.findElement(By.xpath("//div/button[1]/following-sibling::button[2]")).click();
		driver.findElement(By.xpath("//Header[@class=\"jumbotron text-center header_style\"]/div/a/following-sibling::button[1]")).click();
		
	   //travel from child to parent
		driver.findElement(By.xpath("//Header[@class=\"jumbotron text-center header_style\"]/div/a/parent::div")).getText();
		
		
		
		

		
		
		
		
		
		 
		
		
		
	}
}
