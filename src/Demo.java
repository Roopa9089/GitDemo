import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		//This is where you write your Selenium code
		//We need to get this project knowledge of Selenium so that it can run Selenium test cases
		//www.seleniumhq.org/downloads
		
		//How to invoke a browser
		//go to javadoc in selenium website
		
		//Create a driver object
		//Driver object drives the automation
		//New operator creates a memory for your object in the class
		//We want to implement methods present in our webdriver interface. Webdriver provides all the methods for automation
		//We need to give webdriver knowledge to the driver
		
		//WebDriver driver = new FirefoxDriver();   webdriver.gecko.driver
		//WebDriver driver = new InternetExplorerDriver();  webdriver.ie.driver
		//In java when you write a class,you need to import the related packages
		
		//Invoke the .exe file first
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\roopsing\\Desktop\\Learn\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("This is our first program");
		driver.get("http://google.com");//hit a url on the browser
		System.out.println(driver.getTitle());//get the title of the page opened
		System.out.println(driver.getCurrentUrl());//To validate of you landed on the correct URL
		driver.getPageSource();//might be needed if you can't access page source on right clicking on the browser. right click is disabled
		driver.get("http://yahoo.com");
		driver.navigate().back();//to go back to the previous page
		driver.navigate().forward();//to go back to the next page
		driver.close();//to close the browser
		driver.quit();//to close all the browsers opened by selenium script. All child windows as well
		
		//Execution always starts from the main block and is restricted to the main block
		//Java programs are written in class files
		
		//New is a memory allocation operator that creates memory for the child class in the parent class
		

	}

}
