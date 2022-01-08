package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.DatabasePage;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefinition extends TestBase {
	
	LoginPage loginPage;
	DatabasePage databasePage;
	
	@Before
	public void beforeRun() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		databasePage =new DatabasePage();
	}
	
	//Given User is on the Techfios login page 
	
 @Given("^User is on the Techfios login page$")
	public void User_is_on_the_Techfios_login_page() {
	 driver.get("https://techfios.com/billing/?ng=login/");
	 
 }
 
 //When User enters username as "demo@techfios.com" //new version {string}
 
 @When ("^User enters username as \"([^\"]*)\"$")
	public void User_enters_username_as(String username) throws InterruptedException { 
//	 loginPage = PageFactory.initElements(driver, LoginPage.class);
	 loginPage.enterUserName(username);
	 Thread.sleep(3000);
	 
 }
 
 @When("^User enters password as \"([^\"]*)\"$")
 public void user_enters_password_as(String password) throws Throwable {
	 loginPage.enterPassword(password);
		Thread.sleep(3000);
 }
 

 


 @And("^User clicks on Signin button$")
 public void user_clicks_on_Signin_button() throws Throwable {
	 loginPage.clickSignInButton();
		Thread.sleep(3000);
 }
 
 
 @When("^User enters \"([^\"]*)\" from mysql database$")
 public void user_enters_from_mysql_database(String data) throws Throwable {
    switch(data) {
    case "username":
 	   System.out.println("Username from DB: "+ databasePage.getData("username"));
 	   loginPage.enterUserName(databasePage.getData("username"));
 	   Thread.sleep(3000);
 	   break;
    case "password":
 	   System.out.println("Password from DB: "+ databasePage.getData("password"));
 	   loginPage.enterPassword(databasePage.getData("password"));
 	   Thread.sleep(3000);
 	   break;
 	   default:
 		   System.out.println("unable to enter data");
    }
    }

 @Then("^User should land on Dashboard page$")
 public void user_should_land_on_Dashboard_page() throws Throwable {
	 String expectedTitle="Dashboard- iBilling";
		String actualTittle = loginPage.getPageTittle();
		Assert.assertEquals("pageTittle is not matching!",expectedTitle, actualTittle);
		takeScreenShot(driver);
	
     
 }
 
 @After
	public void tearDown() {
		driver.close();
		driver.quit();
	}


		
	
}
