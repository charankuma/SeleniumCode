package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get("http://testleaf.herokuapp.com/pages/frame.html");
		//Scenario 1:I am inside a frame
		/*driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();*/
	   //Scenario 2:	I am inside a nested frame
     /*   driver.switchTo().frame(1);
        driver.switchTo().frame("frame2");
        driver.findElement(By.xpath("//button[@onclick='change()']")).click();*/
		//Scenario 3:Find total number of frames.
        
       List<WebElement> elements= driver.findElements(By.tagName("iframe"));
       
       System.out.println(elements.size());
		
	
	}

}
