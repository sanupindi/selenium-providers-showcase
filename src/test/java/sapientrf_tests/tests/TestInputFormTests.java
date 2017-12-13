package sapientrf_tests.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import sapientrf_tests.pageObjects.InputForm;
import sapientrf_tests.utilties.Util;
import sapientrf_tests.utilties.WebDriverManager;

public class TestInputFormTests {

	WebDriverManager webDriverManager;
	String pageUrl = TestEnvironment.FORM_PAGE_URL;
	WebDriver driver;
	InputForm inputFormPageObject;

	@Test
	public void testEnterAllValidInputs() {
		// Enter all textbox values:
		inputFormPageObject = new InputForm(driver);
		inputFormPageObject.enterValue(inputFormPageObject.firstNameTextbox, Util.VALID_FIRST_NAME);
		inputFormPageObject.enterValue(inputFormPageObject.lastNameTextbox, Util.VALID_LAST_NAME);
		inputFormPageObject.enterValue(inputFormPageObject.phoneNumberTextbox, Util.VALID_PHONE_NUMBER);
		inputFormPageObject.clickSubmit();

		// check if submitted page opens
		Assert.assertEquals(inputFormPageObject.formSubmittedMessage.getText(), Util.FORM_SUBMITTED_MESSAGE);
	}

	@Test
	public void testClearAllValues() {
		inputFormPageObject = new InputForm(driver);
		inputFormPageObject.enterValue(inputFormPageObject.firstNameTextbox, Util.VALID_FIRST_NAME);
		inputFormPageObject.enterValue(inputFormPageObject.lastNameTextbox, Util.VALID_LAST_NAME);
		inputFormPageObject.enterValue(inputFormPageObject.phoneNumberTextbox, Util.VALID_PHONE_NUMBER);
		inputFormPageObject.clickClearButton();
		// check if all textbox values are cleared
		Assert.assertTrue(inputFormPageObject.firstNameTextbox.getText().isEmpty());
		Assert.assertTrue(inputFormPageObject.lastNameTextbox.getText().isEmpty());
		Assert.assertTrue(inputFormPageObject.phoneNumberTextbox.getText().isEmpty());

	}

	@Test
	public void testInvalidFirstNameWithNumber() {
		inputFormPageObject = new InputForm(driver);
		inputFormPageObject.enterValue(inputFormPageObject.firstNameTextbox, Util.INVALID_NAME_HAS_NUMBERS);
		inputFormPageObject.clickSubmit();
		Assert.assertEquals(inputFormPageObject.invalidFirstNameLabel.getText(), Util.FIRST_NAME_INVALID_MESSAGE);
	}

	@Test
	public void testInvalidLastNameWithNumber() {
		inputFormPageObject = new InputForm(driver);
		inputFormPageObject.enterValue(inputFormPageObject.lastNameTextbox, Util.INVALID_NAME_HAS_NUMBERS);
		inputFormPageObject.clickSubmit();
		Assert.assertEquals(inputFormPageObject.invalidLastNameLabel.getText(), Util.LAST_NAME_INVALID_MESSAGE);

	}

	@Test
	public void testInvalidPhoneNumber() {
		inputFormPageObject = new InputForm(driver);
		inputFormPageObject.enterValue(inputFormPageObject.phoneNumberTextbox, Util.INVALID_PHONE_NUMBER);
		inputFormPageObject.clickSubmit();
		Assert.assertEquals(inputFormPageObject.invalidPhoneNumberLabel.getText(), Util.PHONE_NUMBER_INVALID_MESSAGE);

	}

	@Test
	public void testFirstnameLongerThan20Characters() {
		inputFormPageObject = new InputForm(driver);
		inputFormPageObject.enterValue(inputFormPageObject.firstNameTextbox, "qaswdefrgthyjukilopoere");
		inputFormPageObject.clickSubmit();
		Assert.assertEquals(inputFormPageObject.invalidFirstNameLabel.getText(), Util.FIRST_NAME_LENGTH_LONGER_THAN_20);

	}

	//// Here the UI shows first name instead of last name in the validation
	// message
	@Test
	public void testLastnameLongerThan20Characters() {
		inputFormPageObject = new InputForm(driver);
		inputFormPageObject.enterValue(inputFormPageObject.lastNameTextbox, "qaswdefrgthyjukilopoere");
		inputFormPageObject.clickSubmit();
		Assert.assertEquals(inputFormPageObject.invalidLastNameLabel.getText(), Util.FIRST_NAME_LENGTH_LONGER_THAN_20);

	}

	@BeforeMethod
	public void beforeMethod() {
		webDriverManager = new WebDriverManager();
		driver = webDriverManager.create(pageUrl);

	}

	@AfterMethod
	public void afterMethod() {
		webDriverManager.close();

	}

}
