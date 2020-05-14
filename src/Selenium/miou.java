package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class miou {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	driver.get("https://jqueryui.com/draggable/");
	
	//Mouse over action By using Action class
	
	/*WebElement elem1=driver.findElement(By.xpath("//a[text()='Contribute']"));
	WebElement elem=	driver.findElement(By.xpath("//a[text()='Style Guides']"));
	
	Actions act=new Actions(driver);
	
	act.moveToElement(elem1).build().perform();
	
	elem.click();*/
	
	//Drag and Drop
	
	driver.findElement(By.xpath("//a[text()='Draggable']")).click();
	
	driver.switchTo().frame(0);
	
	WebElement source=driver.findElement(By.xpath("//*[@id=\'draggable\']"));
	
/*	////WebElement Desti=driver.findElement(By.xpath("//*[@id=\'draggable\']"));
	
int x=	source.getLocation().getX();
int y=  source.getLocation().getY();*/


	Actions act=new Actions(driver);
	act.dragAndDropBy(source, 108, 62).build().perform();
	
	

	
	
	
	
	

	}

}
