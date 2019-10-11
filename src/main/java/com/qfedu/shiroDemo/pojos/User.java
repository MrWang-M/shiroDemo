package com.qfedu.shiroDemo.pojos;

public class User {
    private String id;
    private String user;
    private String pwd;
    private String salt;

    public User() {
    }

    public User(String id, String user, String pwd, String salt) {
        this.id = id;
        this.user = user;
        this.pwd = pwd;
        this.salt = salt;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", user='" + user + '\'' +
                ", pwd='" + pwd + '\'' +
                ", salt='" + salt + '\'' +
                '}';
    }
}
