package elementsActions;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import session.CreateSession;

public class LocatorsDemo
{
  @Test
  public void androidLocators() throws InterruptedException
  {
	  
	  //create a session
	  
	  AppiumDriver driver=CreateSession.initializeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  System.out.println("session id is: "+driver.getSessionId());
	  
	  
	  
	  //Locators
	  
	  WebElement ele1=driver.findElement(AppiumBy.accessibilityId("Access'ibility"));
	  System.out.println("Text of Element is: "+ele1.getText());
	  ele1.click();
	  
	  
//	  //accessibility service
//	  WebElement ele2=driver.findElement(AppiumBy.id("android:id/text1"));
//	  System.out.println("Text of Element is "+ele2.getText());
//	  ele2.click();
	  
	  //index 0 to n
	  
	  WebElement ele2=driver.findElements(AppiumBy.id("android:id/text1")).get(2);
	  System.out.println("Text of Element is "+ele2.getText());
	  ele2.click();
	  
	  
	  //Go Back to previous page
	  
	  driver.navigate().back();
	  Thread.sleep(2000);
	  driver.navigate().back();
	  System.out.println("Navigation to Main page again!");
	  
	  
	  //main
	  //views by xpath
	  driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
	  System.out.println("Clicked on Views!");
	  
	  
	  //buttons
	  driver.findElements(AppiumBy.className("android.widget.TextView")).get(3).click();
	  
	  System.out.println("Buttons Options got clicked");
	  

  }
  
}
