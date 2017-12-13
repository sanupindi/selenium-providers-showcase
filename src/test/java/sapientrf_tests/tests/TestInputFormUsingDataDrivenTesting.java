package sapientrf_tests.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import sapientrf_tests.pageObjects.InputForm;
import sapientrf_tests.tests.data.FormData;
import sapientrf_tests.tests.data.FormDataProvider;
import sapientrf_tests.utilties.WebDriverManager;

public class TestInputFormUsingDataDrivenTesting {
	WebDriverManager webdriverManager;
	String pageUrl = TestEnvironment.FORM_PAGE_URL;
	WebDriver driver;
	InputForm inputFormPageObject;

	@BeforeMethod
	public void beforeMethod() {
		webdriverManager = new WebDriverManager();
		driver = webdriverManager.create(pageUrl, true);
	}

	@AfterMethod
	public void afterMethod() {
		webdriverManager.close();

	}

	private boolean isNullOrEmpty(String input) {
		return (input == null) || ("".equals(input.trim()));
	}

	@Test(dataProviderClass = FormDataProvider.class, dataProvider = "inputFormData")
	public void testFormForVariousInputs(FormData formData) {
		inputFormPageObject = new InputForm(driver);
		inputFormPageObject.enterValue(inputFormPageObject.firstNameTextbox, formData.getFirstName());
		inputFormPageObject.enterValue(inputFormPageObject.lastNameTextbox, formData.getLastName());
		inputFormPageObject.enterValue(inputFormPageObject.phoneNumberTextbox, formData.getPhoneNumber());

		inputFormPageObject.clickSubmit();

		if (!isNullOrEmpty(formData.getFirstNameValidationMessage())) {
			Assert.assertEquals(inputFormPageObject.invalidFirstNameLabel.getText(),
					formData.getFirstNameValidationMessage());
		}
		if (!isNullOrEmpty(formData.getLastNameValidationMessage())) {
			Assert.assertEquals(inputFormPageObject.invalidLastNameLabel.getText(),
					formData.getLastNameValidationMessage());
		}
		if (!isNullOrEmpty(formData.getPhoneNumberValidationMessage())) {
			Assert.assertEquals(inputFormPageObject.invalidPhoneNumberLabel.getText(),
					formData.getPhoneNumberValidationMessage());
		}

	}
}
