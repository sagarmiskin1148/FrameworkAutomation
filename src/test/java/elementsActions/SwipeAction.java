package elementsActions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.remote.RemoteWebElement;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import session.CreateSession;

public class SwipeAction 
{
  @Test
  public void swipeTest1() throws InterruptedException 
  {
	  
	  
      AppiumDriver driver=CreateSession.initializeDriver();
	  
	  
	  //Click on views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //Complete page list
	  WebElement ele1=driver.findElement(AppiumBy.id("android:id/list"));
	  
	  
	  
	  
	  ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
			  "elementId",((RemoteWebElement)ele1).getId(),
			    "direction", "up",
			    "percent", 0.75
			));
	  
	  
	  Thread.sleep(2000);
	  
	  
	  ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
			  "elementId",((RemoteWebElement)ele1).getId(),
			    "direction", "down",
			    "percent", 0.75
			));
	  
	  
	  
  }
  
  
  @Test
  public void swipeTest2()
  {
	  
 AppiumDriver driver=CreateSession.initializeDriver();
	  
	  
	  //Click on views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	
	  //gallary
	  driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
	  
	  
	  driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
	  
	  WebElement ele1=driver.findElement(AppiumBy.className("android.widget.ImageView"));
	  
	  ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
			  "elementId",((RemoteWebElement)ele1).getId(),
			    "direction", "left",
			    "percent", 0.75
			));
	  
  }
}



