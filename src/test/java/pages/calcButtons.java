package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class calcButtons {

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
    public WebElement nine;

    //кнопка "синус"
    @FindBy(css = "div[jsname = 'aN1RFf']")
    public WebElement sin;


    //нажать на кнопку "синус"
    public void ClickSin() {
        sin.click();
    }

    //нажать на кнопку "открытая круглая скобка"
    public void OpenBr() {
        openBracket.click();
    }

    //кнопка "закрытая круглая скобка"
    public void CloseBr() {
        closeBracket.click();
    }

    //кнопка "умножение"
    public void ClickMul() {
        multip.click();
    }

    //кнопка "деление"
    public void ClickDiv() {
        division.click();
    }

    //кнопка "сложение"
    public void ClickSum() {
        sum.click();
    }

    //кнопка "вычитание"
    public void ClickSub() {
        substruction.click();
    }

    //кнопка "равно"
    public void ClickResult() {
        result.click();
    }

    //кнопка "цифра ноль"
    public void ClickZero() {
        zero.click();
    }

    //кнопка "цифра один"
    public void ClickOne() {
        one.click();
    }

    //кнопка "цифра два"
    public void ClickTwo() {
        two.click();
    }

    //кнопка "цифра три"
    public void ClickThree() {
        three.click();
    }

    //кнопка "цифра четыре"
    public void ClickFour() {
        four.click();
    }

    //кнопка "цифра пять"
    public void ClickFive() {
        five.click();
    }

    //кнопка "цифра шесть"
    public void ClickSix() {
        six.click();
    }

    //кнопка "цифра семь"
    public void ClickSeven() {
        seven.click();
    }

    //кнопка "цифра восемь"
    public void ClickEight() {
        eight.click();
    }

    //кнопка "цифра девять"
    public void ClickNine() {
        nine.click();
    }

    public calcButtons(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
