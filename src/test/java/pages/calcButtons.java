package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class calcButtons {

    //кнопка "открытая круглая скобка"
    @FindBy(css = "div[jsname = 'j93WEe']")
    private WebElement openBracket;

    public void openbr() {
        openBracket.click();
    }
/*
    //кнопка "закрытая круглая скобка"
    @FindBy(css = "div[jsname = 'j93WEe']")
    private WebElement closeBracket;

    //кнопка "умножение"
    @FindBy(css = "div[jsname = 'j93WEe']")
    private WebElement multip;

    //кнопка "деление"
    @FindBy(css = "div[jsname = 'j93WEe']")
    private WebElement division;

    //кнопка "сложение"
    @FindBy(css = "div[jsname = 'j93WEe']")
    private WebElement sum;

    //кнопка "вычитание"
    @FindBy(css = "div[jsname = 'j93WEe']")
    private WebElement substruction;

    //кнопка "равно"
    @FindBy(css = "div[jsname = 'j93WEe']")
    private WebElement equally;

    //кнопка "цифра ноль"
    @FindBy(css = "div[jsname = 'j93WEe']")
    private WebElement zero;

    //кнопка "цифра один"
    @FindBy(css = "div[jsname = 'j93WEe']")
    private WebElement one;

    //кнопка "цифра два"
    @FindBy(css = "div[jsname = 'j93WEe']")
    private WebElement two;

    //кнопка "цифра три"
    @FindBy(css = "div[jsname = 'j93WEe']")
    private WebElement three;

    //кнопка "цифра четыре"
    @FindBy(css = "div[jsname = 'j93WEe']")
    private WebElement four;

    //кнопка "цифра пять"
    @FindBy(css = "div[jsname = 'j93WEe']")
    private WebElement five;

    //кнопка "цифра шесть"
    @FindBy(css = "div[jsname = 'j93WEe']")
    private WebElement six;

    //кнопка "семь"
    @FindBy(css = "div[jsname = 'j93WEe']")
    private WebElement seven;

    //кнопка "восемь"
    @FindBy(css = "div[jsname = 'j93WEe']")
    private WebElement eight;

    //кнопка "девять"
    @FindBy(css = "div[jsname = 'j93WEe']")
    private WebElement nine;
*/

}
