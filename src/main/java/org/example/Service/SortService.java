package org.example.Service;

import org.example.model.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortService {
    public List<String> sortUsers(List<User> users) {
        List<String> stringList = new ArrayList<>();

        users.stream()
                .sorted(Comparator.comparing(User::getName))
                .filter(user -> (user.getAge() < 40))
                .limit(3)
                .forEach(user -> stringList.add(user.getName()));

        return stringList;
    }
}
