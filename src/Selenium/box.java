package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.get("http://testleaf.herokuapp.com/pages/radio.html");

	//	driver.findElement(By.xpath("<input type=\'checkbox\'>")).click();
		
List<WebElement> ele=driver.findElements(By.className("myradio"));

for (WebElement ele1 : ele) {
	ele1.click();
	
}
	}

}
