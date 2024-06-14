package S10actionclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class framehandling {

	public static void main (String args[]) {
		
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("www.amezon.in india");
		Actions a= new Actions(driver);
		a.moveToElement("")
		
	}

}
