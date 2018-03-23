import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LinearFrameWorkAdvanced {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\\\selenium  C07\\\\Browser_Driver\\\\Chrome\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.convertmymoney.com/");
		
		//INR-GBP
		driver.findElement(By.id("amount")).clear();
		new Select(driver.findElement(By.id("from-list"))).selectByVisibleText("INR - Indian Rupee");
		Thread.sleep(2000);
		driver.findElement(By.id("amount")).sendKeys("100");
		String x=driver.findElement(By.id("amount")).getAttribute("value");
		System.out.println("entered rupee value is "+x);
		new Select(driver.findElement(By.id("to-list"))).selectByVisibleText("GBP - British Pound Sterling");
		Thread.sleep(2000);
		
		String Expected_GBP ="1.11";
		System.out.println("The expected_GBP is "+ Expected_GBP);
		String Actual_GBP = driver.findElement(By.id("result")).getAttribute("value");
		System.out.println("the Actual_GBP IS "+ Actual_GBP);
		
		if(Expected_GBP.equals(Actual_GBP)==true)
			System.out.println("testcase passed");
		else
			System.out.println("test case failed");
		
		//INR-AusDollar
		new Select(driver.findElement(By.id("to-list"))).selectByVisibleText("AUD - Australian Dollar");
		Thread.sleep(2000);
		
		String Expected_AUD ="1.98";
		System.out.println("The expected_AUD is "+ Expected_AUD);
		String Actual_AUD = driver.findElement(By.id("result")).getAttribute("value");
		System.out.println("the Actual_AUD IS "+ Actual_AUD);
		
		if(Expected_AUD.equals(Actual_AUD)==true)
			System.out.println("testcase passed");
		else
			System.out.println("test case failed");
		
		//INR-Canada
		new Select(driver.findElement(By.id("to-list"))).selectByVisibleText("CAD - Canadian Dollar");
		Thread.sleep(2000);
		
		String Expected_CAD ="2.01";
		System.out.println("The expected_CAD is "+ Expected_CAD);
		String Actual_CAD = driver.findElement(By.id("result")).getAttribute("value");
		System.out.println("the Actual_AUD IS "+ Actual_CAD);
		
		if(Expected_CAD.equals(Actual_CAD)==true)
			System.out.println("testcase passed");
		else
			System.out.println("test case failed");
		
		driver.quit();
		
	}

}
