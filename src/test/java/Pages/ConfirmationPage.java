package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage {

    @FindBy(how = How.ID, using = "btnvalid")
    public WebElement btnConfirmation;

    @FindBy(how = How.LINK_TEXT, using="Se déconnecter")
    public WebElement btnLogout;


    public ConfirmationPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void confirm(){
        btnConfirmation.click();
    }

    public void logout(){
        btnLogout.click();
    }
}
