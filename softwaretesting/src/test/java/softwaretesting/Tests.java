package softwaretesting;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tests {
    public static final String URL = "http://software-testing.ru";

    @Test
    public void openSite() {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:/Users/lk/selenium_repository_LK/drivers/chromedriver_win32_2.28/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(URL);
        driver.close();
    }
}
