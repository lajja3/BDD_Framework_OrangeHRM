package step_definition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Duration;

public class OrangeStepDefinitionClass {

WebDriver driver;
	
	@Given("^user is already on Login Page$")
	public void user_is_on_login_page() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lajja Patel\\OneDrive\\Desktop\\MySelenium57\\Cucumber\\CucumberWorkspace\\geckodriver.exe");
		driver = new FirefoxDriver(); 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
	}
	
	@When("^title of login page is OrangeHRM$")
	public void title_of_login_page_is_OrangeHRM() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("OrangeHRM", title);
	}
	
	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters(String username,String password) {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username); //not working
		driver.findElement(By.name("password")).sendKeys(password);
	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Then("^user is on home page$")
	public void user_is_on_home_page() throws InterruptedException {
		String title = driver.getTitle();
		System.out.println("Home Page title ::"+ title);
		Thread.sleep(3000);
		//Assert.assertEquals("CRMPRO", title); error
	}
	@Then ("^user clicks on PIM and Add button$")
	public void user_clicks_on_PIM_and_Add_button() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-paper-container']/div[@class='orangehrm-header-container']/button[1]")).click();
		Thread.sleep(2000);
	}
	
	@Then ("^user adds employee \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void user_adds_employee(String fn, String mn, String ln) throws InterruptedException {
		driver.findElement(By.name("firstName")).sendKeys(fn);
		driver.findElement(By.name("middleName")).sendKeys(mn);
		driver.findElement(By.name("lastName")).sendKeys(ln); // <lastname> is coming in output for eachcase
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
	}
	
	/* This is failing junit test
	@Then("^close the browser$")
	 public void close_the_browser(){
		 driver.quit();
	 }*/
}
