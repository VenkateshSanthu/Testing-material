import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OnlineCalculator {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium  C07\\Browser_Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//open URl
		driver.get("http://www.way2automation.com/angularjs-protractor/calc/");
		Thread.sleep(4000);
		
		//insert values
		
		driver.findElement(By.xpath("html/body/div[3]/div/form/input[1]")).sendKeys("5");
		new Select(driver.findElement(By.xpath("html/body/div[3]/div/form/select"))).selectByIndex(3);
		driver.findElement(By.xpath("html/body/div[3]/div/form/input[2]")).sendKeys("10");
		driver.findElement(By.xpath(".//*[@id='gobutton']")).click();
		Thread.sleep(5000);
		
		String x = driver.findElement(By.xpath("html/body/div[3]/div/form/h2")).getText();
		System.out.println("The multiplication of 2 numbers is "+x);
		
		//subtraction
		driver.findElement(By.xpath("html/body/div[3]/div/form/input[1]")).sendKeys("5");
		new Select(driver.findElement(By.xpath("html/body/div[3]/div/form/select"))).selectByIndex(4);
		driver.findElement(By.xpath("html/body/div[3]/div/form/input[2]")).sendKeys("10");
		driver.findElement(By.xpath(".//*[@id='gobutton']")).click();
		Thread.sleep(5000);
		
		String y = driver.findElement(By.xpath("html/body/div[3]/div/form/h2")).getText();
		System.out.println("The subtraction of 2 numbers is "+y);
		
		//%%%%%%%%%%%%%%%%%%
		driver.findElement(By.xpath("html/body/div[3]/div/form/input[1]")).sendKeys("5");
		new Select(driver.findElement(By.xpath("html/body/div[3]/div/form/select"))).selectByIndex(2);
		driver.findElement(By.xpath("html/body/div[3]/div/form/input[2]")).sendKeys("10");
		driver.findElement(By.xpath(".//*[@id='gobutton']")).click();
		Thread.sleep(5000);
		
		String z = driver.findElement(By.xpath("html/body/div[3]/div/form/h2")).getText();
		System.out.println("The % of 2 numbers is "+z);
		
		//+++++++++++++++++++++++
		driver.findElement(By.xpath("html/body/div[3]/div/form/input[1]")).sendKeys("5");
		new Select(driver.findElement(By.xpath("html/body/div[3]/div/form/select"))).selectByIndex(0);
		driver.findElement(By.xpath("html/body/div[3]/div/form/input[2]")).sendKeys("10");
		driver.findElement(By.xpath(".//*[@id='gobutton']")).click();
		Thread.sleep(5000);
		
		String a = driver.findElement(By.xpath("html/body/div[3]/div/form/h2")).getText();
		System.out.println("the addition of 2 numbers is "+a);
		
		//////////////////////////////////
		driver.findElement(By.xpath("html/body/div[3]/div/form/input[1]")).sendKeys("5");
		new Select(driver.findElement(By.xpath("html/body/div[3]/div/form/select"))).selectByIndex(1);
		driver.findElement(By.xpath("html/body/div[3]/div/form/input[2]")).sendKeys("10");
		driver.findElement(By.xpath(".//*[@id='gobutton']")).click();
		Thread.sleep(5000);
		
		String b = driver.findElement(By.xpath("html/body/div[3]/div/form/h2")).getText();
		System.out.println("The division of 2 numbers is "+b);
		driver.close();

	}

}
