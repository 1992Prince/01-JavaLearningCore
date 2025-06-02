package com.easybytes.timdatabase;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;

public class p1_BasicsMain {

    /*
    Making connection with Music database using Driver Manager
     */
    private final static String CONN_STRING = "jdbc:mysql://localhost:3306/music";

    public static void main(String[] args) {

        String username = JOptionPane.showInputDialog(
                null, "Enter DB Username"
        );

        JPasswordField passwordField = new JPasswordField();
        int okCxl = JOptionPane.showConfirmDialog(null, passwordField, "Enter DB Password",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        final char[] passwordChars = (okCxl == JOptionPane.OK_OPTION) ? passwordField.getPassword() : null;

        try(Connection connection = DriverManager.getConnection(
                CONN_STRING, username, String.valueOf(passwordChars)
        )){

            System.out.println("Success! Connection made to music Database");
            Arrays.fill(passwordChars,  ' ');

        }catch (SQLException e){
            throw new RuntimeException(e);
        }



    }
}
