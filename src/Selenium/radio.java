package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//to get count of all tradio buttons in a page
public class radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.get("https://www.statpac.com/contact.htm");
/*WebElement ele1=		driver.findElement(By.xpath("//input[@type='radio']"));
Point xaxis=		ele1.getLocation();*/


	List<WebElement> ele=driver.findElements(By.xpath("//input[@type='radio']"));
	
	System.out.println(ele.size());

	}

}
