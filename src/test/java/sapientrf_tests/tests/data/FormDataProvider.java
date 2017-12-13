package sapientrf_tests.tests.data;

import org.testng.annotations.DataProvider;

import sapientrf_tests.utilties.Util;

public class FormDataProvider {
	@DataProvider(name = "inputFormData")
	public static Object[][] provideFormData() {

		return new Object[][] { { createValidFormData() }, { createValidFormDataWithFirstNameAsSingleCharacter() },
				{ createFormDataWithEmptyInputs() }, { createFormDataWithAllFieldsInvalid() },
				{ createDataWithPhoneNumberHavingLessDigits() }, { createDataWithPhoneNumberHavingMoreDigits() },
				{ createDataWithInvalidFirstnameAndLastname() }, { createDataWithPhoneNumberWithDots() },
				{ createDataWithExtensionInPhoneNumber() }, { createDataWithPhoneNumberHavingBrackets() },
				{ createDataWithPhoneNumberWithBracketandHyphen() },
				{ createDataWithPhoneNumberHavingHavingCountryCodeWithHyphens() },
				{ createDataWithPhoneNumberHavingAlphanumericcharacters() },
				{ createDataWithPhoneNumberHavingCountrycodes() }, { createFirstNameWithSpecialCharacters() },
				{ createFirstNameWithNumbersData() }, { createLastNameWithNumbersData() },
				{ createDataWithPhoneNumberWithHyphens() }, { createDataWithFirstNameHavingSizeMoreThan20() },
				{ createDataWithLastNameHavingSizeMoreThan20() }, { createDataWithFirstNameHavingUnicodeCharacters() },
				{ createDatawithLastNameHavingUnicodeCharacters() } };
	}

	// All valid data
	private static FormData createValidFormData() {
		FormData formData = new FormData();
		formData.setFirstName(Util.VALID_FIRST_NAME);
		formData.setFirstNameValidationMessage(null);
		formData.setLastName(Util.VALID_LAST_NAME);
		formData.setLastNameValidationMessage(null);
		formData.setPhoneNumber(Util.VALID_PHONE_NUMBER);
		formData.setPhoneNumberValidationMessage(null);
		formData.setTestCaseDisplayName("Test with all valid fields has passed - Form Submitted, shows message.");
		return formData;
	}

	private static FormData createValidFormDataWithFirstNameAsSingleCharacter() {
		FormData formData = new FormData();
		formData.setFirstName("J");
		formData.setFirstNameValidationMessage(null);
		formData.setLastName(Util.VALID_LAST_NAME);
		formData.setLastNameValidationMessage(null);
		formData.setPhoneNumber(Util.VALID_PHONE_NUMBER);
		formData.setPhoneNumberValidationMessage(null);
		formData.setTestCaseDisplayName(
				"Test with single character for first name has passed - Form Submitted, shows message.");
		return formData;
	}

	private static FormData createFormDataWithEmptyInputs() {
		FormData formData = new FormData();
		formData.setFirstName("");
		formData.setFirstNameValidationMessage("First name is a required field");
		formData.setLastName("");
		formData.setLastNameValidationMessage("Last name is a required field");
		formData.setPhoneNumber("");
		formData.setPhoneNumberValidationMessage("Phone number is a required input");
		formData.setTestCaseDisplayName("Test with all fields as empty has passed - Shows invalid message.");
		return formData;
	}

	private static FormData createFormDataWithAllFieldsInvalid() {
		FormData formData = new FormData();
		formData.setFirstName("12H");
		formData.setFirstNameValidationMessage(Util.FIRST_NAME_INVALID_MESSAGE);
		formData.setLastName("78H");
		formData.setLastNameValidationMessage(Util.LAST_NAME_INVALID_MESSAGE);
		formData.setPhoneNumber("hjhiyu");
		formData.setPhoneNumberValidationMessage(Util.PHONE_NUMBER_INVALID_MESSAGE);
		formData.setTestCaseDisplayName(
				"Test with multiple fields with invalid data has passed - Shows invalid message.");
		return formData;
	}

	// Data for Vaildating phone number
	private static FormData createDataWithPhoneNumberWithHyphens() {
		FormData formData = new FormData();
		formData.setFirstName("John");
		formData.setFirstNameValidationMessage(null);
		formData.setLastName("Doe");
		formData.setLastNameValidationMessage(null);
		formData.setPhoneNumber("416-123-3234");
		formData.setPhoneNumberValidationMessage(null);
		formData.setTestCaseDisplayName(
				"Test with Phone Number with hyphen as seperator has passed - Form is submitted.");
		return formData;
	}

	private static FormData createDataWithPhoneNumberWithDots() {
		FormData formData = new FormData();
		formData.setFirstName("John");
		formData.setFirstNameValidationMessage(null);
		formData.setLastName("Doe");
		formData.setLastNameValidationMessage(null);
		formData.setPhoneNumber("416.123.7876");
		formData.setPhoneNumberValidationMessage(null);
		formData.setTestCaseDisplayName(
				"Test with Phone Number with dots as seperator has passed - shows valid message.");
		return formData;
	}

	private static FormData createDataWithPhoneNumberWithBracketandHyphen() {
		FormData formData = new FormData();
		formData.setFirstName("John");
		formData.setFirstNameValidationMessage(null);
		formData.setLastName("Doe");
		formData.setLastNameValidationMessage(null);
		formData.setPhoneNumber("(666) 123-4445");
		formData.setPhoneNumberValidationMessage(null);
		formData.setTestCaseDisplayName(
				"Test with Phone Number with bracket and hyphen as seperator has passed - shows valid message.");
		return formData;
	}

	private static FormData createDataWithExtensionInPhoneNumber() {
		FormData formData = new FormData();
		formData.setFirstName("John");
		formData.setFirstNameValidationMessage(null);
		formData.setLastName("Doe");
		formData.setLastNameValidationMessage(null);
		formData.setPhoneNumber("6567873456X1234");
		formData.setPhoneNumberValidationMessage(Util.PHONE_NUMBER_INVALID_MESSAGE);
		formData.setTestCaseDisplayName("Test with Phone Number with extension has passed - shows invalid message.");
		return formData;
	}

	private static FormData createDataWithPhoneNumberHavingLessDigits() {
		FormData formData = new FormData();
		formData.setFirstName(Util.VALID_FIRST_NAME);
		formData.setFirstNameValidationMessage(null);
		formData.setLastName(Util.VALID_LAST_NAME);
		formData.setLastNameValidationMessage(null);
		formData.setPhoneNumber("1234");
		formData.setPhoneNumberValidationMessage(Util.PHONE_NUMBER_INVALID_MESSAGE);
		formData.setTestCaseDisplayName(
				"Test with phone number having less digits has passed - shows invalid message.");
		return formData;
	}

	private static FormData createDataWithPhoneNumberHavingMoreDigits() {
		FormData formData = new FormData();
		formData.setFirstName(Util.VALID_FIRST_NAME);
		formData.setFirstNameValidationMessage(null);
		formData.setLastName(Util.VALID_LAST_NAME);
		formData.setLastNameValidationMessage(null);
		formData.setPhoneNumber("12343456781");
		formData.setPhoneNumberValidationMessage(Util.PHONE_NUMBER_INVALID_MESSAGE);
		formData.setTestCaseDisplayName(
				"Test with phone number having more than 10 digits has passed - shows invalid message.");
		return formData;
	}

	private static FormData createDataWithPhoneNumberHavingBrackets() {
		FormData formData = new FormData();
		formData.setFirstName(Util.VALID_FIRST_NAME);
		formData.setFirstNameValidationMessage(null);
		formData.setLastName(Util.VALID_LAST_NAME);
		formData.setLastNameValidationMessage(null);
		formData.setPhoneNumber("(416) 657 3333");
		formData.setPhoneNumberValidationMessage(Util.PHONE_NUMBER_INVALID_MESSAGE);
		formData.setTestCaseDisplayName("Test with phone number having brackets has passed - shows invalid message.");
		return formData;
	}

	// i think this is a valid phone number
	private static FormData createDataWithPhoneNumberHavingHavingCountryCodeWithHyphens() {
		FormData formData = new FormData();
		formData.setFirstName(Util.VALID_FIRST_NAME);
		formData.setFirstNameValidationMessage(null);
		formData.setLastName(Util.VALID_LAST_NAME);
		formData.setLastNameValidationMessage(null);
		formData.setPhoneNumber("1-888-888-8888");
		formData.setPhoneNumberValidationMessage(Util.PHONE_NUMBER_INVALID_MESSAGE);
		formData.setTestCaseDisplayName(
				"Test with phone number having countrycode with hyphens has passed - shows invalid message.");
		return formData;
	}

	private static FormData createDataWithPhoneNumberHavingAlphanumericcharacters() {
		FormData formData = new FormData();
		formData.setFirstName(Util.VALID_FIRST_NAME);
		formData.setFirstNameValidationMessage(null);
		formData.setLastName(Util.VALID_LAST_NAME);
		formData.setLastNameValidationMessage(null);
		formData.setPhoneNumber("1wqqee2133");
		formData.setPhoneNumberValidationMessage(Util.PHONE_NUMBER_INVALID_MESSAGE);
		formData.setTestCaseDisplayName(
				"Test with phone number having alpha numeric characters has passed - shows invalid message.");
		return formData;
	}

	// I think this is a valid phone number
	private static FormData createDataWithPhoneNumberHavingCountrycodes() {
		FormData formData = new FormData();
		formData.setFirstName(Util.VALID_FIRST_NAME);
		formData.setFirstNameValidationMessage(null);
		formData.setLastName(Util.VALID_LAST_NAME);
		formData.setLastNameValidationMessage(null);
		formData.setPhoneNumber("+1 3223334567");
		formData.setPhoneNumberValidationMessage(Util.PHONE_NUMBER_INVALID_MESSAGE);
		formData.setTestCaseDisplayName(
				"Test with phone number having countrycode has passed - shows invalid message.");
		return formData;
	}

	private static FormData createFirstNameWithNumbersData() {
		FormData formData = new FormData();
		formData.setFirstName("John123");
		formData.setFirstNameValidationMessage(Util.FIRST_NAME_INVALID_MESSAGE);
		formData.setLastName(Util.VALID_LAST_NAME);
		formData.setLastNameValidationMessage(null);
		formData.setPhoneNumber(Util.VALID_PHONE_NUMBER);
		formData.setPhoneNumberValidationMessage(null);
		formData.setTestCaseDisplayName(
				"Test with firstname having numbers - invalid last name -  has passed - shows invalid message.");
		return formData;

	}

	private static FormData createFirstNameWithSpecialCharacters() {
		FormData formData = new FormData();
		formData.setFirstName("#$John");
		formData.setFirstNameValidationMessage(Util.FIRST_NAME_INVALID_MESSAGE);
		formData.setLastName(Util.VALID_LAST_NAME);
		formData.setLastNameValidationMessage(null);
		formData.setPhoneNumber(Util.VALID_PHONE_NUMBER);
		formData.setPhoneNumberValidationMessage(null);
		formData.setTestCaseDisplayName(
				"Test with firstname having numbers - invalid last name -  has passed - shows invalid message.");
		return formData;

	}

	private static FormData createLastNameWithNumbersData() {
		FormData formData = new FormData();
		formData.setFirstName(Util.VALID_FIRST_NAME);
		formData.setFirstNameValidationMessage(null);
		formData.setLastName("Joe453");
		formData.setLastNameValidationMessage(Util.LAST_NAME_INVALID_MESSAGE);
		formData.setPhoneNumber(Util.VALID_PHONE_NUMBER);
		formData.setPhoneNumberValidationMessage(null);
		formData.setTestCaseDisplayName(
				"Test with lastname having numbers- invalid last name - has passed - shows invalid message.");
		return formData;

	}

	private static FormData createDataWithInvalidFirstnameAndLastname() {
		FormData formData = new FormData();
		formData.setFirstName(Util.INVALID_NAME_HAS_NUMBERS);
		formData.setFirstNameValidationMessage(Util.FIRST_NAME_INVALID_MESSAGE);
		formData.setLastName(Util.INVALID_NAME_HAS_NUMBERS);
		formData.setLastNameValidationMessage(Util.LAST_NAME_INVALID_MESSAGE);
		formData.setPhoneNumber(Util.VALID_PHONE_NUMBER);
		formData.setPhoneNumberValidationMessage(null);
		formData.setTestCaseDisplayName(
				"Test with firstname and lastname having numbers- invalid last name - has passed - shows invalid message.");
		return formData;

	}

	// data with names longer than 20
	private static FormData createDataWithFirstNameHavingSizeMoreThan20() {
		FormData formData = new FormData();
		formData.setFirstName("werfdsaxcvbghtyjhytreww");
		formData.setFirstNameValidationMessage(Util.FIRST_NAME_LENGTH_LONGER_THAN_20);
		formData.setLastName("Joe453");
		formData.setLastNameValidationMessage(Util.LAST_NAME_INVALID_MESSAGE);
		formData.setPhoneNumber(Util.VALID_PHONE_NUMBER);
		formData.setPhoneNumberValidationMessage(null);
		formData.setTestCaseDisplayName(
				"Test with firstname having more than 20 characters has passed - shows invalid message.");
		return formData;

	}

	// Here the UI shows first name instead of last name in the validation
	// message
	private static FormData createDataWithLastNameHavingSizeMoreThan20() {
		FormData formData = new FormData();
		formData.setFirstName("wasas");
		formData.setFirstNameValidationMessage(null);
		formData.setLastName("werfdsaxcvbghtyjhytreww");
		formData.setLastNameValidationMessage(Util.FIRST_NAME_LENGTH_LONGER_THAN_20);
		formData.setPhoneNumber(Util.VALID_PHONE_NUMBER);
		formData.setPhoneNumberValidationMessage(null);
		formData.setTestCaseDisplayName(
				"Test with lastname having more than 20 characters has passed - shows invalid message.");
		return formData;

	}

	// data for entering unicode values
	private static FormData createDataWithFirstNameHavingUnicodeCharacters() {
		FormData formData = new FormData();
		formData.setFirstName("à¤¤à¤•à¤¨à¥€à¤•à¥€ à¤²à¤¾à¤­à¤¾à¤¨à¥�à¤µà¤¿à¤¤");
		formData.setFirstNameValidationMessage(Util.FIRST_NAME_INVALID_MESSAGE);
		formData.setLastName("Joe");
		formData.setLastNameValidationMessage(null);
		formData.setPhoneNumber(Util.VALID_PHONE_NUMBER);
		formData.setPhoneNumberValidationMessage(null);
		formData.setTestCaseDisplayName(
				"Test with firstname having unicode characters has passed - shows invalid message.");
		return formData;

	}

	// data for entering unicode values
	private static FormData createDatawithLastNameHavingUnicodeCharacters() {
		FormData formData = new FormData();
		formData.setFirstName("John");
		formData.setFirstNameValidationMessage(null);
		formData.setLastName("à¤¤à¤•à¤¨à¥€à¤•à¥€ à¤²à¤¾à¤­à¤¾à¤¨à¥�à¤µà¤¿à¤¤");
		formData.setLastNameValidationMessage(Util.LAST_NAME_INVALID_MESSAGE);
		formData.setPhoneNumber(Util.VALID_PHONE_NUMBER);
		formData.setPhoneNumberValidationMessage(null);
		formData.setTestCaseDisplayName(
				"Test with lastname having unicode characters has passed - shows invalid message.");
		return formData;

	}

}
