package org.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class P8_OrdersInfoMain {

    public static void main(String[] args) {

        String[] names = {"Alice", "Bob", "Charlie", "David", "Eva", "Frank", "Grace", "Hannah", "Ivy", "Jack"};
        String[] addresses = {"Delhi", "Mumbai", "Bangalore", "Chennai", "Kolkata", "Pune", "Hyderabad", "Jaipur", "Ahmedabad", "Lucknow"};
        String[] phones = {"9876543210", "9876543211", "9876543212", "9876543213", "9876543214",
                "9876543215", "9876543216", "9876543217", "9876543218", "9876543219"};
        String[] emails = {"alice@gmail.com", "bob@yahoo.com", "charlie@outlook.com", "david@gmail.com",
                "eva@gmail.com", "frank@yahoo.com", "grace@outlook.com", "hannah@gmail.com",
                "ivy@yahoo.com", "jack@outlook.com"};

        Map<Integer, OrdersInfo> ordersMap = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            OrdersInfo order = new OrdersInfo(
                    i + 1,                          // orderId (1 to 10)
                    "CUST" + (100 + i),             // unique customerId
                    names[i],                       // customerName
                    addresses[i],                   // address
                    phones[i],                      // phone
                    emails[i]                       // email
            );

            ordersMap.put(order.getOrderId(), order);
        }

        // ✅ Print all orders from HashMap
        for (Map.Entry<Integer, OrdersInfo> entry : ordersMap.entrySet()) {
            System.out.println("OrderID: " + entry.getKey());
            System.out.println("OrderInfo: " + entry.getValue());
            System.out.println("------------------------------------------------");
        }

        Hashtable table = new Hashtable();
    }
}
