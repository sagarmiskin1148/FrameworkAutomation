package newScenarios;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import session.CreateSession;

public class ToggleNetworkSetting
{
  @Test
  public void toggleTest() 
  {
	  
	 AppiumDriver driver=CreateSession.initializeDriver(); 
	 
	 /*
	 //toggle setup for airplane mode off--->ON
	 System.out.println("initially AirplaneMode setup is OFF!");
   	 ((AndroidDriver)driver).toggleAirplaneMode();
   	System.out.println("AirplaneMode setup is ON!");
   	
   	
   	//on--->off
   	((AndroidDriver)driver).toggleAirplaneMode();
	System.out.println("AirplaneMode setup is OFF!");
	*/
	
	//wifi 0n----->0ff
	 System.out.println("initially Wifi  setup is ON!");
	 
	((AndroidDriver)driver).toggleWifi();
	System.out.println("wifi setup is OFF!");
	
	
	//off---on
	((AndroidDriver)driver).toggleWifi();
	
	
	//mobiledata
	((AndroidDriver)driver).toggleData();
	
	
   	
  }
}
