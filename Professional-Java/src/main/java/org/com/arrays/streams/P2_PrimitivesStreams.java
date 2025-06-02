package org.com.arrays.streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P2_PrimitivesStreams {

    public static void main(String[] args) {

        /**
         *  Converting Primitive Array to Wrapper Types
         *  // Convert int[] to List<Integer>
         */
        int[] numbers = {1, 2, 3, 4, 5};
        List<Integer> integerList = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Wrapper Type List: " + integerList); // Wrapper Type List: [1, 2, 3, 4, 5]
        System.out.println();
    }
}
