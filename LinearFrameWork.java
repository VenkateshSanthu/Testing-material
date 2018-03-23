package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LinearFrameWork {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium  C07\\Browser_Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//open browser with url
		driver.get("http://www.practiceselenium.com/welcome.html");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath(".//*[@id='wsb-button-00000000-0000-0000-0000-000450914899']/span")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='wsb-button-00000000-0000-0000-0000-000451961556']/span")).click();
		Thread.sleep(4000);
		
		
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("eailgufsevf@gmail.com");
		driver.findElement(By.xpath(".//*[@id='name']")).sendKeys("ramesh");
		driver.findElement(By.xpath(".//*[@id='address']")).sendKeys("Erragadda");
		new Select(driver.findElement(By.id("card_type"))).selectByIndex(1);
		driver.findElement(By.xpath(".//*[@id='card_number']")).sendKeys("9876543210012345");
		driver.findElement(By.xpath(".//*[@id='cardholder_name']")).sendKeys("shantha bhai");
		driver.findElement(By.xpath(".//*[@id='verification_code']")).sendKeys("895428");
		driver.findElement(By.xpath(".//*[@id='wsb-element-00000000-0000-0000-0000-000452010925']/div/div/form/div/button")).click();
		Thread.sleep(4000);
		
		//close the browser
		driver.quit();
	}

}
