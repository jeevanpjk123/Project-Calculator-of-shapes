package Project1;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {

	@Test
	@Parameters("Browser")
	public void test1(String browser) {
	WebDriver driver;
	if(browser.equalsIgnoreCase("Chrome")) {
	System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\HCLTSS\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/accounts/login/");
	driver.quit();
	}

	else if(browser.equalsIgnoreCase("edge")) {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\HCLTSS\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/accounts/login/");
	driver.quit();
	}
	else if(browser.equalsIgnoreCase("Firefox")) {
	driver = new FirefoxDriver();
	}
	}
	}





