package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

    //@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/div/div[2]/div/div[1]/div/table/tbody/tr[1]/td[1]/table/tbody/tr/td[4]/a/div")
    public WebElement btnEngagement=null;

    public WelcomePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        
      List<WebElement> lst_btnEngagement =  driver.findElements(By.className("viewDocumentExternalValues"));
      
      if(lst_btnEngagement.size() > 0)
    	  btnEngagement= lst_btnEngagement.get(0);
        

    }

    public void goToEngagement(WebDriver driver) throws InterruptedException {
        Thread.sleep(2000);
        
        List<WebElement> lst_btnEngagement =  driver.findElements(By.className("viewDocumentExternalValues"));
        
      	btnEngagement= lst_btnEngagement.size() > 0 ? lst_btnEngagement.get(0) : null;
        
        if(btnEngagement != null)
        btnEngagement.click();
    }



}
