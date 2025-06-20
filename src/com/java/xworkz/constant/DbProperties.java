package com.java.xworkz.constant;

public enum DbProperties {
    VOJESHWINI,
    URL("jdbc:mysql://localhost:3306/java"),
    USER_NAME("root"),
    SECRET("vojeshwini"),
    VERSION_8;

    private String prop;

    private  DbProperties(String prop)
    {
        this.prop=prop;
    }
    private DbProperties(){


    }

    public String getProp() {
        return prop;
    }
}
