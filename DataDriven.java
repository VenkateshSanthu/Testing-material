package DDF;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDriven {

	public static void main(String[] args) throws BiffException, IOException, InterruptedException {
		
		File f = new File("D:\\selenium  C07\\Testdata\\Adactin.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet ws =wb.getSheet("Sheet1"); 
		int x= ws.getRows();
		for(int i=3;i<=x;i++) {
			String Uname = ws.getCell(1,i).getContents();
			String pwd = ws.getCell(2,i).getContents();
			String Loc = ws.getCell(3,i).getContents();
			String hotel = ws.getCell(4,i).getContents();
			String room = ws.getCell(5,i).getContents();
			String firstname = ws.getCell(6,i).getContents();
			String lastname = ws.getCell(7,i).getContents();
			String billingadd = ws.getCell(8,i).getContents();
			String cc = ws.getCell(9,i).getContents();
			String expmon = ws.getCell(10,i).getContents();
			String expyear = ws.getCell(11,i).getContents();
			String cvv = ws.getCell(12,i).getContents();
			System.setProperty("webdriver.chrome.driver","D:\\selenium  C07\\Browser_Driver\\Chrome\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://adactin.com/HotelAppBuild2/");
			driver.findElement(By.id("username")).sendKeys(Uname);
			driver.findElement(By.id("password")).sendKeys(pwd);
			driver.findElement(By.id("login")).click();
			Thread.sleep(2000);
			new Select(driver.findElement(By.id("location"))).selectByValue(Loc);
			new Select(driver.findElement(By.id("hotels"))).selectByValue(hotel);
			new Select(driver.findElement(By.id("room_type"))).selectByValue(room);
			new Select(driver.findElement(By.id("room_nos"))).selectByIndex(2);
			driver.findElement(By.id("datepick_in")).clear();
			driver.findElement(By.id("datepick_in")).sendKeys("21/03/2018");
			driver.findElement(By.id("datepick_out")).clear();
			driver.findElement(By.id("datepick_out")).sendKeys("22/03/2018");
			new Select(driver.findElement(By.id("adult_room"))).selectByIndex(1);
			new Select(driver.findElement(By.xpath(".//*[@id='child_room']"))).selectByIndex(2);
			Thread.sleep(1000);
			driver.findElement(By.xpath(".//*[@id='Submit']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(".//*[@id='radiobutton_0']")).click();
			driver.findElement(By.xpath(".//*[@id='continue']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("first_name")).sendKeys(firstname);
			driver.findElement(By.id("last_name")).sendKeys(lastname);
			driver.findElement(By.id("address")).sendKeys(billingadd);
			driver.findElement(By.id("cc_num")).sendKeys("1234569871236540");
			new Select(driver.findElement(By.id("cc_type"))).selectByVisibleText(cc);
			new Select(driver.findElement(By.id("cc_exp_month"))).selectByVisibleText(expmon);
			new Select(driver.findElement(By.id("cc_exp_year"))).selectByVisibleText(expyear);
			driver.findElement(By.id("cc_cvv")).sendKeys(cvv);
			driver.findElement(By.xpath(".//*[@id='book_now']")).click();
			Thread.sleep(5000);
			String orderno = driver.findElement(By.xpath(".//*[@id='order_no']")).getAttribute("value");
			System.out.println("order number is "+orderno);

			
			
			
			driver.quit();
			
		}

	}

}
