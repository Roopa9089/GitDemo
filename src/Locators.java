import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\roopsing\\Desktop\\Learn\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).click();
		//driver.findElement(By.cssSelector("#email")).sendKeys("This is username");
		driver.findElement(By.id("email")).sendKeys("This is username");
		driver.findElement(By.name("pass")).sendKeys("This is password");
		driver.findElement(By.linkText("Forgot account?")).click();
			
		//There is no guarantee that there will be Id attribute for every element. 
		//In that case, we use xpath or CSS
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("This is username");
		driver.findElement(By.name("pw")).sendKeys("This is password");
		//driver.findElement(By.className("button r4 wide primary")).click();....This gives compound class error
		//driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
		//gettext can be used to get any text from the browser
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("#username")).sendKeys("username1");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("pasowrd1");
		driver.findElement(By.cssSelector("[name='Login']")).click();
		driver.close();

	}

}
