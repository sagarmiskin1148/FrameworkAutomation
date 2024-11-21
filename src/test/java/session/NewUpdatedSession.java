package session;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class NewUpdatedSession 
{
  @Test
  public void newSession() throws MalformedURLException, URISyntaxException
  {
	  
	  UiAutomator2Options option=new UiAutomator2Options();
	  option.setPlatformName("Android");
	  
	  
	  
	  //Application
	  
	  String path=System.getProperty("user.dir")+"/src/test/resources/ApiDemos-debug.apk";
	  option.setCapability("appium:app", path);
	  
	  
	  //server setup
	  URL url=new URI("http://0.0.0.0:4723").toURL();
	  
	  
	  
	  //AppiumDriver
	  AppiumDriver driver=new AndroidDriver(url,option);
	  System.out.println(driver.getSessionId());
  }
}
