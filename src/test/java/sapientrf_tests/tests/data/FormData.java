package sapientrf_tests.tests.data;

public class FormData {
	private String firstName;
	private String lastName;
	private String phoneNumber;

	private String firstNameValidationMessage;
	private String lastNameValidationMessage;
	private String phoneNumberValidationMessage;

	private String displayName;
	public FormData() {
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;

	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;

	}

	public String getFirstNameValidationMessage() {
		return firstNameValidationMessage;
	}

	public void setFirstNameValidationMessage(String firstNameValidationMessage) {
		this.firstNameValidationMessage = firstNameValidationMessage;

	}

	public String getLastNameValidationMessage() {
		return lastNameValidationMessage;
	}

	public void setLastNameValidationMessage(String lastNameValidationMessage) {
		this.lastNameValidationMessage = lastNameValidationMessage;

	}

	public String getPhoneNumberValidationMessage() {
		return phoneNumberValidationMessage;
	}

	public void setPhoneNumberValidationMessage(String phoneNumberValidationMessage) {
		this.phoneNumberValidationMessage = phoneNumberValidationMessage;

	}

	public String getDisplayName() {
		return displayName;
	}

	public void setTestCaseDisplayName(String displayName) {
		this.displayName = displayName;
	}

	@Override
	public String toString() {
		if (this.displayName != null && this.displayName.trim().length() > 0) {
			return this.displayName;
		}
		return super.toString();
	}

}
