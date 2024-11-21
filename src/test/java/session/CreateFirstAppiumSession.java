package session;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class CreateFirstAppiumSession
{
  @Test
  public void sessionTest() throws MalformedURLException, URISyntaxException
  {
	  
	  
	  
    
	  DesiredCapabilities cap=new DesiredCapabilities();
	  cap.setCapability("platformName","Android");
	  cap.setCapability("appium:automationName","uiautomator2");
	  cap.setCapability("appium:deviceName","pixel_7");
	  cap.setCapability("appium:udid","emulator-5554");
	  
	 
	  
	  
	  //application
	  String appPath=System.getProperty("user.dir")+"/src/test/resources/ApiDemos-debug.apk";
	  
	  cap.setCapability("appium:app",appPath);
	  //server connectivity
	  URL url=new URI("http://0.0.0.0:4723").toURL();
	  
	  
	  //To create a session
	  AppiumDriver driver=new AndroidDriver(url,cap);
	  System.out.println("session id is: "+driver.getSessionId());
	  
  }
}
