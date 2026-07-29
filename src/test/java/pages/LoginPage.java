package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By verifyLoginTitle = By.xpath("//h2");
	By loginText=By.className("lead");
	By Username= By.id("txt-username");
	By Password= By.id("txt-password");
	By login =By.id("btn-login");
	
	public boolean islogintitleDisplay() {
		return driver.findElement(verifyLoginTitle).isDisplayed();
	}
	public boolean istolginTextDisplay() {
		return driver.findElement(loginText).isDisplayed();
	}
	public void Username(String enterusername) {
		driver.findElement(Username).sendKeys(enterusername);
	}
	public void Password(String EnterPassword) {
		driver.findElement(Password).sendKeys(EnterPassword);
	}
	public void login() {
		driver.findElement(login).click();
	}


}
