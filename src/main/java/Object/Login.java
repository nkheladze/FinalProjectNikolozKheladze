package Object;

import PageObject.LoginPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;

import java.util.Objects;

import static com.codeborne.selenide.Selenide.open;

public class Login {
    LoginPage loginPage = new LoginPage();
    public void logIn(String userName,String password){
    Configuration.startMaximized=true;
    open("https://demoqa.com/login");
    loginPage.usernameInput.shouldBe(Condition.visible,Condition.enabled).sendKeys(userName);
    loginPage.passwordInput.shouldBe(Condition.visible,Condition.enabled).sendKeys(password);
    loginPage.loginButton.shouldBe(Condition.visible,Condition.enabled).click();
    }
    public void validateError(String error){
        assert Objects.equals(loginPage.error.getText(),error);
    }
}
