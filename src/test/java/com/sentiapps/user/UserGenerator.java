package com.sentiapps.user;

/**
 * Created by patrick on 09/01/2017.
 */
public class UserGenerator {


    public static User getBlankUser() {
        User user = new User();
        return user;
    }


    public static User getFieldsFilledInUser() {
        User user = new User();
        user.setEmail("email@email.com");
        user.setRemail("email@email.com");
        user.setPassword("passworD123");
        user.setFirstname("joe");
        user.setLastname("foo");
        user.setMobileNum("07777777777");

        return user;
    }
}
