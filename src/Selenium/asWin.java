package Selenium;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class asWin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.get("http://testleaf.herokuapp.com/");
		
		driver.findElement(By.xpath("//img[@alt='Windows']")).click();
		
		String ParentWindow=driver.getWindowHandle();
		
		//Scenario 1 Click button to open home page in New Window
/*driver.findElement(By.xpath("//button[text()='Open Home Page']")).click();

Set<String> childWindows=driver.getWindowHandles();


System.out.println(childWindows.size());


for (String sdf : childWindows) {
	
	if(!ParentWindow.equalsIgnoreCase(sdf))
	{
	
	driver.switchTo().window(sdf);
System.out.println(driver.getTitle());
driver.findElement(By.xpath("//img[@alt='Buttons']")).click();
	}	
}*/

		//Find the number of opened windows..Scenario2
		
/*		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();	
		
		Set<String> childWindows=driver.getWindowHandles();
		
		System.out.println(childWindows.size());
		
		for(String sdf:childWindows)
		{
			if(!ParentWindow.equalsIgnoreCase(sdf))
			{
				driver.switchTo().window(sdf);
				driver.findElement(By.xpath("//a[text()='Verify am I broken?']")).click();
				System.out.println(driver.getCurrentUrl());
				
		}
			//driver.switchTo().window("ParentWindow");
		}
		*/
		
		//Scenario 3:
		//Wait for 2 new Windows to open
		
driver.findElement(By.xpath("//button[@onclick='openWindowsWithWait();']")).click();	
		
		Set<String> childWindows=driver.getWindowHandles();
		
		System.out.println(childWindows.size());
		
		for(String sdf:childWindows)
		{
			if(ParentWindow!=sdf)
			{
				try
				{
					driver.switchTo().window(sdf);
				}
				catch(Exception e)
				{
					Thread.sleep(3000);
				}
				
				//driver.findElement(By.xpath("//a[text()='Verify am I broken?']")).click();
				System.out.println(driver.getCurrentUrl());
				
		}
			//driver.switchTo().window("ParentWindow");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


//driver.close();











		
		
	}

}
