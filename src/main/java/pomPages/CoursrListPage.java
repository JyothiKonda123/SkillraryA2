package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.WebDriverUtility;

public class CoursrListPage {
	//Declaration
	@FindBy(xpath = "//h1[normalise-space(text())='Course List']")
	private WebElement pageHeader;
	
	@FindBy(xpath = "//a[text()=' New']")
	private WebElement NewButton;
	
	private String deletePath="//td[text()='%s']/ancestor::tr/descendant::button[text()='Delete']";
	
	@FindBy(xpath ="delete")
	private WebElement deleteButton;
	
	@FindBy(xpath = "//h4[text()='Success!']")
	private WebElement successMessage;
	
	//Initialization
	public CoursrListPage(WebDriver driver) {
	 PageFactory.initElements(driver,this);
	}
	//Utilization
	public String getPageHeader() {
		return pageHeader.getText();
	}
	public void clickNewButton() {
		NewButton.click();
	}
	public void deleteCourse(WebDriverUtility web,String courseName) {
		web.convertPathToElement(deletePath, courseName).click();
		deleteButton.click();
		
	}
	public String getSuccessMessage() {
		return successMessage.getText();
	}

}


