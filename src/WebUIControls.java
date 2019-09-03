import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class WebUIControls {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\roopsing\\Desktop\\Learn\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		
		
		//CHECKBOXES
		//To find if the checkbox has already been selected. should return false
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		//To find if the checkbox has already been selected. should return true
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		//ASSERTIONS
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		//To find if the checkbox has already been selected. should return true
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		//CHECKBOXES
				//To find if the checkbox has already been selected. should return false
				System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
				driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
				//To find if the checkbox has already been selected. should return true
				System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
				
		//to the the number of checkboxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		//use findelements to get the size
		
		
		//RADIOBUTTON
		
		//
		
		
		
		
		
		
		
		
		
		//CURRENCY dropdown
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		//s needs to be made aware where the dropdown is
		//Then we can apply all the methods of the select class to that dropdown
		s.selectByIndex(2);
		s.selectByValue("INR");//we got this value by inspecting the UI
		s.selectByVisibleText("AED");
		s.selectByVisibleText("INR");//What is visible on the screen
		
		//PASSENGERS dropdown
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		//Go element not interactable error.
		//This is because the dropdown had not loaded yet. So we added a wait
		for(int i=0; i<3;i++) {
		driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		int c=1;
		while(c<3) {
			driver.findElement(By.id("hrefIncChd")).click();
			c++;
			}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		
		//Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		
		//FROM and TO city..dynamic dropdowns
		//dropdowns are loaded based on user actions
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();//This will select second instance of MAA
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		//The whole parent should get highlighted when selecting the xpath
		
		//Some team leads do not like using indexes in the srcipt. The don't like index hardcoding
		//IN this case, you can write xpath using parent-child relationship. It will be unique
		
		//Another way of uniquely identifying elements if there are two elements.
		//Parent xpath child xpath
		//In this case, the scope of search is restricted to only parent area
		

		//CALENDAR
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover")).click();
		//This is used for selecting the current date
		//The current date will always keep changing
		//But this class uniquely identifies the current date
		
		//DROPDOWN
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).isEnabled());
		driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).isEnabled());
		//How to check of an element on the webpage is enabled or not
		//First it should return false and then true
		//IN this case, both returned true because of the way the developer has developed it
		//We will try another method
		//From a developer's perspective, developer has to set some attribute to make the element disabled
		//We need to identify that attribute. IN this case, the opacity is changing
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("The element is enabled");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("The element is disabled");
			Assert.assertTrue(false);
			//It will come here only if after selecting radio button, it is returning 0.5
			//so we want to fail the script
		}
		
		
		//RADIO BUTTONS
		

		
		
		
		
		
		
		//Autosuggestive dropdowns
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("mum");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
		
		WebElement dest = driver.findElement(By.xpath("//input[@placeholder='To']"));
		dest.sendKeys("che");
		dest.sendKeys(Keys.ARROW_DOWN);
		dest.sendKeys(Keys.ENTER);
				
				
		
		
	
		
	
		
	}

}
