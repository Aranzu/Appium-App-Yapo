package AppiumAppTest;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchAutoFiltTest extends BaseClass{
    private ExtentTest test;
    @Test
    public void testSearchAutoFilt() throws InterruptedException {
        /*test = TestSuite.createTest("Prueba de busqueda", "Probar la busqueda de productos");
        test.log(Status.INFO, "Comenzando caso de prueba de busqueda valido");*/

        driver.findElement(By.id("cl.yapo:id/action_search")).click();
        driver.findElement(By.id("cl.yapo:id/collapse_button")).click();
        driver.findElement(By.id("cl.yapo:id/txt_search")).sendKeys("Auto");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/" +
                "android.widget.LinearLayout[1]/android.widget.RelativeLayout\n")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Región Metropolitana\"]")).click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/" +
                "android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]")).click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/" +
                "android.widget.LinearLayout[3]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.CheckedTextView")).click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/" +
                "android.widget.LinearLayout[3]/android.widget.LinearLayout[3]/android.widget.Button")).click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
                "android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[6]")).click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/" +
                "android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[11]")).click();
        driver.findElement(By.id("android:id/button1")).click();
        driver.findElement(By.id("cl.yapo:id/search_fab")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        Thread.sleep(5000);

        WebElement message = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView"));
        String value = message.getText();
       /* if (value.equals("Auto")) {
            test.log(Status.PASS, "Busqueda exitosa");
        } else {
            test.log(Status.FAIL, "La busqueda ha fallado");
        }*/
        assertEquals("Auto", value);
    }
}