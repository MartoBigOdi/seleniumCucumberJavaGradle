package pages;

//Clase que sirve para trabajar con dropdowns

public class TestSandbox extends BasePage{

    private String categoryDropdown = "//body/div[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]";

    public TestSandbox() {
        super(driver);
    }

    public void navigateToSandbox(){
        navigateTo("http://opencart.abstracta.us/index.php?route=common/home");
    }

    public void selectComponent(String component){
        selectFromDropdownText(categoryDropdown, component);
    }
}
