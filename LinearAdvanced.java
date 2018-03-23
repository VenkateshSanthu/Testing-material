import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LinearAdvanced {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium  C07\\Browser_Driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//open browser
		driver.get("http://www.way2automation.com/angularjs-protractor/calc/");
		Thread.sleep(5000);
		
		//insert values
		
		driver.findElement(By.xpath("html/body/div[3]/div/form/input[1]")).sendKeys("5");
		new Select(driver.findElement(By.xpath("html/body/div[3]/div/form/select"))).selectByIndex(3);
		driver.findElement(By.xpath("html/body/div[3]/div/form/input[2]")).sendKeys("10");
		driver.findElement(By.xpath(".//*[@id='gobutton']")).click();
		Thread.sleep(5000);
		
		String Expectedmul= "50";
		System.out.println("The Expectedmul value is "+ Expectedmul);
		String Actualmul = driver.findElement(By.xpath("html/body/div[3]/div/form/h2")).getText();
		System.out.println("The Actualmul value is "+Actualmul);
		
		if(Expectedmul.equals(Actualmul)) 
			System.out.println("testcase passed");
		else
			System.out.println("testcase failed");
	
		//subtraction
		
		driver.findElement(By.xpath("html/body/div[3]/div/form/input[1]")).sendKeys("5");
		new Select(driver.findElement(By.xpath("html/body/div[3]/div/form/select"))).selectByIndex(4);
		driver.findElement(By.xpath("html/body/div[3]/div/form/input[2]")).sendKeys("10");
		driver.findElement(By.xpath(".//*[@id='gobutton']")).click();
		Thread.sleep(5000);
		
		String Expectedsub= "50";
		System.out.println("The Expectedsub value is "+ Expectedsub);
		String Actualsub = driver.findElement(By.xpath("html/body/div[3]/div/form/h2")).getText();
		System.out.println("The Actualsub value is "+Actualsub);
		
		if(Expectedsub.equals(Actualsub)) 
			System.out.println("testcase passed");
		else
			System.out.println("testcase failed");
		
		//modulus
		
		driver.findElement(By.xpath("html/body/div[3]/div/form/input[1]")).sendKeys("5");
		new Select(driver.findElement(By.xpath("html/body/div[3]/div/form/select"))).selectByIndex(2);
		driver.findElement(By.xpath("html/body/div[3]/div/form/input[2]")).sendKeys("10");
		driver.findElement(By.xpath(".//*[@id='gobutton']")).click();
		Thread.sleep(5000);
		
		String Expectedmod= "50";
		System.out.println("The Expectedmod value is "+ Expectedmod);
		String Actualmod = driver.findElement(By.xpath("html/body/div[3]/div/form/h2")).getText();
		System.out.println("The Actualmod value is "+Actualmod);
		
		if(Expectedmod.equals(Actualmod)) 
			System.out.println("testcase passed");
		else
			System.out.println("testcase failed");
		
		//addition
		
		driver.findElement(By.xpath("html/body/div[3]/div/form/input[1]")).sendKeys("5");
		new Select(driver.findElement(By.xpath("html/body/div[3]/div/form/select"))).selectByIndex(0);
		driver.findElement(By.xpath("html/body/div[3]/div/form/input[2]")).sendKeys("10");
		driver.findElement(By.xpath(".//*[@id='gobutton']")).click();
		Thread.sleep(5000);
		
		String Expectedadd= "50";
		System.out.println("The Expectedadd value is "+ Expectedadd);
		String Actualadd = driver.findElement(By.xpath("html/body/div[3]/div/form/h2")).getText();
		System.out.println("The Actualadd value is "+Actualadd);
		
		if(Expectedadd.equals(Actualadd)) 
			System.out.println("testcase passed");
		else
			System.out.println("testcase failed");
		
		//division
		
		driver.findElement(By.xpath("html/body/div[3]/div/form/input[1]")).sendKeys("5");
		new Select(driver.findElement(By.xpath("html/body/div[3]/div/form/select"))).selectByIndex(1);
		driver.findElement(By.xpath("html/body/div[3]/div/form/input[2]")).sendKeys("10");
		driver.findElement(By.xpath(".//*[@id='gobutton']")).click();
		Thread.sleep(5000);
		
		String Expected_div= "50";
		System.out.println("The Expected_div value is "+ Expected_div);
		String Actualdiv = driver.findElement(By.xpath("html/body/div[3]/div/form/h2")).getText();
		System.out.println("The Actualdiv value is "+Actualdiv);
		
		if(Expected_div.equals(Actualdiv)) 
			System.out.println("testcase passed");
		else
			System.out.println("testcase failed");
		

	}

}
