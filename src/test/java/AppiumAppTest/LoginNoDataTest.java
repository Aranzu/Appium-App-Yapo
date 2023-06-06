package AppiumAppTest;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginNoDataTest extends BaseClass{
    private ExtentTest test;

    @Test
    public void testNoDataLogin() throws InterruptedException {
        test = TestSuite.createTest("Prueba Login Válido datos faltantes", "Probar el login sin credenciales");
        test.log(Status.INFO, "Comenzando caso de prueba de login invalido sin datos");

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.Button")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Abrir navegador\"]")).click();
        driver.findElement(By.id("cl.yapo:id/user_section_login_button")).click();
        driver.findElement(By.id("cl.yapo:id/submit_button")).click();
        driver.findElement(By.id("cl.yapo:id/email")).click();
        Thread.sleep(5000);

        WebElement message = driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Ingresar\"]/android.widget.TextView"));
        String value = message.getText();
        if (value.equals("INGRESAR")) {
            test.log(Status.PASS, "Se detuvo correctamente el inicio de sesión");
        } else {
            test.log(Status.FAIL, "Algo fallo en la validación");
        }
        assertEquals("INGRESAR", value);
    }
}