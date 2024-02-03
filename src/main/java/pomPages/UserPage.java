package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {
	// Declaration
	@FindBy(xpath = "//h1[normalize-space(text())='Users']")
	private WebElement PageHeader;

	@FindBy(xpath = "//a[text()='New']")
	private WebElement newButton;

	// initialization
	public UserPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Utilization
	public String getPageHeader() {
		return PageHeader.getText();
	} 

	public void clickNewButton() {
		newButton.click();
	}

	public String getSuccessMessage() { 
		return null;
	}
}
