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

public class p3_BasicsMainSelectQuery {

    /*
    Making connection with Music database using DataSource latest way and reading configuration from properties file
    music.properties file is at root level, so to read it, we don't need to provide full path and we can use Path.of("music.properties")
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
            while (resultSet.next()) {
                System.out.printf("%d %s %s %n",
                        resultSet.getInt("track_number"),
                        resultSet.getString("artist_name"),
                        resultSet.getString("song_title"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
