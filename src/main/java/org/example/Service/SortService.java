package org.example.Service;

import org.example.model.User;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortService {
    public List<String> sortUsers(List<User> users) {
        return users.stream()
                .sorted(Comparator.comparing(User::getName))
                .filter(user -> (user.getAge() < 40))
                .limit(3)
                .map(User::getName)
                .collect(Collectors.toList());
    }
}
