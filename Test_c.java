package Tech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import G1.Insta;

public class Test_c {
	
	@Test
	public void verifyLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
	            "C:\\Users\\TSS_HCL\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
				
		WebDriver driver=new ChromeDriver();
				driver.get("https://www.instagram.com/accounts/login/");
				Thread.sleep(500);
				driver.manage().window().maximize();
				
				Insta pageom=new Insta(driver);
				pageom.typeuser();
				pageom.typepassword();
				pageom.clickbtn();
				}
				
}
