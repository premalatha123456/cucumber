package stepDefinations;

import org.openqa.selenium.WebDriver;

import commonFunctions.FunctionLibrary;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CustomerSteps {
	public static WebDriver driver;
	
	@Given("^User launch Browser$")
	public void startBrowser() throws Throwable {
		driver=FunctionLibrary.startBrowser();
	   
	}

	@When("^user Enter url as \"([^\"]*)\" in a browser$")
	public void openUrl(String url) throws Throwable {
		FunctionLibrary.openUrl(url);
	   
	}

	@When("^user Wait for username with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void waitForUser(String LocatorName, String LocatorValue) throws Throwable {
		FunctionLibrary.waitForElement(LocatorName, LocatorValue, "10");
	    
	}

	@When("^user enter user name with \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enterUser(String LocatorName, String LocatorValue, String TestData) throws Throwable {
		FunctionLibrary.typeAction(LocatorName, LocatorValue, TestData);
	   
	}

	@When("^user enter password with \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enterPass(String LocatorName, String LocatorValue, String TestData) throws Throwable {
		FunctionLibrary.typeAction(LocatorName, LocatorValue, TestData);
	  
	}

	@When("^user click login with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void clickLogin(String LocatorName, String LocatorValue) throws Throwable {
		FunctionLibrary.clickAction(LocatorName, LocatorValue);
	}

	@When("^user Wait for customer link with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void waitForCustomerLink(String LocatorName, String LocatorValue) throws Throwable {
		FunctionLibrary.waitForElement(LocatorName, LocatorValue, "10");
	    
	}

	@When("^user click customer link with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void clickCustomerLink(String LocatorName, String LocatorValue) throws Throwable {
		FunctionLibrary.clickAction(LocatorName, LocatorValue);
	   
	}

	@When("^Wait for Add\\+icon with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void waitForAddIcon(String LocatorName, String LocatorValue) throws Throwable {
		FunctionLibrary.waitForElement(LocatorName, LocatorValue, "10");
	   
	}

	@When("^click Add\\+icon with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void clickAddIconButton(String LocatorName, String LocatorValue) throws Throwable {
		FunctionLibrary.clickAction(LocatorName, LocatorValue);
	  
	}

	@When("^Wait for Customer Number with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void waitForCustomerNumber(String LocatorName, String LocatorValue) throws Throwable {
		FunctionLibrary.waitForElement(LocatorName, LocatorValue, "10");
	}

	@When("^capture customer number with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void captureNumber(String LocatorName, String LocatorValue) throws Throwable {
		FunctionLibrary.captureCustomer(LocatorName, LocatorValue);
	 
	}

	@When("^Enter in \"([^\"]*)\" with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void addCustomer(String TestData,String LocatorName, String LocatorValue) throws Throwable {
		FunctionLibrary.typeAction(LocatorName, LocatorValue,TestData);
	  
	}

	@When("^click Add button with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void clickAddButton(String LocatorName, String LocatorValue) throws Throwable {
		FunctionLibrary.clickAction(LocatorName, LocatorValue);
	    
	}

	@When("^Wait for Confirm ok button with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void wait_for_Confirm_ok_button_with_and(String LocatorName, String LocatorValue) throws Throwable {
		FunctionLibrary.waitForElement(LocatorName, LocatorValue, "10");

	}

	@When("^click confirm ok button with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_confirm_ok_button_with_and(String LocatorName, String LocatorValue) throws Throwable {
		FunctionLibrary.clickAction(LocatorName, LocatorValue);
	    
	}

	@When("^Wait for Alert ok button with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void wait_for_Alert_ok_button_with_and(String LocatorName, String LocatorValue) throws Throwable {
		FunctionLibrary.waitForElement(LocatorName, LocatorValue, "10");
	
	}

	@When("^click for Alert ok button with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_for_Alert_ok_button_with_and(String LocatorName, String LocatorValue) throws Throwable {
		FunctionLibrary.clickAction(LocatorName, LocatorValue);
	    
	}

	@When("^validate customer table$")
	public void validate_customer_table() throws Throwable {
		FunctionLibrary.customerTable();
	   
	}

	@When("^click logout link with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_logout_link_with_and(String LocatorName, String LocatorValue) throws Throwable {
		FunctionLibrary.clickAction(LocatorName, LocatorValue);
	   
	}

	@When("^close Browser$")
	public void close_Browser() throws Throwable {
		driver.quit();
	    
	}



}
