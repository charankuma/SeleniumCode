package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;
//Possible Questions
/*
 * 
 */
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {
	
static String St="Handle Exceptions";

static String vt;

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

driver.get("http://testleaf.herokuapp.com/pages/table.html");
//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
Thread.sleep(3000);

WebElement tsbs=driver.findElement(By.xpath("//*[@id=\'contentblock\']"));



/*This Code is find column Headings
 * 
 * List<WebElement> Headings=tsbs.findElements(By.tagName("th"));

for(int i=0;i<=Headings.size();i++)
{
	
	System.out.println(Headings.get(i).getText());
	
}*/
/* one way to fetch all data from a table
List<WebElement> rows=driver.findElements(By.tagName("tr"));

System.out.println(rows.size());

System.out.println(driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/table/tbody/tr[3]/td[1]/font")).getText());

for(int i=2;i<rows.size();i++) {
	List<WebElement> columnss=rows.get(i).findElements(By.tagName("td"));
	for(int j=0;j<columnss.size();j++)
			{
		
		 vt=columnss.get(j).getText();
		
		System.out.println(vt);
		
		}
		
		
			
	}
*/


//Another way to fetch all data from a TABLE

WebElement element=driver.findElement(By.xpath("//*[@id=\'contentblock\']"));

//Rows..tr..To get Number of Rows

List<WebElement> rowcount=driver.findElements(By.xpath("//*[@id='contentblock']/section/div[1]/table/tbody/tr"));

System.out.println(rowcount.size());

//Columns..td..To get total Cell

List<WebElement> columnCount=driver.findElements(By.xpath("//*[@id='contentblock']/section/div[1]/table/tbody/tr/th"));

System.out.println(columnCount.size());

//ystem.out.println(driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/table/tbody/tr[1]/td[1])")).getText());

//To get Row cell count..one row column number..use *

//List<WebElement> RowcolumnCount=driver.findElements(By.xpath("//*[@id='contentblock']/section/div[1]/table/tbody/tr[1]/td"));

//System.out.println(RowcolumnCount.size());
//

//To get all data from Table

for(int i=1;i<=rowcount.size();i++)
{
	
	for(int j=1;j<=columnCount.size();j++)
	{
		System.out.print(driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/table/tbody/tr["+i+"]/*["+j+"]")).getText());
	}
	}

driver.close();
}


			




}

