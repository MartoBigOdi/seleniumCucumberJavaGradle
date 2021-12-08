package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {

     //Vamos a tener una instancia del objeto para compartir en todas las clases.

     protected static WebDriver driver;
     private static WebDriverWait wait;

     //Bloque estatico para nuestra instancia compartida
     static {
          System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");

          ChromeOptions chromeOptions = new ChromeOptions();
          //Le pasamos las options
          driver = new ChromeDriver(chromeOptions);
          //Le pasamos el driver y el tiempo de la espera.
          wait = new WebDriverWait(driver, 10);
     }

     public BasePage(WebDriver driver){
          BasePage.driver = driver;
          wait = new WebDriverWait(driver, 10);
     }

     public static void navigateTo(String url){
          driver.get(url);
     }

     private WebElement Find(String locator){
          //Nos devuelve un Web Element pero espera que aparezca. Lo buscamos con "By.xpath()"
          return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
     };

     public void clickElement(String locator){
          //Hacemos Click en el elemento que encontramos con el metodo "Find()"
          Find(locator).click();
     }

     public void write(String locator, String textToWrite){
          WebElement webElement = Find(locator);
          webElement.clear(); //Esto va a limpiar el campo de texto
          webElement.sendKeys(textToWrite); //Le enviamos el texto
     }

     public void selectFromDropdownText(String locator, String valueToSelect){
          //Instanciamos el "Select"
          Select dropdown = new Select(Find(locator));
          dropdown.selectByVisibleText(valueToSelect);
     }



}
