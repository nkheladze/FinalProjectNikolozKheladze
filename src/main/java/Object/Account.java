package Object;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;


public class Account {
    public String getUserName() {
        return userName;
    }
    public String getPassword() {
        return password;
    }
    private String userName,password;
    Response response;
    JsonPath jsonPath;
    public void addUser(String name,String password){
    this.userName=name;this.password=password;
    Map<String,String> user = new HashMap<String, String>();
    user.put("userName",userName);
    user.put("password",password);
    Response response = given().contentType(JSON)
                .body(user).post("https://bookstore.toolsqa.com/Account/v1/User");

     response.print();
    }
    public void getDeletedUser(){
    Map<String,String> user = new HashMap<String, String>();
    user.put("userName",userName);
    user.put("password",password);

    response = given().contentType(JSON)
    .body(user).post("https://bookstore.toolsqa.com/Account/v1/Authorized");

    }
    public void assertDeletedUser(){
    jsonPath=response.jsonPath();
    String message = jsonPath.get("message");
    assert Objects.equals(message,"User not found!");
    }
}
