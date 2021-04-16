package Module4_Test_LogIN;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIN1Test 
{

	@Test
	public void Test() throws InterruptedException
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Amar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.get("http://www.Flipkart.com/");
	Thread.sleep(2000);
}
}
