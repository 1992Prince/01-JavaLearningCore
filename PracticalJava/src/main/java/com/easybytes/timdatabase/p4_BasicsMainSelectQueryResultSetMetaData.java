package com.easybytes.timdatabase;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class p4_BasicsMainSelectQueryResultSetMetaData {

    /*
    If you don't know what the data might be, that's returned from your query,
    you can use the ResultSetMetaData object, to get information about the ResultSet.

    Code is still pending below
     */
    private final static String CONN_STRING = "jdbc:mysql://localhost:3306/music";

    public static void main(String[] args) {

        Properties properties = new Properties();
        try {
            properties.load(Files.newInputStream(Path.of("music.properties"),
                    StandardOpenOption.READ));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String albumName = "Tapestry";
        String query = "SELECT * FROM music.albumview WHERE album_name='%s'"
                         .formatted(albumName);

        var dataSource = new MysqlDataSource();
        dataSource.setServerName(properties.getProperty("serverName"));
        dataSource.setPort(Integer.parseInt(properties.getProperty("port")));
        dataSource.setDatabaseName(properties.getProperty("databaseName"));

        try (var connection = dataSource.getConnection(
                properties.getProperty("user"),
                properties.getProperty("password"));
             Statement statement = connection.createStatement();
        ) {

            ResultSet resultSet = statement.executeQuery(query);
            var meta =  resultSet.getMetaData();
            for (int i = 1; i <= meta.getColumnCount(); i++) {
                System.out.printf("%d %s %s%n",
                        i,
                        meta.getColumnName(i),
                        meta.getColumnTypeName(i));
            }

            System.out.println("-".repeat(30));
            while (resultSet.next()) {
             /*   System.out.printf("%d %s %s %n",
                        resultSet.getInt("track_number"),
                        resultSet.getString("artist_name"),
                        resultSet.getString("song_title"));*/
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
