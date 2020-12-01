package tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.SearchPage;

public class googleTest {

    private static  WebDriver driver;
    private static SearchPage searchPage;



    @BeforeAll
    public static void init() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        searchPage = new SearchPage(driver);
    }

    @BeforeEach
    public void setup() {
        driver.get("http://google.com");
    }

    @Test
    @DisplayName("Открытие страницы с калькулятором")
    public void test1() {
        searchPage.search("калькулятор");
      //  assertEquals(9, searchPage.results.size());
    }


    @AfterAll
    public  static void teardown() {
        driver.quit();
    }
}
