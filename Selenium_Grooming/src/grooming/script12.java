package grooming;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class script12 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.swiggy.com/");
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("//span[text()='Search']"));
				search.click();
				WebElement search1 = driver.findElement(By.className("_2FkHZ"));
				search1.sendKeys("biriyani");
				WebElement search2 =driver.findElement(By.xpath("//div[text()='Chicken Biryani']"));
				search2.click();
		
	}}
