package Orange.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Orange.Steps.ButtonPages;
import Orange.Steps.Questions;

public class LeavePage {
	
	private ButtonPages buttonPages;
	private Questions questions;
	
	@FindBy(how = How.ID, using = "firstName")
	private WebElement txtfirstName;
	
	@FindBy(how = How.ID, using = "lastName")
	private WebElement txtlastName;
	
	public LeavePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.buttonPages = new ButtonPages(driver);
		this.questions = new Questions();
	}
	
	public void diligenciarAddEmployee(WebDriver driver) {
		buttonPages.btnPim();
		buttonPages.btnAddEmployee(driver);
	}
	
	public void llenarAddEmployee(String firstName, String lastName, WebDriver driver) {
		txtfirstName.sendKeys(firstName);
		txtlastName.sendKeys(lastName);
		questions.tiempoSegundos(1);
		questions.screenShot(driver);
		buttonPages.btnSave();
		questions.assertWelcome(driver);
		questions.screenShot(driver);
	}
}
