package org.optional;

import java.util.Objects;
import java.util.Optional;

public class P3_DemoIfPresent {

    public static void main(String[] args) {

        // ifPresent takes Consumer Functional interface
        // ifPresent will proceed if value is present then
        Optional<String> nameContainer = getName();
        nameContainer.ifPresent(val -> System.out.println(val.toUpperCase()));
        /*
        IF name = "Dilip Singh"; then DILIP SING will be printed else it will
        move to next line.
         */
        System.out.println("Completed ifPresent() method");

    }

    public static Optional<String> getName() {
        //String name = "Dilip Singh";
        String name = null;
        Optional<String> value = null;
        if (Objects.isNull(name)) {
            value = Optional.empty();
        } else {
            value = Optional.of(name);
        }
        return value;
    }
}
