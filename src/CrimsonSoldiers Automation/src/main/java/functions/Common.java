package functions;

import setup.CommonDriverClass;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Common {

    public static void refreshToFirstPage(){
        CommonDriverClass.driver.get("https://crimsonsoldiers-iusservicelisting.azurewebsites.net/");
    }

    public static String getPageBodySource(){
        return CommonDriverClass.driver.getPageSource();
    }

    public static void logTestPass(String description) {
        System.out.println(description);
        //variables.Common.test.log(LogStatus.PASS, description);
        Assert.assertTrue(true);
    }

    public static void logTestPassFile(String description, String file) {
        System.out.println(description);
        variables.Common.test.log(LogStatus.PASS, description);
        Assert.assertTrue(true);
    }

    public static void logTestFatal(String description) {
        System.out.println(description);
        variables.Common.test.log(LogStatus.FATAL, description);

        try {
            Assert.assertTrue(false);
        } finally {
            CommonDriverClass.softAssert.assertAll();
        }

    }

    public static void AssertAllFail() {
        CommonDriverClass.softAssert.assertAll();
        Assert.assertTrue(false);
    }

    public static void logTestFail(String description) {
        System.out.println("Fail: " + description);
        //variables.Common.test.log(LogStatus.FAIL, description);
        CommonDriverClass.softAssert.assertTrue(false);
    }

    public static void logTestInfo(String description) {
        variables.Common.test.log(LogStatus.INFO, description);
    }

    public static void logTestWarning(String description) {
        variables.Common.test.log(LogStatus.WARNING, description);
    }

    public static void logTestSkip(String description) {
        variables.Common.test.log(LogStatus.SKIP, description);
    }

    public static void logTestError(String description) {
        variables.Common.test.log(LogStatus.ERROR, description);
    }

    public static void startNewTest(String description) {
        variables.Common.test = variables.Common.report.startTest(description);
    }

    public static boolean browserSync() {
        try {
            WebDriverWait wait = new WebDriverWait(CommonDriverClass.driver, 30L);
            return (Boolean)wait.until((driver) -> {
                return String.valueOf(((JavascriptExecutor)driver).executeScript("return document.readyState", new Object[0])).equalsIgnoreCase("complete");
            });
        } catch (Exception var1) {
            return browserSync();
        }
    }

    public static void switchToNewWindow() {
        try {
            if (CommonDriverClass.driver.getWindowHandles().size() > 2) {
                logTestFatal("More than 2 windows are open.");
            } else if (CommonDriverClass.driver.getWindowHandles().size() == 2) {
                String currentWindowID = CommonDriverClass.driver.getWindowHandle();
                Set<String> handles = CommonDriverClass.driver.getWindowHandles();
                handles.remove(currentWindowID);
                String nextWindowID = (String)handles.toArray()[0];
                if (nextWindowID.equalsIgnoreCase(currentWindowID)) {
                    logTestInfo("No window switch needed, new window is already active.");
                } else {
                    CommonDriverClass.driver.switchTo().window(nextWindowID);
                    logTestInfo("Switched to new window successfully: " + CommonDriverClass.driver.getTitle());
                }
            } else {
                System.out.println(CommonDriverClass.driver.getWindowHandles().size() + " window handles");
                CommonDriverClass.driver.switchTo().window((String)CommonDriverClass.driver.getWindowHandles().toArray()[0]);
                logTestInfo("There is only 1 window open, driver is now pointed at that window.");
            }
        } catch (Error var3) {
            logTestFail("See screenshot for Error screenshot. " + var3);
        } catch (Exception var4) {
            System.out.println(var4);
            logTestFail("See screenshot for Exception screenshot. " + var4);
        }

        browserSync();
    }

    public static void returnToParentWindow() {
        CommonDriverClass.driver.switchTo().window(CommonDriverClass.getParentWindowID());
        logTestInfo("Returned to the Parent Window");
    }

    public static void closeParentWindow() {
        try {
            if (CommonDriverClass.driver.getWindowHandles().size() > 2) {
                logTestFatal("More than 2 windows are open.");
            } else if (CommonDriverClass.driver.getWindowHandles().size() == 2) {
                Set handles = CommonDriverClass.driver.getWindowHandles();

                try {
                    returnToParentWindow();
                } catch (NoSuchWindowException var3) {
                    logTestInfo("The original window has been closed, going to previous window.");
                    CommonDriverClass.driver.switchTo().window((String)handles.toArray()[0]);
                }

                String currentWindowID = CommonDriverClass.driver.getWindowHandle();
                handles.remove(currentWindowID);
                CommonDriverClass.driver.close();
                logTestInfo("Closed the Parent Window");
                String nextWindowID = (String)handles.toArray()[0];
                if (nextWindowID.equalsIgnoreCase(currentWindowID)) {
                    logTestInfo("No window switch needed, new window is already active.");
                } else {
                    CommonDriverClass.driver.switchTo().window(nextWindowID);
                    logTestInfo("Switched to new window successfully: " + CommonDriverClass.driver.getTitle());
                }
            } else {
                System.out.println(CommonDriverClass.driver.getWindowHandles().size() + " window handles");
                CommonDriverClass.driver.switchTo().window((String)CommonDriverClass.driver.getWindowHandles().toArray()[0]);
                logTestInfo("There is only 1 window open, driver is now pointed at that window.");
            }
        } catch (Error var4) {
            logTestFail("See screenshot for Error screenshot. " + var4);
        } catch (Exception var5) {
            System.out.println(var5);
            logTestFail("See screenshot for Exception screenshot. " + var5);
        }

        browserSync();
        logTestInfo("Returned to Current Window");
    }

    public static boolean tabTitleCheck(String expectedTitle) {
        try {
            Assert.assertEquals(browserSync(), true);
            if (CommonDriverClass.driver.getTitle().toLowerCase().equals(expectedTitle.toLowerCase())) {
                logTestInfo("The page " + expectedTitle + " loaded completely.");
            } else {
                logTestInfo("The page that loaded was: " + CommonDriverClass.driver.getTitle());
            }
        } catch (Exception var5) {
            logTestFail("The page did not load successfully" + var5);
            Assert.assertFalse(true);
            return false;
        } catch (Error var6) {
            logTestFail(var6 + "");
            Assert.assertFalse(true);
            return false;
        }

        String actualTitle = CommonDriverClass.driver.getTitle();

        try {
            Assert.assertEquals(actualTitle, expectedTitle);
            logTestPass("The page titled \"" + expectedTitle + "\" was reached.");
            return true;
        } catch (Exception var3) {
            logTestFail("The page titled \"" + expectedTitle + "\" was not reached. \"" + actualTitle + "\" was the title for the page displayed.   " + var3);
            return false;
        } catch (Error var4) {
            logTestFail(var4 + "");
            return false;
        }
    }

    public static void SleepSeconds(int numOfSeconds) throws InterruptedException {
            TimeUnit.SECONDS.sleep(numOfSeconds);
    }

    public static boolean tabTitleContains(String partialTabTitle) {
        if (CommonDriverClass.driver.getTitle().contains(partialTabTitle)) {
            logTestPass("The page was loaded with a partial or full title of " + partialTabTitle);
            return true;
        } else {
            logTestFail("The page loaded was not titled " + partialTabTitle + " either in part or in full.");
            return false;
        }
    }
}
