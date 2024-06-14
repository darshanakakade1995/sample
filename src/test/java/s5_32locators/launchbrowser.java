package s5_32locators;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.w3c.dom.Text;

import com.github.dockerjava.api.command.InspectExecResponse.Container;

public class launchbrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		//id,classname,name locator use 
		driver.findElement(By.id("inputUsername")).sendKeys("111");
		driver.findElement(By.name("inputPassword")).sendKeys("q33"+Keys.ENTER);
		driver.findElement(By.className("signInBtn")).click();
		//Thread.sleep(3000);
/*
		String errormsg=	driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println(errormsg);	
		
		
	    driver.findElement(By.linkText("Forgot your password?")).click();
		//driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		
		//when we have to find css using index when we dont have unique attribute
		driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("Darshana");
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("darshana@gmail.com");
	
		
		//how to travels from parent to child 
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("123");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String password= driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		System.out.println(password);
		
		//when attribute value continu changing half text that case
		driver.findElement(By.xpath("//div[contains(@class,'pwd')]/button[1]")).click();
		//div[contains(@class,'pwd')]/button[1]
		//div[@class="forgot-pwd-btn-conainer"]/button[1]
       ////button[text()='ADD TO CART']    -- search element using text visible in webpage

		
		driver.findElement(By.id("inputUsername")).sendKeys("rahulshettyacademy");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		
		
		
	}
*/
}
}
