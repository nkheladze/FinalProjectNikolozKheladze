package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class DeletePage {
    public SelenideElement deleteAccountButton = $x("//*[text()='Delete Account']"),
    deleteCheckButton=$("#closeSmallModal-ok");

}
