package AppiumAppTest;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginValidTest extends BaseClass{
    private ExtentTest test;

    @Test
    public void testLogin() throws InterruptedException {

        test = TestSuite.createTest("Prueba Login Válido", "Probar el login con credenciales válidas");
        test.log(Status.INFO, "Comenzando caso de prueba de login valido");

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.Button")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Abrir navegador\"]")).click();
        driver.findElement(By.id("cl.yapo:id/user_section_login_button")).click();
        driver.findElement(By.id("cl.yapo:id/email")).sendKeys("rsol777ddd@gmail.com");
        driver.findElement(By.id("cl.yapo:id/password")).sendKeys("asdSSRR545");
        driver.findElement(By.id("cl.yapo:id/submit_button")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Abrir navegador\"]")).click();
        Thread.sleep(5000);

        WebElement message = driver.findElement(By.id("cl.yapo:id/account_name"));
        String value = message.getText();
        if (value.equals("Raul Sol Rojo Verde")) {
            test.log(Status.PASS, "Se ha iniciado sesión correctamente");
        } else {
            test.log(Status.FAIL, "El inicio de sesión ha fallado");
        }
        assertEquals("Raul Sol Rojo Verde", value);
    }
}