package list;

import java.util.ArrayList;
import java.util.List;

public class P2_CustomTypeParametrizedList {

    public static void main(String[] args) {

        // here we will be creating collection object of custom type
        List<Car> carList = new ArrayList<>();

        carList.add(new Car("Honda", "Civic", 21000.0));
        carList.add(new Car("Toyota", "Camry", 29000.0));
        carList.add(new Car("BMW", "5 Series", 65000.0));

        // System.out.println("Car List - " + carList);

        /**
         * Car List - [Car{make='Honda', model='Civic', price='21000.0'},
         * Car{make='Toyota', model='Camry', price='29000.0'}, Car{make='BMW',
         * model='5 Series', price='65000.0'}]
         */

        // printing carList elements using for-each loop
        for (Car car : carList) {
            System.out.println(car.getMake() + " " + car.getModel() + " " + car.getPrice());
        }

        /**
         Honda Civic 21000.0
         Toyota Camry 29000.0
         BMW 5 Series 65000.0
         */

        System.out.println();
        System.out.println();

        // carList2 is not Generics type and we are adding car object to it
        // we need to typecast it before we access it
        List carList2 = new ArrayList();
        carList2.add(new Car("Honda", "Civic", 21000.0));
        carList2.add(new Car("Toyota", "Camry", 29000.0));
        carList2.add(new Car("BMW", "5 Series", 65000.0));

        // see the change, below we have Object instead of Car
        for (Object carObj : carList2) {
            // now we need to cast carObj to Car type first
            // and then only u can access Car class specific mehtods
            // directly with carObj u can't access Car specific methods and
            // can access only Object class methods
            Car car = (Car) carObj;
            System.out.println(car.getMake() + " " + car.getModel() + " " + car.getPrice());
        }

        /*
        Honda Civic 21000.0
        Toyota Camry 29000.0
        BMW 5 Series 65000.0

        So we should use Generics Collections instead of raw type
         */
    }
}
