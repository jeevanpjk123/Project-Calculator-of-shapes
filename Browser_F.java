package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser_F{
static WebDriver driver;
public static WebDriver startBrowser(String browsername, String url) throws InterruptedException {
if(browsername.equalsIgnoreCase("chrome")) {

	System.setProperty("webdriver.chrome.driver",
            "C:\\Users\\TSS_HCL\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			
	 driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get(url);
Thread.sleep(500);
}
else if(browsername.equalsIgnoreCase("edge")) {

	System.setProperty("webdriver.edge.driver", 
			"C:\\Users\\TSS_HCL\\Downloads\\edgedriver_win64\\msedgedriver.exe");
driver=new EdgeDriver();
}
return driver;
}
}


