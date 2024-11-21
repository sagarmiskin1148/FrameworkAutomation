package elementsActions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.remote.RemoteWebElement;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import session.CreateSession;

public class ScrollActions 
{
  @Test
  public void scrollTest() throws InterruptedException 
  {
	  
	  AppiumDriver driver=CreateSession.initializeDriver();
	  
	  
	  //Click on views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //Complete page list
	  WebElement ele1=driver.findElement(AppiumBy.id("android:id/list"));
	  
	  
	  //Scroll Action
	  //Scroll down
	  ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			      "elementId",((RemoteWebElement)ele1).getId(),
	             "direction", "down",
			    "percent", 0.75));
	  
	  
	  
	  
	      Thread.sleep(2000);
	  
	      //Scroll up
	  ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			      "elementId",((RemoteWebElement)ele1).getId(),
	             "direction", "up",
			    "percent", 0.75));
	  
	  
	  
	  
  }
}
