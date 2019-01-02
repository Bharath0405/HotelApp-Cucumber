package HotelApp_StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	public static WebDriver driver;

	@Given("^User is on the HotelApp homepage$")
	public void user_is_on_the_HotelApp_homepage() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Bharath\\Desktop\\Classes\\Browser_Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://adactin.com/HotelApp/");
		driver.manage().window().maximize();
	}

	@When("^User enters the username and password$")
	public void user_enters_the_username_and_password() {
		driver.findElement(By.id("username")).sendKeys("bharathreddy");
		driver.findElement(By.id("password")).sendKeys("testing1234");

	}

	@When("^clicks on the login button$")
	public void clicks_on_the_login_button() {
		WebElement loginbtn = driver.findElement(By.xpath("//input[@type='Submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginbtn);
	}

	@Then("^Verify the login status$")
	public void verify_the_login_status() {

		WebElement logout = driver.findElement(By.linkText("Logout"));
		logout.click();
		driver.quit();
	}

}
