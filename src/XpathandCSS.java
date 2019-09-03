import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathandCSS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\roopsing\\Desktop\\Learn\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("This is username");
		driver.findElement(By.cssSelector("#pass")).sendKeys("This is password");
		driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
		
		
		//customized xpath and CSS
		driver.get("https://www.facebook.com/");
		
		
		
		//....  //tagname[@attribute = 'value']...xpath syntax
		//........tagname[attribute='value']...CSS Synatax
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("username");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
		driver.findElement(By.xpath("//*[@value='Log In']")).click();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("username");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("password");
		driver.findElement(By.cssSelector("[value='Log In']")).click();*/
		
		
		/*driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//a[contains(@title,' Sign in')]")).click();
		driver.findElement(By.xpath("//*[@name='login']")).sendKeys("username");
		driver.findElement(By.cssSelector("[name='passwd']")).sendKeys("password");
		driver.findElement(By.cssSelector("input[value*=' Sign in ']")).click();*/
		
		driver.get("http://google.com");
		driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[1]/input[1]")).sendKeys("This is information");
		//We didn't use style tag as closing and opening it was not making any difference to the text input
		driver.close();
		
		
		
		

	}

}
