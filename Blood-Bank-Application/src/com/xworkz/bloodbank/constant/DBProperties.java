package com.xworkz.bloodbank.constant;

public enum DBProperties {
    URL("jdbc:mysql://localhost:3306/bloodDb"),
    USER_NAME("root"),
    SECRET("Xworkzodc@123"),
    VERSION_8;

    private String prop;
    private DBProperties(String prop){
        this.prop=prop;}
    private DBProperties()
    {

    }
    public String getProp(){
        return prop;
    }
}
