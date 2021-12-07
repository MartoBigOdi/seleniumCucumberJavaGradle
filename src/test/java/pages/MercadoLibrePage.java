package pages;

public class MercadoLibrePage extends BasePage{

    private String searchButton = "//header/div[1]/form[1]/button[1]";
    private String inputSearchCriteria = "/html[1]/body[1]/header[1]/div[1]/form[1]/input[1]";

    public MercadoLibrePage() {
        super(driver);
    }

    public void navigateToMercadoLibre(){
        navigateTo("https://www.mercadolibre.com.ar/");
    }

    public void clickMercadoSearch(){
        clickElement(searchButton);
    }

    public void enterSearchCriteria(String criteria){
        write(inputSearchCriteria, criteria);
    }
}
