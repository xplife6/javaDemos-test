package com.xplife.common;

import java.util.function.Function;
import java.util.function.Supplier;

public class User implements Function {
    private  String name;
    private  String pwd;


    public User(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public String getPwd() {
        return pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }


    @Override
    public Boolean apply(Object o) {
        User u = (User) o;
        if (u.getName().length()>1){
            return true;
        } else{
            return  false ;
        }

    }
}
