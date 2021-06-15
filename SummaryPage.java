package PagesKatalonCURA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SummaryPage extends BasicPage {

	public SummaryPage(WebDriver driver) {
		super(driver);
	}
// facility
	public WebElement getFacility() {
		return driver.findElement(By.id("facility"));
	}
// readmission
	public WebElement getReadMission () {
		return driver.findElement(By.id("hospital_readmission"));
	}
// healthcare program
	public WebElement getHCProgram() {
		return driver.findElement(By.id("program"));
	}
// date
	public WebElement getDate() {
		return driver.findElement(By.id("visit_date"));
	}
// comment	
	public WebElement getComments() {
		return driver.findElement(By.id("comment"));
	}
}
