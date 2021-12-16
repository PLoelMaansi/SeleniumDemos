package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;
import java.util.List;

public class GetAllURLs {

public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\selenium_software\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://demowebshop.tricentis.com");
driver.manage().window().maximize();

String url="";
List<WebElement> allURLs = driver.findElements(By.xpath("//a"));
System.out.println(allURLs.size());

driver.quit();
}
}