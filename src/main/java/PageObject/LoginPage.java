package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public SelenideElement usernameInput = $("#userName"),
    passwordInput = $("#password"),loginButton=$("#login"),error=$("#name");
}
