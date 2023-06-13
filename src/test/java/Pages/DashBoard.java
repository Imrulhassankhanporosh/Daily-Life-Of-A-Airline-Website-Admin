package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoard extends BasePage {

    @FindBy(xpath = "//*[@id=\"dropdownUser1\"]")
    WebElement icon_btn;

    @FindBy(xpath = "/html/body/main/header/div[2]/ul/li[6]/a")
    WebElement logout_btn;

    public DashBoard(WebDriver driver) {
        super(driver);
    }

    public void logoutAction() throws InterruptedException {

        System.out.println("Let's log off now!!!!");

        icon_btn.click();
        Thread.sleep(5000);
        logout_btn.click();
        Thread.sleep(3000);

        saveScreenshot("After logging out",driver);


    }
}
