package S8additemIntoCart;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.dockerjava.api.exception.NotAcceptableException;

public class additemintocart {

	/*
	 * task- Add randam vegitable into cart > go checkout >add discount >place order
	 * succefully 1.get the all product name list 2.check that product name match
	 * with expected product name 3.if match then click on add to cart
	 */

	static int j = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String[] expecteditemarray = { "Cucumber", "Tomato","Beetroot" };
		// normal arry user bcz for small size then
		// convert arry it into list
		// Get product name list and compaire with expected product
		// here we are reciving productname as cucumber - 1kg , tomato -1kg so we need
		// to remove -1 kg to match with expected item
		// ]we are spliting from - so name[0]=cucmeber , name[1]= -1kg
		// but before - there is empty space .. that also we need to remove using trim
		// method

		AddItem(driver, expecteditemarray);
        checkout(driver,wait);
	}

	public static void AddItem(WebDriver driver,String[] expecteditemarray) {

		List<WebElement> productName = driver.findElements(By.cssSelector("h4.product-name"));

		List<WebElement> addToCartButtons = driver
				.findElements(By.xpath("//div[@class='product'] //div[@class='product-action']/button"));

		for (int i = 0; i < productName.size(); i++) {

			String[] name = productName.get(i).getText().split("-");
			String formatedname = name[0].trim();
			List expecteditemlist = Arrays.asList(expecteditemarray);
			if (expecteditemlist.contains(formatedname)) {
				j++;
				addToCartButtons.get(i).click();
				if (j == expecteditemarray.length) {
					break;
				}
			}
		}
	}
	public static void checkout(WebDriver driver, WebDriverWait wait) {
		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'cart-preview')] //div[@class='action-block']/button")).click();
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//div[@class='promoWrapper']/button")).click();

	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
	 System.out.println( driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());

	}
	
	

}
