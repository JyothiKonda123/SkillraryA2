package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCategoryPage {
	// Declaration
	@FindBy(xpath = "//b[text()='Add New Category']")
	private WebElement pageHeader;

	@FindBy(xpath = "//button[text()='Save' and @name='add']")
	private WebElement saveButton;

//Initialization
	public AddNewCategoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Utilization
	public String getPaeHeader() {
		return pageHeader.getText();
	}

	public void clickSave1() {
		// TODO Auto-generated method stub
		
	}

	public void clickSave() {
		// TODO Auto-generated method stub
		
	}

	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}
}
