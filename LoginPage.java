package PagesKatalonCURA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasicPage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public WebElement getAppointmentBtn () {
		return driver.findElement(By.id("btn-make-appointment"));
	}
	
	public WebElement getUsername() {
		return driver.findElement(By.id("txt-username"));
	}

	public WebElement getPassword() {
		return driver.findElement(By.id("txt-password"));
	}

	public WebElement getLoginBtn () {
		return driver.findElement(By.id("btn-login"));
	}
}
