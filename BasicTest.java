package TestsKatalonCURA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import PagesKatalonCURA.AppointmentPage;
import PagesKatalonCURA.LoginPage;
import PagesKatalonCURA.SummaryPage;

public abstract class BasicTest {

	protected WebDriver driver;
	protected LoginPage loginPage;
	protected AppointmentPage appPage;
	protected SummaryPage sumPage;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "driver_lib\\chromedriver.exe");

		this.driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		loginPage = new LoginPage (driver);
		appPage = new AppointmentPage(driver);
		sumPage = new SummaryPage(driver);
	}

	@AfterMethod
	public void cleanup() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}
}
