package PagesKatalonCURA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BasicPage {

	protected WebDriver driver;
	
	public BasicPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean elementExist (WebDriver driver, By by) {
		boolean exist = true;
		
		try {
			driver.findElement(by);
		} catch (Exception e) {
			exist = false;
		}
		return exist;
	}
	
}
