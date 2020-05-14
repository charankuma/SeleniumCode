package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class win {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.get("http://testleaf.herokuapp.com/");
		
		driver.findElement(By.xpath("//img[@alt='Alert']")).click();
		
	/*	driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);*/
driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();

		
try
{
driver.switchTo().alert().sendKeys("Charankumark");
}
catch(Exception e)
{
		Thread.sleep(2000);
}
driver.findElement(By.xpath("//button[text()='Line Breaks?']")).click();
		
	String st=	driver.switchTo().alert().getText();
	
	System.out.println(st);
		
		
		
		
		

	}

}
