package pages;

public class LinkedingPage extends BasePage{

        String FIRST_RESULT = "/html/body/main/section[1]/div/section/section[1]/div/div[2]/div/h3/span[1]";
        String CLOSE_MODAL = "/html/body/div[2]/div/div/section/button";


        public LinkedingPage() {
            super(driver);
        }

        public void navigateToLinkeding(){
            navigateTo("https://www.linkedin.com/in/marto-vasconcelo-1910014b/");
        }


        public void clickCloseModal(){
            clickElement(CLOSE_MODAL);
        }


        public String firstResult(){
            return textFromElement(FIRST_RESULT);
        }

}
