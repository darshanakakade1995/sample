package S7Dropdown;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.xpath("//div[@class='form-group'] //input[@name='name']")).sendKeys("Darshana");
		driver.findElement(By.xpath("//div[@class='form-group'] //input[@name='email']")).sendKeys("darsh@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("pass@123");
		driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();
		// Gender dropdown
		WebElement drpdwn = driver.findElement(By.id("exampleFormControlSelect1"));
		Select genderdrpdwon = new Select(drpdwn);
		genderdrpdwon.selectByVisibleText("Female");
		// radio button
		driver.findElement(By.xpath("//input[@id='inlineRadio2']")).click();
		// input[@name='bday']

		driver.findElement(By.xpath("//input[@name='bday']")).click();

		driver.findElement(By.xpath("//input[@value='Submit']")).click();

		String expectedmsg = "Success! The Form has been submitted successfully!.";

		String actualmsg = driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText();
		assertEquals(actualmsg, expectedmsg);

	}

}
