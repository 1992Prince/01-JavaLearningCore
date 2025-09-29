package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class P1_ParametrizedList {

    public static void main(String[] args) {

        // Generics Collections

        List<String> stringArrayList = new ArrayList<>();
        System.out.println("ArrayList class : " + stringArrayList.getClass());
        // ArrayList class : class java.util.ArrayList

        System.out.println();

        System.out.println("ArrayList instanceof List: "
                    + (stringArrayList instanceof List));
        System.out.println("ArrayList instanceof List: "
                + (stringArrayList instanceof Collection));
        System.out.println("ArrayList instanceof List: "
                + (stringArrayList instanceof Iterable));

        /**
         * ArrayList instanceof List: true
         * ArrayList instanceof List: true
         * ArrayList instanceof List: true
         */

        System.out.println();
        System.out.println();

        // below is non-parametrized arraylist obj and we can add any type of object or
        // elements to it
        // this is not recommended approach and it is not following Generics

        ArrayList stringArrayList2 = new ArrayList();
        stringArrayList2.add("Pikachu");
        stringArrayList2.add(10);
        stringArrayList2.add(true);
    }
}
