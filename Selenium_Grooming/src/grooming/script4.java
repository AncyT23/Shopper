package grooming;

import org.openqa.selenium.chrome.ChromeDriver;

public class script4 {
public static void main(String[] args) throws InterruptedException {
	{
		String key = "webdriver.chrome.driver";
		String value = "./software/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		
	}
}
}
 