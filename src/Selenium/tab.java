package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tab {
	
	static String st="Mukesh";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.get("http://makeseleniumeasy.com/2017/07/14/how-to-handle-a-web-table-in-selenium-webdriver/");
		
WebElement Tabs=driver.findElement(By.name("BookTable"));

List<WebElement> Rows=Tabs.findElements(By.tagName("tr"));

System.out.println(Rows.size());

List<WebElement> Cellcount=Tabs.findElements(By.tagName("td"));

System.out.println(Cellcount.size());

List<WebElement> Column=Tabs.findElements(By.tagName("th"));

System.out.println(Column.size());

for (WebElement ele : Column) {
	
	System.out.println(ele.getText());
	
}

for(int i=1;i<Rows.size();i++)
{
	List<WebElement> cells=Rows.get(i).findElements(By.tagName("td"));
	
	for(int j=1;j<cells.size();j++)
	{
		System.out.println(cells.get(j).getText());
		
		String st2=cells.get(j).getText();
		
}

driver.close();
	}
	

}
}
