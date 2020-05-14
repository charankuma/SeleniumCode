package Selenium;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mov {
//	public static String ul;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get("https:google.com");
       List<WebElement> tag= driver.findElements(By.tagName("a"));
       System.out.println(tag.size());
       
       for(int i=0;i<tag.size();i++)
       {
    	   String linkurl=tag.get(i).getAttribute("href");
    	  URL url= new URL(linkurl);
    
    	   HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
    	   
    	   
    	   httpURLConnection.connect();
    	   httpURLConnection.getResponseMessage();
    	   httpURLConnection.disconnect();
    	   System.out.println(linkurl+"........"+ httpURLConnection.getResponseMessage());
    			
    	   
       }
        
       
       
        
   
   
   


	}

}
