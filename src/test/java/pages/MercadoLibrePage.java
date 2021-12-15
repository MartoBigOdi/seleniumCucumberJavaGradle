package pages;

public class MercadoLibrePage extends BasePage{

    String SEARCH_BUTTON = "//header/div[1]/form[1]/button[1]";
    String INPUT_SEARCH_CRITERIA = "/html[1]/body[1]/header[1]/div[1]/form[1]/input[1]";
    String FIRST_RESULT = "//h2[contains(text(),'Bateria Rc30-0270 Rz09-0270 Para Razer Hazel Blade')]";

    public MercadoLibrePage() {
        super(driver);
    }

    public void navigateToMercadoLibre(){
        navigateTo("https://www.mercadolibre.com.ar/");
    }

    public void clickMercadoSearch(){
        clickElement(SEARCH_BUTTON);
    }

    public void enterSearchCriteria(String criteria){
        write(INPUT_SEARCH_CRITERIA, criteria);
    }

    public String firstResult(){
        return textFromElement(FIRST_RESULT);
    }

}
