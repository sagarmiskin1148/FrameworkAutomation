package newScenarios;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import session.CreateSession;

public class NotificationTest 
{
  @Test
  public void notificationTest () 
  {
	  AppiumDriver driver=CreateSession.initializeDriver();
	  
	  
	  //open notification-openNotifications()
	  
	  ((AndroidDriver)driver).openNotifications();
	  
	  String text1=driver.findElement(AppiumBy.id("android:id/big_text")).getText();
	  System.out.println(text1);
	  
	  
	  
	  
  }
}
