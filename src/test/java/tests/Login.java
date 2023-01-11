package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Login extends TestBase{

    @BeforeMethod
    public void preConditions(){
        if (app.getUser().isLogged()){
            app.getUser().logOut();
        }
    }


    @Test
    public void login1(){
        app.getUser().initLogin();
        app.getUser().pause(2000);
        app.getUser().fillInLoginForm("irinaa.kren@gmail.com", "nezabudka0890");
        app.getUser().submitLogin();
        app.getUser().pause(2000);

        Assert.assertTrue(app.getUser().isLogged());



        /*
        click(By.cssSelector("[href='/login']"));             //Refactor (ctrl+Alt+M)
        pause(2000);
        type(By.cssSelector("#user"), "irinaa.kren@gmail.com");
        click(By.cssSelector("#login"));
        pause(2000);
        type(By.cssSelector("#password"),"nezabudka0890");
        click(By.cssSelector("#login-submit"));
        pause(2000);
*/

    }



}
