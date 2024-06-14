package S7Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkbox {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// find out checkbox and make it selectable
		// find out n print all checkboxes in present in page

		// check it is already selected or not then select it
		System.out.println(driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).isSelected());

		// find out n print all checkboxes in present in page
		System.out.println("count of all checkbox:"+driver.findElements(By.xpath("//input[@type='checkbox']/following-sibling::label")).size());

		// assignment
		// 1.Check the first Checkbox and verify if it is successfully checked and
		// Uncheck it again to verify if it is successfully Unchecked
		// 2. How to get the Count of number of check boxes present in the page

		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		if (driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected()) {
			System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).getText());
		}
		
	System.out.println("count of checkbox:"+driver.findElements(By.xpath("//input[@type='checkbox']")).size());

	}
}
