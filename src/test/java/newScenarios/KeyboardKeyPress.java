package newScenarios;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import helper.Utility;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import session.CreateSession;

public class KeyboardKeyPress
{
  @Test
  public void textTypeText()
  {
	  AppiumDriver driver=CreateSession.initializeDriver();
	  
	 
	  //view
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  
	  //element
	  WebElement ele=driver.findElement(AppiumBy.id("android:id/list"));
	  
	  //Scroll the page at down 
	  Utility.appiumScrollDown(driver ,ele);
	  Utility.appiumScrollDown(driver ,ele);
	  
	  
	  //textview
	  driver.findElement(AppiumBy.accessibilityId("TextFields")).click();
	  
	  
	  //textarea
	  WebElement textarea=driver.findElement(AppiumBy.id("io.appium.android.apis:id/edit"));
	  textarea.click();
	  textarea.sendKeys("Hello Everyone!.....How are you");
	  
	  
	  //Keyboard action
	  ((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.ENTER));
	  ((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.H));
	  ((AndroidDriver)driver).pressKey(new KeyEvent().withKey(AndroidKey.I));
	  
	  
	  
	  
	  
	  
  }
}
