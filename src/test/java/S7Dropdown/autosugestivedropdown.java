package S7Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class autosugestivedropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// in searchbox when we type anything ,below suggested keyword comming from that
		// list we need to pick our expected output
		// i.e in suggestion put ind --- print all list and print expected output as
		// well as india from given list

		driver.findElement(By.id("autosuggest")).sendKeys("in");
		List<WebElement> autolist = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));

		for (WebElement option : autolist) {
			
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}		System.out.println(driver.findElement(By.id("autosuggest")).getText());

		}

	}

}
