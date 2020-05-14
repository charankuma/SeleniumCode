package Selenium;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		WebElement elem=driver.findElement(By.xpath("//select[@id='dropdown1']"));
		System.out.println(elem.getTagName());
     /*   Select oselect=new Select(elem);
        oselect.selectByIndex(1);
		WebElement elem1=driver.findElement(By.xpath("//select[@name='dropdown2']"));
		 Select oselect1=new Select(elem1);
		 oselect1.selectByVisibleText("Appium");
		 WebElement elem2=driver.findElement(By.xpath("//select[@id='dropdown3']"));
		 Select oselect2=new Select(elem2);
		 oselect2.selectByVisibleText("Loadrunner");
		 WebElement elem3=driver.findElement(By.xpath("//select[@class='dropdown']"));
		 Select oselect3=new Select(elem2);*/
		

/*List<WebElement> opt=oselect3.getOptions();
for (WebElement opt1 : opt) {
	System.out.println(opt1.getText());
	 WebElement elem4=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/select"));
	elem4.sendKeys("UFT/QTP");
	 */

	
	
	
	
}


	}

