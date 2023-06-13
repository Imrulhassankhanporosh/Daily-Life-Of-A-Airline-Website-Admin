package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddFlight extends BasePage {

    @FindBy(xpath = "/html/body/main/header/ul/li[10]/button")
    WebElement flights_option_from_menu;

    @FindBy(xpath = "//*[@id=\"flights-collapse\"]/ul/li[1]/a")
    WebElement flights_option;

    @FindBy(xpath = "/html/body/main/section/div[2]/div/div/div[1]/div[1]/a")
    WebElement add_flight_btn;

    @FindBy(xpath = "/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[2]/div/span/span[1]/span/span[2]/b")
    WebElement status_dropdown;

    @FindBy(xpath = "/html/body/span/span/span[1]/input")
    WebElement enabled_field;

    @FindBy(xpath = "/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[2]/td[2]/span/span[1]/span/span[2]/b")
    WebElement userId_dropdown;

    @FindBy(xpath = "/html/body/span/span/span[1]/input")
    WebElement userId_field;

    @FindBy(xpath = "/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[3]/td[2]/span/span[1]/span/span[2]/b")
    WebElement airline_dropdown;

    @FindBy(xpath = "/html/body/span/span/span[1]/input")
    WebElement airline_field;

    @FindBy(xpath = "/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[4]/td[2]/span/span[1]/span/span[2]/b")
    WebElement From_Airport_dropdown;

    @FindBy(xpath = "/html/body/span/span/span[1]/input")
    WebElement From_Airport_field;

    @FindBy(xpath = "/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[5]/td[2]/span/span[1]/span/span[2]/b")
    WebElement To_Airport_dropdown;

    @FindBy(xpath = "/html/body/span/span/span[1]/input")
    WebElement To_Airport_field;

    @FindBy(xpath = "/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[6]/td[2]/input")
    WebElement Adult_price;

    @FindBy(xpath = "/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[7]/td[2]/input")
    WebElement Child_price;

    @FindBy(xpath = "/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[8]/td[2]/input")
    WebElement Infant_price;

    @FindBy(xpath = "/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[9]/td[2]/input")
    WebElement Duration;

    @FindBy(xpath = "//input[@class='xcrud-input xcrud-datepicker form-control hasDatepicker']")
    WebElement departure_time;

    @FindBy(xpath = "//*[@id=\"dp1686670051843\"]")
    WebElement arrival_time;

    @FindBy(xpath = "/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[12]/td[2]/input")
    WebElement Baggage;

    @FindBy(xpath = "/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[13]/td[2]/input")
    WebElement cabin_baggage;

    @FindBy(xpath = "/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[14]/td[2]/span/span[1]/span/span[2]/b")
    WebElement type_dropdown;

    @FindBy(xpath = "/html/body/span/span/span[1]/input")
    WebElement type_field;

    @FindBy(xpath = "/html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[15]/td[2]/div/span/span[1]/span/span[2]/b")
    WebElement refundable_dropdown;

    @FindBy(xpath = "/html/body/span/span/span[1]/input")
    WebElement refundable_field;

    @FindBy(xpath = "/html/body/main/section/div[2]/div/div/div[1]/div[1]/a[1]")
    WebElement save_btn;

    public AddFlight(WebDriver driver) {
        super(driver);
    }

    public void addFlight(String status, String userId, String airline, String f_airport, String t_airport,String a_price, String c_price, String i_price,String duration,String d_time, String a_time, String baggage,String c_baggage, String type,String refundable ) throws InterruptedException {

        flights_option_from_menu.click();
        Thread.sleep(2000);

        flights_option.click();
        Thread.sleep(2000);

        add_flight_btn.click();
        Thread.sleep(5000);

        status_dropdown.click();
        Thread.sleep(2000);

        enabled_field.sendKeys(status);
        Thread.sleep(2000);
        enabled_field.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        userId_dropdown.click();
        Thread.sleep(2000);

        userId_field.sendKeys(userId);
        Thread.sleep(2000);
        userId_field.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        airline_dropdown.click();
        Thread.sleep(2000);

        airline_field.sendKeys(airline);
        Thread.sleep(2000);
        airline_field.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        From_Airport_dropdown.click();
        Thread.sleep(2000);

        From_Airport_field.sendKeys(f_airport);
        Thread.sleep(2000);
        From_Airport_field.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        To_Airport_dropdown.click();
        Thread.sleep(2000);

        To_Airport_field.sendKeys(t_airport);
        Thread.sleep(2000);
        To_Airport_field.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        Adult_price.sendKeys(a_price);
        Thread.sleep(2000);

        Child_price.sendKeys(c_price);
        Thread.sleep(2000);

        Infant_price.sendKeys(i_price);
        Thread.sleep(2000);

        Duration.sendKeys(duration);
        Thread.sleep(2000);

        departure_time.click();
        Thread.sleep(1000);
        departure_time.sendKeys(d_time);
        Thread.sleep(2000);
        departure_time.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        arrival_time.click();
        Thread.sleep(1000);
        arrival_time.sendKeys(a_time);
        Thread.sleep(2000);
        arrival_time.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        Baggage.sendKeys(baggage);
        Thread.sleep(2000);

        cabin_baggage.sendKeys(c_baggage);
        Thread.sleep(2000);

        type_dropdown.click();
        Thread.sleep(2000);

        type_field.sendKeys(type);
        Thread.sleep(2000);
        type_field.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        refundable_dropdown.click();
        Thread.sleep(2000);

        refundable_field.sendKeys(refundable);
        Thread.sleep(2000);
        refundable_field.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        save_btn.click();
        Thread.sleep(2000);

        saveScreenshot("After Adding a new Flight",driver);





    }
}
