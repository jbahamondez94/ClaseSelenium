import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class EjemploWebElements {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://open.spotify.com/intl-es");
        driver.manage().window().maximize();

        //espere 5 segundos
        Thread.sleep(5000);

        // se elimina mensaje de cookies
        WebElement btnCerrarPopup;
        By byBtnCerrarPopup = By.xpath("//button[@aria-label=\"Cerrar\"] ");
        btnCerrarPopup = driver.findElement(byBtnCerrarPopup);
        btnCerrarPopup.click();
        if (btnCerrarPopup.isDisplayed()) {
            btnCerrarPopup.click();
        }

        //clic al boton registrarse
        WebElement btnRegistrarse;
        By byBtnIniciarSesion = By.xpath("//button[@data-testid=\"signup-button\"]");

        btnRegistrarse = driver.findElement(byBtnIniciarSesion);
        btnRegistrarse.click();

        Thread.sleep(5000);

        //ingreso correo electronico
        driver.findElement(By.id("username")).sendKeys("cualquiercosa@algo.cl");

        Thread.sleep(2000);


        //clic en boton siguiente
        WebElement btnSiguiente1;
        By byBtnSiguiente1 = By.xpath("//button[@data-testid=\"submit\"]");
        btnSiguiente1 = driver.findElement(byBtnSiguiente1);
        btnSiguiente1.click();

        Thread.sleep(2000);

        // paso 1 de 3
        // crear contraseña
        WebElement TxtContrasena;
        By byTxtContrasena = By.id("new-password");
        TxtContrasena = driver.findElement(byTxtContrasena);
        TxtContrasena.sendKeys("Esteban123.2");


        Thread.sleep(2000);

        // clic en botón siguiente
        WebElement btnSiguiente2;
        By byBtnSiguiente2 = By.xpath("//button[@data-testid=\"submit\"]");
        btnSiguiente2 = driver.findElement(byBtnSiguiente2);
        btnSiguiente2.click();
        Thread.sleep(2000);

        // creacion nombre
        WebElement txtNombreUsuario;
        By bytxtNombreUsuario = By.id("displayName");
        txtNombreUsuario = driver.findElement(bytxtNombreUsuario);
        txtNombreUsuario.click();
        txtNombreUsuario.sendKeys("Armando");

        Thread.sleep(2000);

        // fechanacimiento
        //dia
        WebElement txtDiaNacimiento;
        By bytxtDiaNacimiento= By.id("day");
        txtDiaNacimiento = driver.findElement(bytxtDiaNacimiento);
        txtDiaNacimiento.click();
        txtDiaNacimiento.sendKeys("2");

        //mes
        WebElement cmboMes,MesJunio,txtAnio;
        By bycmboMes = By.id("month");
        cmboMes = driver.findElement(bycmboMes);
        cmboMes.click();
        Thread.sleep(2000);
        By byMesJunio = By.xpath("/html/body/div[1]/main/main/section/div/form/div[1]/div[2]/div/section/div[3]/div[2]/div[2]/div/div/select/option[7]");
        MesJunio = driver.findElement(byMesJunio);
        MesJunio.click();
        MesJunio.click();
        By bytxtAnio = By.id("year");
        txtAnio = driver.findElement(bytxtAnio);
        txtAnio.click();
        txtAnio.sendKeys("1992");

        //checkbox genero
        WebElement chkGenero;
        By bychkGenero = By.xpath("/html/body/div[1]/main/main/section/div/form/div[1]/div[2]/div/section/div[3]/fieldset/div/div/div[5]/label/span[2]");
        chkGenero = driver.findElement(bychkGenero);
        chkGenero.click();

        Thread.sleep(2000);
        btnSiguiente2.click();

        //paso 3
        Thread.sleep(2000);
        btnSiguiente2.click();




    }
}