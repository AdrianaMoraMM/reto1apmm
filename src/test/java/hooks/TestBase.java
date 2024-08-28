package hooks;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public abstract class TestBase   {

    protected WebDriver driver;
    private String url = "https://www.demoblaze.com";

    @BeforeEach
    public void configWebDriver(){


        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

        driver.get(url);

    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }
    
}