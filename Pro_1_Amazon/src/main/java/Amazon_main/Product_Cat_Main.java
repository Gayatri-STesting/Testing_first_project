package Amazon_main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Main_PageObjectClass.Abstract_Component;

public class Product_Cat_Main extends Abstract_Component {
WebDriver driver;
	public Product_Cat_Main(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		super(driver);
		// TODO Auto-generated constructor stub
	}

}
