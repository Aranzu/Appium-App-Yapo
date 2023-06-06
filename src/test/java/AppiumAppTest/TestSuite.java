package AppiumAppTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        LoginValidTest.class,
        LoginNoDataTest.class,
        LoginInvalidTest.class,
        SearchAutoFiltTest.class,
        SearchEmpleoTest.class,
        UpdateProfileTest.class,
        UpdateProfileWrongPassTest.class,
        UpdateProfileWrongPhoneTest.class,
})
public class TestSuite {
    private static ExtentReports extent;

    @BeforeClass
    public static void setUp() {
        extent = new ExtentReports();
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter("target/report/ExtentReport.html");
        extent.attachReporter(htmlReporter);
    }

    @AfterClass
    public static void tearDown() {
        extent.flush();
    }

    public static ExtentTest createTest(String testName, String testDescription) {
        ExtentTest test = extent.createTest(testName, testDescription);
        return test;
    }
}

