package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GridTest {
  @Test
  public void testOnChrome() throws MalformedURLException, InterruptedException {
	  ChromeOptions options=new ChromeOptions();
	  Reporter.log("Test executing on Chrome !!!",true);
	  
	  WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/"),options);
	  Reporter.log("Driver session is established with server !!!",true);
	  Thread.sleep(5000);
	  
	  driver.get("https://www.amazon.in");
	  System.out.println("Amazon title is: "+driver.getTitle());
	  Thread.sleep(10000);
	  Reporter.log("Test executing for Amazon application !!!",true);
	  
	  driver.quit();
	  Reporter.log("Test completed !!!",true);
	  
  }
}
