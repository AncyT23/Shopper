package grooming;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script10 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.get("file:///C:/Users/Ancy%20Tharakan/OneDrive/Desktop/Selenium/webpage.html");
	Thread.sleep(2000);
	
        WebElement Text1= driver.findElement(By.name("t1"));
        Text1.sendKeys("abc");
		Thread.sleep(2000);
		WebElement Text2= driver.findElement(By.name("t2"));
		Text2.sendKeys("xyz");
		Thread.sleep(2000);
		WebElement Text3= driver.findElement(By.id("i3"));
		Text3.clear();
		Thread.sleep(2000);
		WebElement CB=driver.findElement(By.className("check"));
		CB.click();
		Thread.sleep(2000);
		WebElement RB=driver.findElement(By.name("r"));
		RB.click();
		
		
		
}
}
