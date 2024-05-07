package grooming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script6 {
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	 Thread.sleep(2000);
	 driver.get("file:///C:/Users/Ancy%20Tharakan/OneDrive/Desktop/Selenium/source1.html");
	 Thread.sleep(2000);
	 WebElement ele=driver.findElement(By.tagName("a"));
	 Thread.sleep(2000);
	 ele.click();	 
		 
		 
	}

}
