package AppiumAppTest;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.MobileBy;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UpdateProfileTest extends BaseClass{
    private ExtentTest test;
    @Test
    public void testUpdateProfile() throws InterruptedException {
        /*test = TestSuite.createTest("Prueba de Actualización de perfil", "Probar la Actualización de perfil");
        test.log(Status.INFO, "Comenzando caso de prueba de Actualización de perfil");*/

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.Button")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Abrir navegador\"]")).click();
        driver.findElement(By.id("cl.yapo:id/user_section_login_button")).click();
        driver.findElement(By.id("cl.yapo:id/email")).sendKeys("rsol777ddd@gmail.com");
        driver.findElement(By.id("cl.yapo:id/password")).sendKeys("asdSSRR545");
        driver.findElement(By.id("cl.yapo:id/submit_button")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Abrir navegador\"]")).click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/" +
                "android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/" +
                "android.widget.RelativeLayout[4]/android.widget.TextView")).click();
        driver.findElement(By.id("cl.yapo:id/edit")).click();
        driver.findElement(By.id("cl.yapo:id/user_name_field")).clear();
        driver.findElement(By.id("cl.yapo:id/user_name_field")).sendKeys("Raul Sol Rojo Verde");
        driver.findElement(By.id("cl.yapo:id/phone_field")).clear();
        driver.findElement(By.id("cl.yapo:id/phone_field")).sendKeys("988888888");

        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(100000)"));

        driver.findElement(By.id("cl.yapo:id/update_account_button")).click();
        Thread.sleep(5000);

        WebElement message = driver.findElement(By.id("cl.yapo:id/user_name_field"));
        String value = message.getText();
        /*if (value.equals("Raul Sol Rojo Verde")) {
            test.log(Status.PASS, "Actualización exitosa");
        } else {
            test.log(Status.FAIL, "La Actualización ha fallado");
        }*/
        assertEquals("Raul Sol Rojo Verde", value);

        WebElement message2 = driver.findElement(By.id("cl.yapo:id/phone_field"));
        String value2 = message2.getText();
        /*if (value2.equals("988888888")) {
            test.log(Status.PASS, "Actualización exitosa");
        } else {
            test.log(Status.FAIL, "La Actualización ha fallado");

        }*/
        assertEquals("988888888", value2);
    }
}