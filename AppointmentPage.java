package PagesKatalonCURA;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AppointmentPage extends BasicPage {

	public AppointmentPage(WebDriver driver) {
		super(driver);
	}

	public Select getFacility1() {
		Select f1 = new Select(driver.findElement(By.name("facility")));
		return f1;
	}

	public void selectFacilities(String facility) {
		this.getFacility1().selectByVisibleText(facility);
	}

	public WebElement getReadmission() {
		return driver.findElement(By.id("chk_hospotal_readmission"));
	}

	public WebElement getRadio1() {
		return driver.findElement(By.id("radio_program_medicare"));
	}

	public WebElement getRadio2() {
		return driver.findElement(By.id("radio_program_medicaid"));
	}

	public WebElement getRadio3() {
		return driver.findElement(By.id("radio_program_none"));
	}

	public WebElement getVisitDate() {
		return driver.findElement(By.id("txt_visit_date"));
	}

	public WebElement getComment() {
		return driver.findElement(By.name("comment"));
	}

	public boolean isFormPresented() {

		List<WebElement> elements = driver.findElements(By.id("appointment"));

		if (elements.size() == 0) {
			return false;
		} else {
			return true;
		}
	}

	public WebElement getBookAppointmentBtn () {
		return driver.findElement(By.id("btn-book-appointment"));
	}

}
