package S7Dropdown;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class S7staticdropdown {
	static int a=5,b=4;
	public static void main(String args[])
	{
		System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
         WebDriver driver=new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//static dropdown
	WebElement options=	driver.findElement(By.xpath("//select[@name=\"ctl00$mainContent$DropDownListCurrency\"]"));
		Select dropdown= new Select(options);
		dropdown.selectByIndex(2);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
	
	//dropdown with incremental selection	
	driver.findElement(By.xpath("//div[@id=\"divpaxinfo\"]")).click();
	WebElement adultplus=	driver.findElement(By.id("hrefIncAdt"));
	
	int a=1;
	
	while(a<5) {
		adultplus.click();
		a++;	
	}
	
	WebElement childplus= driver.findElement(By.id("hrefIncChd"));
	
	
	for(int c=1 ; c<5;c++)
	{
		childplus.click();
	}	
	
	driver.findElement(By.id ("btnclosepaxoption")).click();
	System.out.println(	driver.findElement(By.xpath("//div[@id=\"divpaxinfo\"]")).getText());
	
	
	
	
	
	
	}
}
