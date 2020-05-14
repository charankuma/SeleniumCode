package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class drop {
	@Test

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get("http://newtours.demoaut.com");
        driver.findElement(By.name("userName")).sendKeys("charan");
        driver.findElement(By.name("password")).sendKeys("charan");
        driver.findElement(By.name("login")).click();
        //Verify dropdown values
        String st[]= {"Acapulco","Frankfurt","London","New york","Paris","Portland","San Francisco","Seattle","Sydney","Zurich"};
        Select oselect=new Select(driver.findElement(By.name("fromPort")));
        List<WebElement> elem=oselect.getOptions();
        for(int i=0;i<=elem.size();i++)
        {
     Assert.assertEquals(expected, actual);
     Assert.assertEquals(expected, actual);
     
     }
        

	}

}
