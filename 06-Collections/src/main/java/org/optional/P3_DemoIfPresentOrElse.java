package org.optional;

import java.util.Objects;
import java.util.Optional;

public class P3_DemoIfPresentOrElse {

    public static void main(String[] args) {

        // ifPresent takes Consumer Functional interface
        // ifPresentOrElse will proceed if value is present then perform given action
        // else if value is not present then perform another action
        Optional<String> nameContainer = getName();
        nameContainer.ifPresentOrElse(
                // when value exists
                (val) -> {
                    System.out.println("Value is present");
                    System.out.println(val.toUpperCase());
                }
                ,
                // when values doesn't exists - default logic
                ()-> {
                    System.out.println("Value is null or not present - executing defult logic");
                }
        );

        /**
         * when name = null output will be
         * Value is null or not present - executing defult logic
         *
         * when name = "Dilip Singh"; then output will be
         * Value is present
         * DILIP SINGH
         */

    }

    public static Optional<String> getName() {
        String name = "Dilip Singh";
        //String name = null;
        Optional<String> value = null;
        if (Objects.isNull(name)) {
            value = Optional.empty();
        } else {
            value = Optional.of(name);
        }
        return value;
    }
}
