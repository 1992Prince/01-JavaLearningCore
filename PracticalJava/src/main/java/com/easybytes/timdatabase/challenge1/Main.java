package com.easybytes.timdatabase.challenge1;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    private static String USE_SCHEMA = "USE storefront";

    private static int MYSQL_DB_NOT_FOUND = 1049;

    public static void main(String[] args) {

        var dataSource = new MysqlDataSource();
        dataSource.setServerName("localhost");
        dataSource.setPort(3306);
        //dataSource.setUser(System.getenv("MYSQLUSER"));
        //dataSource.setPassword(System.getenv("MYSQLPASS"));
        dataSource.setUser("devuser");
        dataSource.setPassword("ROOT");


        try (Connection connection = dataSource.getConnection()) {
           if (!checkSchema(connection)){
               System.out.println("storefront schema does not exist");
               createSchema(connection);
           }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private static boolean checkSchema(Connection conn) throws SQLException {
        try(Statement statement = conn.createStatement()){
            statement.execute(USE_SCHEMA);
        }catch (SQLException e){
            e.printStackTrace();
            System.err.println("SQLState: " + e.getSQLState());
            System.err.println("Error Code: " + e.getErrorCode());
            System.err.println("Message: " + e.getMessage());

            if (conn.getMetaData().getDatabaseProductName().equals("MySQL")
            && e.getErrorCode() == MYSQL_DB_NOT_FOUND){
                return false;
            }else {
                throw e;
            }
        }
        return true;
    }

    private static void createSchema(Connection conn) throws SQLException {

        String createSchema = "CREATE SCHEMA storefront";

        String createOrder = """
                CREATE TABLE storefront.order (
                order_id int NOT NULL AUTO_INCREMENT,
                order_date DATETIME NOT NULL,
                PRIMARY KEY (order_id)
                )""";

        String createOrderDetails = """
                CREATE TABLE storefront.order_details (
                order_detail_id int NOT NULL AUTO_INCREMENT,
                item_description text,
                order_id int DEFAULT NULL,
                PRIMARY KEY (order_detail_id),
                KEY FK_ORDERID (order_id),
                CONSTRAINT FK_ORDERID FOREIGN KEY (order_id)
                REFERENCES storefront.order (order_id) ON DELETE CASCADE
                ) """;


        try(Statement statement = conn.createStatement()){

            System.out.println("Creating storefront Database");
            statement.execute(createSchema);
            if (checkSchema(conn)){
                statement.execute(createOrder);
                System.out.println("Successfully created order");
                statement.execute(createOrderDetails);
                System.out.println("Successfully created order details");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static int addOrder(Connection conn,  String[] items){
        int orderId = -1;
        String insertOrder = "INSERT INTO storefront.order (order_date) VALUES ('%s')";
        String insertDetails = "INSERT INTO storefront.order_details " +
                               "(order_id, item_description) values(%d, %s)";

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String orderDateTime = LocalDateTime.now().format(dtf);
        System.out.println(orderDateTime);
        String formattedString = insertOrder.formatted(orderDateTime);
        System.out.println(formattedString);
        return orderId;

    }

}
