package HotelApp_StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CancelBooking {

	public static WebDriver driver;

	@Before
	public void setUp() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bharath\\Desktop\\Classes\\Browser_Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://adactin.com/HotelApp/");

	}

	@After
	public void tearDown() {
		//driver.quit();
	}

	@Given("^User enters the home page$")
	public void user_enters_the_home_page() {
		driver.findElement(By.id("username")).sendKeys("bharathreddy");
		driver.findElement(By.id("password")).sendKeys("testing1234");
		driver.findElement(By.id("login")).click();
	}

	@When("^User clicks on Booked Itinerary link$")
	public void user_clicks_on_Booked_Itinerary_link() {
		driver.findElement(By.linkText("Booked Itinerary")).click();
	}

	@When("^User serach for the Itinerary$")
	public void user_serach_for_the_Itinerary() {
		driver.findElement(By.id("order_id_text")).sendKeys("Z240O22S86");
		driver.findElement(By.id("search_hotel_id")).click();
	}

	@Then("^User selects an itinary to cancel$")
	public void user_selects_an_itinary_to_cancel() {
		driver.findElement(By.id("check_all")).click();
	}

	@Then("^User clicks on cancel selected$")
	public void user_clicks_on_cancel_selected() {
		Wait_for("cancelall",10);
		WebElement ele_id= driver.findElement(By.name("cancelall"));
		ele_id.click();
	
		driver.switchTo().alert().accept();

	}

	@Then("^User confirms the concelation$")
	public void user_confirms_the_concelation() {

		driver.findElement(By.id("search_result_error")).getText().contains("The booking has been cancelled.");
		driver.quit();
	}

	public static void Wait_for(String ele_id, int t) {
		WebDriverWait wait = new WebDriverWait(driver, t);
		wait.pollingEvery(1, TimeUnit.MILLISECONDS);
		wait.until(ExpectedConditions.elementToBeClickable(By.name(ele_id)));
		
	}
}
