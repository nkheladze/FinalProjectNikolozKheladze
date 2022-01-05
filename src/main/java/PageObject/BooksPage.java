package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$x;

public class BooksPage {
    public SelenideElement searchBox=$("#searchBox");
    public ElementsCollection elements = $$x("//div[@class='rt-td' and contains(text(),'Reilly Media')]");


}
