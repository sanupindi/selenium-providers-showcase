package sapientrf_tests.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class InputForm {
	WebDriver driver;

	// Constructor
	public InputForm(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// WebElements:

	// FirstName textbox
	@FindBy(id = "fname")
	public WebElement firstNameTextbox;

	// Value of textbox
	// public String firstNameTextboxValue=
	// firstNameTextbox.getAttribute("value");

	// Lastname textbox
	@FindBy(id = "lname")
	public WebElement lastNameTextbox;

	// Phone number textbox
	@FindBy(id = "phone")
	public WebElement phoneNumberTextbox;

	// Submit button
	@FindBy(id = "submit")
	public WebElement submitButton;

	// Clear button - using xpath to find following sibling as there is no id or
	// class locator present.
	@FindBy(xpath = "//button[@id='submit']/following-sibling::button")
	public WebElement clearButton;

	// FormSubmitted message
	@FindBy(xpath = "//p")
	public WebElement formSubmittedMessage;

	// Invalid firstname label
	@FindBy(id = "fname-error")
	public WebElement invalidFirstNameLabel;

	// Invalid lastname label
	@FindBy(id = "lname-error")
	public WebElement invalidLastNameLabel;

	// Invalid phone number label
	@FindBy(id = "phone-error")
	public WebElement invalidPhoneNumberLabel;

	// Methods

	// Enter value into text box
	public void enterValue(WebElement element, String value) {
		element.sendKeys(value);

	}

	// Click Submit button
	public void clickSubmit() {
		submitButton.click();
	}

	// click Clear button
	public void clickClearButton() {
		clearButton.click();
	}

}
