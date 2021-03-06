package com.sap.myloginapp;

public class Model {

    /*
     * Singleton-Implementierung
     */
    private static Model instance;

    private Model() {
    }

    public static Model getInstance() {
        if (instance == null) {
            instance = new Model();
        }
        return instance;
    }

    /*
     * Model-Implementierung
     */
    private String userName;
    private String password;

    public boolean checkLoginData(String userName, String password) {
        if (userName.equals("appe") && password.equals("appe")) {
            this.userName = userName;
            this.password = password;
            return true;
        } else {
            return false;
        }
    }

    public String getUserName() {
        return userName;
    }

}
