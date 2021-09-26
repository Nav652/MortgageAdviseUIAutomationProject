package UI_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Request_Call_Back {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\mnavi\\eclipse-workspace\\chromedriver.exe");
    
    WebDriver driver = new ChromeDriver();
	driver.get("https://www.mortgageadvicebureau.com/contact-us");
	//maximise the window
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	driver.findElement(By.id("FirstName")).sendKeys("Navitha");
	driver.findElement(By.id("LastName")).sendKeys("Muniraju");
	driver.findElement(By.id("EmailAddress")).sendKeys("m.navitha9@gmail.com");
	driver.findElement(By.name("PhoneNumber")).sendKeys("07423211356");
	driver.findElement(By.name("BestTimeToCallYou")).sendKeys("6 PM");
	
	// Code to Handle Static Drop downs
	WebElement StaticDropdown = driver.findElement(By.id("ReasonForEnquiry"));
	Select dropdown = new Select(StaticDropdown);
	dropdown.selectByIndex(3);
	System.out.println(dropdown.getFirstSelectedOption().getText());
	
	//Code to Handle Check box
	
	System.out.println(driver.findElement(By.id("OptInEmail")).isSelected());
	driver.findElement(By.id("OptInEmail")).click();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	// because the checkbox is at the bottom.
	js.executeScript("scroll(0, 250)");
	System.out.println(driver.findElement(By.name("OptInEmail")).isSelected());
	Thread.sleep(1000);
	driver.close();
	
	}

}
