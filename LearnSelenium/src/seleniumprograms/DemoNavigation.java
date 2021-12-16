package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoNavigation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Software\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='ico-register']")).click();
		
		String expectedtitle = "Demo Web Shop. Login";
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("you are on the correct page");
		driver.findElement(By.id("Email")).sendKeys("loelp@gmail.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("Demo Web Shop. Login");
		driver.navigate().refresh();
		driver.close();
		}
		else
		{
		System.out.println("you are on the wrong page");
		driver.close();
	}

}
	
}
	

