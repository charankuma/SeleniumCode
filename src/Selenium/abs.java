package Selenium;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class abs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
      driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
 //   driver.findElement(By.cssSelector(“body”)).sendKeys(Keys.Control + "t");
      ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
      driver.switchTo().window(tabs.get(0));


        

        
	}

}
