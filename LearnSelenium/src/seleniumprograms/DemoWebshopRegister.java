package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebshopRegister{

public static void main(String[] args){

System.setProperty("webdriver.chrome.driver", "C:\\selenium_software\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://demowebshop.tricentis.com//register");
driver.manage().window().maximize();

driver.findElement(By.xpath("//a[@class='ico-register']")).click();


driver.findElement(By.xpath("//input[@value='F']")).click();
driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("LoelMaansi");
driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Pothuri");
driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("maansip@gmail.com");
driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("loel28");
driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("loel28");
driver.findElement(By.xpath("//input[@value='Register']")).click();
}

}