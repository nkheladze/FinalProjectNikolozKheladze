package Object;

import PageObject.BooksPage;
import com.codeborne.selenide.Condition;
import io.restassured.response.Response;
import org.apache.commons.lang3.StringUtils;

import static com.codeborne.selenide.Selenide.open;
import static io.restassured.RestAssured.given;

public class Books {
    BooksPage booksPage=new BooksPage();
    String responseBody;

    public void getBooksFromApi(){
        Response response = given().when().get("https://bookstore.toolsqa.com/BookStore/v1/Books");
        responseBody = response.getBody().asString();
    }
    public void findBooks(){
        open("https://demoqa.com/books");
        booksPage.searchBox.shouldBe(Condition.visible).sendKeys("O'Reilly Media");
    }
    public void checkCountOfBooks(){
        String findStr = "O'Reilly Media";

        assert booksPage.elements.stream().count() == StringUtils.countMatches(responseBody, findStr);

        System.out.print(StringUtils.countMatches(responseBody, findStr));
    }
}
