package setup;

import org.testng.*;
import org.testng.annotations.Parameters;

public class AnnotationsListeners implements ITestListener, ISuiteListener{
    String browser;
    String runType;


    @Parameters({ "role", "runType" })
    public void onStart(ITestContext context) {
        browser = context.getCurrentXmlTest().getParameter("browser");
        runType = context.getCurrentXmlTest().getParameter("runType");
        CommonDriverClass.initDriver(browser);
        CommonDriverClass.driver.get("https://crimsonsoldiers-iusservicelisting.azurewebsites.net/");
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test Beginning");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ReportSetupLocation.applyToOnTestSuccess(result);
        CommonDriverClass.softAssert.assertAll();
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ReportSetupLocation.applyToOnTestFailure(result);
    }

    @Override
    public void onFinish(ITestContext context) {
        ReportSetupLocation.applyToOnTestFinish();
    }

    @Override
    public void onStart(ISuite suite) {
        ReportSetupLocation.applyToOnSuiteStart(suite);
    }

    @Override
    public void onFinish(ISuite suite) {
        ReportSetupLocation.applyToOnSuiteFinish();
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // TODO Auto-generated method stub
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub
    }

}
