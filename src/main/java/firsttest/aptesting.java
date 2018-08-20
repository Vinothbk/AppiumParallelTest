package firsttest;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
//import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class aptesting {
public WebDriver driver;
@BeforeTest
@Parameters({"platform", "deviceName", "wdaLocalPort"})
	public void setUp(String platform, String deviceName, String wdaLocalPort) throws Exception {
		// set up appium
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		//DesiredCapabilities capabilities = new DesiredCapabilities();
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", deviceName);
		//caps.setCapability("udid", "ENUL6303030010"); //Give Device ID of your mobile phone
		caps.setCapability("platformName", "iOS");
		caps.setCapability("platformVersion", platform);
		caps.setCapability("automationName", "XCUITest");
		caps.setCapability("wdaLocalPort", wdaLocalPort);
		//caps.setCapability(MobileCapabilityType.NO_RESET, false);
		caps.setCapability("bundleId", "com.facebooktest.wda.integrationApp");
		caps.setCapability("app", "/Users/vinothqa/Documents/appium project/testapp/IntegrationApp.app");
		/*capabilities.setCapability(CapabilityType.BROWSER_NAME, "iOS");
		capabilities.setCapability(CapabilityType.VERSION, "6.1");
		capabilities.setCapability(CapabilityType.PLATFORM, "Mac");
		capabilities.setCapability("app","/Users/username/Downloads/InternationalMountains   /build/Release-iphonesimulator/InternationalMountains.app");*/
		//driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		driver = new IOSDriver<MobileElement>(url, caps);
		}

@Test
public void test() {
	System.out.println("Test works!");
}
}
