package org.tim.sec7project4;

public class Main {

    public static void main(String[] args) {

        System.out.println("🚀 Starting Login System...");

        // User creation
        User u1 = new User("alice", "pass123"); // ✅ User created: alice
        User u2 = new User("bob", "mypassword"); // User created: bob

        // Admin creation
        AdminUser admin = new AdminUser("admin", "admin@123"); // User created: admin

        // Using static method from utility
        System.out.println("🔍 Is 'pass123' valid? " + UserUtils.validatePassword("pass123")); // Is 'pass123' valid? true

        // Login actions
        u1.login();
        u2.login();
        admin.login();
        admin.accessDashboard();

        /**
         * 🔐 alice logged in!
         * 🔐 bob logged in!
         * 🔐 admin logged in!
         */

        // Show total users created
        User.showTotalUsers(); // 👥 Total Users: 3

    }
}
