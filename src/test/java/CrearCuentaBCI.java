import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrearCuentaBCI {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.bci.cl/personas");
        driver.manage().window().maximize();

        WebElement btnHazteCliente;
        By byHazteCliente = By.xpath("//*[@id=\"header\"]/nav[2]/div[2]/ul/li[1]/a");
        btnHazteCliente = driver.findElement(byHazteCliente);
        btnHazteCliente.click();
        Thread.sleep(2000);

        //espere 5 segundos
        Thread.sleep(10000);

        //switch To IFrame using Web Element
        WebElement iframe = driver.findElement(By.id("myFrame"));
        //Switch to the frame
        driver.switchTo().frame(iframe);

        //formulario
        WebElement txtRut;
        By bytxtRut = By.xpath("/html/body/app-root/div/div/div/app-datos-basicos/form/div/bci-wk-input-text[1]/input");
        txtRut = driver.findElement(bytxtRut);
        txtRut.click();
        txtRut.sendKeys("111111111");

        Thread.sleep(5000);

        WebElement txtDocumento;
        By bytxtDocumento = By.xpath("/html/body/app-root/div/div/div/app-datos-basicos/form/div/bci-wk-input-text[2]/input");
        txtDocumento = driver.findElement(bytxtDocumento);
        txtDocumento.sendKeys("111111111");

        Thread.sleep(5000);

        WebElement txtNumero;
        By bytxtNumero = By.xpath("/html/body/app-root/div/div/div/app-datos-basicos/form/div/bci-wk-input-phone/input");
        txtNumero = driver.findElement(bytxtNumero);
        txtNumero.sendKeys("88929494");
        Thread.sleep(5000);

        WebElement txtEmail;
        By bytxtEmail = By.xpath("/html/body/app-root/div/div/div/app-datos-basicos/form/div/div[1]/validador-correo/form/div[1]/input");
        txtEmail = driver.findElement(bytxtEmail);
        txtEmail.sendKeys("asdq@gmail.com");

        WebElement txtEmail2;
        By bytxtEmail2 = By.xpath("/html/body/app-root/div/div/div/app-datos-basicos/form/div/div[1]/validador-correo/form/div[2]/input");
        txtEmail2 = driver.findElement(bytxtEmail2);
        txtEmail2.sendKeys("asdq@gmail.com");

        WebElement chkTerminosyCondiciones;
        By bychkTerminosyCondiciones = By.xpath("//bci-wk-checkbox[@formcontrolname='checkPoliticas']/input");
        chkTerminosyCondiciones = driver.findElement(bychkTerminosyCondiciones);
        chkTerminosyCondiciones.click();

        WebElement btnContinuar;
        By bybtnContinuar = By.xpath("/html/body/app-root/div/div/div/app-datos-basicos/form/div/div[3]/button");
        btnContinuar = driver.findElement(bybtnContinuar);
        btnContinuar.click();







}

}
