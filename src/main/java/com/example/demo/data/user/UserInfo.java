package com.example.demo.data.user;

public class UserInfo {

    private long userId;

    private String name;

    private String password;

    private String age;

    private String phone;

    private String img;

    public UserInfo(){

    }

    public UserInfo(String name, String password, String age, String phone) {
        this.name = name;
        this.password = password;
        this.age = age;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getUserIdString() {
        return userId + "";
    }

    public void setUserIdString(String userId) {
        this.userId = Integer.parseInt(userId);
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userId='" + userId + '\'' +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age='" + age + '\'' +
                ", phone='" + phone + '\'' +
                ", img='" + img + '\'' +
                '}';
    }
}
