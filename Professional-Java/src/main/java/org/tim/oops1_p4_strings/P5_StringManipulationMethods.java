package org.tim.oops1_p4_strings;

public class P5_StringManipulationMethods {

    public static void main(String[] args) {

        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("1982");
        System.out.println("startingIndex = " + startingIndex);                   // startingIndex = 6
        System.out.println("Birth year = " + birthDate.substring(startingIndex)); // Birth year = 1982
        System.out.println("Month = " + birthDate.substring(3, 5));               // Month = 11

        String newDate = String.join("/", "25", "11", "1982");
        System.out.println("newDate = " + newDate);                               // newDate = 25/11/1982

        /**
         * If we use concat method or + operator
         * newDate = "25" + "/" + "11" + "/" + "1982";
         * But join method is more efficient.
         */
        newDate = "25" + "/" + "11" + "/" + "1982";
        System.out.println("newDate = " + newDate);       // newDate = 25/11/1982

        System.out.println();

        // using concat method
        newDate = "25".concat("/").concat("11").concat("/").concat("1982");
        System.out.println("newDate = " + newDate);       // newDate = 25/11/1982

        System.out.println();
        System.out.println();

        // using replace method
        System.out.println(newDate.replace('/', '-'));    // 25-11-1982
        System.out.println(newDate.replace("2", "00"));  // 005/11/19800

        System.out.println(newDate.replaceFirst("/", "-")); // 25-11/1982
        System.out.println(newDate.replaceAll("/", "-"));   // 25-11-1982

        System.out.println();

        System.out.println("ABC\n".repeat(3));

        /**
         * ABC
         * ABC
         * ABC
         */
        System.out.println("-".repeat(20)); // --------------------

        System.out.println("ABC\n".repeat(3).indent(8));
        /**
         *         ABC
         *         ABC
         *         ABC
         */



    }
}
