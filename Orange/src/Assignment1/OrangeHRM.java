package Assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class OrangeHRM {
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("Webdrive.chrome.driver","/Users/macbookair/Documents/Selenium_FIles/chromedriver_mac_arm64/chromedriver");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.orangehrm.com/");	
	Thread.sleep(5000);
	
	//testing the Book a free demo
	driver.findElement(By.xpath("//body/nav[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/a[1]/button[1]")).click(); 
	Thread.sleep(5000);
	
	//to scroll the website 
	JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,600)");
	Thread.sleep(5000);
	driver.findElement(By.name("FullName")).sendKeys("Test");
	driver.findElement(By.name("Email")).sendKeys("test@xyz.com");
	Thread.sleep(3000);
	Select Country = new Select(driver.findElement(By.name("Country")));
	Country.selectByVisibleText("Nepal");
	driver.findElement(By.name("Contact")).sendKeys("123456789");
	Thread.sleep(10000);
	driver.findElement(By.name("action_submitForm")).click();
	Thread.sleep(5000);
	
	
	//redirecting to homepage by clicking the OrangeHRM title in the website.
	driver.findElement(By.xpath("//body/nav[1]/div[1]/a[1]/img[1]")).click();
	Thread.sleep(3000);
	
	
	//testing the Contact Sales
	driver.findElement(By.xpath("//body/nav[1]/div[1]/div[2]/div[2]/ul[1]/li[2]/a[1]/button[1]")).click();
	JavascriptExecutor scroll = (JavascriptExecutor) driver;
	scroll.executeScript("window.scrollBy(0,15000)");
	driver.findElement(By.name("FullName")).sendKeys("Test2");
	driver.findElement(By.name("Contact")).sendKeys("987654321");
	driver.findElement(By.name("Email")).sendKeys("test2@xyz.com");
	Thread.sleep(3000);
	Select Country2 = new Select(driver.findElement(By.name("Country")));
	Country2.selectByVisibleText("Canada");
	Thread.sleep(3000);
	Select Employee = new Select(driver.findElement(By.name("NoOfEmployees")));
	Employee.selectByVisibleText("21 - 25");
	driver.findElement(By.name("JobTitle")).sendKeys("QA Intern");
	driver.findElement(By.name("Comment")).sendKeys("This is a automation testing of this website");
	Thread.sleep(10000);
	driver.findElement(By.name("action_submitForm")).click();
	Thread.sleep(5000);
	
	
	//redirecting to the homepage
	driver.findElement(By.xpath("//body/nav[1]/div[1]/a[1]/img[1]")).click();
	
	//hovering the mouse and clicking the one element
	WebElement hover = driver.findElement(By.xpath("//body/nav[1]/div[1]/div[2]/ul[1]/li[4]/a[1]"));
    new Actions(driver)
            .moveToElement(hover)
            .perform();
    Thread.sleep(5000);
    
    //after hovering the mouse then choosing the required option from the visible
    driver.findElement(By.xpath("//body/nav[1]/div[1]/div[2]/ul[1]/li[4]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
    
    
    //returing back to home page
     driver.findElement(By.xpath("//body/nav[1]/div[1]/a[1]/img[1]")).click();
    Thread.sleep(3000);
    
    
    //testing for try it for free
    driver.findElement(By.name("EmailHomePage")).sendKeys("test3@xyz.com");
    driver.findElement(By.name("action_request")).click();
    driver.findElement(By.name("subdomain")).sendKeys("user");
    driver.findElement(By.name("Name")).sendKeys("User12");
    //driver.findElement(By.name("Email")).sendKeys("test3@xyz.com");
    driver.findElement(By.name("Contact")).sendKeys("1234567890");
    driver.findElement(By.name("subdomain")).sendKeys("user");
    Select countryChoose = new Select(driver.findElement(By.name("Country")));
	countryChoose.selectByVisibleText("Nepal");
	Thread.sleep(10000);
	 driver.findElement(By.name("action_submitForm")).click();




    
    
	
}
}