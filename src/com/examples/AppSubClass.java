package com.examples;

public class AppSubClass {
    private String name;
    public String email;

    //    CONSTRUCTOR
   public AppSubClass(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public AppSubClass() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void log(String message) {
        System.out.println(message);
    }


}
