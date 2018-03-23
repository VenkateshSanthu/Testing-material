import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LinearFrameWork1 {

	public static void main(String[] args) throws InterruptedException {
		//open the chrome browser
		System.setProperty("webdriver.chrome.driver","D:\\selenium  C07\\Browser_Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//open the application
		driver.get("http://adactin.com/HotelAppBuild2/");
		
		//user login
		driver.findElement(By.id("username")).sendKeys("hemanth123");
		driver.findElement(By.name("password")).sendKeys("hemanth123");
		driver.findElement(By.xpath(".//*[@id='login']")).click();
		Thread.sleep(10000);
		
		//search Hotel
		String x=driver.findElement(By.xpath(".//*[@id='username_show']")).getAttribute("value");
		System.out.println(x);
		String y=driver.findElement(By.xpath("html/body/table[2]/tbody/tr[1]/td[1]")).getText();
		System.out.println(y);
		
		new Select(driver.findElement(By.id("location"))).selectByIndex(3);
		new Select(driver.findElement(By.id("hotels"))).selectByIndex(3);
		new Select(driver.findElement(By.id("room_type"))).selectByIndex(3);
		new Select(driver.findElement(By.id("room_nos"))).selectByIndex(3);
		
		driver.findElement(By.id("datepick_in")).sendKeys("15/03/2018");
		driver.findElement(By.id("datepick_out")).sendKeys("16/03/2018");
		new Select(driver.findElement(By.id("adult_room"))).selectByIndex(3);
		new Select(driver.findElement(By.id("child_room"))).selectByIndex(3);
		driver.findElement(By.id("Submit")).click();
		Thread.sleep(5000);
		
		//book
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.xpath(".//*[@id='continue']")).click();
		Thread.sleep(5000);
		
		//book a hotel
		driver.findElement(By.id("first_name")).sendKeys("ramesh");
		driver.findElement(By.id("last_name")).sendKeys("suresh");
		driver.findElement(By.id("address")).sendKeys("gachibowli");
		driver.findElement(By.id("cc_num")).sendKeys("4528642178932234");
		new Select(driver.findElement(By.id("cc_type"))).selectByIndex(2);
		new Select(driver.findElement(By.xpath(".//*[@id='cc_exp_month']"))).selectByIndex(3);
		new Select(driver.findElement(By.xpath(".//*[@id='cc_exp_year']"))).selectByIndex(10);
		driver.findElement(By.id("cc_cvv")).sendKeys("458");
		driver.findElement(By.id("book_now")).click();
		Thread.sleep(5000);
		
		//order number
		String ordernumber = driver.findElement(By.xpath(".//*[@id='order_no']")).getAttribute("value");
		System.out.println("The order number is"+" " +ordernumber);
		
		driver.close();

	}

}
