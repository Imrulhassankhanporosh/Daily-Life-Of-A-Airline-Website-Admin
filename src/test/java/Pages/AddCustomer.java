package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddCustomer extends BasePage{


    @FindBy(xpath = "/html/body/main/header/ul/li[5]/button")
    WebElement users_option_from_menu;

    @FindBy(xpath = "//*[@id=\"users-collapse\"]/ul/li[5]/a")
    WebElement customer_option_from_menu;

    @FindBy(xpath = "/html/body/main/section/div[2]/div/div/div[1]/div[1]/a")
    WebElement add_customer_btn;

    @FindBy(xpath = "/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div/span/span[1]/span/span[2]/b")
    WebElement status_dropdown;

    @FindBy(xpath = "/html/body/span/span/span[1]/input")
    WebElement enable_field;

    @FindBy(xpath = "/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[2]/td[2]/input")
    WebElement fName;

    @FindBy(xpath = "/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[3]/td[2]/input")
    WebElement lName;

    @FindBy(xpath = "/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[4]/td[2]/input")
    WebElement email;

    @FindBy(xpath = "/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[5]/td[2]/input")
    WebElement password;

    @FindBy(xpath = "/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[6]/td[2]/input")
    WebElement phone;

    @FindBy(xpath = "/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[7]/td[2]/span/span[1]/span")
    WebElement userType;

    @FindBy(xpath = "//*[@id=\"select2-dXNlcnMudXNlcl90eXBl-ih-result-bn77-Customer\"]")
    WebElement customer_option;

    @FindBy(xpath = "/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[8]/td[2]/span/span[1]/span/span[2]/b")
    WebElement currency_dropdown;

    @FindBy(xpath = "/html/body/span/span/span[1]/input")
    WebElement usd_field;

    @FindBy(xpath = "/html/body/main/section/div[2]/div/div/div[1]/div[1]/a[1]")
    WebElement save_btn;



    public AddCustomer(WebDriver driver) {
        super(driver);
    }

    public void addCustomer(String status,String firstName,String lastName,String emailAddress, String userPassword, String phoneNumber, String currency) throws InterruptedException {

        System.out.println("Let's Add a customer now!!!!");

        users_option_from_menu.click();
        Thread.sleep(2000);

        customer_option_from_menu.click();
        Thread.sleep(2000);

        add_customer_btn.click();
        Thread.sleep(5000);

        status_dropdown.click();
        Thread.sleep(4000);
        enable_field.sendKeys(status);
        Thread.sleep(4000);
        enable_field.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        fName.sendKeys(firstName);
        Thread.sleep(2000);

        lName.sendKeys(lastName);
        Thread.sleep(2000);


        email.sendKeys(emailAddress);
        Thread.sleep(2000);


        password.sendKeys(userPassword);
        Thread.sleep(2000);

        phone.sendKeys(phoneNumber);
        Thread.sleep(2000);

        userType.click();
        Thread.sleep(4000);

        userType.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        userType.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        userType.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);

        userType.sendKeys(Keys.ENTER);
        Thread.sleep(2000);


        currency_dropdown.click();
        Thread.sleep(4000);

        usd_field.sendKeys(currency);
        Thread.sleep(4000);
        usd_field.sendKeys(Keys.ENTER);
        Thread.sleep(2000);


        save_btn.click();
        Thread.sleep(2000);

        saveScreenshot("After Adding a new Customer",driver);

    }
}
