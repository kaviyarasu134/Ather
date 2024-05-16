package org.base;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	public static WebDriver driver;
	
	public static void chromelaunch() {
		
		WebDriverManager.chromedriver().setup(); 
		

		 driver=new ChromeDriver();
		
		}
	
	public static void urllaunch(String url) {
		driver.get(url);

	}
	public static void implicitlyWait(int sec) {
		
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		
		}
	
	public static void sendkeys(WebElement e,String data) {
		
		e.sendKeys(data);
		

	}
	
	
	public static void click(WebElement e) {
		
		e.click();
		

	}
	
	public static String gettile() {
		String t=driver.getTitle();
		
		return t;

	}
	
	
	public static String getatrribute(WebElement e) {
		
		String c=e.getAttribute("value");
		
		return c;
		
		
		}
	
	public static void quit() {
		driver.quit();

	}
	
	public static void draganddrop(WebElement from,WebElement to) {
		Actions a=new Actions(driver);
		
		a.dragAndDrop(from, to).perform();

	}
	
	
	public static void simplealert() {
		Alert ls=driver.switchTo().alert();
		
		ls.accept();

	}
		
		
		

	}
	
	
	
	


