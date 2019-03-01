package com.computershop.model;

import org.springframework.stereotype.Component;

@Component
public class Users {
    private Integer userid;

    private String username;

    private String userpassword;

    private String userphone;

    private String useremail;

    private String useraddress;

    private String userwish;

    private String usercart;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone == null ? null : userphone.trim();
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail == null ? null : useremail.trim();
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress == null ? null : useraddress.trim();
    }

    public String getUserwish() {
        return userwish;
    }

    public void setUserwish(String userwish) {
        this.userwish = userwish == null ? null : userwish.trim();
    }

    public String getUsercart() {
        return usercart;
    }

    public void setUsercart(String usercart) {
        this.usercart = usercart == null ? null : usercart.trim();
    }
}