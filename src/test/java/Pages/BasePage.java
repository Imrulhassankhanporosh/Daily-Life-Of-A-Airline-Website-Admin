package Pages;

import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.ByteArrayInputStream;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public static void saveScreenshot(String name, WebDriver driver) {
        byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        Allure.addAttachment(name, new ByteArrayInputStream(screenshot));
    }

}
