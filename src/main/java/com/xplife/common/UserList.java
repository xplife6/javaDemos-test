package com.xplife.common;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.List;

public class UserList {
    public static List<User> getUsers(){
        User zhangshan = new User("张", "132456");
        User user = new User("李斯", "456");
        User user1 = new User("王五", "789");
        User user2 = new User("李岩", "123");
        User user3 = new User("石秀", "0.12");
        User user4 = new User("王麻子", "987");

        List<User> users = new ArrayList<>();
        users.add(zhangshan);
        users.add(user);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        return  users;

    }


}
