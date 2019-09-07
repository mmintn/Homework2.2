package com.example.homework2.model;

public class Auth {

    private static final String EMAIL = "mint280940@gmail.com";
    private static final String PASSWORD = "1234";

    private String mEmail;
    private String mPassword;

    public Auth(String email, String password) {
        this.mEmail = email;
        this.mPassword = password;
    }


    //    public String getmEmail() {
//        return mEmail;
//    }
//
//    public void setmEmail(String email) {
//        this.mEmail = email;
//    }
//
//    public String getmPassword() {
//        return mPassword;
//    }
//
//    public void setmPassword(String password) {
//        this.mPassword = password;
//    }
//
    public boolean check() {
        if (mEmail.equals(EMAIL) && mPassword.equals(PASSWORD)) {
            return true;
        } else {
            return false;
        }
//    }
    }
}
