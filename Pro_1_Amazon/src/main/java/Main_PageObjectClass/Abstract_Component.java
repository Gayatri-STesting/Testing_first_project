package Main_PageObjectClass;

import java.util.concurrent.TimeUnit;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Amazon_main.Landing_Page;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Abstract_Component {
	WebDriver driver;
	public Abstract_Component(WebDriver driver) {
		this.driver=driver;
	}

	public void waitFOr_Element(By findBy) {
	//WebDriverWait wait =new WebDriverWait(driver,Duration,ofSecond(5));
		WebDriverWait wait =new WebDriverWait(driver,Duration,ofSecond(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	//driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	}
}
