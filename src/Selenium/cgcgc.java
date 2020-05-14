package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

//Verification of the dropdown values:

public class cgcgc {
	
	public static String Expected1="Portland";
	
	public static void main(String[] args) {
	
	
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get("http://newtours.demoaut.com");
        driver.findElement(By.name("userName")).sendKeys("charan");
        driver.findElement(By.name("password")).sendKeys("charan");
        driver.findElement(By.name("login")).click();
      
 //    String[] st= {"Acapulco","Frankfurt","London","New York","Paris","Portland","San Francisco","Seattle","Sydney","Zurich"};
      
      
      
    /*  for(int i=0;i<=st.length-1;i++)
      {
    	  System.out.println(st[i]);
      }*/
        Select oselect=new Select(driver.findElement(By.name("fromPort")));
        List<WebElement> elem=oselect.getOptions();
        System.out.println(elem.size());
   /*   for(int i=0;i<elem.size();i++)
        {
    Assert.assertEquals(st[i], elem.get(i).getText());
    	  System.out.println(elem.get(i).getText());
     
     }*/
        
        for(int i=0;i<elem.size();i++)
        {
    if(Expected1.equals(elem.get(i).getText()))
    {
    	System.out.println("Available");
    }
     }
        
        
        System.out.println("Vertification Successful");
        
       
        
        
        
        
     
        
	}

}
