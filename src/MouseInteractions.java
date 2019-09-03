import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseInteractions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\roopsing\\Desktop\\Learn\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();

		// nav-link-accountList

		Actions a = new Actions(driver);
		// driver will not get the capabilities of action class method

		// move to specific element
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).contextClick().build().perform();
		// Build means it is now ready to execute
		// perform means you want to execute and it will execute

		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello")
				.doubleClick().build().perform();
		// concantenating all our actions in one step

		// drag and drop

		// Handle multiple windows

		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en-GB&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("a[href='https://support.google.com/accounts?hl=en-GB']")).click();
		System.out.println(driver.getTitle());

		// first selenium needs to get all windows open. we need to use getwindowhandle
		// method. it will return IDs
		// each window will have one handle id
		Set<String> ids = driver.getWindowHandles();//this will get window ids which is a set
		Iterator<String> it = ids.iterator();
		String parentid = it.next();//By default it is outside the set, and on next it gives the parent id
		String childid= it.next();//This moves to first child
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		//If you want to do something on parent, you need to switch back
		
		driver.switchTo().window(parentid);
		//We need to pass the window id as argument in the window argument

	}

}
