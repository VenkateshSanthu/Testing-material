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

public class Ddfcalc {

	public static void main(String[] args) throws BiffException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		File f = new File("D:\\selenium  C07\\Testdata\\Adactin.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet ws =wb.getSheet("Sheet2"); 
		int x= ws.getRows();
		for(int i=1;i<=x;i++) {
			String inp1 = ws.getCell(0,i).getContents();
			String oper = ws.getCell(1,i).getContents();
			String inp2 = ws.getCell(2,i).getContents();
			System.setProperty("webdriver.chrome.driver","D:\\selenium  C07\\Browser_Driver\\Chrome\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.way2automation.com/angularjs-protractor/calc/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("html/body/div[3]/div/form/input[1]")).sendKeys(inp1);
			new Select(driver.findElement(By.xpath("html/body/div[3]/div/form/select"))).selectByVisibleText(oper);
			driver.findElement(By.xpath("html/body/div[3]/div/form/input[2]")).sendKeys(inp2);
			driver.findElement(By.xpath(".//*[@id='gobutton']")).click();
			Thread.sleep(5000);
			String res= driver.findElement(By.xpath("html/body/div[3]/div/form/h2")).getText();
			System.out.println("result is "+res);
			driver.quit();
		
		}

	}

}
