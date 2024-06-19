package org.example.testcases;

import org.example.base.BaseSetup;
import org.example.pages.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest {
    LoginPage loginPage;
    @Parameters({"browser"})
    @BeforeClass
    void openBrowser(String browser){
        BaseSetup.open(browser);
        loginPage = new LoginPage();
        loginPage.openBrowser();
    }
    @Test
    void setLoginPage(String username, String password) throws InterruptedException {
        loginPage.clickUsername();
        Thread.sleep(1000);
        loginPage.setUsernameInput("admin");
        loginPage.clickPassword();
        Thread.sleep(1000);
        loginPage.setPasswordInput("Abc@123");
        loginPage.clickLoginButton();

    }
    @AfterClass
    public void closeBrowser(){
        BaseSetup.close();
    }
}
