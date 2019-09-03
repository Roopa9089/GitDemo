import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\roopsing\\Desktop\\Learn\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle());
		

		String text = "Roopa";
		driver.findElement(By.id("name")).sendKeys(text);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#alertbtn")).click();

		// If you right click, nothing happens. That means it is a Java Alert
		// These pop-ups are not html based
		// Selenium cannot handle Java based alerts

		System.out.println(driver.switchTo().alert().getText());// To grab the text in the alert

		driver.switchTo().alert().accept();// This is for positive scenarios. Yes ok
		// Switch is used to switch the context from browser to alert
		// Now selenium will perform actions on alert

		// driver.switchTo().alert().dismiss();//For negative scenarios

		driver.findElement(By.id("name")).sendKeys(text);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();

		// username and password kind of popups can be handled using AutoIT

	}

}
