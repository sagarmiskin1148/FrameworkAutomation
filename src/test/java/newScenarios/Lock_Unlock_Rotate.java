package newScenarios;

import org.openqa.selenium.ScreenOrientation;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import session.CreateSession;

public class Lock_Unlock_Rotate 
{
  @Test
  public void testDevice_lock_unlock_rotate() 
  {
	AppiumDriver driver=CreateSession.initializeDriver();  
	  
	
	//Lock the device
	((AndroidDriver)driver).lockDevice();
	System.out.println("Device get locked!");
	
	
	//status check
	System.out.println("Is my Device is locked: "+((AndroidDriver)driver).isDeviceLocked());//true
	
	
	//unlock the device
	((AndroidDriver)driver).unlockDevice();
	System.out.println("Device get unlocked!");
	 
	System.out.println("Is my Device is locked: "+((AndroidDriver)driver).isDeviceLocked());//false
	  
	
	//rotate
	((AndroidDriver)driver).rotate(ScreenOrientation.LANDSCAPE);
	System.out.println("rotating screen in landscape mode!");
	
	
	((AndroidDriver)driver).rotate(ScreenOrientation.PORTRAIT);
	System.out.println("rotating screen in portrait mode!");
	 
  }
}
