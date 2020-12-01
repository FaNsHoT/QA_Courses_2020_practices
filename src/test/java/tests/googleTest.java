package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.SearchPage;
import pages.calcButtons;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class googleTest {

    private static  WebDriver driver;
    private static SearchPage searchPage;
    private static calcButtons clickButtons ;


    @BeforeAll
    public static void init() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        searchPage = new SearchPage(driver);
        clickButtons = new calcButtons(driver);
    }

    @BeforeEach
    public void setup() {
        driver.get("http://google.com");
    }

    @Test
    @DisplayName("Практическое задание №1")
    public void test1() {

        searchPage.search("калькулятор");

        clickButtons.OpenBr();
        clickButtons.ClickOne();
        clickButtons.ClickSum();
        clickButtons.ClickTwo();
        clickButtons.CloseBr();
        clickButtons.ClickMul();
        clickButtons.ClickThree();
        clickButtons.ClickSub();
        clickButtons.ClickFour();
        clickButtons.ClickZero();
        clickButtons.ClickDiv();
        clickButtons.ClickFive();
        clickButtons.ClickResult();

        assertEquals("1",driver.findElement(By.cssSelector("span[jsname='VssY5c']")).getText());
    }

    @Test
    @DisplayName("Практическое задание №2")
    public void test2() {
        searchPage.search("калькулятор");
        clickButtons.ClickSix();
        clickButtons.ClickDiv();
        clickButtons.ClickZero();
        clickButtons.ClickResult();
        assertEquals("Infinity",driver.findElement(By.cssSelector("span[jsname='VssY5c']")).getText());
    }

    @Test
    @DisplayName("Практическое задание №2")
    public void test3() {
        searchPage.search("калькулятор");
//сюда кнопку синуса
        clickButtons.ClickResult();
        assertEquals("Error",driver.findElement(By.cssSelector("span[jsname='VssY5c']")).getText());
    }

    /*
    @AfterAll
    public  static void teardown() {
        driver.quit();
    }

     */
}
