package org.tim.sec7project4;

public class AdminUser extends User{

    String role;
    public AdminUser(String username, String password) {
        super(username, password);  // constructor chaining
        this.role = "Admin";
    }

    public void accessDashboard() {
        System.out.println("📊 " + username + " accessing admin dashboard...");
    }
}
