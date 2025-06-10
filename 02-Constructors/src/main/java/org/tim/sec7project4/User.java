package org.tim.sec7project4;

public class User {
    private static int userCount = 0; // static: shared across all users
    protected String username;
    private String password;

    // Constructor
    public User(String username, String password) {
        this.username = username;
        this.password = password;
        userCount++;
        System.out.println("✅ User created: " + username);
    }

    // Public getter (no setter for password for security)
    public String getUsername() {
        return username;
    }

    // Let's assume we want to allow updating username
    public void setUsername(String username) {
        this.username = username;
    }

    public void login() {
        System.out.println("🔐 " + username + " logged in!");
    }

    public static void showTotalUsers() {
        System.out.println("👥 Total Users: " + userCount);
    }

    public static int getUserCount() {
        return userCount;
    }
}
