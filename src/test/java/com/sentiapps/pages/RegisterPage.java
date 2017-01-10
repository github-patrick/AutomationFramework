package com.sentiapps.pages;

import com.sentiapps.user.User;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by patrick on 09/01/2017.
 */
public class RegisterPage extends AbstractPage {

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "remail")
    private WebElement remail;

    @FindBy(id = "PASSWORD")
    private WebElement password;

    @FindBy(id = "firstname")
    private WebElement firstname;

    @FindBy(id = "lastname")
    private WebElement lastname;

    @FindBy(id = "sbtBtn")
    private WebElement registerBtn;

    @FindBy(id = "phoneFlagComp1")
    private WebElement telephoneNum;

    @FindBy(css = "#email_w")
    private WebElement emailErrorMsg;

    @FindBy(css = "#remail_w")
    private WebElement remailErrorMsg;

    @FindBy(css = "#PASSWORD_w")
    private WebElement passwordErrorMgs;

    @FindBy(css = "#firstname_w")
    private WebElement firstnameErrorMsg;

    @FindBy(css = "#lastname_w")
    private WebElement lastnameErrorMsg;

    @FindBy(css=".ml51.tx")
    private WebElement registerTabLink;

    public String getLastnameErrorMsg() {
        return lastnameErrorMsg.getText();
    }

    public String getEmailErrorMsg() {
        return emailErrorMsg.getText();
    }

    public String getRemailErrorMsg() {
        return remailErrorMsg.getText();
    }

    public String getPasswordErrorMgs() {
        return passwordErrorMgs.getText();
    }

    public String getFirstnameErrorMsg() {
        return firstnameErrorMsg.getText();
    }

    public void fillInAllFields(User user) {
        email.sendKeys(user.getEmail());
        remail.sendKeys(user.getRemail());
        password.sendKeys(user.getPassword());
        firstname.sendKeys(user.getFirstname());
        lastname.sendKeys(user.getLastname());
        telephoneNum.sendKeys(user.getMobileNum());
    }

    public void clickOnRegisterBtn() {
        registerBtn.click();
    }

    public void clickRegisterTabLink() {
        registerTabLink.click();
    }
}
