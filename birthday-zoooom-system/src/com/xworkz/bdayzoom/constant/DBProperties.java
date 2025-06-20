package com.xworkz.bdayzoom.constant;

public enum DBProperties {

    URL("jdbc:mysql://localhost:3306/birthdaydb"),
    USER_NAME("root"),
    SECRET("Xworkzodc@123"),
VERSION_8;
    private String prop;
    DBProperties(String prop ) {
        this.prop=prop;
    }
    private DBProperties(){

    }
    public String getProp()
    {
        return prop;
    }
}
