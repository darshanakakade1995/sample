package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class simplealert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.getProperty("Webdriver.gecko.driver", "C:\\\\drivers\\\\geckodriver.exe");
   WebDriver driver=new FirefoxDriver();  
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	/*
	driver.findElement(By.id("alertbtn")).click();
	Alert a = driver.switchTo().alert();
	System.out.println(a.getText());
	a.accept(); */
	
	
	
	driver.findElement(By.id("confirmbtn")).click();
	Alert b= driver.switchTo().alert();
	b.dismiss();

		
	}

}
