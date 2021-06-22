package com.xplife.stream;

import com.xplife.common.User;
import com.xplife.common.UserList;

import java.util.List;
import java.util.stream.Stream;

public class StreamDemo1 {
    public static void main(String[] args) {
        List<User> users = UserList.getUsers();
//        users.stream().filter(t->t.apply(t)
//        ).forEach(System.out::println);
        users.stream().filter(t->t.apply(t)
        ).forEach(System.out::println);

        System.out.println("---------------------------------------");

        Stream.of(1,3,5,6,4,8,7).filter(s->!s.equals(5)).forEach(System.out::println);

        System.out.println("---------------------------------------");


    }
}
