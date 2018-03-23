package ddf;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Currency {

	public static void main(String[] args) throws BiffException, IOException, InterruptedException {
		
		File f = new File("D:\\selenium  C07\\Testdata\\Online currency.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet ws = wb.getSheet("Sheet1");
		for(int i=1;i<ws.getRows();i++) {
			
			String from = ws.getCell(0,i).getContents();
			String to = ws.getCell(1,i).getContents();
			String amount = ws.getCell(2,i).getContents();
			
			//driver registration
			System.setProperty("webdriver.chrome.driver","D:\\\\selenium  C07\\\\Browser_Driver\\\\Chrome\\\\chromedriver.exe" );
			
			//open browser
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.convertmymoney.com/");
			
			new Select(driver.findElement(By.id("from-list"))).selectByVisibleText(from);
			Thread.sleep(2000);
			
			new Select(driver.findElement(By.id("to-list"))).selectByVisibleText(to);
			Thread.sleep(2000);
			
			driver.findElement(By.id("amount")).clear();
			driver.findElement(By.id("amount")).sendKeys(amount);
			Thread.sleep(5000);
			String res = driver.findElement(By.xpath(".//*[@id='result']")).getAttribute("value");
			System.out.println("result is" +res);
			
			//close the browser
			driver.quit();
			
			
			
		}

	}

}
