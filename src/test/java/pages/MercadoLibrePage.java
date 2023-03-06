package pages;

public class MercadoLibrePage extends BasePage{

    String SEARCH_BUTTON = "/html[1]/body[1]/header[1]/div[1]/div[2]/form[1]/button[1]";
    String INPUT_SEARCH_CRITERIA = "/html[1]/body[1]/header[1]/div[1]/div[2]/form[1]/input[1]";
    String FIRST_RESULT = "//h2[contains(text(),'Laptop Razer Blade 15 Base Model')]";

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
