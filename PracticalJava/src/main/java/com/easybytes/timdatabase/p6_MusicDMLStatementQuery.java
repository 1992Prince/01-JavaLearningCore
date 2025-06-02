package com.easybytes.timdatabase;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.sql.*;
import java.util.Properties;

public class p6_MusicDMLStatementQuery {

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
            String tableName = "music.artists";
            String columnName = "artist_name";
            String columnValue = "Neil Young";
            if (!executeSelect(statement, tableName, columnName, columnValue)){
                System.out.println("May be we should add this record");
                insertRecord(statement, tableName, new String[]{columnName},
                        new String[]{columnValue});
            } else {
                System.out.println("Record already exists");
                //deleteRecord(statement, tableName, columnName, columnValue);
                updateRecord(statement, tableName, columnName, columnValue,
                        columnName, columnValue.toUpperCase());
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean printRecords(ResultSet resultSet) throws SQLException{

        boolean foundData = false;
        var metaData = resultSet.getMetaData();

        System.out.println("===========================================");

        for (int i = 1; i <= metaData.getColumnCount(); i++) { // i=1 bcoz in mysql index starts from 1 and not 0. chnages db to db
            System.out.printf("%-15s", metaData.getColumnName(i).toUpperCase());
        }
        System.out.println();

        while(resultSet.next()){
            for (int i = 1; i <= metaData.getColumnCount(); i++) {
                System.out.printf("%-15s", resultSet.getString(i));
            }
            System.out.println();
            foundData = true;
        }
        return foundData;
    }

    private static boolean executeSelect(Statement statement, String table,
                                         String columnName, String columnValue) throws SQLException{

        String query = "SELECT * FROM %s WHERE %s='%s'".formatted(table, columnName, columnValue);
        ResultSet rs = statement.executeQuery(query);

        if (rs != null){
            return printRecords(rs);
        }
        return false;
    }

    private static boolean insertRecord(Statement statement, String table,
                                        String[] columnNames, String[] columnValues) throws SQLException{

        String colNames = String.join(", ", columnNames);
        String colValues = String.join("', '", columnValues);

        String query = "INSERT INTO %s (%s) VALUES ('%s')".formatted(table,
                colNames, colValues);

        System.out.println("query - " + query);
        System.out.println("Col Names - " + colNames);
        System.out.println("Col Values - " + colValues);
        boolean insertResult = statement.execute(query);
        int recordsInserted = statement.getUpdateCount();
        if (recordsInserted > 0){
            System.out.println("Records Inserted - " + recordsInserted);
            executeSelect(statement, table,
                    columnNames[0], columnValues[0]);
        }
        return recordsInserted > 0;
    }

    private static boolean deleteRecord(Statement statement, String table,
                                        String columnName, String columnValue) throws SQLException{

        String query = "DELETE FROM %s WHERE %s='%s'".formatted(table, columnName, columnValue);
        System.out.println("Query - " + query);
        boolean deleteResult = statement.execute(query);
        // this time it will returns no of records deleted
        int recordsDeleted = statement.getUpdateCount();

        if (recordsDeleted > 0){
            System.out.println("Records Deleted - " + recordsDeleted);
            executeSelect(statement, table, columnName, columnValue);
        }

        return recordsDeleted > 0;
    }

    private static boolean updateRecord(Statement statement, String table,
                                        String matchedColumn, String matchedValue,
                                        String updatedColumn, String updatedValue) throws SQLException{

        String query = "UPDATE %s SET %s = '%s' WHERE %s='%s'".formatted(table, updatedColumn, updatedValue,
                matchedColumn, matchedValue);
        System.out.println("Query - " + query);
        boolean deleteResult = statement.execute(query);
        // this time it will returns no of records deleted
        int recordsUpdated = statement.getUpdateCount();

        if (recordsUpdated > 0){
            System.out.println("Records Deleted - " + recordsUpdated);
            executeSelect(statement, table, updatedColumn, updatedValue);
        }

        return recordsUpdated > 0;
    }
}
