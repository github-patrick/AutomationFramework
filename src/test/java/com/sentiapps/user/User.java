package com.sentiapps.user;

/**
 * Created by patrick on 09/01/2017.
 */
public class User {

    private String email;
    private String remail;
    private String password;
    private String firstname;
    private String lastname;
    private String mobileNum;

    public User() {
        this.email = "";
        this.remail = "";
        this.password = "";
        this.firstname = "";
        this.lastname = "";
        this.mobileNum = "";
    }

    public User(String email, String remail, String password, String firstname, String lastname, String mobileNum) {
        this.email = email;
        this.remail = remail;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.mobileNum = mobileNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRemail() {
        return remail;
    }

    public void setRemail(String remail) {
        this.remail = remail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }
}
