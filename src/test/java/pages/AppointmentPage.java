package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AppointmentPage {
	WebDriver driver;
	
	public AppointmentPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By VerifyMakeAppointmentPage= By.name("comment");
	
	public boolean VerifyMakeAppointText() {
		return driver.findElement(VerifyMakeAppointmentPage).isDisplayed();
	}
 

}
