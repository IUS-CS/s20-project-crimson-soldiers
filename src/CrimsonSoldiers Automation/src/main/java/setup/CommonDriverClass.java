package setup;

import java.net.URL;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.HttpCommandExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

public class CommonDriverClass {
    public static WebDriver driver;
    public static SoftAssert softAssert;
    static String parentWindowID = "";

    @Parameters({"browser", "runType"})
    public static void initDriver(String browser) {
        softAssert = new SoftAssert();
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "/Users/benszabo/Desktop/C346-Software Engineering/chromedriver");
            Map<String, Object> preferences = new Hashtable();
            preferences.put("profile.default_content_settings.popups", 0);
            preferences.put("download.prompt_for_download", "false");
            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("prefs", preferences);
            try {
                driver = new ChromeDriver(options);
            } catch (Error var8) {
                System.out.println("ERROR: " + var8);
            } catch (Exception var9) {
                System.out.println("EXCEPTION: " + var9);
            }
            System.out.println("Chrome Driver started");
            driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
            //driver.manage().window().maximize();
            setParentWindowID(driver.getWindowHandle());
        }
    }

    public static void printDriverInfo() {
        HttpCommandExecutor executor = (HttpCommandExecutor)((RemoteWebDriver)driver).getCommandExecutor();
        URL url = executor.getAddressOfRemoteServer();
        SessionId session_id = ((RemoteWebDriver)driver).getSessionId();
        System.out.println("URL: " + url);
        System.out.println("Session ID: " + session_id);
    }

    public static String getParentWindowID() {
        return parentWindowID;
    }

    public static void setParentWindowID(String id) {
        parentWindowID = id;
    }
}
