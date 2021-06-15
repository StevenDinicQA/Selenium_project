package TestsKatalonCURA;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppointmentTest extends BasicTest {

	@Test
	public void katalonHealthcare() throws InterruptedException {
		this.driver.get("https://katalon-demo-cura.herokuapp.com/");

		loginPage.getAppointmentBtn().click();
		Thread.sleep(3000);
		loginPage.getUsername().sendKeys("John Doe");
		loginPage.getPassword().sendKeys("ThisIsNotAPassword");
		loginPage.getLoginBtn().click();
		Thread.sleep(3000);

		appPage.isFormPresented();

		String facility = "Hongkong CURA Healthcare Center";
		String date = "21/09/2020";
		String comment = "123, test comment";

		appPage.selectFacilities(facility);
		appPage.getRadio1().click();
		appPage.getVisitDate().sendKeys(date);
		appPage.getComment().sendKeys(comment);
		appPage.getBookAppointmentBtn().click();

		Assert.assertTrue(sumPage.getFacility().getText().contains("Hongkong"), "Facility error");
		Assert.assertTrue(sumPage.getReadMission().getText().contains("No"), "ReadMission not present");
		Assert.assertTrue(sumPage.getHCProgram().getText().contains("Medicare"), "Program not present");
		Assert.assertTrue(sumPage.getDate().getText().contains("21/09/2020"), "date not good");
		Assert.assertTrue(sumPage.getComments().getText().contains("123, test comment"), "text not there");

	}

}
