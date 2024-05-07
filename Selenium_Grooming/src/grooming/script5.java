package grooming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class script5 
{
public static void main(String[] args) 
{
	System.setProperty( "webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	String title = driver.getTitle();
	
System.out.println(title);

String url = driver.getCurrentUrl();
System.out.println(url);

String src = driver.getPageSource();
System.out.println(src);

driver.quit();
	
}
}
