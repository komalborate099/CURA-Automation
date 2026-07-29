package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	//contrsuctor 
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	By curaTitleHomePage= By.xpath("//h1");
	By wecancareaboutyourhealthText= By.xpath("//h3");
	By copyWriter = By.className("text-muted");
	By makeApppointBt = By.id("btn-make-appointment");
	By menu= By.id("menu-toggle");
	//title 
	public boolean isCurahelathtiltleDisplay() {
		return driver.findElement(curaTitleHomePage).isDisplayed();
		
	}
	//second title
	public boolean secondtitle() {
		return driver.findElement(wecancareaboutyourhealthText).isDisplayed();
	}
	//copywriter
	public boolean iscopywriteDisplay() {
		return driver.findElement(copyWriter).isDisplayed();
	}
	public boolean ismakeappointmentbuttonDisplay() {
		return driver.findElement(makeApppointBt).isDisplayed();
	}
	public void clickAppointmentbt() {
		driver.findElement(makeApppointBt).click();
	}
	public void clickMenuoption() {
		driver.findElement(menu).click();
	}

}
