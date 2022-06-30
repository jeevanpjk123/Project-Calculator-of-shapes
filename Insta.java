package G1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Insta {
	WebDriver driver;
By username=By.name("username");
By password=By.name("password");
By loginbtn=By.xpath("//*[@id=\"loginForm\"]/div/div[3]");

public Insta(WebDriver driver) {
this.driver=driver;
}
public void typeuser() {
driver.findElement(username).sendKeys("proj.ectinsta");
}
public void typepassword() {
driver.findElement(password).sendKeys("INSTAGRAM");
}
public void clickbtn() {
driver.findElement(loginbtn).click();
}

}
