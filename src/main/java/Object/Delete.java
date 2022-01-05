package Object;

import PageObject.DeletePage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import java.util.Objects;

public class Delete {
    DeletePage deletePage = new DeletePage();
    public void deleteUser(){
    deletePage.deleteAccountButton.shouldBe(Condition.visible).click();
    deletePage.deleteCheckButton.shouldBe(Condition.visible).click();

    assert Objects.equals(Selenide.switchTo().alert().getText(),"User Deleted.");
    Selenide.switchTo().alert().accept();
    }
}
