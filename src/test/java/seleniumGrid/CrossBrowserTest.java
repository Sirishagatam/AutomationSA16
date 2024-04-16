package seleniumGrid;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	
	public WebDriver driver;
	@Parameters({"bwname"})
	
  @Test
  public void browserTest(String bwname) throws MalformedURLException, InterruptedException {
	  
	  if (bwname.equalsIgnoreCase("chrome")) {
		  
		  ChromeOptions options=new ChromeOptions();
		  Reporter.log("Test is executing on Chrome !!!",true);
		  
		  driver = new RemoteWebDriver(new URL("http://localhost:4444/"),options);
		  Thread.sleep(5000);
		  Reporter.log("Driver session is established with server !!!",true);
		  
		  driver.get("https://www.amazon.in");
		  System.out.println("Title is: "+driver.getTitle());
		  Thread.sleep(10000);
		  Reporter.log("Test executing for Amazon application on chrome",true);
		  
		  driver.quit();
		  Reporter.log("Test executing for chrome is complete !!!",true);
		  
	  } else if (bwname.equalsIgnoreCase("edge")) {
		  EdgeOptions options=new EdgeOptions();
		  Reporter.log("Test is executing on Edge !!!",true);
		  
		  driver = new RemoteWebDriver(new URL("http://localhost:4444/"),options);
		  Thread.sleep(5000);
		  Reporter.log("Driver session is established with server !!!",true);
		  
		  driver.get("https://www.amazon.in");
		  System.out.println("Title is: "+driver.getTitle());
		  Thread.sleep(10000);
		  Reporter.log("Test executing for Amazon application on edge",true);
		  
		  driver.quit();
		  Reporter.log("Test executing for edge is complete !!!",true);
		  
		  
	  } else if (bwname.equalsIgnoreCase("firefox")) {
		  FirefoxOptions options=new FirefoxOptions();
		  Reporter.log("Test is executing on Firefox !!!");
		  
		  driver=new RemoteWebDriver(new URL("http://localhost:4444"),options);
		  Thread.sleep(5000);
		  Reporter.log("Driver session is established with server !!!",true);
		  
		  driver.get("https://www.amazon.in");
		  Reporter.log("Test is executing for Amazon application on firefox",true);
		  Thread.sleep(10000);
		  
		  driver.quit();
		  Reporter.log("Test execution for firefox is complete !!!",true);
		  
	  }
	  
  }
}
