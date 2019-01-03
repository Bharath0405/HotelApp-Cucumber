package HotelApp_StepDefinitions;

import java.util.List;
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

public class HotelBooking {

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
		driver.quit();
	}

	@Given("^User is on hotel booking page$")
	public void user_is_on_hotel_booking_page() {
		driver.findElement(By.id("username")).sendKeys("bharathreddy");
		driver.findElement(By.id("password")).sendKeys("testing1234");
		driver.findElement(By.id("login")).click();

	}

	@Then("^Selects the hotel location$")
	public void selects_the_hotel_location() {

		Dropdown_select("location", "Option", "Sydney");

			}

	@Then("^Selects Hotel$")
	public void selects_Hotel() {
		Dropdown_select("hotels", "option", "Hotel Sunshine");
	}

	@Then("^Selects the type of room$")
	public void selects_the_type_of_room() {
		Dropdown_select("room_type", "option", "Deluxe");

	}

	@Then("^Chooses number of rooms$")
	public void chooses_number_of_rooms() {
		Dropdown_select("room_nos", "option", "2 - Two");
	}

	@Then("^enters \"(.*)\" and \"(.*)\" dates$")
	public void enters_and_dates(String checkIn, String checkOut) {
		driver.findElement(By.id("datepick_in")).clear();
		driver.findElement(By.id("datepick_in")).sendKeys(checkIn);
		driver.findElement(By.id("datepick_out")).clear();
		driver.findElement(By.id("datepick_out")).sendKeys(checkOut);

	}

	@Then("^Selects number of Audlts in a room$")
	public void selects_number_of_Audlts_in_a_room() {
		Dropdown_select("adult_room", "option", "2 - Two");
	}

	@Then("^also mentions the number of children in a room$")
	public void also_mentions_the_number_of_children_in_a_room() {
		Dropdown_select("child_room", "option", "2 - Two");
	}

	@Then("^clicks on search button$")
	public void clicks_on_search_button() {
		driver.findElement(By.xpath("//*[@id=\'Submit\']")).click();

	}

	@Then("^Selects the available room$")
	public void selects_the_available_room() {
		driver.findElement(By.id("radiobutton_0")).click();

	}

	@Then("^User clicks on continue button$")
	public void user_clicks_on_continue_button() {
		driver.findElement(By.id("continue")).click();

	}

	@Then("^Enter billing details and click on book now$")
	public void enter_billing_details_and_click_on_booknow() {
		BookAHotel("Donald", "Trump", "Washington DC", "1122334455667788", "1245");
	
	}

	public static void Dropdown_select(String ids, String opt, String val) {

		WebElement Dropdown = driver.findElement(By.id(ids));
		List<WebElement> list = Dropdown.findElements(By.tagName(opt));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().equals(val)) {
				list.get(i).click();
				break;
			}
		}

	}
	public static void BookAHotel(String fName, String lName, String adr, String CCN, String CVV) {
		driver.findElement(By.id("first_name")).sendKeys(fName);
		driver.findElement(By.id("last_name")).sendKeys(lName);
		driver.findElement(By.id("address")).sendKeys(adr);
		driver.findElement(By.id("cc_num")).sendKeys(CCN);
		Dropdown_select("cc_type", "option", "VISA");
		Dropdown_select("cc_exp_month", "option", "January");
		Dropdown_select("cc_exp_year", "option", "2022");
		driver.findElement(By.id("cc_cvv")).sendKeys(CVV);
		driver.findElement(By.xpath("//*[@id=\'book_now\']")).click();
		Waiting_for("logout", 100);
		driver.findElement(By.id("logout")).click();

	}
	public static void Waiting_for(String e_id, int t) {
		WebDriverWait wait = new WebDriverWait(driver, t);
		wait.pollingEvery(1, TimeUnit.MILLISECONDS);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id(e_id)));	
		
	}

}
