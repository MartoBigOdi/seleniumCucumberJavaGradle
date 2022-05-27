package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BasePage {

     //Vamos a tener una instancia del objeto para compartir en todas las clases.

     protected static WebDriver driver;
     private static WebDriverWait wait;
     private static Actions action;

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
          //Aca utilizamos una espera explicita porque le dijimos que espere 10 segundos pero la volvimos
          //implicita ya que utilizamos la misma en el framework.
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

     public void hoverOverElement(String locator){
          //Estamos haciendo un hover over sobre un elemento
          action.moveToElement(Find(locator));
     }

     public void doubleClick(String locator){
          //Estamos haciendo un doble click a un elemento
          action.doubleClick(Find(locator));
     }

     public void rightClick(String locator){
          //Click derecho sobre un elemento
          action.contextClick(Find(locator));
     }

     //Devolvemos el texto de un webElement
     public String textFromElement(String locator){
          return Find(locator).getText();
     }

    public static void closeBrowser() {
           driver.quit();
    }

}
