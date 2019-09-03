import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\roopsing\\Desktop\\Learn\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		//driver.findElement(By.id("draggable")).click();
		
		
		//we need to drag and drop the box from source to folder
		
		Actions a = new Actions(driver);
		a.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();;
		
		//another method to keep code clean
		/*WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target);*/
		
		//driver.switchTo().frame(0);.a.this will go to the first frame
		
		
		//to get the count of the number of iframes on the application
		/*System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0);//switch to the frame*/
		
		//how to switch from frames to windows
		driver.switchTo().defaultContent();//comes back to normal window
		

	}

}
