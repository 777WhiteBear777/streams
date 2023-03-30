package org.example;

import org.example.Service.SortService;
import org.example.model.User;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SortService sortService = new SortService();
        List<User> users = List.of(new User("David", 45),
                new User("Max", 20),
                new User("Alex", 24),
                new User("Sima", 4),
                new User("Joe", 55),
                new User("Nikita", 32),
                new User("Masha", 37),
                new User("Soika", 17),
                new User("Misha", 14),
                new User("Pole", 41));

       sortService.sortUsers(users).forEach(System.out::println);
    }
}