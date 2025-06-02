package com.easybytes.timdatabase;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.sql.*;
import java.util.Properties;

public class p5_MusicDMLStatementQuery {

    /*
    Here we are using Statment.execute() method to execute DML queries instead of Statement.executeQuery()
    execute() method returns boolean value.
    true if the first result is a ResultSet object;
    false if it is an update count or there are no results.

    In this example we are executing SELECT query and it returns true

    When you use System.out.printf("%-15s", resultSet.getString(i));, it means that the getString(i) value from the resultSet is being printed as a string,
    left-justified in a field that is 15 characters wide. If the string is shorter than 15 characters,
    it will be padded with spaces on the right. If the string is longer than 15 characters, it will be printed in its entirety without truncation.
     */

    public static void main(String[] args) {

        /* This method will actually return a class instance and can be used for other purposes, like reflection.

            Below code is deprecated and no need to use it now in latest code so commenting it

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

         */

        Properties properties = new Properties();
        try {
            properties.load(Files.newInputStream(Path.of("music.properties"),
                    StandardOpenOption.READ));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/music",
                properties.getProperty("user"),
                properties.getProperty("password"));
             Statement statement = connection.createStatement();
        ) {

            String artist = "Elf";
            String artist1 = "Elf1";
            String query = "SELECT * FROM artists WHERE artist_name='%s' "
                           .formatted(artist); // replace artist with astist1 to get Artist was not found message
            /*
            Elf artist name is preset in music.artists table but there is no artist with name Elf1
            so the execute() method returns true for artist Elf or Elf1.
            So boolean result can't be used, to test for the existence of a record, in a table
            Instead, I'll test the data in the result set. I'll use the getResultSet method on statement to
            get that data.
             */
            boolean result = statement.execute(query);
            System.out.println("result = " + result);
            ResultSet rs = statement.getResultSet();
            boolean found = (rs != null && rs.next());
            System.out.println("Artist was " + (found ? "found" : "not found"));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
