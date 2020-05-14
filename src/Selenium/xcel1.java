package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xcel1 {
	
	
	public static void m1(String Firstname,String Lastname,String phone,String username,String address1, String city,String state,String postal)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get(cons.url);
        driver.findElement(By.name("firstName")).sendKeys(Firstname);
        driver.findElement(By.name("lastName")).sendKeys(Lastname);
        driver.findElement(By.name("phone")).sendKeys(phone);
        driver.findElement(By.name("userName")).sendKeys(username);
        driver.findElement(By.name("address1")).sendKeys(address1);
        driver.findElement(By.name("city")).sendKeys(city);
        driver.findElement(By.name("state")).sendKeys(state);
        driver.findElement(By.name("postalCode")).sendKeys(postal);
     //   driver.findElement(By.name("email")).sendKeys("charan");
       // driver.findElement(By.name("password")).sendKeys("charan");
        //driver.findElement(By.name("confirmPassword")).sendKeys("charan");
	}

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		//xcel1.m1();
		m1("charan","charan","charan","charan","charan","charan","charan","charan");
		
		EXcelsss se=new EXcelsss("C://Users//hp//eclipse-workspace//Test//src//TestData//Realdata.xlsx");
		
		
	
	}

}
