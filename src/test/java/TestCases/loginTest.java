package TestCases;

import Pages.AddCustomer;
import Pages.AddFlight;
import Pages.DashBoard;
import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class loginTest {

    WebDriver driver;

    @BeforeTest
    public void setup(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


       // driver.get("https://www.google.com/");
    }


    @Test(priority = 0)
    @Description("Test Login with valid email and password")
    public void testLogin() throws InterruptedException {

        LoginPage loginpage = new LoginPage(driver);

        driver.get("https://phptravels.net/admin/login.php");
        Thread.sleep(5000);

        loginpage.login("admin@phptravels.com","demoadmin");
        Thread.sleep(5000);


    }

    @Test(priority = 1)
    @Description("Test Add Customer")
    public void addCustomer() throws InterruptedException {

        AddCustomer add_Customer = new AddCustomer(driver);

        add_Customer.addCustomer("Enabled","Hello", "World","hello@gmail.com","12345","1234567890","USD");
        Thread.sleep(3000);
    }

    @Test(priority = 2)
    @Description("Test Add Flight")
    public void addFlight() throws InterruptedException {

        AddFlight add_Flight = new AddFlight(driver);

        add_Flight.addFlight("Enabled","supplier@phptravels.com","12 North","04G","06N","100", "50","10","5","10:20:30", "05:20:30","3","1","business", "Enabled");
        Thread.sleep(3000);
    }





    @Test(priority = 3)
    @Description("Test LogOut")
    public void testLogOut() throws InterruptedException {

        DashBoard dashBoard = new DashBoard(driver);

        dashBoard.logoutAction();
        Thread.sleep(2000);

    }

    @AfterTest
    public void afterTest(){
        driver.close();
    }


}
