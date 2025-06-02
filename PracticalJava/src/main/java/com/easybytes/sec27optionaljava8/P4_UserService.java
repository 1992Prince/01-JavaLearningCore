package com.easybytes.sec27optionaljava8;

import java.util.Optional;

/*
Optional class usage example
 */

public class P4_UserService {

    public static class User {
        private String name;

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    private static User findUserById(String userId) {
        // Simulate a user lookup which might return null
        if ("123".equals(userId)) {
            return new User("John Doe");
        }
        return null;
    }

    public static void main(String[] args) {
        String userId = "123";
        Optional<User> user = Optional.ofNullable(findUserById(userId));

        if (user.isPresent()) {
            System.out.println("User found: " + user.get().getName());
        } else {
            System.out.println("User not found");
        }
    }
}
