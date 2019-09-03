import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndtoEndexercise {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\roopsing\\Desktop\\Learn\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		
		//1.get the number of links on this page
		//any link will have the tag as a
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//2.get me the count of links present in the footer section
		//limit webdriver scope to the footer section instead of the whole page
		//we need to create a minidriver..this is called limiting webdriver scope
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		//now footerdriver is the new driver for us
		
		//3. links count of only first column of the footer section
		
		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		//4.click on each link of the column and check if the links are working and the pages are opening
		
		int count = columndriver.findElements(By.tagName("a")).size();
		
		for(int i=1;i<count;i++) {
			String clickOnLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);//ENter is same as click
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			Thread.sleep(5000);
			
			
			
			}
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		
		while(it.hasNext()) {//tells us if the next index is present or not
			driver.switchTo().window(it.next());//move to the next index
			System.out.println(driver.getTitle());
		}//This way it will loop and it will click it
		//In the first instance it will fail, because the new window opens, it searches for the link in the new window. we need to click back
		
		//If you press control on your keyboard and click on any link, it opens in a new tab
		
		//The normal way to do this, is open one link, grab title and then hit back
		
		
	}

}
