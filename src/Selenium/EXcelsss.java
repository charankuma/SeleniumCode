package Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EXcelsss {

public File src;
public  XSSFWorkbook book;
public static	XSSFSheet sheet;
public FileInputStream file;
public static String cell;
public EXcelsss(String path) throws Throwable
{
 //In File mention path of the  Excel..Go to Excel..Right Click..Properties..Select Location
        //In Java one Backward slash is not allowed so we need to use 2 forward slashes
        //File..Where we need to mention the path of Excel
        //File InputStream..When we are readind or writing in Excel then we have too use FileInputStream
 src=new File(path);
 file=new FileInputStream(src);
 //Load our full workbook by using XSSFworkbook
 book=new XSSFWorkbook(file);
 sheet=book.getSheetAt(0);
}
      
        
 public static void m2(int i,int j)
 {
   cell=sheet.getRow(i).getCell(j).getStringCellValue();
 }
	 
   
 /* System.out.println(sheet.);
  
  System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
  
  System.out.println(sheet.getRow(0).getCell(2).getStringCellValue());
  System.out.println(sheet.getRow(0).getCell(3).getStringCellValue());
  System.out.println(sheet.getRow(0).getCell(4).getStringCellValue());
  
  System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
  System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());*/


   
  for(int i=0;i<=sheet.getLastRowNum();i++)
   {
	   
int cells=sheet.getRow(i).getLastCellNum();


for(int j=0;j<cells;j++)
{
	String st=sheet.getRow(i).getCell(j).getStringCellValue();
	System.out.println(st);
}
   }
   
 }
     
	}
	}
 

	


