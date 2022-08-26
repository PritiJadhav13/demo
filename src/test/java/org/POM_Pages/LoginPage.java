package org.POM_Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private WebDriver driver;
	/*private int a;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}*/


	//WebElement
	@FindBy(id="username")
	private WebElement uNameField;

	@FindBy(css=".textField.pwdfield")
	private WebElement pwdField;

	@FindBy(css="#loginbutton>div")
	private WebElement loginBtn;

	@FindBy(id="keepLoggedinCheckBox")
	private WebElement keepLoggedinCheckBox;

	@FindBy(id="#logoContainer log")
	private List<WebElement> loginLogos;


	//Constructor
	public LoginPage(WebDriver driver) {
		//PageFactory.initElements(driver, LoginPage.class);
		//or
		PageFactory.initElements(driver, LoginPage.this);
		this.driver = driver;
	}

	//Page Action Method
	public boolean isUserNameFieldDisplayed() {
		return uNameField.isDisplayed();

	}
	public boolean isPasswordFiNameDisplayed() {
		return pwdField.isDisplayed();
	}	
	public boolean isloginBtnDisplayed() {
		return loginBtn.isDisplayed();
	}
	public boolean keepMeLoginCheckBoxDisplayed() {
		return keepLoggedinCheckBox.isDisplayed();
	}
	public boolean isloginLogosDisplayed() {
		boolean flag =false;
		for(int i=0; i<loginLogos.size(); i++) {
			
				flag = loginLogos.get(i).isDisplayed();
				if(flag) {
				continue;

			}else {
				break;
			}

		}
		return flag;
	}

public void enterUserName(String uName) {
	uNameField.sendKeys(uName);
}

public void enterPassword(String pwd) {
	pwdField.sendKeys(pwd);
}

public void ClickOnLoginBtn(){
	loginBtn.click();
	}

public void doLogin(String uName, String pwd) {
	uNameField.sendKeys(uName);
	pwdField.sendKeys(pwd);
	loginBtn.click();
}





}

