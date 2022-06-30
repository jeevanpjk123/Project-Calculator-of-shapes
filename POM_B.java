package G1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class POM_B {
WebDriver driver;

@FindBy
(how=How.NAME,using="username")
WebElement uname;

@FindBy
(how=How.NAME,using="password")
WebElement pwd;

@FindBy
(how=How.XPATH,using="//*[@id=\"loginForm\"]/div/div[3]")
WebElement btn;

public POM_B(WebDriver driver) {
this.driver=driver;
}

public void login(String uid, String pass) {
uname.sendKeys(uid);
pwd.sendKeys(pass);
btn.click();
}

}


