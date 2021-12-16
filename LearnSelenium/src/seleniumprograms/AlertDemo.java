package seleniumprograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\selenium_software\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://demo.automationtesting.in/Alerts.html");
driver.manage().window().maximize();

driver.findElement(By.xpath("//button[contains(text(),'click the button to display an alert box')]")).click();
Alert altr1=driver.switchTo().alert();
String alertmessage1=driver.switchTo().alert().getText();
System.out.println(alertmessage1);
altr1.accept();

driver.findElement(By.xpath(" //a[contains(text(),'Alert with OK & Cancel')]")).click();
driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]")).click();
Alert altr2=driver.switchTo().alert();
String alertmessage2=driver.switchTo().alert().getText();
System.out.println(alertmessage2);
altr2.dismiss();

driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box')]")).click();
Alert altr3=driver.switchTo().alert();
String alertmessage3=driver.switchTo().alert().getText();
System.out.println(alertmessage3);
altr3.sendKeys("supriya");
altr3.accept();


}

}