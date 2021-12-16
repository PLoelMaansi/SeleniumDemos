package seleniumprograms;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jDemo {
public static void main (String[] args) {
	
	Logger log=Logger.getLogger(Log4jDemo.class);
	PropertyConfigurator.configure("log4j.properties");
	
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Software\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	log.info("Launch Browser");
	
	
	driver.get("http://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	
	log.info("Opened application");
	
	String expectedtitle="Demo Web ";
	//Demo Web Shop. Login
	String actualtitle=driver.getTitle();
	System.out.println(actualtitle);
	log.info("Title valie is:" +actualtitle);
	
	if(actualtitle.equals(expectedtitle))
	{
		System.out.println("Titles match");
		log.info("Correct Title");
		driver.findElement(By.id("Email")).sendKeys("loel@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("loel18");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElements(By.linkText("Log out")).click();
		driver.close();
		
		
				
	}
}
}
