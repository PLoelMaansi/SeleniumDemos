package seleniumprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\selenium_software\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://demowebshop.tricentis.com/");
driver.manage().window().maximize();

String title=driver.getTitle();
System.out.println(title);
System.out.println(title.length());

String currenturl=driver.getCurrentUrl();
String expectedurl="http://demowebshop.tricentis.com/";
if(currenturl.equals(expectedurl))
{
System.out.println("It is Correct URL");
}
else
{
System.out.println("It is wrong URL");
}
String page_source=driver.getPageSource();
int pslength=page_source.length();
System.out.println(pslength);
driver.close();
}
}