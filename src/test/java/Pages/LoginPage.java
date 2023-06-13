package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    //@FindBy(xpath = "//input[@name='email']")
    @FindBy(id = "email")
    WebElement email;

    //@FindBy(xpath = "//input[@name='password']")
    @FindBy(id = "password")
    WebElement password;

    //@FindBy(xpath = "//*[@id=\"layoutAuthentication_content\"]/main/div/div/div/div[1]/div/form/div[4]/button/span[1]")
    @FindBy(id = "submit")
    WebElement login_btn;




    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String emailAddress, String userPassword) throws InterruptedException {

        System.out.println("Let's log in now!!!!");

        email.sendKeys(emailAddress);
        Thread.sleep(5000);
        password.sendKeys(userPassword);
        Thread.sleep(5000);
        login_btn.click();

        saveScreenshot("After Clicking login button",driver);

    }
}
