package tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.SearchPage;
import pages.calcButtons;

public class googleTest {

    private static  WebDriver driver;
    private static SearchPage searchPage;
    private calcButtons clickButtons;

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

    //Блок открыи страницы "калькулятор"
    @Test
    @DisplayName("Рпактическое задание №1")
    public void test1() {
        searchPage.search("калькулятор");
        searchPage.openBr();
        searchPage.clickOne();
        searchPage.clickSum();
        searchPage.clickTwo();
        searchPage.closeBr();
        searchPage.clickMul();
        searchPage.clickThree();
        searchPage.clickSub();
        searchPage.clickFour();
        searchPage.clickZero();
        searchPage.clickDiv();
        searchPage.clickFive();
        searchPage.clickResult();

    }

    @AfterAll
    public  static void teardown() {
        driver.quit();
    }
}
