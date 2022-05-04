package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {

	public ChromeDriver driver;

	@Given("Open the chrome browser")
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	@Given("Load the application url")
	public void loadApplicationUrl() {
		driver.get("http://leaftaps.com/opentaps/control/main");

	}

	@Given("Enter the username as {string}")
	public void enter_the_username_as(String uname) {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("username")).sendKeys(uname);
	}

	@Given("Enter the password as {string}")
	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);

	}

	@Given("Click on Login button")
	public void clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}

	@Given("Click on CRM link")
	public void clickOnLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();

	}

	@Given("Click on Leads")
	public void clickOnLeads() {
		driver.findElement(By.linkText("Leads")).click();

	}

	@Given("Click on CreateLead")
	public void clickOnCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();

	}

	@Given("Enter Company name as {string}")
	public void companyName(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);

	}

	@Given("Enter FirstName as {string}")
	public void firstName(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);

	}

	@Given("Enter LastName {string}")
	public void lastName(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);

	}

	@When("Click on Create Button")
	public void createButton() {
		driver.findElement(By.name("submitButton")).click();

	}

	String exptitle = "View Lead | opentaps CRM";

	@Then("Lead is Created")
	public void leadIsCreated() {
		String title = driver.getTitle();
		/*
		 * if (title.contains("View"))
		 * System.out.println("Lead is created successfully");
		 */
		Assert.assertEquals(title, exptitle);
		System.out.println("Lead is Created Successfully");
	}

	// Edit Lead

	@Given("Click on Find Lead")
	public void findLead() {
		driver.findElement(By.linkText("Find Leads")).click();
	}

	@Given("Enter the Firstname {string}")
	public void frstName(String frstName) {
		driver.findElement(By.xpath("//div[@Class='x-form-item x-tab-item'][2]//input[@name='firstName']"))
				.sendKeys(frstName);
	}

	@Given("Click on Find Leads button")
	public void findLeads() throws InterruptedException {
		driver.findElement(By.xpath("//div[@Class='x-panel-footer x-panel-footer-noborder']//button")).click();
		Thread.sleep(1000);
	}

	@Given("Click on first resulting lead")
	public void firstLead() {
		driver.findElement(By.xpath("//div[@Class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).click();
	}

	@Given("Click Edit button")
	public void editbutton() {
		driver.findElement(By.linkText("Edit")).click();
	}

	@Given("Change the {string}")
	public void companyChange(String compName) {
		driver.findElement(By.xpath("//input[@Id='updateLeadForm_companyName']")).clear();
		driver.findElement(By.xpath("//input[@Id='updateLeadForm_companyName']")).sendKeys("Cognizant");
	}

	@When("Click on Update Button")
	public void updateButton() {
		driver.findElement(By.xpath("//input[@value='Update']")).click();
	}

	@Then("Lead is Edited")
	public void editedLead() {
		String title = driver.getTitle();
		Assert.assertEquals(title, exptitle);
		System.out.println("Lead is Edited Successfully");
	}

	// Duplicate Lead

	@Given("Click on DuplicateLead Button")
	public void duplicateLead() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
	}

	@Then("Lead is Duplicated")
	public void dupLead() {
		String title = driver.getTitle();
		Assert.assertEquals(title, exptitle);
		System.out.println("Lead is Duplicated Successfully");
	}

	// Delete Lead

	@Given("Click on Phone")
	public void clickPhone() {
		driver.findElement(By.xpath("//span[@Class='x-tab-strip-inner']/span[text()='Phone']")).click();
	}

	@Given("Enter {string}")
	public void phoneNumber(String ph) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(ph);
	}

	@When("Click on Delete Button")
	public void deleteButton() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		Thread.sleep(2000);
	}

	String expectedtitle = "My Leads | opentaps CRM";

	@Then("Lead is Deleted")
	public void delete() {
		String title = driver.getTitle();
		Assert.assertEquals(title, expectedtitle);
		System.out.println("Lead is Deleted Successfully");
	}

	// Create Contact

	@Given("Click on Contacts")
	public void clickContact() {
		driver.findElement(By.linkText("Contacts")).click();
	}
	
	@Given("Click on Create Contact")
	public void createContact() {
		driver.findElement(By.linkText("Create Contact")).click();
	}

	@Given("Enter FirstName {string}")
	public void firstname(String frstName) {
		driver.findElement(By.id("firstNameField")).sendKeys(frstName);
	}
	
	@Given("Enter LastName as {string}")
	public void lastname(String lastName) {
		driver.findElement(By.id("lastNameField")).sendKeys(lastName);

	}
	
	
	@Given("Enter department name {string}")
	public void departmentName(String dName) {
		driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys(dName);
	}

	@Given("Enter the {string}")
	public void description(String desc) {
		driver.findElement(By.id("createContactForm_description")).sendKeys(desc);
	}

	@Given("Enter email {string}")
	public void email(String email) {
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys(email);
	}

	String expecttitle = "View Contact | opentaps CRM";

	@Given("Created Contact successfully")
	public void createdContact() {
		String title = driver.getTitle();
		Assert.assertEquals(title, expecttitle);
		System.out.println("Contact Created Successfully");
	}

	//driver-close
	@Then("driver close")
	public void driverClose() {
		driver.close();
	}
}
