package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	    JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("var elemen=document.getElementById('autocomplete');elemen.value='charan';");
		js.executeScript("var element=document.getElementsByName('radioButton');element[2].click();");
	//	js.executeScript("document.getElementById('dropdown-class-example').value='Option2'");
WebElement ele=		driver.findElement(By.cssSelector("button#mousehover"));
		//js.executeScript("arguments[0].scrollToView()", ele);
//js.executeScript("window.close()");
js.executeScript("window.location='http://www.google.com'");








		
		
		
		

	}

}
