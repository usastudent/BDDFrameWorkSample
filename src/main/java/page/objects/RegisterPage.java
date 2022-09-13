package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RegisterPage extends Base{
	
	public RegisterPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id = "input-firstname")
	private WebElement firstNameField;
	
	@FindBy(id = "input-lastname")
	private WebElement lastNameField;
	
	@FindBy(id ="input-email")
	private WebElement emailField;
	
	@FindBy(id = "input-telephone")
	private WebElement telephoneField;
	
	@FindBy(id = "input-password")
	private WebElement passwordField;
	
	@FindBy(id ="input-confirm")
	private WebElement passConfirmField;
	
	@FindBy(xpath = "//input[@type='radio' and @value ='1' and @name='newsletter']")
	private WebElement yesSubscribe;
	
	@FindBy(xpath ="//input[@type='radio' and @value ='0' and @name='newsletter']")
	private WebElement noSubscribe;
	
	@FindBy(xpath = "//input[@name='agree']")
	private WebElement privacyPolicy;
	
	@FindBy(xpath ="//input[@type='submit']")
	private WebElement continueButton;
	
	@FindBy(xpath ="//h1[text()='Your Account Has Been Created!']")
	private WebElement successMessage;
	
	
	
	public void enterFirstName(String firstNameValue) {
		firstNameField.sendKeys(firstNameValue);
	}
	
	public void enterLastName(String lastNameValue) {
		lastNameField.sendKeys(lastNameValue);
	}
	
	public void enterEmail(String emailValue) {
		emailField.sendKeys(emailValue);
	}
	
	public void enterTelephone(String telephoneValue) {
		telephoneField.sendKeys(telephoneValue);
	}
	
	public void enterPassword(String passValue) {
		passwordField.sendKeys(passValue);
	}
	
	public void enterConfirmPass(String confirmPassValue) {
		passConfirmField.sendKeys(confirmPassValue);
	}
	
	public void selectSubscribe(String option) {
		if(option.equalsIgnoreCase("yes") && !yesSubscribe.isSelected()) {
			yesSubscribe.click();
		}else
			noSubscribe.click();
	}
	
	public void clickPrivacyPolicy() {
		privacyPolicy.click();
	}
	
	public void clickOnContinueButton() {
		continueButton.click();
	}
	
	public String getSuccessMessage() {
		String actualMessage = successMessage.getText();
		return actualMessage;
	}

}
