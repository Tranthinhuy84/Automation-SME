package org.example.pages;

import org.example.base.BaseSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;

    public void LoginPage() {
        this.driver = BaseSetup.getDriver();
    }

    By usernameInput = By.xpath("//*[@id=\"mui-1\"]");
    By passwordInput = By.xpath("//*[@id=\"mui-2\"]");
    By loginInput = By.xpath("/html/body/div/div/div/div[1]/div[1]/div/div/div/div/div[2]/form/button");

    public void openBrowser() {
        driver.manage().window().maximize();
        driver.get("https://cms-sme-staging.fbox.fpt.vn/royalpalace/login");
    }
    public void clickUsername(){
        driver.findElement(usernameInput).click();
    }
    public void setUsernameInput(String username){
        driver.findElement(usernameInput).sendKeys(username);
    }
    public void clickPassword(){
        driver.findElement(passwordInput).click();
    }
    public void setPasswordInput(String password){
        driver.findElement(usernameInput).sendKeys(password);
    }
    public boolean clickLoginButton(){
        WebElement submitsignin = driver.findElement(loginInput);
        if (submitsignin.isDisplayed()) {
            submitsignin.click();
        }
        return false;
    }

}