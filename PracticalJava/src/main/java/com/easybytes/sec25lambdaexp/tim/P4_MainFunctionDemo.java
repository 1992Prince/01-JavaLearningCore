package com.easybytes.sec25lambdaexp.tim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P4_MainFunctionDemo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of(
                "alpha", "bravo", "charlie", "delta"
        ));

        System.out.println(list); // [alpha, bravo, charlie, delta]

        System.out.println();

        // List method replaceAll accepts UnaryOperator Functional interface
        list.replaceAll(s -> s.charAt(0) + " - " + s.toUpperCase());

        System.out.println("---------------------------");

        System.out.println(list); // [a - ALPHA, b - BRAVO, c - CHARLIE, d - DELTA]

        String[] emptyStrings = new String[10];
        System.out.println(Arrays.toString(emptyStrings));

        // [null, null, null, null, null, null, null, null, null, null]
        Arrays.fill(emptyStrings, "");
        System.out.println(Arrays.toString(emptyStrings)); // [, , , , , , , , , ]

        // setAll accepts intFunction and left side (i) is array index
        Arrays.setAll(emptyStrings, (i) -> "" + (i+1) + ". ");
        System.out.println(Arrays.toString(emptyStrings));
        // [1. , 2. , 3. , 4. , 5. , 6. , 7. , 8. , 9. , 10. ]



    }
}
