package Steps;

import Pages.*;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class Alexandrie {
    WebDriver driver;

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() {
        //for windows
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        // for linux
        //System.setProperty("webdriver.chrome.driver", "chromedriver");
        
        Map<String, Object> prefs = new HashMap<String, Object>();
        
        //To Turns off multiple download warning
        prefs.put("profile.default_content_setting_values.automatic_downloads", 1);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);

        driver =  new ChromeDriver(options);

        driver.manage().window().maximize();

        driver.navigate().to("https://aezan.genedoc.fr/Login");

    }


    @And("I click login button")
    public void iClickLoginButton() {
        // System.out.println("Click login button");

        LoginPage page = new LoginPage(driver);

        page.ClickLogin();
    }

    @Then("I should see the welcome page")
    public void iShouldSeeTheUserformPage() {
        System.out.println("I should see userform");
        //Assert.assertEquals("its not displayed",driver.findElement(By.className("container body-content")).isDisplayed(),true );


        //driver.findElement(By.name("generate")).click() ;


    }

    @And("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEnterUsernameAndPassword(String username, String password) throws InterruptedException {
        LoginPage page = new LoginPage(driver);
        page.Login(username, password);
        Thread.sleep(2000);
    }

    @Then("I close the browser")
    public void iCloseTheBrowser() throws InterruptedException {
        driver.quit();
        driver = null;
    }



    @Then("I logout")
    public void iLogout() throws InterruptedException {
        ConfirmationPage page = new ConfirmationPage(driver);
        page.logout();
        Thread.sleep(2000);

    }

    @Then("I navigate to the engagement page")
    public void iNavigateToTheEngagementPage() throws InterruptedException 
    {
        WelcomePage page = new WelcomePage(driver);
        page.goToEngagement(driver);
        Thread.sleep(2000);


    }

    @Then("I enter the engagement code : {string}")
    public void iEnterTheEngagementCode(String code) throws InterruptedException {
        EngagementsPage page = new EngagementsPage(driver);
        page.insertEngagementCode(code);
        Thread.sleep(2000);

    }

    @Then("I enter the engagement code2 : {string}")
    public void iEnterTheEngagementCode2(String code) throws InterruptedException {
        EngagementsPage page = new EngagementsPage(driver);
        page.insertEngagementCode(code);
        Thread.sleep(2000);

    }

    @Then("I select the engagement")
    public void iSelectTheEngagement() throws InterruptedException {
        EngagementsPage page = new EngagementsPage(driver);
        page.selectEngagement(driver);
        Thread.sleep(2000);
    }

    @Then("I validate the engagement")
    public void iValidateTheEngagement() throws InterruptedException {
        ConfirmationPage page = new ConfirmationPage(driver);
        page.confirm();
        Thread.sleep((2000));



    }

    @Then("I verify the existance of Catherine PORTA")
    public void iVerifyTheExistanceOfCatherinePORTA() {
       boolean myvalue= driver.findElement(By.id("_Signataire1KPMG")).getAttribute("value").equals("Catherine Porta");
        Assert.assertEquals(myvalue,true,"its not displayed" );


    }

    @Then("I verify that the pdf was successfully downloaded")
    public void iVerifyThatThePdfWasSuccessfullyDownloaded() throws InterruptedException {
        DownloadsPage page= new DownloadsPage(driver);
        page.verifyDownloadWithFileExtension(".pdf");

    }

    @Then("I verify the contenu of the pdf")
    public void iVerifyTheContenuOfThePdf() {
        String cont1="Ngk Spark Plugs (France)";
        String cont6="aumur CS 50009 92354 LE PLESSIS ROBINSON CEDEX";
        String cont2="9 avenue R" ;
        String cont7="Renaud Laggiard";
        String cont3="KPMG AUDIT IS";
        String cont4="Paris La D";
        //String cont5="Eric JACQUET";
        PDFPage page= new PDFPage(driver);
        page.afficherPDF();
        boolean b1= page.verifyPDFContenu(cont1);
        Assert.assertTrue(b1, "Can not found : \n" +cont1);
        boolean b6= page.verifyPDFContenu(cont1);
        Assert.assertTrue(b6, "Can not found : \n" +cont6);

        //boolean b2= page.verifyPDFContenu(cont2);
        //Assert.assertTrue(b2, "Can not found : \n" +cont2);
        boolean b7= page.verifyPDFContenu(cont1);
        Assert.assertTrue(b7, "Can not found : \n" +cont7);

        boolean b3= page.verifyPDFContenu(cont3);
        Assert.assertTrue(b3, "Can not found : \n" +cont3);
        boolean b4= page.verifyPDFContenu(cont4);
        Assert.assertTrue(b4, "Can not found : \n" +cont4);
        //boolean b5= page.verifyPDFContenu(cont3);
        //Assert.assertTrue(b5, "Can not found : \n" +cont5);

    }

    @Then("I verify the contenu of the pdf {string} ,{string},{string},{string},{string},{string},{string},{string}")
    public void iVerifyTheContenuOfThePdf(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8) {

        PDFPage page= new PDFPage(driver);
        page.afficherPDF();
        boolean b1= page.verifyPDFContenu(arg1);
        Assert.assertTrue(b1, "Can not found : \n" +arg1);
        boolean b6= page.verifyPDFContenu(arg2);
        Assert.assertTrue(b6, "Can not found : \n" +arg2);

        //boolean b2= page.verifyPDFContenu(cont2);
        //Assert.assertTrue(b2, "Can not found : \n" +cont2);
        boolean b7= page.verifyPDFContenu(arg4);
        Assert.assertTrue(b7, "Can not found : \n" +arg4);

        boolean b3= page.verifyPDFContenu(arg5);
        Assert.assertTrue(b3, "Can not found : \n" +arg5);
        boolean b4= page.verifyPDFContenu(arg6);
        Assert.assertTrue(b4, "Can not found : \n" +arg6);
        //boolean b5= page.verifyPDFContenu(cont3);
        //Assert.assertTrue(b5, "Can not found : \n" +cont5);

        boolean b8= page.verifyPDFContenu(arg7);
        Assert.assertTrue(b8, "Can not found : \n" +arg7);

        boolean b9= page.verifyPDFContenu(arg8);
        Assert.assertTrue(b3, "Can not found : \n" +arg8);
    }
}
