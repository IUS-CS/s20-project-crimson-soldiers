package setup;

import java.util.ArrayList;
import java.util.List;
import org.testng.ISuite;
import org.testng.ITestResult;

public class ReportSetupLocation {
    static String projDir = System.getProperty("user.dir");
    static String appName;
    static int failures;
    static List<String> failureList;

    public ReportSetupLocation() {
    }

    public static void applyToOnSuiteStart(ISuite suite) {
        System.out.println("on Start(Suite Level)");
        String suiteName = suite.getName();
        System.out.println(suiteName);
    }

    public static void applyToOnTestSuccess(ITestResult result) {

    }

    public static void applyToOnTestFailure(ITestResult result) {
        System.out.println("on Test Failure");
        System.out.println("Location" + result.getInstanceName());
        String thingDown = result.getInstanceName();
        String flipIt = "";
        String reverseIt = "";
        String subString = "";

        int i;
        for(i = thingDown.length() - 1; i >= 0; --i) {
            flipIt = flipIt + thingDown.charAt(i);
        }

        subString = flipIt.substring(0, flipIt.indexOf("."));

        for(i = subString.length() - 1; i >= 0; --i) {
            reverseIt = reverseIt + subString.charAt(i);
        }

        if (failures > 1) {
            failureList.add(reverseIt + "; ");
        } else {
            failureList.add(reverseIt + "; ");
        }

        ++failures;
    }

    public static void applyToOnTestFinish() {
        System.out.println("Test Finished");
        CommonDriverClass.driver.quit();
    }

    public static void applyToOnSuiteFinish() {
        System.out.println("Test Complete");
        CommonDriverClass.driver.quit();
    }

    static {
        appName = projDir.substring(projDir.lastIndexOf("\\") + 1);
        failures = 0;
        failureList = new ArrayList();
    }
}

