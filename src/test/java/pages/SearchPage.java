package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPage {

    @FindBy(css = "input.gLFyf.gsfi")
    private WebElement searchInput;

    @FindBy(css = "#search .g")
    public List<WebElement> results;

    //кнопка "открытая круглая скобка"
    @FindBy(css = "div[jsname = 'j93WEe']")
    private WebElement openBracket;

    //кнопка "закрытая круглая скобка"
    @FindBy(css = "div[jsname = 'qCp9A']")
    private WebElement closeBracket;

    //кнопка "умножение"
    @FindBy(css = "div[jsname = 'YovRWb']")
    private WebElement multip;

    //кнопка "деление"
    @FindBy(css = "div[jsname = 'WxTTNd']")
    private WebElement division;

    //кнопка "сложение"
    @FindBy(css = "div[jsname = 'XSr6wc']")
    private WebElement sum;

    //кнопка "вычитание"
    @FindBy(css = "div[jsname = 'pPHzQc']")
    private WebElement substruction;

    //кнопка "равно"
    @FindBy(css = "div[jsname = 'Pt8tGc']")
    private WebElement result;

    //кнопка "цифра ноль"
    @FindBy(css = "div[jsname = 'bkEvMb']")
    private WebElement zero;

    //кнопка "цифра один"
    @FindBy(css = "div[jsname = 'N10B9']")
    private WebElement one;

    //кнопка "цифра два"
    @FindBy(css = "div[jsname = 'lVjWed']")
    private WebElement two;

    //кнопка "цифра три"
    @FindBy(css = "div[jsname = 'KN1kY']")
    private WebElement three;

    //кнопка "цифра четыре"
    @FindBy(css = "div[jsname = 'xAP7E']")
    private WebElement four;

    //кнопка "цифра пять"
    @FindBy(css = "div[jsname = 'Ax5wH']")
    private WebElement five;

    //кнопка "цифра шесть"
    @FindBy(css = "div[jsname = 'abcgof']")
    private WebElement six;

    //кнопка "семь"
    @FindBy(css = "div[jsname = 'rk7bOd']")
    private WebElement seven;

    //кнопка "восемь"
    @FindBy(css = "div[jsname = 'T7PMFe']")
    private WebElement eight;

    //кнопка "девять"
    @FindBy(css = "div[jsname = 'XoxYJ']")
    private WebElement nine;


    //нажать на кнопку "открытая круглая скобка"
    public void openBr() {
        openBracket.click();
    }

    //кнопка "закрытая круглая скобка"
    public void closeBr() {
        closeBracket.click();
    }

    //кнопка "умножение"
    public void clickMul() {
        multip.click();
    }

    //кнопка "деление"
    public void clickDiv() {
        division.click();
    }

    //кнопка "сложение"
    public void clickSum() {
        sum.click();
    }

    //кнопка "вычитание"
    public void clickSub() {
        substruction.click();
    }

    //кнопка "равно"
    public void clickResult() {
        result.click();
    }

    //кнопка "цифра ноль"
    public void clickZero() {
        zero.click();
    }

    public void clickOne() {
        one.click();
    }

    public void clickTwo() {
        two.click();
    }

    public void clickThree() {
        three.click();
    }

    public void clickFour() {
        four.click();
    }

    public void clickFive() {
        five.click();
    }

    public void clickSix() {
        six.click();
    }

    public void clickSeven() {
        seven.click();
    }

    public void clickEight() {
        eight.click();
    }

    public void clickNine() {
        nine.click();
    }


    public SearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void search(String text) {
        searchInput.sendKeys(text, Keys.ENTER);
    }




}

