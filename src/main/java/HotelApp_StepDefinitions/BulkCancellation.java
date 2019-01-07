package HotelApp_StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BulkCancellation {

	public static WebDriver driver;

	@Given("^User present on the home page$")
	public void user_present_on_the_home_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bharath\\Desktop\\Classes\\Browser_Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://adactin.com/HotelApp/");
		driver.manage().window().maximize();
	}

	@When("^User gives \"(.*)\" and \"(.*)\"$")
	public void user_gives_and(String username, String password) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login")).click();
	}

	@Then("^On the HotelApp booking page user clicks on Booked Itinerary link$")
	public void on_the_HotelApp_booking_page_user_clicks_on_Booked_Itinerary_link() {
		WebElement itr = driver.findElement(By.linkText("Booked Itinerary"));
		itr.click();
	}

	@Then("^User searches for booking to be cancelled with \"(.*)\"$")
	public void user_searches_for_booking_to_be_cancelled_with(String bookingID) {
		driver.findElement(By.id("order_id_text")).sendKeys(bookingID);
		driver.findElement(By.id("search_hotel_id")).click();
	}

	@Then("^select the relevant booking$")
	public void select_the_relevant_booking() {
		driver.findElement(By.id("check_all")).click();

	}

	@Then("^User clicks on Cancellation and confirms it$")
	public void user_clicks_on_Cancellation_and_confirms_it() {
		Wait_for_Element("cancelall", 10);
		WebElement e_id = driver.findElement(By.name("cancelall"));
		e_id.click();

		driver.switchTo().alert().accept();

		driver.findElement(By.id("search_result_error")).getText().contains("The booking has been cancelled.");
		driver.quit();
	}

	public static void Wait_for_Element(String e_id, int t) {
		WebDriverWait Wait = new WebDriverWait(driver, t);
		Wait.pollingEvery(1, TimeUnit.MILLISECONDS);
		Wait.until(ExpectedConditions.elementToBeClickable(By.name(e_id)));
	}

}
