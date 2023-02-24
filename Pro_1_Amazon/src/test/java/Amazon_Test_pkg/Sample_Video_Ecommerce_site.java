package Amazon_Test_pkg;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Sample_Video_Ecommerce_site {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/client");
		/* SIGNUP driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Gayatri");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Kes");
driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("g@gmail.com");
driver.findElement(By.xpath("//input[@id='userMobile']")).sendKeys("1234567890");

WebElement occu=driver.findElement(By.xpath("//select[contains(@class,'custom-select ')]"));
occu.click();

Select s=new Select(occu);
s.selectByVisibleText("Engineer");
driver.findElement(By.xpath("//span[text()='Female']")).click();
driver.findElement(By.xpath("//input[@id='userPassword']")).sendKeys("Gayu@123");
driver.findElement(By.xpath("//input[@id='confirmPassword']")).sendKeys("Gayu@123");
driver.findElement(By.xpath("//input[@formcontrolname='required']")).click();
driver.findElement(By.xpath("//input[@id='login']")).click();*/
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("g@gmail.com");
		driver.findElement(By.xpath("//input[@id='userPassword']")).sendKeys("Gayu@123");
		
		driver.findElement(By.xpath("//input[@id='login']")).click();
		driver.findElement(By.xpath(" ( //button[text()=' Add To Cart'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(" ( //button[text()=' Add To Cart'])[3]")).click();
		// //button[text()=' Add To Cart']
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//button[@class='btn btn-custom'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='btn btn-custom'])[3]")).click();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,6000)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Checkout']")).click();
driver.findElement(By.xpath("(//input[@class='input txt'])[1]")).sendKeys("1");


driver.findElement(By.xpath("(//input[@class='input txt'])[2]")).sendKeys("2");
		//driver.findElement(By.xpath("//input[@name='coupon']")).sendKeys("2");
		//driver.findElement(By.xpath("//button[text()='Apply Coupon']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Select Country']")).sendKeys("india");
		List<WebElement>ListOption=driver.findElements(By.xpath("//button[@class='ta-item list-group-item ng-star-inserted']"));
		for(WebElement option:ListOption) {
			
			if(option.getText().equalsIgnoreCase("india")) {
				option.click();
				break;
			}
		}
	
		driver.findElement(By.xpath("//a[text()='Place Order ']")).click();
	
//		public void clickCookiesPolicies() {
//			WebDriver wait =new WebDriverWait(driver,20);
//			wait.until(ExpectedConditions.visibilityOf(cookiesPolicy))cookiesPolicy.click();
		}
		
	}
	
	


