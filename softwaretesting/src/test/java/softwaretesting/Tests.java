package softwaretesting;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tests {
    public static final String URL = "http://software-testing.ru";
    public static WebDriver driver = null;

    @Before
    public void settings() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/lk/selenium_repository_LK/drivers/chromedriver_win32_2.28/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void closeBrowser() {
        driver.close();
        driver.quit();
    }

    @Test
    public void openSite() {
        driver.get(URL);
    }

    @Test
    public void loginLitecart() {
        driver.get("http://localhost/litecart/admin/login.php");
        driver.findElement(By.xpath(".//*[@id='box-login']/form/div[1]/table/tbody/tr[1]/td[2]/span/input")).sendKeys("admin");
        driver.findElement(By.xpath(".//*[@id='box-login']/form/div[1]/table/tbody/tr[2]/td[2]/span/input")).sendKeys("admin");
        driver.findElement(By.xpath(".//*[@id='box-login']/form/div[2]/button")).click();
        driver.findElement(By.xpath(".//*[@id='sidebar']/div[3]/ul/li[4]")).click();
        driver.findElement(By.xpath(".//*[@id='content']/form/p/span/button[1]")).click();
        driver.findElement(By.xpath(".//*[@id='sidebar']/div[2]/a[5]/i")).click();
    }
}


