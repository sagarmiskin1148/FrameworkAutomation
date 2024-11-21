package newScenarios;

import java.util.List;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import session.CreateSession;

public class PerformanceData 
{
  @Test
  public void getperformanceData() 
  {
	  AppiumDriver driver=CreateSession.initializeDriver();
	  
	  
	  List<String> performanceTypes=((AndroidDriver)driver).getSupportedPerformanceDataTypes();
	
	  
	  System.out.println(performanceTypes);
	  //[cpuinfo, memoryinfo, batteryinfo, networkinfo]
	  
	  //To get Batteryinfo
	  List<List<Object>> batterydata=((AndroidDriver)driver).getPerformanceData("io.appium.android.apis","batteryinfo",5);
	  System.out.println("Performance result for battery: "+batterydata);  
	  
	  System.out.println("*************************************");
	  
	  
	  List<List<Object>> memorydata=((AndroidDriver)driver).getPerformanceData("io.appium.android.apis","memoryinfo",5);
	  System.out.println("Performance result for memory: "+memorydata);
	  
	  
	  
	  System.out.println("*************************************");
	  
	  List<List<Object>> networkdata=((AndroidDriver)driver).getPerformanceData("io.appium.android.apis","networkinfo",5);
	  System.out.println("Performance result for network: "+networkdata);  
	  
	  
	  
  }
}
