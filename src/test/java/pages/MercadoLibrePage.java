package pages;

public class MercadoLibrePage extends BasePage{

    public MercadoLibrePage() {
        super(driver);
    }

    public void navigateToMercadoLibre(){
        navigateTo("https://www.mercadolibre.com.ar/");
    }

    public void clickMercadoSearch(){
        String SEARCH_BUTTON = "//header/div[1]/form[1]/button[1]";
        clickElement(SEARCH_BUTTON);
    }

    public void enterSearchCriteria(String criteria){
        String INPUT_SEARCH_CRITERIA = "/html[1]/body[1]/header[1]/div[1]/form[1]/input[1]";
        write(INPUT_SEARCH_CRITERIA, criteria);
    }
}
