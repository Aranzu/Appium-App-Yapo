package AppiumAppTest;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchEmpleoTest extends BaseClass{
    private ExtentTest test;
    @Test
    public void testSearchEmpleo() throws InterruptedException {
        /*test = TestSuite.createTest("Prueba de busqueda", "Probar la busqueda de productos con todos los filtros");
        test.log(Status.INFO, "Comenzando caso de prueba de busqueda con filtros valida");*/

        driver.findElement(By.id("cl.yapo:id/action_search")).click();
        driver.findElement(By.id("cl.yapo:id/collapse_button")).click();
        driver.findElement(By.id("cl.yapo:id/txt_search")).sendKeys("Trabajo");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/" +
                "android.widget.LinearLayout[1]/android.widget.RelativeLayout\n")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"V Valparaíso\"]")).click();
        driver.findElement(By.id("cl.yapo:id/search_fab")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        Thread.sleep(5000);

        WebElement message = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView"));
        String value = message.getText();
        /*if (value.equals("Trabajo")) {
            test.log(Status.PASS, "Busqueda exitosa");
        } else {
            test.log(Status.FAIL, "La busqueda ha fallado");
        }*/
        assertEquals("Trabajo", value);
    }
}