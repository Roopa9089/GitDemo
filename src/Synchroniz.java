import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchroniz {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\roopsing\\Desktop\\Learn\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		
		WebDriverWait d = new WebDriverWait(driver,20);
		
		//So i am passing my driver object and saying wait for 20 secs
		//d has the knowledge of this driver and it will wait for 20 secs
		//Wherever you use D, for those steps this 20 secs wait is applicable
		
		d.until(ExpectedConditions.visibilityOfElementLocated(""));
	
		
	}

}
