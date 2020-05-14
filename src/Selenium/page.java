package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.get("http://datatables.net/examples/advanced_init/dt_events.html");
		
	/*WebElement table=	driver.findElement(By.xpath("//*[@id='example']"));
		
	List<WebElement> Row	=table.findElements(By.tagName("tr"));
	System.out.println(Row.size());
	List<WebElement> Columns	=table.findElements(By.tagName("th"));
	System.out.println(Columns.size());
	*/
	List<WebElement> elenm=driver.findElements(By.cssSelector("#example_paginate>span>a"));
	elenm.size();
	for(int i=1;i<=elenm.size();i++)
	{
		driver.findElements(By.cssSelector("#example_paginate>span>a[i]"));
	}
	

	}

}
