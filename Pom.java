package Tech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Helper.Browser_F;
import G1.POM_B;

public class Pom {
	
	@Test
public void checkvalidUser() throws InterruptedException {
	WebDriver driver=Browser_F.startBrowser("chrome","https://www.instagram.com/accounts/login/");
	
	POM_B loginp=PageFactory.initElements(driver, POM_B.class);
	loginp.login("proj.ectinsta", "INSTAGRAM");
	
}
}
