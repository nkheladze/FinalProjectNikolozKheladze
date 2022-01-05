import Object.Account;
import Object.Books;
import Object.Delete;
import Object.Login;


public class Test {
    Account account = new Account();
    Login login = new Login();
    Delete deleteaccount = new Delete();
    Books books = new Books();
    @org.testng.annotations.Test
    public void test1(){
        String userName = "NikaNew", password = "Babuna$123";
        account.addUser(userName,password);
        login.logIn(account.getUserName(),account.getPassword());
        deleteaccount.deleteUser();
        login.logIn(account.getUserName(),account.getPassword());
        login.validateError("Invalid username or password!");
        account.getDeletedUser();
        account.assertDeletedUser();
    }
    @org.testng.annotations.Test
    public void test2(){
        books.getBooksFromApi();
        books.findBooks();
        books.checkCountOfBooks();
    }
}
