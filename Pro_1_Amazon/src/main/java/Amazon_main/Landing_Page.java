package Amazon_main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Main_PageObjectClass.Abstract_Component;

public class Landing_Page extends Abstract_Component {
	
	 WebDriver driver;
	 public Landing_Page(WebDriver driver){
		 super(driver);
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 //WebElement UserEmail=driver.findElement(By.xpath("//input[@id='userEmail']"));
	 //OR
//PageFactory
	 @FindBy(xpath="//input[@id='userEmail']")
	 WebElement userEmail;
@FindBy(xpath="//input[@id='userPassword']")
WebElement password;
@FindBy(xpath="//input[@id='login']")
WebElement login;

public void loginApp(String email,String Pass) {
	userEmail.sendKeys(email);
	password.sendKeys(Pass);
	login.click();
}
public void goTo() {
	driver.get("https://rahulshettyacademy.com/client");
}
}
